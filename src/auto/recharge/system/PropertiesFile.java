/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 *
 * @author monirozzamanroni
 */
public class PropertiesFile {
    
    public static String getValueByKey(String key) {
    Properties prop = new Properties();
    try {
        
        prop.load(PropertiesFile.class.getClassLoader().getResourceAsStream("resources\\config.properties"));
        return prop.getProperty(key);
    } 
    catch (IOException ex) {
        ex.printStackTrace();
    }
    return "Not Found";
   }
}
