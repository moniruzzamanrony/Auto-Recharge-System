
package auto.recharge.system;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class Home extends javax.swing.JFrame {
   
    public Home() {
        initComponents();
        popupMenu.add(confirmPopUp);
        setFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmPopUp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        popupMenu = new javax.swing.JPopupMenu();
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
        clickClose = new javax.swing.JLabel();
        clickMinimize = new javax.swing.JLabel();
        networkBar = new javax.swing.JLabel();
        helpBar = new javax.swing.JLabel();
        clickGroupLoad = new javax.swing.JButton();
        clickUssdDail = new javax.swing.JButton();
        getPrepaidOrPostpaid = new javax.swing.JComboBox<>();
        getAmmountInTk = new javax.swing.JTextField();
        getMobileNumber = new javax.swing.JTextField();
        clickContactList = new javax.swing.JLabel();
        clickSend = new javax.swing.JLabel();
        selectedSimOperatorIcon = new javax.swing.JLabel();
        body_bg = new javax.swing.JLabel();
        billPaymentPanel = new javax.swing.JPanel();
        getPrepaidOrPostpaid1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
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
        CurrencyType1 = new javax.swing.JLabel();
        showingAmmountInTk1 = new javax.swing.JLabel();
        balenceDetails = new javax.swing.JLabel();
        header1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        getSelectedSimOperator = new javax.swing.JComboBox<>();
        clickSend3 = new javax.swing.JLabel();
        networkBar3 = new javax.swing.JLabel();
        body_bg3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        paymentDetailsPanel = new javax.swing.JPanel();
        payementDetailsTable = new javax.swing.JScrollPane();
        paymentDetailsTable = new javax.swing.JTable();
        getSearchViaPhoneNoAndTrnId = new javax.swing.JTextField();
        clickAdvanceSearch = new javax.swing.JLabel();
        clickSend4 = new javax.swing.JLabel();
        networkBar4 = new javax.swing.JLabel();
        body_bg4 = new javax.swing.JLabel();
        settingPanel = new javax.swing.JPanel();
        newServiceAdding = new javax.swing.JButton();
        softwareSetting = new javax.swing.JButton();
        setDefaultSetting = new javax.swing.JButton();
        myProfile1 = new javax.swing.JButton();
        buyOfferPack = new javax.swing.JButton();
        networkBar5 = new javax.swing.JLabel();
        body_bg5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");
        confirmPopUp.add(jLabel4);

        popupMenu.setMinimumSize(new java.awt.Dimension(32767, 32767));

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

        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Mobile No.", "Ammount", "Date & Time", "Status", "TrxId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        rechargeDetailsTable.setViewportView(jTable1);

        mobileRechargePanel.add(rechargeDetailsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 960, 140));

        clickClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickCloseMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(clickClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 5, 20, 30));

        clickMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMinimizeMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(clickMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 5, 20, 30));

        networkBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        mobileRechargePanel.add(networkBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 5, -1, -1));

        helpBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/HelplineBar.png"))); // NOI18N
        helpBar.setText("jLabel3");
        mobileRechargePanel.add(helpBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 260, 112));

        clickGroupLoad.setText("Group Load");
        mobileRechargePanel.add(clickGroupLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 270, 120, 40));

        clickUssdDail.setText("Ussd Dail");
        clickUssdDail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUssdDailActionPerformed(evt);
            }
        });
        mobileRechargePanel.add(clickUssdDail, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 220, 120, 40));

        getPrepaidOrPostpaid.setBackground(new java.awt.Color(255, 255, 255));
        getPrepaidOrPostpaid.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getPrepaidOrPostpaid.setForeground(new java.awt.Color(204, 51, 0));
        getPrepaidOrPostpaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));
        getPrepaidOrPostpaid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getPrepaidOrPostpaid.setMinimumSize(new java.awt.Dimension(83, 20));
        getPrepaidOrPostpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrepaidOrPostpaidActionPerformed(evt);
            }
        });
        mobileRechargePanel.add(getPrepaidOrPostpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 335, 215, 60));

        getAmmountInTk.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        getAmmountInTk.setForeground(new java.awt.Color(0, 0, 0));
        getAmmountInTk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getAmmountInTk.setBorder(null);
        getAmmountInTk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getAmmountInTkMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(getAmmountInTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 520, 90));

        getMobileNumber.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        getMobileNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getMobileNumber.setBorder(null);
        getMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMobileNumberActionPerformed(evt);
            }
        });
        mobileRechargePanel.add(getMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 670, 90));

        clickContactList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickContactListMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(clickContactList, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 50, 40));

        clickSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSendMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(clickSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 200, 40));

        selectedSimOperatorIcon.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        selectedSimOperatorIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedSimOperatorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/sim.png"))); // NOI18N
        selectedSimOperatorIcon.setToolTipText("");
        mobileRechargePanel.add(selectedSimOperatorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 50, 50));

        body_bg.setBackground(new java.awt.Color(255, 255, 255));
        body_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_mobile_recharge.png"))); // NOI18N
        body_bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mobileRechargePanel.add(body_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(mobileRechargePanel, "card2");

        billPaymentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getPrepaidOrPostpaid1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        getPrepaidOrPostpaid1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bKash", "Rocket" }));
        getPrepaidOrPostpaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrepaidOrPostpaid1ActionPerformed(evt);
            }
        });
        billPaymentPanel.add(getPrepaidOrPostpaid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 175, 780, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/sim.png"))); // NOI18N
        billPaymentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, 70, 60));

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

        header.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Current Balence");
        myBalencePanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 340, 40));

        showingAmmountInTk.setFont(new java.awt.Font("Bahnschrift", 0, 90)); // NOI18N
        showingAmmountInTk.setForeground(new java.awt.Color(255, 51, 0));
        showingAmmountInTk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showingAmmountInTk.setText("XXXXXX");
        showingAmmountInTk.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        showingAmmountInTk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showingAmmountInTk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        myBalencePanel.add(showingAmmountInTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 330, 110));

        CurrencyType.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        CurrencyType.setText("BDT");
        myBalencePanel.add(CurrencyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 50, 30));

        CurrencyType1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        CurrencyType1.setText("BDT");
        myBalencePanel.add(CurrencyType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 50, 30));

        showingAmmountInTk1.setFont(new java.awt.Font("Bahnschrift", 0, 90)); // NOI18N
        showingAmmountInTk1.setForeground(new java.awt.Color(255, 51, 0));
        showingAmmountInTk1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showingAmmountInTk1.setText("XXXXXX");
        showingAmmountInTk1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        showingAmmountInTk1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showingAmmountInTk1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        myBalencePanel.add(showingAmmountInTk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 330, 120));

        balenceDetails.setForeground(new java.awt.Color(255, 0, 51));
        balenceDetails.setText("Details..");
        myBalencePanel.add(balenceDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, -1, -1));

        header1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header1.setText("Total Profit");
        myBalencePanel.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 380, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/sim.png"))); // NOI18N
        myBalencePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 70, 60));

        getSelectedSimOperator.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        getSelectedSimOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bKash", "Robi", "Gp" }));
        myBalencePanel.add(getSelectedSimOperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 200, 700, 55));

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

        jSeparator1.setBackground(new java.awt.Color(204, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        myBalencePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, 260));

        basePanel.add(myBalencePanel, "card2");

        paymentDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Mobile No.", "Payment Type", "Payment By", "Ammount", "Current Balence", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        payementDetailsTable.setViewportView(paymentDetailsTable);
        if (paymentDetailsTable.getColumnModel().getColumnCount() > 0) {
            paymentDetailsTable.getColumnModel().getColumn(0).setHeaderValue("No.");
            paymentDetailsTable.getColumnModel().getColumn(1).setHeaderValue("Mobile No.");
            paymentDetailsTable.getColumnModel().getColumn(2).setHeaderValue("Payment Type");
            paymentDetailsTable.getColumnModel().getColumn(3).setHeaderValue("Payment By");
            paymentDetailsTable.getColumnModel().getColumn(4).setHeaderValue("Ammount");
            paymentDetailsTable.getColumnModel().getColumn(5).setHeaderValue("Current Balence");
            paymentDetailsTable.getColumnModel().getColumn(6).setHeaderValue("Action");
        }

        paymentDetailsPanel.add(payementDetailsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1000, 430));

        getSearchViaPhoneNoAndTrnId.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        getSearchViaPhoneNoAndTrnId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getSearchViaPhoneNoAndTrnId.setBorder(null);
        getSearchViaPhoneNoAndTrnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSearchViaPhoneNoAndTrnIdActionPerformed(evt);
            }
        });
        paymentDetailsPanel.add(getSearchViaPhoneNoAndTrnId, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 172, 340, 50));

        clickAdvanceSearch.setBackground(new java.awt.Color(153, 153, 153));
        clickAdvanceSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clickAdvanceSearch.setForeground(new java.awt.Color(255, 0, 0));
        clickAdvanceSearch.setText("Advance Search");
        clickAdvanceSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAdvanceSearchMouseClicked(evt);
            }
        });
        paymentDetailsPanel.add(clickAdvanceSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, -1));

        clickSend4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSend4MouseClicked(evt);
            }
        });
        paymentDetailsPanel.add(clickSend4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 200, 40));

        networkBar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        paymentDetailsPanel.add(networkBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg4.setBackground(new java.awt.Color(255, 255, 255));
        body_bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/payment_details.png"))); // NOI18N
        body_bg4.setText("frgdfgh");
        body_bg4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        paymentDetailsPanel.add(body_bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(paymentDetailsPanel, "card2");

        settingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newServiceAdding.setText("New Service Adding");
        newServiceAdding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newServiceAddingActionPerformed(evt);
            }
        });
        settingPanel.add(newServiceAdding, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 1010, 40));

        softwareSetting.setText("Software Setting");
        softwareSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareSettingActionPerformed(evt);
            }
        });
        settingPanel.add(softwareSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1010, 40));

        setDefaultSetting.setText("Set Default Setting");
        setDefaultSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDefaultSettingActionPerformed(evt);
            }
        });
        settingPanel.add(setDefaultSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1010, 40));

        myProfile1.setText("My Profile");
        myProfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfile1ActionPerformed(evt);
            }
        });
        settingPanel.add(myProfile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1010, 40));

        buyOfferPack.setText("Buy Offer Pack");
        buyOfferPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyOfferPackActionPerformed(evt);
            }
        });
        settingPanel.add(buyOfferPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1010, 40));

        networkBar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        settingPanel.add(networkBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg5.setBackground(new java.awt.Color(209, 178, 228));
        body_bg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/settings.png"))); // NOI18N
        body_bg5.setText("frgdfg");
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
       String phoneNumberRequested = getMobileNumber.getText();
       String ammountRequested = getAmmountInTk.getText();
           
       if(!phoneNumberRequested.equals("")  && !ammountRequested.equals("") 
               && phoneNumberRequested.matches("[0-9]+") 
               && ammountRequested.matches("[0-9]+")){
           
           recharge();
       }
       else{
       getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00"))); 
       getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00"))); 
       }
           
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

    private void clickSend4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSend4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clickSend4MouseClicked

    private void clickContactListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactListMouseClicked
        System.out.println("auto.recharge.system.Home.clickContactListMouseClicked()");
    }//GEN-LAST:event_clickContactListMouseClicked

    private void getSearchViaPhoneNoAndTrnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSearchViaPhoneNoAndTrnIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSearchViaPhoneNoAndTrnIdActionPerformed

    private void clickAdvanceSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAdvanceSearchMouseClicked
        System.out.println("auto.recharge.system.Home.clickAdvanceSearchMouseClicked()");
    }//GEN-LAST:event_clickAdvanceSearchMouseClicked

    private void buyOfferPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyOfferPackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyOfferPackActionPerformed

    private void myProfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myProfile1ActionPerformed

    private void newServiceAddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newServiceAddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newServiceAddingActionPerformed

    private void setDefaultSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDefaultSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setDefaultSettingActionPerformed

    private void softwareSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_softwareSettingActionPerformed

    private void getMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getMobileNumberActionPerformed

    private void clickUssdDailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clickUssdDailActionPerformed

    private void clickCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickCloseMouseClicked
       System.exit(0);
    }//GEN-LAST:event_clickCloseMouseClicked

    private void clickMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMinimizeMouseClicked
       this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_clickMinimizeMouseClicked

    private void getAmmountInTkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getAmmountInTkMouseClicked
        setOperatorIcon();
    }//GEN-LAST:event_getAmmountInTkMouseClicked

 
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
    private javax.swing.JLabel CurrencyType1;
    private javax.swing.JLabel LoggedUserName;
    private javax.swing.JPanel addOfferAndResellerPanel;
    private javax.swing.JLabel balenceDetails;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel billPaymentPanel;
    private javax.swing.JLabel body_bg;
    private javax.swing.JLabel body_bg1;
    private javax.swing.JLabel body_bg2;
    private javax.swing.JLabel body_bg3;
    private javax.swing.JLabel body_bg4;
    private javax.swing.JLabel body_bg5;
    private javax.swing.JButton buyOfferPack;
    private javax.swing.JLabel clickAddOfferAndReseller;
    private javax.swing.JLabel clickAdvanceSearch;
    private javax.swing.JLabel clickBillPayment;
    private javax.swing.JLabel clickClose;
    private javax.swing.JLabel clickContactList;
    private javax.swing.JButton clickGroupLoad;
    private javax.swing.JLabel clickMinimize;
    private javax.swing.JLabel clickMobileRecharge;
    private javax.swing.JLabel clickMyBalence;
    private javax.swing.JLabel clickNewReseller;
    private javax.swing.JLabel clickPackageOffer;
    private javax.swing.JLabel clickPaymentDetails;
    private javax.swing.JLabel clickSend;
    private javax.swing.JLabel clickSend1;
    private javax.swing.JLabel clickSend3;
    private javax.swing.JLabel clickSend4;
    private javax.swing.JLabel clickSetting;
    private javax.swing.JLabel clickSimOffer;
    private javax.swing.JButton clickUssdDail;
    private javax.swing.JPanel confirmPopUp;
    private javax.swing.JTextField getAmmountInTk;
    private javax.swing.JTextField getMobileNumber;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid1;
    private javax.swing.JTextField getSearchViaPhoneNoAndTrnId;
    private javax.swing.JComboBox<String> getSelectedSimOperator;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel helpBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel menuBody;
    private javax.swing.JPanel mobileRechargePanel;
    private javax.swing.JPanel myBalencePanel;
    private javax.swing.JButton myProfile1;
    private javax.swing.JLabel networkBar;
    private javax.swing.JLabel networkBar1;
    private javax.swing.JLabel networkBar2;
    private javax.swing.JLabel networkBar3;
    private javax.swing.JLabel networkBar4;
    private javax.swing.JLabel networkBar5;
    private javax.swing.JButton newServiceAdding;
    private javax.swing.JScrollPane payementDetailsTable;
    private javax.swing.JPanel paymentDetailsPanel;
    private javax.swing.JTable paymentDetailsTable;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JScrollPane rechargeDetailsTable;
    private javax.swing.JLabel selectedSimOperatorIcon;
    private javax.swing.JButton setDefaultSetting;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JLabel showingAmmountInTk;
    private javax.swing.JLabel showingAmmountInTk1;
    private javax.swing.JButton softwareSetting;
    private javax.swing.JLabel subTitleOfUserName;
    // End of variables declaration//GEN-END:variables

    private void recharge() {      
       int result= Popup.display("Recharge Confirmation",getMobileNumber.getText()
                ,getAmmountInTk.getText()+" tk | "+getPrepaidOrPostpaid.getSelectedItem().toString(),"OK","Edit");
       
       if(result == Popup.OK)
       {
            rechargeDoneProcess();
       }
       else if(result == Popup.EXIT)
       {
           Icon icon = new ImageIcon(getClass().getResource("/resources/images/default_operator_icon_1.png"));
           selectedSimOperatorIcon.setIcon(icon);
           getMobileNumber.setText("");
           getAmmountInTk.setText("");
           getMobileNumber.requestFocusInWindow();
           
       }       
       
    }
    
    public void setFocus()
    {
      getMobileNumber.addKeyListener(new KeyAdapter() {
               @Override
               public void keyPressed(KeyEvent ke) {
                   if(ke.getKeyCode() == KeyEvent.VK_ENTER){                 
                     setOperatorIcon();
                    }
                    else{
                                                  
                    }                  
               }               
            });
      getAmmountInTk.addKeyListener(new KeyAdapter() {
               @Override
               public void keyPressed(KeyEvent ke) {
                   if(ke.getKeyCode() == KeyEvent.VK_ENTER)
                   { 
                       if(!getAmmountInTk.getText().equals("") && getAmmountInTk.getText().matches("[0-9]+"))
                       {
                      recharge();
                      getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                       }
                       else{
                          getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                       }
                   }
               }
               
            });      
    }
    
    private void setOperatorIcon() {        
       if(getMobileNumber.getText().equals("") || getMobileNumber.getText().length() != 11 || !getMobileNumber.getText().matches("[0-9]+"))
              {
              getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00"))); 
              }
              else{
                Icon icon;         
                   switch(getMobileNumber.getText().substring(0, 3))
                    {
                            case "019" : 
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(getClass().getResource("/resources/images/bl_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();
                                break;
                            case "014" : 
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(getClass().getResource("/resources/images/bl_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();

                                break;
                            case "017" : 
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(getClass().getResource("/resources/images/gp_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();
                                break;
                            case "013" : 
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(getClass().getResource("/resources/images/gp_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();
                                break;
                            case "018" : 
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(getClass().getResource("/resources/images/robi_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();
                                break;
                            case "015" :
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(getClass().getResource("/resources/images/tele_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();
                                break;
                            case "016" : 
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(getClass().getResource("/resources/images/airtel_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();
                                break;
                            default:
                                icon = new ImageIcon(getClass().getResource("/resources/images/default_operator_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00"))); 
                                 break;
            }
     }
   }   

    private void rechargeDoneProcess() {
       String phoneNumberRequested = getMobileNumber.getText();
       String ammountRequested = getAmmountInTk.getText();
       String preOrPostRequested = getPrepaidOrPostpaid.getSelectedItem().toString();
    }
}
