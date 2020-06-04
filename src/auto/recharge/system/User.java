/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import static auto.recharge.system.Mail.getMacAddress;
import com.itvillage.AES;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monirozzamanroni
 */
public class User {
    
 public  static String getUserId()
    {
         String computerMacAddress;
        try {
            computerMacAddress = getMacAddress().replace(":", "");
             return AES.encrypt(computerMacAddress, "itvillage428854");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SocketException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
       return "User Not Found";
    }
 
}
