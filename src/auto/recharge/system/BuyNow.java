package auto.recharge.system;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.itvillage.AES;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Calendar;
import java.util.Date;
import java.net.URL;
import javax.swing.ImageIcon;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class BuyNow extends javax.swing.JFrame {

    private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private final DBMySQLConnection mySQLConnection = new DBMySQLConnection();
    private JDialog processtingLoderDialog;

    public BuyNow() {
        initComponents();
        processingLoderDialog();

        URL url = getClass().getResource("/resources/images/logo64.png");
        ImageIcon imgicon = new ImageIcon(url);
        this.setIconImage(imgicon.getImage());
        this.setTitle("Auto Recharge with Managment");
        // new BuyNow().setVisible(true);
        setKeyBoardControl();
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
        getPackageName = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        clickBuyNow = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        getShopName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        shopAddress = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 5));

        getName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNameActionPerformed(evt);
            }
        });

        getPhoneNumber.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        getEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEmailActionPerformed(evt);
            }
        });

        getPackageName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trial Package @ 7days", "Monthly Package @1month", "Monthly Package @6month", "Silver Package @ 1year", "Gold Package @ 2years", "Diamond Package @3years", "Premium Package @Lifetime" }));
        getPackageName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                getSelectedPackage(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 0, 51));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Apply Form");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/verify.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setText("Name: ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("**If you haven't nay Serial Key then BUY NOW");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setText("Phone : ");

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setText("Email: ");

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel11.setText("Select Package: ");

        clickBuyNow.setBackground(new java.awt.Color(0, 153, 51));
        clickBuyNow.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        clickBuyNow.setForeground(new java.awt.Color(255, 255, 255));
        clickBuyNow.setText("BUY NOW");
        clickBuyNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickBuyNowActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel14.setText("Shop Name:");

        getShopName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getShopName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getShopNameActionPerformed(evt);
            }
        });

        shopAddress.setColumns(20);
        shopAddress.setRows(5);
        jScrollPane1.setViewportView(shopAddress);

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel12.setText("Address");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(getEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                    .addComponent(getPhoneNumber)
                                    .addComponent(getName))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getPackageName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(getShopName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clickBuyNow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(getName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(getPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(getEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getShopName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(getPackageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clickBuyNow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Auto Recharge System");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Helpline : 01816385858,01913350462");

        qrCode.setForeground(new java.awt.Color(204, 0, 51));
        qrCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qrCode.setText("No Package Found!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qrCode, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qrCode, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        getSerialKey.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Serial Key:");

        jButton1.setText("Active now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clickBack.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clickBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        clickBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(clickBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(getSerialKey, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clickBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(getSerialKey, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    private void clickBuyNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickBuyNowActionPerformed

        buyNowClick();

    }//GEN-LAST:event_clickBuyNowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                System.out.println("Verifing...");
                processtingLoderDialog.setVisible(true);
                verifySerialKey();
                return null;
            }

            @Override
            protected void done() {
                System.out.println("Login Done..");

                processtingLoderDialog.setVisible(false);
            }

        };

        swingWorker.execute();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void clickBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBackMouseClicked
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_clickBackMouseClicked

    private void getSelectedPackage(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getSelectedPackage

    }//GEN-LAST:event_getSelectedPackage

    private void getShopNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getShopNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getShopNameActionPerformed

    private void getNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel clickBack;
    private javax.swing.JButton clickBuyNow;
    private javax.swing.JTextField getEmail;
    private javax.swing.JTextField getName;
    private javax.swing.JComboBox<String> getPackageName;
    private javax.swing.JTextField getPhoneNumber;
    private javax.swing.JTextField getSerialKey;
    private javax.swing.JTextField getShopName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel qrCode;
    private javax.swing.JTextArea shopAddress;
    // End of variables declaration//GEN-END:variables

//    ---------------------------------- Custom Methods ----------------------------------------------------
    private void genarateQRCode(String clientName, String userPhoneNo, String userEmail, String selectedPackage, String shopName, String userId, String shopAddress) {
        Log.mgs("389", "Genarating QR COde");

        // String loggedUserNameOfComputer = System.getProperty("user.name").toLowerCase().trim();
        String computerMacAddress = Configaration.getMacAddress().replace(":", "");
        System.err.println(computerMacAddress);

        try {

            String qrCodeData = userPhoneNo + "," + clientName
                    + "," + computerMacAddress.toLowerCase() + "," + userId
                    + "," + selectedPackage + "," + userEmail + "," + shopName + "," + shopAddress;

            String encryptQrCodeData = qrCodeData;
            String filePath = userPhoneNo + ".png";
            String charset = "UTF-8";
            Map< EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap< EncodeHintType, ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                    new String(encryptQrCodeData.getBytes(charset), charset),
                    BarcodeFormat.QR_CODE, 200, 200, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                    .lastIndexOf('.') + 1), new File(filePath));
            Log.mgs("463", "Genarating QR COde Success");
            sendMailToAuthority(userPhoneNo, userEmail, clientName, selectedPackage, shopName, userId);
        } catch (Exception e) {
            System.err.println("458--->" + e.getMessage());
        }

    }

    private void sendMailToAuthority(String fileName, String email, String userName, String selectedPackage, String paymentTrsId, String userId) {
        Log.mgs("428", "Mail Send Method.");
        Mail mail = new Mail(userId);
        mail.send(fileName, "auto.recharge20bd@gmail.com", userName, selectedPackage, paymentTrsId, email);
        mail.send(email, userName, selectedPackage, paymentTrsId);
    }

    private void verifySerialKey() {

        String userIdFromSQL = null, nameFromSQL = null, phoneNoFromSQL = null, shopNameFromSQL = null,
                addessFromSQL = null, passwordFromSQL = null, activePackageFromSQL = null,
                macAddreassFromSQL = null, emailFromSQL = null, activeDateFromSQL = null, expireDateFromSQL = null, packageValidity = null, role = null;
        String serialKey = getSerialKey.getText();
        String encryptedSerialKey = AES.decrypt(serialKey, "itvillage428854");
        if (encryptedSerialKey == null) {
            Popup.error("Invalid Serial Key");
        }
        System.err.println(encryptedSerialKey);
        String[] values = encryptedSerialKey.split(",");
        String userId = values[1];
        if (isUserIdIsExist(userId)) {
            Popup.customError("Invalid Serial Key");
        } else {
            Log.mgs("User Id:", userId);
            if (!serialKey.equals("")) {
                try {
                    Connection conn = mySQLConnection.connect();
                    String query = "SELECT * from user_info WHERE user_id=\'" + userId + "\'";
                    PreparedStatement stm = conn.prepareStatement(query);
                    ResultSet rs = stm.executeQuery();
                    while (rs.next()) {
                        userIdFromSQL = rs.getString("user_id");
                        nameFromSQL = rs.getString("client_name");
                        phoneNoFromSQL = rs.getString("phone_no");
                        shopNameFromSQL = rs.getString("shop_name");
                        addessFromSQL = rs.getString("shop_address");
                        passwordFromSQL = rs.getString("initial_password");
                        activePackageFromSQL = rs.getString("package_name");
                        macAddreassFromSQL = rs.getString("mac_address");
                        emailFromSQL = rs.getString("email");
                        activeDateFromSQL = rs.getString("active_date");
                        expireDateFromSQL = rs.getString("expaied_date");
                        packageValidity = rs.getString("package_validity");
                        role = rs.getString("role");
                        System.out.println("Username : " + userIdFromSQL + "\n" + "Password : " + passwordFromSQL);

                    }
                    mySQLConnection.disconnect();
                    if (isAuthrizeMacAddress(macAddreassFromSQL)) {

                        saveToDbUserInfo(userIdFromSQL, nameFromSQL, phoneNoFromSQL, shopNameFromSQL,
                                addessFromSQL, passwordFromSQL, activePackageFromSQL, macAddreassFromSQL, emailFromSQL, activeDateFromSQL, expireDateFromSQL, packageValidity, role);
                    } else {
                        Popup.customError("Unauthrize Computer");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(BuyNow.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                Configaration.changeBorderColorForTextFeild(getSerialKey, "#FF2D00");
            }
        }
    }

    private boolean isUserIdIsExist(String userId) {
        boolean isExist = false;
        Connection conn = DbConnection.connect();
        try {

            String query = "SELECT * from user_info WHERE user_id=\'" + userId + "\'";
            PreparedStatement stm = conn.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String userName = rs.getString("user_id");
                // String password = rs.getString("phone_no");

                System.out.println("Username ---------------------------: " + userName);
                isExist = true;
            }

        } catch (SQLException ex) {
            Log.error("SQLException", ex.toString());
            isExist = false;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BuyNow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return isExist;

    }

    private void saveToDbUserInfo(String userIdFromSQL, String nameFromSQL,
            String phoneNoFromSQL, String shopNameFromSQL, String addessFromSQL,
            String passwordFromSQL, String activePackageFromSQL,
            String macAddreassFromSQL, String emailFromSQL,
            String activeDateFromSQL, String expireDateFromSQL,
            String packageValidity, String role) {

        String activeDate = Configaration.getCurrentDate();
        int packageValidityInt = Integer.parseInt(packageValidity);
        String expairedDate = addDays(Configaration.stringToDateType(activeDate), packageValidityInt);

        Connection conn = DbConnection.connect();
        String sql = "INSERT INTO user_info(user_id,name,phone_no,shop_name,address,password,active_package,mac_address,email,active_date,expire_date,active_status,role) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, userIdFromSQL);
            preparedStatement.setString(2, nameFromSQL);
            preparedStatement.setString(3, phoneNoFromSQL);
            preparedStatement.setString(4, shopNameFromSQL);
            preparedStatement.setString(5, addessFromSQL);
            preparedStatement.setString(6, AES.encrypt(passwordFromSQL, "itvillage428854"));
            preparedStatement.setString(7, activePackageFromSQL);
            preparedStatement.setString(8, macAddreassFromSQL);
            preparedStatement.setString(9, emailFromSQL);
            preparedStatement.setString(10, activeDateFromSQL);
            preparedStatement.setString(11, expireDateFromSQL);
            preparedStatement.setString(12, "true");
            preparedStatement.setString(13, role);
            preparedStatement.execute();
            Popup.customSuccess();
            getSerialKey.setText("");
            this.setVisible(false);
            Login login = new Login();
            login.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String addDays(Date d, int days) {

        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_MONTH, days);

        return Configaration.getJustDate(c.getTime());
    }

    private boolean isAuthrizeMacAddress(String macAddreassFromSQL) {
        boolean isAuthrizeMacAddress = false;

        String computerMacAddress = Configaration.getMacAddress().replace(":", "");
        System.err.println(computerMacAddress + "  " + macAddreassFromSQL);
        if (computerMacAddress.equals(macAddreassFromSQL)) {
            isAuthrizeMacAddress = true;
        }

        return isAuthrizeMacAddress;
    }

    private void processingLoderDialog() {

        ProcesseingLoderUI processeingLoderUI = new ProcesseingLoderUI();

        processtingLoderDialog = new JDialog();
        processtingLoderDialog.add(processeingLoderUI);
        processtingLoderDialog.setSize(404, 381);
        processtingLoderDialog.setLocationRelativeTo(null);
        processtingLoderDialog.setUndecorated(true);

    }

    private void setKeyBoardControl() {
        getName.requestFocusInWindow();

        getName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getPhoneNumber.requestFocusInWindow();

                }
            }
        });

        getPhoneNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getEmail.requestFocusInWindow();

                }
            }
        });
        getEmail.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getShopName.requestFocusInWindow();

                }
            }
        });
        getShopName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getPackageName.requestFocusInWindow();

                }
            }
        });
        getPackageName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    shopAddress.requestFocusInWindow();

                }
            }
        });
        shopAddress.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickBuyNow.requestFocusInWindow();

                }
            }
        });

        clickBuyNow.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    buyNowClick();

                }
            }
        });

        // For Serial Key
        getSerialKey.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    jButton1.requestFocusInWindow();

                }
            }
        });

        jButton1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            System.out.println("Verifing...");
                            processtingLoderDialog.setVisible(true);
                            verifySerialKey();
                            return null;
                        }

                        @Override
                        protected void done() {
                          
                            processtingLoderDialog.setVisible(false);
                        }

                    };

                    swingWorker.execute();

                }
            }
        });
    }

    private void buyNowClick() {
        String clientName = getName.getText();
        String userPhoneNo = getPhoneNumber.getText();
        String userEmail = getEmail.getText();
        String selectedPackage = getPackageName.getSelectedItem().toString().trim();
        String shopName = getShopName.getText();
        String shopAddress = this.shopAddress.getText();
        String userId = User.getUserId().toLowerCase();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userEmail);

        if (clientName.equals("")) {
            Configaration.changeBorderColorForTextFeild(getName, "#FF2D00");  //#FF2D00 is Red Color
        }
        if (userPhoneNo.equals("")) {
            Configaration.changeBorderColorForTextFeild(getPhoneNumber, "#FF2D00");
        }
        if (userEmail.equals("")) {
            Configaration.changeBorderColorForTextFeild(getEmail, "#FF2D00");
        }
        if (shopName.equals("")) {
            Configaration.changeBorderColorForTextFeild(getShopName, "#FF2D00");
        }
        if (!matcher.matches()) {
            Configaration.changeBorderColorForTextFeild(getEmail, "#FF2D00");
        } else {
            if (Configaration.netIsAvailable()) {

                int result = JOptionPane.showConfirmDialog(bg, "Are you sure?", "Auto Recharge System", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (result == 1) {
                    getName.setText("");
                    getPhoneNumber.setText("");
                    getEmail.setText("");
                    getShopName.setText("");
                    Log.mgs("272", "Reset Done.");
                } else {
                    Log.mgs("274", "Start Swing Worker.");
                    SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            Log.mgs("269", "Clicked.");
                            clickBuyNow.setText("Please Wait..");
                            clickBuyNow.setEnabled(false);
                            processtingLoderDialog.setVisible(true);
                            genarateQRCode(clientName, userPhoneNo, userEmail, selectedPackage, shopName, userId, shopAddress);
                            return null;
                        }

                        @Override
                        protected void done() {
                            clickBuyNow.setText("Buy Now");
                            clickBuyNow.setEnabled(true);
                            getName.setText("");
                            getPhoneNumber.setText("");
                            getEmail.setText("");
                            getShopName.setText("");
                            processtingLoderDialog.setVisible(false);
                            Log.mgs("275", "Task Completed.");
                        }

                    };
                    swingWorker.execute();

                }
            } else {
                Popup.error("No INTERNET CONNECTION");
            }

        }

        if (!clientName.equals("")) {
            Configaration.changeBorderColorForTextFeild(getName, "#DCDADA");  //#FF2D00 is deep black
        }
        if (!userPhoneNo.equals("")) {
            Configaration.changeBorderColorForTextFeild(getPhoneNumber, "#DCDADA");
        }
        if (matcher.matches()) {
            Configaration.changeBorderColorForTextFeild(getEmail, "#DCDADA");
        }
        if (!shopName.equals("")) {
            Configaration.changeBorderColorForTextFeild(getShopName, "#DCDADA");
        }
    }

}
