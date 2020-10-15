/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.config;

import static auto.recharge.system.config.CommTest.portsCommPortIdentifierList;
import static auto.recharge.system.config.RunningModemPort.portId;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommTest {

    private static final String _NO_DEVICE_FOUND = "  no device found";

    private final static Formatter _formatter = new Formatter(System.out);

    private final static String TAG = "Find ports:CommTest";

    static CommPortIdentifier portId;

    static Enumeration<CommPortIdentifier> portsCommPortIdentifierList;

    static int bauds[] = {9600/*, 14400, 19200, 28800, 33600, 38400, 56000, 57600, 115200 */};

    /**
     * Wrapper around {@link CommPortIdentifier#getPortIdentifiers()} to be
     * avoid unchecked warnings.
     */
    private static Enumeration<CommPortIdentifier> getCleanPortIdentifiers() {
        return CommPortIdentifier.getPortIdentifiers();
    }

    public static List<String> getPorts() {
        List<String> portLists = new ArrayList<>();

        System.out.println("step 11/12: Search modem COM Port");
        portsCommPortIdentifierList = getCleanPortIdentifiers();

        while (portsCommPortIdentifierList.hasMoreElements()) {
            portId = portsCommPortIdentifierList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                
                System.out.println("step 12/10: Start COM Port testig for " + portId.getName());
                _formatter.format("%nFound port: %-5s%n", portId.getName());

                // for (int i = 0; i < bauds.length; i++) {
                SerialPort serialPort = null;
            
                try {
                    InputStream inStream;
                    OutputStream outStream;
                    int c;
                    String response;
                    serialPort = (SerialPort) portId.open("SMSLibCommTester ", 1971);
                    serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN);
                    serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                    inStream = serialPort.getInputStream();
                    outStream = serialPort.getOutputStream();
                    serialPort.enableReceiveTimeout(1000);
                    c = inStream.read();
                    while (c != -1) {
                        c = inStream.read();
                    }
                    outStream.write('A');
                    outStream.write('T');
                    outStream.write('\r');
                    Thread.sleep(1000);
                    response = "";
                    StringBuilder sb = new StringBuilder();
                    c = inStream.read();
                    while (c != -1) {
                        sb.append((char) c);
                        c = inStream.read();
                    }
                    response = sb.toString();
                    if (response.indexOf("OK") >= 0) {
                        try {
                           portLists.add(portId.getName());

//                                outStream.write('A');
//                                outStream.write('T');
//                                outStream.write('+');
//                                outStream.write('C');
//                                outStream.write('G');
//                                outStream.write('M');
//                                outStream.write('M');
//                                outStream.write('\r');
//                                response = "";
//                                c = inStream.read();
//                                while (c != -1) {
//                                    response += (char) c;
//                                    c = inStream.read();
//                                }
                            System.out.println(" Found: " + response.replaceAll("\\s+OK\\s+", "").replaceAll("\n", "").replaceAll("\r", ""));
                        } catch (Exception e) {
                            System.out.println(_NO_DEVICE_FOUND);
                        }
                    } else {
                        System.out.println(_NO_DEVICE_FOUND);
                    }
                } catch (Exception e) {
                    System.out.print(_NO_DEVICE_FOUND);
                    Throwable cause = e;
                    while (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    System.out.println(" (" + cause.getMessage() + ")");
                } finally {
                    if (serialPort != null) {
                        serialPort.close();
                    }
                }
            }
        }
        return portLists;
    }

    public static List<String> getModemPorts() {
        try {
            System.out.println("step 11/12: Search modem COM Port");
            portsCommPortIdentifierList = getCleanPortIdentifiers();

            RunningModemPort runningModemPort = new RunningModemPort(portsCommPortIdentifierList);
            runningModemPort.start();
            runningModemPort.join();

            return runningModemPort.getPorts();
        } catch (InterruptedException ex) {
            Logger.getLogger(CommTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
}

class RunningModemPort extends Thread {

    private final Enumeration<CommPortIdentifier> portsCommPortIdentifierList;
    private List<String> ports = new ArrayList<>();
    private final String _NO_DEVICE_FOUND = "  no device found";
    private final static Formatter _formatter = new Formatter(System.out);
    private final static String TAG = "Find ports:CommTest";
    private final int bauds[] = {9600/*, 14400, 19200, 28800, 33600, 38400, 56000, 57600, 115200 */};

    static CommPortIdentifier portId;

    public RunningModemPort(Enumeration<CommPortIdentifier> portsCommPortIdentifierList) {
        this.portsCommPortIdentifierList = portsCommPortIdentifierList;
    }

    @Override
    public void run() {

        while (portsCommPortIdentifierList.hasMoreElements()) {
            portId = portsCommPortIdentifierList.nextElement();

            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {

                System.out.println("step 12/10: Start COM Port testig for " + portId.getName());
                _formatter.format("%nFound port: %-5s%n", portId.getName());

                // for (int i = 0; i < bauds.length; i++) {
                SerialPort serialPort = null;
                _formatter.format("       Trying at %6d... ", 9600);
                try {
//                    InputStream inStream;
//                    OutputStream outStream;
//                    int c;
//                    String response;
//                    serialPort = (SerialPort) portId.open("SMSLibCommTester ", 1971);
//                    serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN);
//                    serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
//                    inStream = serialPort.getInputStream();
//                    outStream = serialPort.getOutputStream();
//                    serialPort.enableReceiveTimeout(1000);
//                    c = inStream.read();
//                    while (c != -1) {
//                        c = inStream.read();
//                    }
//                    outStream.write('A');
//                    outStream.write('T');
//                    outStream.write('\r');
//                    Thread.sleep(1000);
//                    response = "";
//                    StringBuilder sb = new StringBuilder();
//                    c = inStream.read();
//                    while (c != -1) {
//                        sb.append((char) c);
//                        c = inStream.read();
//                    }
//                    response = sb.toString();
//                    if (response.indexOf("OK") >= 0) {
//                        try {
//                            //  System.out.print("  Getting Info...");
//                            // System.out.println(portId.getName());
//
////                                outStream.write('A');
////                                outStream.write('T');
////                                outStream.write('+');
////                                outStream.write('C');
////                                outStream.write('G');
////                                outStream.write('M');
////                                outStream.write('M');
////                                outStream.write('\r');
////                                response = "";
////                                c = inStream.read();
////                                while (c != -1) {
////                                    response += (char) c;
////                                    c = inStream.read();
////                                }
//                            ports.add(portId.getName());
//                            System.out.println(" Found: " + response.replaceAll("\\s+OK\\s+", "").replaceAll("\n", "").replaceAll("\r", ""));
//                        } catch (Exception e) {
//                            System.out.println(_NO_DEVICE_FOUND);
//                        }
//                    } else {
//                        System.out.println(_NO_DEVICE_FOUND);
//                    }
                } catch (Exception e) {
                    System.out.print(_NO_DEVICE_FOUND);
                    Throwable cause = e;
                    while (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    System.out.println(" (" + cause.getMessage() + ")");
                } finally {
                    if (serialPort != null) {
                        serialPort.close();
                    }
                }
                //}
            }

        }
    }

    public List<String> getPorts() {
        return ports;
    }

}
