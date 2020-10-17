package auto.recharge.system.config;

import auto.recharge.system.Popup;
import gnu.io.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ModemUtils {

    private static int send_to_parser;
    private static String last_cmd;
    private InputStream in1;
    private OutputStream outputStream;
    private CommPort commPort;
    private SerialPort serialPort;
    private String port_name;
    private String response = "Error";
    private String responseAdd = "";

    static String getPortTypeName(int portType) {
        switch (portType) {
            case 3:
                return "I2C";
            case 2:
                return "Parallel";
            case 5:
                return "Raw";
            case 4:
                return "RS485";
            case 1:
                return "Serial";
        }
        return "unknown type";
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public String connect(String portName, int speed) throws Exception {

        String ret = "connect_fail";
        CommPortIdentifier portIdentifier = CommPortIdentifier
                .getPortIdentifier(portName);
        if (portIdentifier.isCurrentlyOwned()) {
            System.out.println("step 7/10: " + portName + " port is already used");
            Popup.customError(portName + " is busy.\nPlease resreat this application");

            ret = "connect_port_in_use";
        } else {
            try {
                this.commPort = portIdentifier.open(getClass().getName(), 2000);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                String s1 = portName
                        + "  is currently in use. Please close the application that is using this port and connect again."
                        + "\r\n";
                System.out.println(s1);
                return "connect_port_in_use";
            }
            System.out.println("step 8/10: " + this.commPort + "ready to used");

            if ((this.commPort instanceof SerialPort)) {
                this.serialPort = ((SerialPort) this.commPort);
                this.port_name = portIdentifier.getName();

                this.serialPort.setSerialPortParams(speed, 8, 1, 0);

                InputStream in = this.serialPort.getInputStream();
                OutputStream out = this.serialPort.getOutputStream();
                this.in1 = in;
                this.outputStream = out;

                this.serialPort
                        .addEventListener(new ModemUtils.SerialReader(
                                this.in1));
                this.serialPort.notifyOnDataAvailable(true);
                ret = "connect_sucess";
            } else {
                System.out.println("Error: " + "Only serial ports are handled by this software.");

                ret = "connect_error";
                String s1 = "Error connecting to " + portName + ".\r\n";
                System.out.println("Error: " + "Only serial ports are handled by this software.");
            }
        }
        return ret;
    }

    public String disconnect() {
        String res = "Disconnect Failed";
        try {

            serialPort.removeEventListener();
            serialPort.close();
            this.in1.close();
            this.outputStream.close();
            res = "Disconnect Successful";
        } catch (IOException ex) {
            // don't care
        }
        // Close the port.
        serialPort.close();
        return res;
    }

    private String sendUssdCode(String str, int type) {

        String res = "submit_fail";
        if (this.serialPort != null) {
            try {
                System.out.println("step 9/10: Prepaire to send ussd code");

                this.outputStream.write(str.getBytes());
                if (type == 1) {
                    String[] t5 = str.split("\r\n");
                    last_cmd = t5[0];
                }
                res = "AT Command Submitted";
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String s1 = "No port is connected.\r\n\r\n";
            printValue(s1);
            res = "submit_port_not_connected";
        }
        return res;
    }

    private String checkPortConnected() {
        String ret = "NULL";
        if (this.serialPort != null) {
            ret = this.serialPort.getName();
        }
        return ret;
    }

    private void printValue(String value) {
        // Here Final Result prineted
        responseAdd = responseAdd + value + ",";
        //System.out.println("325--->" + value);

    }

    public String USSDCodeDial(String command) {
        try {
            sendUssdCode(command + "\r\n", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        wait(2000);
        return response;
    }

    public String ussdDial(String command) {
        try {
            responseAdd = new String();
            sendUssdCode(command + "\r\n", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        wait(1500);

        return responseAdd;
    }

    public List<String> getActivePorts() {
        System.out.println("step 6/10: Start COM Port testig");
        return CommTest.getPorts();
    }

    private class SerialReader implements SerialPortEventListener {

        public int winflag = 1;
        List<String> resp_array = new ArrayList<String>();
        private InputStream in;
        private byte[] portBuffer = new byte[1024];
        private String fileBuffer;

        public SerialReader(InputStream in) {
            this.in = in;

        }

        public void serialEvent(SerialPortEvent arg0) {
            String delimiter = "\r\n";
            try {
                int len = 0;
                int data;
                while ((data = this.in.read()) > -1) {

                    this.portBuffer[(len++)] = ((byte) data);
                    if (data == 10) {
                        break;
                    }
                }
                this.fileBuffer = new String(this.portBuffer, 0, len);

                response = this.fileBuffer.toString();
                response = this.fileBuffer.toString();
                if (response.contains("RING")) {
                    printValue("Ring");
                    return;
                }
                if (response.contains("CONNECT OK")) {
                    printValue(response);
                    printValue("Connect OK");
                    return;
                }
                if (response.contains("CLOSE")) {
                    printValue(response);
                    printValue(resp_array.toString());
                    return;
                }
                if (response.contains("NO CARRIER")) {
                    printValue(response);
                    printValue(resp_array.toString());
                    return;
                }
                if (response.contains("+HTTPACTION:0")) {
                    String[] temp = response.split(delimiter);
                    resp_array.clear();
                    resp_array.add(temp[0]);
                    printValue(resp_array.toString());
                    return;
                }
                if (response.contains("POSITION:")) {
                    String[] temp = response.split(delimiter);
                    resp_array.clear();
                    resp_array.add(temp[0]);
                    printValue(resp_array.toString());
                    return;
                }
                if (response.contains("IPDATA:")) {
                    resp_array.clear();
                    while ((data = this.in.read()) > -1) {
                        this.portBuffer[(len++)] = ((byte) data);
                    }
                    this.fileBuffer = new String(this.portBuffer, 0, len);
                    System.out.println("step 10/10: " + this.fileBuffer.toString());

                    response = this.fileBuffer.toString();
                    resp_array.add(response);
                    printValue(resp_array.toString());
                    return;
                }
                if (response.contains("+FTPPUT:1,")) {
                    String[] temp = response.split(delimiter);
                    String[] temp1 = temp[0].split(":");
                    temp1 = temp1[1].split(",");
                    ModemUtils.last_cmd = "+FTPPUT:";
                    resp_array.clear();
                    resp_array.add(temp1[0]);
                    resp_array.add(temp1[1]);
                    if (temp1[1].equals("1")) {
                        resp_array.add(temp1[2]);
                    }
                    printValue(response);
                    printValue(resp_array.toString());
                    return;
                }
                if (response.contains("+FTPPUT:2,")) {
                    String[] temp = response.split(delimiter);
                    String[] temp1 = temp[0].split(":");
                    temp1 = temp1[1].split(",");
                    ModemUtils.last_cmd = "+FTPPUT:";
                    resp_array.clear();
                    resp_array.add(temp1[0]);
                    resp_array.add(temp1[1]);

                    printValue(response);
                    printValue(resp_array.toString());

                    return;
                }
                if (response.contains("+FTPGET:1,")) {
                    String[] temp = response.split(delimiter);
                    String[] temp1 = temp[0].split(":");
                    ModemUtils.last_cmd = "+FTPGET:";
                    resp_array.clear();
                    resp_array.add(temp1[1]);

                    printValue(response);
                    printValue(resp_array.toString());

                    return;
                }
                if (response.contains("+FTPGET:2,")) {
                    String[] temp = response.split(delimiter);
                    String[] temp1 = temp[0].split(":");
                    temp = response.split(":");
                    ModemUtils.last_cmd = "+FTPGET:";
                    resp_array.clear();
                    resp_array.add(temp1[1]);
                    printValue(response);
                    return;
                }
                if (response.equals("AT")) {
                    resp_array.clear();
                    return;
                }
                if (ModemUtils.send_to_parser == 1) {

                    printValue(response);
                    if ((response.equals(ModemUtils.last_cmd + "\r\r\n"))
                            || (response.equals(ModemUtils.last_cmd + "\r\n"))
                            || (response.equals(ModemUtils.last_cmd + "\r"))) {
                        resp_array.clear();
                    } else {
                        String[] temp = response.split(delimiter);
                        if (temp[0].contains("ERROR")) {
                            resp_array.add(temp[0]);
                            printValue(resp_array.toString());
                            resp_array.clear();
                        } else if (temp[0].equals("OK")) {
                            resp_array.add(temp[0]);
                            printValue(resp_array.toString());
                            resp_array.clear();
                        } else if (temp[0] != "") {
                            resp_array.add(temp[0]);
                        }
                    }
                } else {
                    printValue(response);

                }
                return;
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }

}
