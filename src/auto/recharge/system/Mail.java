/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author monirozzamanroni
 */
public class Mail {
    
 public static void send() {
     
    final String username = "itvillage029@gmail.com";
    final String password = "ITvillage428854";

    Properties props = new Properties();
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props,new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

    try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("eproni29@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("eproni29@gmail.com"));
        message.setSubject("Testing Subject");
        message.setText("PFA");

        MimeBodyPart messageBodyPart = new MimeBodyPart();

        Multipart multipart = new MimeMultipart();

        messageBodyPart = new MimeBodyPart();
        String file = "path of file to be attached";
        String fileName = "attachmentName";
        DataSource source = new FileDataSource("01988841890.png");
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(fileName);
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);

        System.out.println("Sending");

        Transport.send(message);
        Popup.info("Thanks! Buying Processing\nAs soon as possible our team connect to you");
        System.out.println("Done");

    } catch (MessagingException e) {
        Popup.error("Somthing Wrong..\n  Try Again");
        e.printStackTrace();
    }
  }
}