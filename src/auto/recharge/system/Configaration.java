package auto.recharge.system;

import java.awt.Color;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
}
