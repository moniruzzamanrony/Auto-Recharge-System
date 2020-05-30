
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
        basePanel = new javax.swing.JPanel();
        mobileRechargePanel = new javax.swing.JPanel();
        rechargeDetailsTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        getPrepaidOrPostpaid = new javax.swing.JComboBox<>();
        getAmmountInTk = new javax.swing.JTextField();
        getMobileNumber = new javax.swing.JTextField();
        clickSend = new javax.swing.JLabel();
        networkBar = new javax.swing.JLabel();
        body_bg = new javax.swing.JLabel();
        billPaymentPanel = new javax.swing.JPanel();
        getPrepaidOrPostpaid1 = new javax.swing.JComboBox<>();
        clickSend1 = new javax.swing.JLabel();
        networkBar1 = new javax.swing.JLabel();
        body_bg1 = new javax.swing.JLabel();
        addOfferAndResellerPanel = new javax.swing.JPanel();
        clickSimOffer = new javax.swing.JLabel();
        clickNewReseller = new javax.swing.JLabel();
        clickPackageOffer = new javax.swing.JLabel();
        networkBar2 = new javax.swing.JLabel();
        body_bg2 = new javax.swing.JLabel();
        myBalencePanel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        showingAmmountInTk = new javax.swing.JLabel();
        CurrencyType = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        getSelectedSimOperator = new javax.swing.JComboBox<>();
        clickSend3 = new javax.swing.JLabel();
        networkBar3 = new javax.swing.JLabel();
        body_bg3 = new javax.swing.JLabel();
        paymentDetailsPanel = new javax.swing.JPanel();
        rechargeDetailsTable4 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        getPrepaidOrPostpaid4 = new javax.swing.JComboBox<>();
        getAmmountInTk4 = new javax.swing.JTextField();
        getMobileNumber4 = new javax.swing.JTextField();
        clickSend4 = new javax.swing.JLabel();
        networkBar4 = new javax.swing.JLabel();
        body_bg4 = new javax.swing.JLabel();
        settingPanel = new javax.swing.JPanel();
        rechargeDetailsTable5 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        getPrepaidOrPostpaid5 = new javax.swing.JComboBox<>();
        getAmmountInTk5 = new javax.swing.JTextField();
        getMobileNumber5 = new javax.swing.JTextField();
        clickSend5 = new javax.swing.JLabel();
        networkBar5 = new javax.swing.JLabel();
        body_bg5 = new javax.swing.JLabel();

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

        basePanel.setLayout(new java.awt.CardLayout());

        mobileRechargePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        mobileRechargePanel.add(rechargeDetailsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 970, 150));

        getPrepaidOrPostpaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));
        getPrepaidOrPostpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrepaidOrPostpaidActionPerformed(evt);
            }
        });
        mobileRechargePanel.add(getPrepaidOrPostpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 190, 30));

        getAmmountInTk.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        getAmmountInTk.setForeground(new java.awt.Color(0, 0, 0));
        getAmmountInTk.setText("500");
        mobileRechargePanel.add(getAmmountInTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 520, 90));

        getMobileNumber.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        getMobileNumber.setText("01988841890");
        mobileRechargePanel.add(getMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 670, 90));

        clickSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSendMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(clickSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 200, 40));

        networkBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        mobileRechargePanel.add(networkBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg.setBackground(new java.awt.Color(255, 255, 255));
        body_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_mobile_recharge.png"))); // NOI18N
        body_bg.setText("frgdfgh");
        body_bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mobileRechargePanel.add(body_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(mobileRechargePanel, "card2");

        billPaymentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getPrepaidOrPostpaid1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));
        getPrepaidOrPostpaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrepaidOrPostpaid1ActionPerformed(evt);
            }
        });
        billPaymentPanel.add(getPrepaidOrPostpaid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 760, 40));

        clickSend1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSend1MouseClicked(evt);
            }
        });
        billPaymentPanel.add(clickSend1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 200, 40));

        networkBar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        billPaymentPanel.add(networkBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg1.setBackground(new java.awt.Color(255, 255, 255));
        body_bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_bill_payment.png"))); // NOI18N
        body_bg1.setText("frgdfgh");
        body_bg1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        billPaymentPanel.add(body_bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(billPaymentPanel, "card2");

        addOfferAndResellerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        addOfferAndResellerPanel.add(clickSimOffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 150, 160));

        clickNewReseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickNewResellerMouseClicked(evt);
            }
        });
        addOfferAndResellerPanel.add(clickNewReseller, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 160, 160));
        addOfferAndResellerPanel.add(clickPackageOffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 160, 160));

        networkBar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        addOfferAndResellerPanel.add(networkBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg2.setBackground(new java.awt.Color(255, 255, 255));
        body_bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/add_offer_body.png"))); // NOI18N
        body_bg2.setText("frgdfgh");
        body_bg2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        addOfferAndResellerPanel.add(body_bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(addOfferAndResellerPanel, "card2");

        myBalencePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        header.setText("Current Balence");
        myBalencePanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        showingAmmountInTk.setFont(new java.awt.Font("Bahnschrift", 0, 170)); // NOI18N
        showingAmmountInTk.setForeground(new java.awt.Color(255, 51, 0));
        showingAmmountInTk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showingAmmountInTk.setText("XXXXXX");
        showingAmmountInTk.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        showingAmmountInTk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showingAmmountInTk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        myBalencePanel.add(showingAmmountInTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 650, 220));

        CurrencyType.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        CurrencyType.setText("BDT");
        myBalencePanel.add(CurrencyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, -1, -1));

        jLabel1.setText("Icon");
        myBalencePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 70, 60));

        getSelectedSimOperator.setBackground(new java.awt.Color(255, 255, 255));
        getSelectedSimOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        myBalencePanel.add(getSelectedSimOperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 690, 40));

        clickSend3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSend3MouseClicked(evt);
            }
        });
        myBalencePanel.add(clickSend3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 200, 40));

        networkBar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        myBalencePanel.add(networkBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg3.setBackground(new java.awt.Color(255, 255, 255));
        body_bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_my_balence.png"))); // NOI18N
        body_bg3.setText("frgdfgh");
        body_bg3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        myBalencePanel.add(body_bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(myBalencePanel, "card2");

        paymentDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        rechargeDetailsTable4.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setHeaderValue("TrxId");
            jTable5.getColumnModel().getColumn(1).setHeaderValue("Mobile No.");
            jTable5.getColumnModel().getColumn(2).setHeaderValue("Ammount");
            jTable5.getColumnModel().getColumn(3).setHeaderValue("Date & Time");
        }

        paymentDetailsPanel.add(rechargeDetailsTable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 970, 150));

        getPrepaidOrPostpaid4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));
        getPrepaidOrPostpaid4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrepaidOrPostpaid4ActionPerformed(evt);
            }
        });
        paymentDetailsPanel.add(getPrepaidOrPostpaid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 190, 30));

        getAmmountInTk4.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        getAmmountInTk4.setForeground(new java.awt.Color(0, 0, 0));
        getAmmountInTk4.setText("500");
        paymentDetailsPanel.add(getAmmountInTk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 520, 90));

        getMobileNumber4.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        getMobileNumber4.setText("01988841890");
        paymentDetailsPanel.add(getMobileNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 670, 90));

        clickSend4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSend4MouseClicked(evt);
            }
        });
        paymentDetailsPanel.add(clickSend4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 200, 40));

        networkBar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        paymentDetailsPanel.add(networkBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg4.setBackground(new java.awt.Color(255, 255, 255));
        body_bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_mobile_recharge.png"))); // NOI18N
        body_bg4.setText("frgdfgh");
        body_bg4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        paymentDetailsPanel.add(body_bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(paymentDetailsPanel, "card2");

        settingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        rechargeDetailsTable5.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setHeaderValue("TrxId");
            jTable6.getColumnModel().getColumn(1).setHeaderValue("Mobile No.");
            jTable6.getColumnModel().getColumn(2).setHeaderValue("Ammount");
            jTable6.getColumnModel().getColumn(3).setHeaderValue("Date & Time");
        }

        settingPanel.add(rechargeDetailsTable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 970, 150));

        getPrepaidOrPostpaid5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));
        getPrepaidOrPostpaid5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrepaidOrPostpaid5ActionPerformed(evt);
            }
        });
        settingPanel.add(getPrepaidOrPostpaid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 190, 30));

        getAmmountInTk5.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        getAmmountInTk5.setForeground(new java.awt.Color(0, 0, 0));
        getAmmountInTk5.setText("500");
        settingPanel.add(getAmmountInTk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 520, 90));

        getMobileNumber5.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        getMobileNumber5.setText("01988841890");
        settingPanel.add(getMobileNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 670, 90));

        clickSend5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSend5MouseClicked(evt);
            }
        });
        settingPanel.add(clickSend5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 200, 40));

        networkBar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        settingPanel.add(networkBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg5.setBackground(new java.awt.Color(255, 255, 255));
        body_bg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_mobile_recharge.png"))); // NOI18N
        body_bg5.setText("frgdfgh");
        body_bg5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        settingPanel.add(body_bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(settingPanel, "card2");

        getContentPane().add(basePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1020, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clickMobileRechargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMobileRechargeMouseClicked
        
        switchPanelViaMenu(mobileRechargePanel);
        System.out.println("Switch to Mobile Recharge Panel");
    }//GEN-LAST:event_clickMobileRechargeMouseClicked

    private void clickAddOfferAndResellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAddOfferAndResellerMouseClicked
        
        switchPanelViaMenu(addOfferAndResellerPanel);
        System.out.println("Switch to Add Offer Panel Panel");
    }//GEN-LAST:event_clickAddOfferAndResellerMouseClicked

    private void clickBillPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBillPaymentMouseClicked
        
        switchPanelViaMenu(billPaymentPanel);
        System.out.println("Switch to Bill Payment Panel");
    }//GEN-LAST:event_clickBillPaymentMouseClicked

    private void clickMyBalenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMyBalenceMouseClicked
       
        switchPanelViaMenu(myBalencePanel);
        System.out.println("Switch to My Balence Panel");
    }//GEN-LAST:event_clickMyBalenceMouseClicked

    private void clickPaymentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickPaymentDetailsMouseClicked
        
        switchPanelViaMenu(paymentDetailsPanel);
        System.out.println("Switch to Payment Details Panel");
    }//GEN-LAST:event_clickPaymentDetailsMouseClicked

    private void clickSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSettingMouseClicked
       
        switchPanelViaMenu(settingPanel);
        System.out.println("Switch to Setting Panel");
    }//GEN-LAST:event_clickSettingMouseClicked

    private void getPrepaidOrPostpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPrepaidOrPostpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPrepaidOrPostpaidActionPerformed

    private void clickSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSendMouseClicked
        System.out.println("auto.recharge.system.Home.clickSendMouseClicked()");
    }//GEN-LAST:event_clickSendMouseClicked

    private void getPrepaidOrPostpaid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPrepaidOrPostpaid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPrepaidOrPostpaid1ActionPerformed

    private void clickSend1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSend1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clickSend1MouseClicked

    private void clickNewResellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNewResellerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clickNewResellerMouseClicked

    private void clickSend3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSend3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clickSend3MouseClicked

    private void getPrepaidOrPostpaid4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPrepaidOrPostpaid4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPrepaidOrPostpaid4ActionPerformed

    private void clickSend4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSend4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clickSend4MouseClicked

    private void getPrepaidOrPostpaid5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPrepaidOrPostpaid5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPrepaidOrPostpaid5ActionPerformed

    private void clickSend5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSend5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clickSend5MouseClicked

 
    public void showDeshBoardPage() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    protected void switchPanelViaMenu(javax.swing.JPanel requestedPanel) {
        basePanel.removeAll();
        basePanel.repaint();
        basePanel.revalidate();
        
        basePanel.add(requestedPanel);
        basePanel.repaint();
        basePanel.revalidate();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrencyType;
    private javax.swing.JLabel LoggedUserName;
    private javax.swing.JPanel addOfferAndResellerPanel;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel billPaymentPanel;
    private javax.swing.JLabel body_bg;
    private javax.swing.JLabel body_bg1;
    private javax.swing.JLabel body_bg2;
    private javax.swing.JLabel body_bg3;
    private javax.swing.JLabel body_bg4;
    private javax.swing.JLabel body_bg5;
    private javax.swing.JLabel clickAddOfferAndReseller;
    private javax.swing.JLabel clickBillPayment;
    private javax.swing.JLabel clickMobileRecharge;
    private javax.swing.JLabel clickMyBalence;
    private javax.swing.JLabel clickNewReseller;
    private javax.swing.JLabel clickPackageOffer;
    private javax.swing.JLabel clickPaymentDetails;
    private javax.swing.JLabel clickSend;
    private javax.swing.JLabel clickSend1;
    private javax.swing.JLabel clickSend3;
    private javax.swing.JLabel clickSend4;
    private javax.swing.JLabel clickSend5;
    private javax.swing.JLabel clickSetting;
    private javax.swing.JLabel clickSimOffer;
    private javax.swing.JTextField getAmmountInTk;
    private javax.swing.JTextField getAmmountInTk4;
    private javax.swing.JTextField getAmmountInTk5;
    private javax.swing.JTextField getMobileNumber;
    private javax.swing.JTextField getMobileNumber4;
    private javax.swing.JTextField getMobileNumber5;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid1;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid4;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid5;
    private javax.swing.JComboBox<String> getSelectedSimOperator;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JLabel menuBody;
    private javax.swing.JPanel mobileRechargePanel;
    private javax.swing.JPanel myBalencePanel;
    private javax.swing.JLabel networkBar;
    private javax.swing.JLabel networkBar1;
    private javax.swing.JLabel networkBar2;
    private javax.swing.JLabel networkBar3;
    private javax.swing.JLabel networkBar4;
    private javax.swing.JLabel networkBar5;
    private javax.swing.JPanel paymentDetailsPanel;
    private javax.swing.JScrollPane rechargeDetailsTable;
    private javax.swing.JScrollPane rechargeDetailsTable4;
    private javax.swing.JScrollPane rechargeDetailsTable5;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JLabel showingAmmountInTk;
    private javax.swing.JLabel subTitleOfUserName;
    // End of variables declaration//GEN-END:variables
}
