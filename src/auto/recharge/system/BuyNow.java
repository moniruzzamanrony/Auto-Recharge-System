/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter; 
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class BuyNow extends javax.swing.JFrame {
  private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
 
    public BuyNow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        getName = new javax.swing.JTextField();
        getPhoneNumber = new javax.swing.JTextField();
        getEmail = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        getPackageName = new javax.swing.JComboBox<>();
        getTransactionId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        clickBuyNow = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        qrCode = new javax.swing.JLabel();
        getSerialKey = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        clickBack = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(133, 47, 209));
        bg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bg.setForeground(new java.awt.Color(133, 47, 209));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel3.add(getName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 105, 310, 30));

        getPhoneNumber.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel3.add(getPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 310, 30));

        getEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEmailActionPerformed(evt);
            }
        });
        jPanel3.add(getEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 310, 30));

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField5.setText("jTextField2");
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 310, 30));

        getPackageName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trial Package @ 7days", "Silver Package @ 1year", "Gold Package @ 2years", "Diamond Package @3years", "Premium Package @Lifetime" }));
        getPackageName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                getSelectedPackage(evt);
            }
        });
        jPanel3.add(getPackageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 240, -1));

        getTransactionId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getTransactionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getTransactionIdActionPerformed(evt);
            }
        });
        jPanel3.add(getTransactionId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 310, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 410, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Apply Form");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/verify.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 17, 60, 60));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel6.setText("Name: ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("**If you haven't nay Serial Key then BUY NOW");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel8.setText("Phone : ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel10.setText("Email: ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel11.setText("Select Package: ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel12.setText("bKash Transection Id: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

        clickBuyNow.setBackground(new java.awt.Color(0, 153, 51));
        clickBuyNow.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        clickBuyNow.setForeground(new java.awt.Color(255, 255, 255));
        clickBuyNow.setText("BUY NOW");
        clickBuyNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickBuyNowActionPerformed(evt);
            }
        });
        jPanel3.add(clickBuyNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 200, 40));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 430, 390));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Auto Recharge System");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 400, -1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Helpline : 01988841890,01788841890");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        qrCode.setForeground(new java.awt.Color(204, 0, 51));
        qrCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qrCode.setText("No Package Found!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qrCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qrCode, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 140, 140));

        getSerialKey.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        getSerialKey.setText("XXXX-XXXX-XXXX-XX");
        bg.add(getSerialKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 400, 40));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Serial Key:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jButton1.setText("Active now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 150, 30));

        clickBack.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clickBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        clickBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickBackMouseClicked(evt);
            }
        });
        bg.add(clickBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getEmailActionPerformed

    private void getTransactionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getTransactionIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getTransactionIdActionPerformed

    private void clickBuyNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickBuyNowActionPerformed
     
      String userName = getName.getText();
      String userPhoneNo = getPhoneNumber.getText();
      String userEmail = getEmail.getText();
      String selectedPackage = getPackageName.getSelectedItem().toString().trim();
      String paymentTrsId = getTransactionId.getText();
      Pattern pattern = Pattern.compile(regex); 
      Matcher matcher = pattern.matcher(userEmail);
      if(userName.equals("")){
          changeBorderColorForTextFeild(getName,"#FF2D00");  //#FF2D00 is Red Color
      }if(userPhoneNo.equals("")){
          changeBorderColorForTextFeild(getPhoneNumber,"#FF2D00");  
      }if(userEmail.equals("")){
          changeBorderColorForTextFeild(getEmail,"#FF2D00");  
      }if(paymentTrsId.equals("")){
          changeBorderColorForTextFeild(getTransactionId,"#FF2D00");  
      }if(!matcher.matches()){
          changeBorderColorForTextFeild(getEmail,"#FF2D00");  
      }else{
         genarateQRCode(userName,userPhoneNo,userEmail,selectedPackage,paymentTrsId);
      }if(!userName.equals("")){
          changeBorderColorForTextFeild(getName,"#DCDADA");  //#FF2D00 is deep black
      }if(!userPhoneNo.equals("")){
          changeBorderColorForTextFeild(getPhoneNumber,"#DCDADA");  
      }if(matcher.matches()){
          changeBorderColorForTextFeild(getEmail,"#DCDADA");  
      }if(!paymentTrsId.equals("")){
          changeBorderColorForTextFeild(getTransactionId,"#DCDADA");  
      }
      
    }//GEN-LAST:event_clickBuyNowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clickBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBackMouseClicked
      this.setVisible(false);
      Login login = new Login();
      login.setVisible(true);
    }//GEN-LAST:event_clickBackMouseClicked

    private void getSelectedPackage(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getSelectedPackage
       
    }//GEN-LAST:event_getSelectedPackage
    
    private void changeBorderColorForTextFeild(javax.swing.JTextField jTextField,String colorCode) {
       jTextField.setBorder(BorderFactory.createLineBorder(Color.decode(colorCode)));
    }
    
    public String getMacAddress() throws UnknownHostException,
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
     private void genarateQRCode(String userName, String userPhoneNo, String userEmail, String selectedPackage, String paymentTrsId) {
        
         try {
          
             String loggedUserNameOfComputer = System.getProperty("user.name").toLowerCase().trim();
             String computerMacAddress = getMacAddress().replace(":", "");
            
             try {
                 String qrCodeData = userPhoneNo+"."+loggedUserNameOfComputer+"."+computerMacAddress;
                 String filePath = userPhoneNo+".png";
                 String charset = "UTF-8"; // or "ISO-8859-1"
                 Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
                 hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
                 BitMatrix matrix = new MultiFormatWriter().encode(
                         new String(qrCodeData.getBytes(charset), charset),
                         BarcodeFormat.QR_CODE, 200, 200, hintMap);
                 MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                         .lastIndexOf('.') + 1), new File(filePath));
                 if(Configaration.netIsAvailable())
                 {
                 sendMailToAuthority(userPhoneNo,userEmail,userName,selectedPackage,paymentTrsId);
                 }
                 else{            
                 Popup.error("No INTERNET CONNECTION");                
                 }
                 
             } catch (Exception e) {
                 System.err.println(e);
             }
         } catch (UnknownHostException ex) {
            Logger.getLogger(BuyNow.class.getName()).log(Level.SEVERE, null,ex);
        } catch (SocketException ex) {
            Logger.getLogger(BuyNow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    private void sendMailToAuthority(String fileName, String email, String userName, String selectedPackage, String paymentTrsId) {
        
        Mail.send(fileName,"eproni29@gmail.com",userName,selectedPackage,paymentTrsId);
        Mail.send(email,userName,selectedPackage,paymentTrsId);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyNow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel clickBack;
    private javax.swing.JButton clickBuyNow;
    private javax.swing.JTextField getEmail;
    private javax.swing.JTextField getName;
    private javax.swing.JComboBox<String> getPackageName;
    private javax.swing.JTextField getPhoneNumber;
    private javax.swing.JTextField getSerialKey;
    private javax.swing.JTextField getTransactionId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel qrCode;
    // End of variables declaration//GEN-END:variables

 

   

  
}
