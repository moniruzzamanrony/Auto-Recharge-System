
package auto.recharge.system;

import javax.swing.ImageIcon;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subTitleOfUserName = new javax.swing.JLabel();
        LoggedUserName = new javax.swing.JLabel();
        clickSetting = new javax.swing.JLabel();
        clickPaymentDetails = new javax.swing.JLabel();
        clickMyBalence = new javax.swing.JLabel();
        clickAddOfferAndReseller = new javax.swing.JLabel();
        clickBillPayment = new javax.swing.JLabel();
        clickMobileRecharge = new javax.swing.JLabel();
        menuBody = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rechargeDetailsTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        getPrepaidOrPostpaid = new javax.swing.JComboBox<>();
        getAmmountInTk = new javax.swing.JTextField();
        getMobileNumber = new javax.swing.JTextField();
        clickSend = new javax.swing.JLabel();
        networkBar = new javax.swing.JLabel();
        body_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subTitleOfUserName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        subTitleOfUserName.setForeground(new java.awt.Color(255, 255, 255));
        subTitleOfUserName.setText("Owner,Al Telecom");
        getContentPane().add(subTitleOfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        LoggedUserName.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LoggedUserName.setForeground(new java.awt.Color(255, 255, 255));
        LoggedUserName.setText("Moniruzzaman Rony");
        getContentPane().add(LoggedUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 150, -1));

        clickSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSettingMouseClicked(evt);
            }
        });
        getContentPane().add(clickSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 230, 50));

        clickPaymentDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickPaymentDetailsMouseClicked(evt);
            }
        });
        getContentPane().add(clickPaymentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 406, 240, 40));

        clickMyBalence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMyBalenceMouseClicked(evt);
            }
        });
        getContentPane().add(clickMyBalence, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 336, 240, 50));

        clickAddOfferAndReseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAddOfferAndResellerMouseClicked(evt);
            }
        });
        getContentPane().add(clickAddOfferAndReseller, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 230, 40));

        clickBillPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickBillPaymentMouseClicked(evt);
            }
        });
        getContentPane().add(clickBillPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 210, 230, 40));

        clickMobileRecharge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMobileRechargeMouseClicked(evt);
            }
        });
        getContentPane().add(clickMobileRecharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 240, 40));

        menuBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Manu.png"))); // NOI18N
        menuBody.setText("jLabel1");
        getContentPane().add(menuBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 720));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TrxId", "Mobile No.", "Ammount", "Date & Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        rechargeDetailsTable.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("TrxId");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Mobile No.");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Ammount");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Date & Time");
        }

        jPanel1.add(rechargeDetailsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 970, 150));

        getPrepaidOrPostpaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));
        getPrepaidOrPostpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrepaidOrPostpaidActionPerformed(evt);
            }
        });
        jPanel1.add(getPrepaidOrPostpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 190, 30));

        getAmmountInTk.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        getAmmountInTk.setForeground(new java.awt.Color(0, 0, 0));
        getAmmountInTk.setText("500");
        jPanel1.add(getAmmountInTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 520, 90));

        getMobileNumber.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        getMobileNumber.setText("01988841890");
        jPanel1.add(getMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 670, 90));

        clickSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSendMouseClicked(evt);
            }
        });
        jPanel1.add(clickSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 200, 40));

        networkBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        jPanel1.add(networkBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg.setBackground(new java.awt.Color(255, 255, 255));
        body_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_mobile_recharge.png"))); // NOI18N
        body_bg.setText("frgdfgh");
        body_bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(body_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1020, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clickMobileRechargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMobileRechargeMouseClicked
        System.out.println("auto.recharge.system.Home.clickMobileRechargeMouseClicked()");
    }//GEN-LAST:event_clickMobileRechargeMouseClicked

    private void clickAddOfferAndResellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAddOfferAndResellerMouseClicked
        updateLabelBcakground("add_offer_body");
        System.out.println("auto.recharge.system.Home.addOfferMenuBerClickMouseClicked()");
    }//GEN-LAST:event_clickAddOfferAndResellerMouseClicked

    private void clickBillPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBillPaymentMouseClicked
        updateLabelBcakground("body_bill_payment");
        System.out.println("auto.recharge.system.Home.clickBillPaymentMouseClicked()");
    }//GEN-LAST:event_clickBillPaymentMouseClicked

    private void clickMyBalenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMyBalenceMouseClicked
        System.out.println("auto.recharge.system.Home.clickMyBalenceMouseClicked()");
    }//GEN-LAST:event_clickMyBalenceMouseClicked

    private void clickPaymentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickPaymentDetailsMouseClicked
        System.out.println("auto.recharge.system.Home.clickPaymentDetailsMouseClicked()");
    }//GEN-LAST:event_clickPaymentDetailsMouseClicked

    private void clickSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSettingMouseClicked
        System.out.println("auto.recharge.system.Home.clickSettingMouseClicked()");
    }//GEN-LAST:event_clickSettingMouseClicked

    private void getPrepaidOrPostpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPrepaidOrPostpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPrepaidOrPostpaidActionPerformed

    private void clickSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSendMouseClicked
        System.out.println("auto.recharge.system.Home.clickSendMouseClicked()");
    }//GEN-LAST:event_clickSendMouseClicked

 
    public void showDeshBoardPage() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    protected void updateLabelBcakground(String name) {
           System.out.println(name);
//            ImageIcon imageIcon = new ImageIcon("images/"+name+".png");  
//            
//            body_bg.setSize(1280, 720);
//            body_bg.setIcon(imageIcon);
//            body_bg.setText(null);
//            body_bg.revalidate();
//            body_bg.repaint();     
                this.remove(jTable1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoggedUserName;
    private javax.swing.JLabel body_bg;
    private javax.swing.JLabel clickAddOfferAndReseller;
    private javax.swing.JLabel clickBillPayment;
    private javax.swing.JLabel clickMobileRecharge;
    private javax.swing.JLabel clickMyBalence;
    private javax.swing.JLabel clickPaymentDetails;
    private javax.swing.JLabel clickSend;
    private javax.swing.JLabel clickSetting;
    private javax.swing.JTextField getAmmountInTk;
    private javax.swing.JTextField getMobileNumber;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel menuBody;
    private javax.swing.JLabel networkBar;
    private javax.swing.JScrollPane rechargeDetailsTable;
    private javax.swing.JLabel subTitleOfUserName;
    // End of variables declaration//GEN-END:variables
}
