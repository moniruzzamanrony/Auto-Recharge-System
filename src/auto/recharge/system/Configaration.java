package auto.recharge.system;

import com.moniruzzaman.Modem;
import java.awt.Color;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import javax.swing.BorderFactory;

public class Configaration {

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
       DateFormat df = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        Calendar calobj = Calendar.getInstance();
        return df.format(calobj.getTime());
    }

}
