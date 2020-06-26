package auto.recharge.system;

import auto.recharge.system.dto.ModemInfoList;
import auto.recharge.system.dto.SimOperatorIdentifierDto;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JTable;

public class Configaration {

    private static final Pattern HEXADECIMAL_PATTERN = Pattern.compile("\\p{XDigit}+");

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

    static String getCurrentDateAndTime() {
        DateFormat df = new SimpleDateFormat("yy/MM/dd hh:mm:ss");
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

        com.moniruzzaman.Modem.connect(port);
        System.out.println(com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"#xxx#\",15"));
        com.moniruzzaman.Modem.disconnect();

    }
}
