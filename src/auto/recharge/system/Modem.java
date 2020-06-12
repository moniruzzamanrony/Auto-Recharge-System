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

    public static List<String> getActivePortsList() {
        List<String> a = com.moniruzzaman.Modem.getActiveModemsPorts();
        a.remove("COM156");
        System.err.println(a);
        List<String> selectedActivePortsList = new ArrayList<>();
        List<String> activePortsList = new ArrayList<>();
        a.stream().map((port) -> {
            com.moniruzzaman.Modem.connect(port);
            return port;
        }).forEachOrdered((port) -> {
            if (com.moniruzzaman.Modem.sendATCommand("AT").replaceAll("\\s+OK\\s+", "").replaceAll("\n", ",").replaceAll("\r", "").replaceAll(",", "").equals("OK")) {
                activePortsList.add(port);

                com.moniruzzaman.Modem.disconnect();
            } else {
                System.err.println("Inactive Port");
                com.moniruzzaman.Modem.disconnect();
            }
        });
        return activePortsList;
    }

    public static List<SimOperatorIdentifierDto> getSimInfo(List<String> ports) {
            List<SimOperatorIdentifierDto> simOperatorIdentifierDtos= new ArrayList<>();
            int count=0;
            for(String port: ports)
            {
                com.moniruzzaman.Modem.connect(port);
                SimOperatorIdentifierDto simOperatorIdentifierDto= new SimOperatorIdentifierDto();
                simOperatorIdentifierDto.setId(count++);
                simOperatorIdentifierDto.setOperatorName(com.moniruzzaman.Modem.sendATCommand("AT+COPS?").replaceAll(",", "")
                        .replaceAll("OK", "").replaceAll("COPS:", "").replaceAll("\"", "").replaceAll("\\d", "").replaceAll("\\W", ""));
                simOperatorIdentifierDto.setPortName(port);
                com.moniruzzaman.Modem.disconnect();
                
                simOperatorIdentifierDtos.add(simOperatorIdentifierDto);
            }
            
            return  simOperatorIdentifierDtos;      
    }
}
