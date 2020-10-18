/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Properties;


public class Mail {

    private String userId;

    public Mail(String userId) {
        this.userId = userId;

    }


    public void send(String fileName, String email, String userName, String selectedPackage, String paymentTrsId, String clientEmail) {

        final String USERNAME = "auto.recharge20bd@gmail.com";
        final String PASSWORD = "Afsar/.,123";

        System.err.println("Mail Sending to " + email);
        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.debug", "true");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });
        session.setDebug(true);

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email));

            message.setSubject("Thanks for applying");
            MimeMultipart multipart = new MimeMultipart("related");
            BodyPart messageBodyPart = new MimeBodyPart();

            String htmlText = "<b>Hello Employer</b> <br>Our company had recived "
                    + "your BUYING request.<br><h3 style=\"color:Red;\">Request Details</h3>.<br>User Id: " + userId
                    + "<br>User name: " + userName + "<br>Email: " + clientEmail + "<br>Requested Package: "
                    + selectedPackage + "<br>Shop Name: " + paymentTrsId + "<br>Phone NO: " + fileName;

            messageBodyPart.setContent(htmlText, "text/html");
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();

            DataSource source = new FileDataSource(fileName + ".png");
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName + ".png");

            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("To send ADMIN");

        } catch (MessagingException e) {

            Log.error("85", "Administration Login Failed.");
        }
    }

    public void send(String email, String userName, String selectedPackage, String paymentTrsId) {

        final String USERNAME = "auto.recharge20bd@gmail.com";
        final String PASSWORD = "Afsar/.,123";

        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.debug", "true");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });
        session.setDebug(true);
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email));


            message.setSubject("Buying Request from " + userName);
            MimeMultipart multipart = new MimeMultipart("related");

            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<b>Hello </b>" + userName + "<br>We are recived your "
                    + "BUYING request.Our team recently connect with you.<br>Your "
                    + "user Id: " + userId + "<br><h2 style=\"color:DodgerBlue;\">Helpline</h2>"
                    + "<br><h3 style=\"color:Red;\">01988841890(Afser)</h3><br>";
            messageBodyPart.setContent(htmlText, "text/html");
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);

            System.out.println("Sending");
            Transport.send(message);
            Popup.info("Thanks!\n Buying Processing\nAs soon as possible our team connect to you");
            System.out.println("Done");

        } catch (MessagingException e) {
            Popup.error("Sorry,Your Request is\'t Deliver");
        }
    }


    public String getMacAddress() throws UnknownHostException,
            SocketException {
        InetAddress ipAddress = InetAddress.getLocalHost();
        NetworkInterface networkInterface = NetworkInterface
                .getByInetAddress(ipAddress);
        byte[] macAddressBytes = networkInterface.getHardwareAddress();
        StringBuilder macAddressBuilder = new StringBuilder();

        for (int macAddressByteIndex = 0; macAddressByteIndex < macAddressBytes.length; macAddressByteIndex++) {
            String macAddressHexByte = String.format("%02X",
                    macAddressBytes[macAddressByteIndex]);
            macAddressBuilder.append(macAddressHexByte);

            if (macAddressByteIndex != macAddressBytes.length - 1) {
                macAddressBuilder.append(":");
            }
        }
        return macAddressBuilder.toString();
    }


}