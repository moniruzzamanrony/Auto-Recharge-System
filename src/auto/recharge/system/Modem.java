/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import auto.recharge.system.dto.SimCardInformationDTO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author monirozzamanroni
 */
public class Modem {

    public static List<String> getActivePortsList() {
        return auto.recharge.system.config.Modem.getActiveModemsPorts();
    }

    /**
     * "BANGLALINK", "GP", "ROBI", "AIRTEL", "TELETALK"
     *
     * @param ports
     * @return
     */
    public static Set<SimCardInformationDTO> getSimInfo(List<String> ports) {

        try {
            SIMInfoCollector sIMInfoCollector = new SIMInfoCollector(ports);
            sIMInfoCollector.start();
            sIMInfoCollector.join();

            return sIMInfoCollector.getSimOperatorIdentifierDtos();
        } catch (InterruptedException ex) {
            System.out.println("Error: Ports Set not Found " + ex.getMessage());
        }
        return null;
    }

}

class SIMInfoCollector extends Thread {

    private static final String[] SIM_OPERATORS_NAME = new String[]{"BANGLALINK", "GP", "ROBI", "AIRTEL", "TELETALK"};
    private final List<String> ports;
    private final Set<SimCardInformationDTO> simOperatorIdentifierDtos = new HashSet<>();

    public SIMInfoCollector(List<String> ports) {
        this.ports = ports;
    }

    private static String getPhoneNumberFromSim(String numberGettingcode) {

        String phoneNumber;
        String responseFromSavedPhoneNumber = auto.recharge.system.config.Modem.sendATCommand("AT+CNUM");

        // System.out.println("Getting SIM Number: "+responseFromSavedPhoneNumber);
        List<String> responseFromSavedPhoneNumbers = Configaration.stringToNumberList(responseFromSavedPhoneNumber);
        if (responseFromSavedPhoneNumbers.isEmpty()) {
            String value = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + numberGettingcode + "\",15");
            String[] splitResponse = value.split(",");
            String finalResponse = splitResponse[1].replaceAll("\"", "");
            String finalResponseString = Configaration.haxToStringConvert(finalResponse);
            List<String> phoneNumbers = Configaration.stringToNumberList(finalResponseString);
            phoneNumber = phoneNumbers.get(0);

            auto.recharge.system.config.Modem.sendATCommand("AT+CPBS=?");
            auto.recharge.system.config.Modem.sendATCommand("AT+CPBS?");
            auto.recharge.system.config.Modem.sendATCommand("AT+CPBS=\"ON\"");
            auto.recharge.system.config.Modem.sendATCommand("at+cpbs?");
            auto.recharge.system.config.Modem.sendATCommand("at+cpbw=,\"" + phoneNumber + "\"");

            System.out.println("Saved List In SIM:" + auto.recharge.system.config.Modem.sendATCommand("at+cpbs?"));

            System.out.println("step 15/15: Getting SIM Number: " + phoneNumbers.get(0));
        } else {
            phoneNumber = responseFromSavedPhoneNumbers.get(0);
            System.out.println("step 15/15: Getting SIM Number: " + phoneNumber);
        }

        return phoneNumber;
    }

    @Override
    public void run() {
        System.out.println("step 14/14: Start Connected SIM Number Collectting ");
        ArrayList<SimCardInformationDTO> operatorIdentifierDtosArray = new ArrayList<>();
        int count = 0;
        for (String port : ports) {
            auto.recharge.system.config.Modem.connect(port);
            SimCardInformationDTO simOperatorIdentifierDto = new SimCardInformationDTO();
            simOperatorIdentifierDto.setId(count++);
            simOperatorIdentifierDto.setSimCurrentBalance("0.0");
            String opName = auto.recharge.system.config.Modem.sendATCommand("AT+COPS?").replaceAll(",", "")
                    .replaceAll("OK", "").replaceAll("COPS:", "").replaceAll("\"", "").replaceAll("\\d", "").replaceAll("\\W", "");

            if (opName.toUpperCase().contains(SIM_OPERATORS_NAME[0])) {
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[0]);
                simOperatorIdentifierDto.setOwnPhoneNumber(getPhoneNumberFromSim("*511#"));

            } else if (opName.toUpperCase().contains(SIM_OPERATORS_NAME[1])) {
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[1]);
                simOperatorIdentifierDto.setOwnPhoneNumber(getPhoneNumberFromSim("*2#"));

            } else if (opName.toUpperCase().contains(SIM_OPERATORS_NAME[2])) {
                simOperatorIdentifierDto.setOwnPhoneNumber(getPhoneNumberFromSim("*140*2*4#"));
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[2]);

            } else if (opName.toUpperCase().contains(SIM_OPERATORS_NAME[3])) {
                simOperatorIdentifierDto.setOwnPhoneNumber(getPhoneNumberFromSim("*121*7*3#"));
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[3]);

            } else if (opName.toUpperCase().contains(SIM_OPERATORS_NAME[4])) {
                simOperatorIdentifierDto.setOwnPhoneNumber(getPhoneNumberFromSim("*551#"));
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[4]);

            } else {
                int a = Popup.customError("SIM card not found.");
                if (a == 0) {
                    System.exit(0);
                }

            }
            simOperatorIdentifierDto.setPortName(port);
            auto.recharge.system.config.Modem.disconnect();

            operatorIdentifierDtosArray.add(simOperatorIdentifierDto);
        }
        String operatorName = "default", operatorPhoneNumber = "default";
        for (SimCardInformationDTO simOperatorIdentifierDto : operatorIdentifierDtosArray) {
            if (simOperatorIdentifierDto.getOperatorName().endsWith(operatorName)
                    && simOperatorIdentifierDto.getOwnPhoneNumber().endsWith(operatorPhoneNumber)) {
                Log.error("Duplicate Port found: ", simOperatorIdentifierDto.getPortName());
            } else {
                operatorName = simOperatorIdentifierDto.getOperatorName();
                operatorPhoneNumber = simOperatorIdentifierDto.getOwnPhoneNumber();
                simOperatorIdentifierDtos.add(simOperatorIdentifierDto);
            }

        }
        System.out.println("After selection: " + simOperatorIdentifierDtos.toString());
    }

    public Set<SimCardInformationDTO> getSimOperatorIdentifierDtos() {
        return simOperatorIdentifierDtos;
    }
}
