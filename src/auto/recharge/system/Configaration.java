package auto.recharge.system;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import static java.rmi.server.LogStream.log;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JTable;

public class Configaration {

    private static final Pattern HEXADECIMAL_PATTERN = Pattern.compile("\\p{XDigit}+");
    private static JDialog processtingLoderDialog;

    public static boolean netIsAvailable() {
        try {
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
            return true;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return false;
        }
    }

    public Configaration() {
        processingLoderDialog();
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void changeBorderColorForTextFeild(javax.swing.JTextField jTextField, String colorCode) {
        jTextField.setBorder(BorderFactory.createLineBorder(Color.decode(colorCode)));
    }

    public static String getPropertiesValueByKey(String key) {
        Properties prop = new Properties();
        try {

            prop.load(Configaration.class.getClassLoader().getResourceAsStream("resources\\config.properties"));
            return prop.getProperty(key);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "Not Found";
    }

    public static void setErrorLog(String mgs) {
        System.err.println(mgs);
    }

    public static void setLog(String mgs) {
        System.out.println(mgs);
    }

    public static void setErrorLog(int mgs) {
        System.err.println(mgs);
    }

    public static void setLog(int mgs) {
        System.out.println(mgs);
    }

    public static String haxToStringConvert(String haxValue) {
        byte[] bytes = hexStringToByteArray(haxValue);
        return new String(bytes, StandardCharsets.UTF_16);
    }

    private static byte[] hexStringToByteArray(String hex) {
        int l = hex.length();
        byte[] data = new byte[l / 2];
        for (int i = 0; i < l; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    public static String getCurrentDateAndTime() {
        DateFormat df = new SimpleDateFormat("yy/MM/dd hh:mm:ss");
        Calendar calobj = Calendar.getInstance();
        return df.format(calobj.getTime());
    }

    static String getCurrentDate() {
        DateFormat df = new SimpleDateFormat("yy/MM/dd");
        Calendar calobj = Calendar.getInstance();
        return df.format(calobj.getTime());
    }

    public static boolean isHexadecimal(String input) {
        final Matcher matcher = HEXADECIMAL_PATTERN.matcher(input);
        return matcher.matches();
    }

    public static void export(JTable jTable) {
        try {
            JFileChooser f = new JFileChooser();
            f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            f.showSaveDialog(null);

            System.out.println(f.getCurrentDirectory());
            System.out.println(f.getSelectedFile());

            Document document = new Document();

            try {
                PdfWriter.getInstance(document, new FileOutputStream(f.getSelectedFile() + "/ARS-" + Math.random() + ".pdf"));
                document.open();

                PdfPTable pdfPTable = new PdfPTable(8);
                pdfPTable.setWidthPercentage(100);

                pdfPTable.addCell("TrxId");
                pdfPTable.addCell("Date & Time");
                pdfPTable.addCell("Type");
                pdfPTable.addCell("Mobile No");
                pdfPTable.addCell("Ammount");
                pdfPTable.addCell("From");
                pdfPTable.addCell("Current Balance");
                pdfPTable.addCell("Status");

                for (int i = 0; i < jTable.getRowCount(); i++) {
                    pdfPTable.addCell(jTable.getValueAt(i, 0).toString());
                    pdfPTable.addCell(jTable.getValueAt(i, 1).toString());
                    pdfPTable.addCell(jTable.getValueAt(i, 2).toString());
                    pdfPTable.addCell(jTable.getValueAt(i, 3).toString());
                    pdfPTable.addCell(jTable.getValueAt(i, 4).toString());
                    pdfPTable.addCell(jTable.getValueAt(i, 5).toString());
                    pdfPTable.addCell(jTable.getValueAt(i, 6).toString());
                    pdfPTable.addCell(jTable.getValueAt(i, 7).toString());

                }

                document.add(pdfPTable);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Configaration.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(Configaration.class.getName()).log(Level.SEVERE, null, ex);
        }
        Popup.customSuccess();
        System.out.println("******** PDF Created ***************");
    }

    public static String getJustDate(Date date) {
        SimpleDateFormat dateOnly = new SimpleDateFormat("yy/MM/dd");
        return dateOnly.format(date);
    }

    public static Date stringToDateType(String date) {
        Date dateType = null;
        try {
            dateType = new SimpleDateFormat("yy/MM/dd").parse(date);

        } catch (ParseException ex) {
            Logger.getLogger(Configaration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dateType;
    }

    public static void closeUssdSession(String port) {

        auto.recharge.system.config.Modem.connect(port);
        System.out.println(auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"#xxx#\",15"));
        auto.recharge.system.config.Modem.disconnect();

    }

    public static Dimension getImageDim(final String path) {
        Dimension result = null;
        String suffix = Configaration.getFileSuffix(path);
        Iterator<ImageReader> iter = ImageIO.getImageReadersBySuffix(suffix);
        if (iter.hasNext()) {
            ImageReader reader = iter.next();
            try {
                ImageInputStream stream = new FileImageInputStream(new File(path));
                reader.setInput(stream);
                int width = reader.getWidth(reader.getMinIndex());
                int height = reader.getHeight(reader.getMinIndex());
                result = new Dimension(width, height);
            } catch (IOException e) {
                log(e.getMessage());
            } finally {
                reader.dispose();
            }
        } else {

        }
        return result;
    }

    private static String getFileSuffix(final String path) {
        String result = null;
        if (path != null) {
            result = "";
            if (path.lastIndexOf('.') != -1) {
                result = path.substring(path.lastIndexOf('.'));
                if (result.startsWith(".")) {
                    result = result.substring(1);
                }
            }
        }
        return result;
    }

    public static void closeUssdSession() {
        auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=2");
        System.out.println("Session closed.");
    }

    private void processingLoderDialog() {

        ProcesseingLoderUI processeingLoderUI = new ProcesseingLoderUI();

        processtingLoderDialog = new JDialog();
        processtingLoderDialog.add(processeingLoderUI);
        processtingLoderDialog.setSize(214, 138);
        processtingLoderDialog.setLocationRelativeTo(null);
        processtingLoderDialog.setUndecorated(true);

    }

    public static void showProcessingBar() {
        processtingLoderDialog.setVisible(true);

    }

    public static void disposeProcessingBar() {
        processtingLoderDialog.setVisible(true);

    }

    public static String getUUID() {
        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }

    public static String getMacAddress() {
        String motherBoard_SerialNumber = getWindowsMotherboard_SerialNumber().replace(" ", "").toLowerCase();

        return motherBoard_SerialNumber;
    }

    private static String getWindowsMotherboard_SerialNumber() {
        String result = "";
        try {
            File file = File.createTempFile("realhowto", ".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);

            String vbs
                    = "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\n"
                    + "Set colItems = objWMIService.ExecQuery _ \n"
                    + "   (\"Select * from Win32_BaseBoard\") \n"
                    + "For Each objItem in colItems \n"
                    + "    Wscript.Echo objItem.SerialNumber \n"
                    + "    exit for  ' do the first cpu only! \n"
                    + "Next \n";

            fw.write(vbs);
            fw.close();

            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                result += line;
            }
            input.close();
        } catch (Exception E) {
            System.err.println("Windows MotherBoard Exp : " + E.getMessage());
        }
        return result.trim();
    }

    public static List<String> stringToNumberList(String value) {
        List<String> ussdCodeSerialList = new ArrayList<>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(value);
        ussdCodeSerialList.clear();
        while (m.find()) {

            ussdCodeSerialList.add(m.group());
        }
        return ussdCodeSerialList;

    }
    public static void openWebpage(String urlString) {
    try {
        Desktop.getDesktop().browse(new URL(urlString).toURI());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
