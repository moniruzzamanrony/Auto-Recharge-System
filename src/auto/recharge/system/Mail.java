/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import com.itvillage.AES;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class Mail {
    private static Connection conn;
   
 public static void send(String fileName, String email, String userName, String selectedPackage, String paymentTrsId) {
     
    final String USERNAME = "itvillage29@gmail.com";
    final String PASSWORD = "itvillage428854@#";
   

    Properties props = new Properties();
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props,new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(USERNAME, PASSWORD);
                }
            });

    try {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(email));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(email));

         message.setSubject("Thanks for applying");      
        MimeMultipart multipart = new MimeMultipart("related");      
        BodyPart messageBodyPart = new MimeBodyPart();
       
        String htmlText = "<b>Hello Employer</b> <br>Our company had recived "
                + "your BUYING request.<br><h3 style=\"color:Red;\">Request Details</h3>.<br>User Id: "+getUserId()
                +"<br>User name: "+userName+"<br>Email: "+email+"<br>Requested Package: "
                +selectedPackage+"<br>TnxId: "+paymentTrsId+"<br>Phone NO: "+fileName;
        
        messageBodyPart.setContent(htmlText, "text/html");        
        multipart.addBodyPart(messageBodyPart);      
        messageBodyPart = new MimeBodyPart();
        
        DataSource source = new FileDataSource(fileName+".png");
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(fileName+".png");

        multipart.addBodyPart(messageBodyPart);
        message.setContent(multipart);
        Transport.send(message);
        DbConnection.delete("user_info");
        
      if(!saveToDbUserInfo(fileName,email,userName,selectedPackage,paymentTrsId)){
       System.out.println("User Info Table Inserted");
       }
        System.out.println("To send ADMIN");

    } catch (MessagingException e) {
        Popup.error("Somthing Wrong..\n  Try Again");
    }
  }

    public static void send(String email, String userName, String selectedPackage, String paymentTrsId) {
     
    final String username = Configaration.getPropertiesValueByKey("senderMail");
    final String password = Configaration.getPropertiesValueByKey("senderMailPassword");

    Properties props = new Properties();
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props,new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

    try {

      Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(email));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(email));

        
         message.setSubject("Buying Request from "+userName);         
         MimeMultipart multipart = new MimeMultipart("related");
        
         BodyPart messageBodyPart = new MimeBodyPart();
         String htmlText = "<b>Hello </b>"+ userName+"<br>We are recived your "
                 + "BUYING request.Our team recently connect with you.<br>Your "
                 + "user Id: "+getUserId()+"<br><h2 style=\"color:DodgerBlue;\">Helpline</h2>"
                 +"<br><h3 style=\"color:Red;\">01988841890(Afser)</h3><br>";
         messageBodyPart.setContent(htmlText, "text/html");      
         multipart.addBodyPart(messageBodyPart);     
         message.setContent(multipart);
         
        System.out.println("Sending");
        Transport.send(message);   
        Popup.info("Thanks!\n Buying Processing\nAs soon as possible our team connect to you");      
        System.out.println("Done");

    } catch (MessagingException e) {
        Popup.error("Somthing Wrong..\n  Try Again");
    }
  }

    private static boolean saveToDbUserInfo(String phoneNo, String email,
            String userName, String selectedPackage, String paymentTrsId) {
        conn = DbConnection.connect();
        try {
                                             
            String sql= "INSERT INTO user_info(user_id,name,phone_no,shop_name,address,password,active_package,mac_address,email) VALUES(?,?,?,?,?,?,?,?,?)";
            String computerMacAddress = getMacAddress().replace(":", "");
            try {
               PreparedStatement  preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, getUserId());
                preparedStatement.setString(2, userName);
                preparedStatement.setString(3, phoneNo);
                preparedStatement.setString(4, "");
                preparedStatement.setString(5, "");
                preparedStatement.setString(6, AES.encrypt("admin", Configaration.getPropertiesValueByKey("secretKey")));
                preparedStatement.setString(7, selectedPackage);
                preparedStatement.setString(8, computerMacAddress);
                preparedStatement.setString(9, email);
               return preparedStatement.execute();
               
            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (UnknownHostException | SocketException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }   
    public static String getMacAddress() throws UnknownHostException,
            SocketException
    {
        InetAddress ipAddress = InetAddress.getLocalHost();
        NetworkInterface networkInterface = NetworkInterface
                .getByInetAddress(ipAddress);
        byte[] macAddressBytes = networkInterface.getHardwareAddress();
        StringBuilder macAddressBuilder = new StringBuilder();

        for (int macAddressByteIndex = 0; macAddressByteIndex < macAddressBytes.length; macAddressByteIndex++)
        {
            String macAddressHexByte = String.format("%02X",
                    macAddressBytes[macAddressByteIndex]);
            macAddressBuilder.append(macAddressHexByte);

            if (macAddressByteIndex != macAddressBytes.length - 1)
            {
                macAddressBuilder.append(":");
            }
        }
        return macAddressBuilder.toString();
    }
    
    public  static String getUserId()
    {
         String computerMacAddress;
        try {
            computerMacAddress = getMacAddress().replace(":", "");
             return AES.encrypt(computerMacAddress, Configaration.getPropertiesValueByKey("secretKey"));
        } catch (UnknownHostException | SocketException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
       return "User Not Found";
    }
}