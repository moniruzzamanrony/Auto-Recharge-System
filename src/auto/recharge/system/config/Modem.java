package auto.recharge.system.config;


import java.util.List;

public class Modem {
    static ModemUtils modemUtils;

    public static String dialUSSDCode(String command) {

        return modemUtils.USSDCodeDial(command);
    }

    public static String sendATCommand(String command) {
        System.out.println("step 17/17: Processing requested command ");
        return modemUtils.ussdDial(command);
    }

    public static String connect(String portName) {
        System.out.println("step 17/17: Connected with " + portName);
        modemUtils = new ModemUtils();
        try {
            return modemUtils.connect(portName, 9600);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
    }

    public static List<String> getActiveModemsPorts() {
        System.out.println("step 5/15: Start Port Searching");
        modemUtils = new ModemUtils();
        return modemUtils.getActivePorts();
    }

    public static String disconnect() {
        System.out.println("Port disconnected");
        return modemUtils.disconnect();
    }

    public static List<String> getActivePortsList() {
        return getActiveModemsPorts();
    }

}
