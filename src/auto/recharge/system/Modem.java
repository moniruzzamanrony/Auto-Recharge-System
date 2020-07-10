/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;


import auto.recharge.system.dto.SimOperatorIdentifierDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monirozzamanroni
 */
public class Modem {
private static final String[] SIM_OPERATORS_NAME = new String[]{"BANGLALINK", "GP", "ROBI", "AIRTEL", "TELETALK"};
    public static List<String> getActivePortsList() {
        List<String> a = auto.recharge.system.config.Modem.getActiveModemsPorts();
        a.remove("COM156");
        System.err.println(a);
        List<String> selectedActivePortsList = new ArrayList<>();
        List<String> activePortsList = new ArrayList<>();
        a.stream().map((port) -> {
            auto.recharge.system.config.Modem.connect(port);
            return port;
        }).forEachOrdered((port) -> {
            if (auto.recharge.system.config.Modem.sendATCommand("AT").replaceAll("\\s+OK\\s+", "").replaceAll("\n", ",").replaceAll("\r", "").replaceAll(",", "").equals("OK")) {
                activePortsList.add(port);

                auto.recharge.system.config.Modem.disconnect();
            } else {
                System.err.println("Inactive Port");
                auto.recharge.system.config.Modem.disconnect();
            }
        });
        return activePortsList;
    }

    public static List<SimOperatorIdentifierDto> getSimInfo(List<String> ports) {
            List<SimOperatorIdentifierDto> simOperatorIdentifierDtos= new ArrayList<>();
            int count=0;
            for(String port: ports)
            {
                auto.recharge.system.config.Modem.connect(port);
                SimOperatorIdentifierDto simOperatorIdentifierDto= new SimOperatorIdentifierDto();
                simOperatorIdentifierDto.setId(count++);
                String opName = auto.recharge.system.config.Modem.sendATCommand("AT+COPS?").replaceAll(",", "")
                        .replaceAll("OK", "").replaceAll("COPS:", "").replaceAll("\"", "").replaceAll("\\d", "").replaceAll("\\W", "");
                if(opName.toUpperCase().contains(SIM_OPERATORS_NAME[0]))
                {
                
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[0]);
                }
                else if(opName.toUpperCase().contains(SIM_OPERATORS_NAME[1]))
                {
                
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[1]);
                }
                else if(opName.toUpperCase().contains(SIM_OPERATORS_NAME[2]))
                {
                
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[2]);
                }
                else if(opName.toUpperCase().contains(SIM_OPERATORS_NAME[3]))
                {
                
                simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[3]);
                }
                else if(opName.toUpperCase().contains(SIM_OPERATORS_NAME[4]))
                {
                 simOperatorIdentifierDto.setOperatorName(SIM_OPERATORS_NAME[4]);

                
                }
                else{
                Popup.customError("Modem Power is off in "+port);
                
                }
                simOperatorIdentifierDto.setPortName(port);
                auto.recharge.system.config.Modem.disconnect();
                
                simOperatorIdentifierDtos.add(simOperatorIdentifierDto);
            }
            
            return  simOperatorIdentifierDtos;      
    }
}
