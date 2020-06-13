package auto.recharge.system;

import static auto.recharge.system.Mail.getMacAddress;
import auto.recharge.system.dto.ModemInfoList;
import auto.recharge.system.dto.SimOperatorIdentifierDto;
import com.itvillage.AES;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Home extends javax.swing.JFrame {
    
    private Connection conn;
    private String imagePath = "No Image";
    private LoadingScreen l;
    private String selectedSimOperatorName;
    
    public Home() {
        initComponents();
        popupMenu.add(confirmPopUp);
        setFocus();
        loadContractListInTable();
        setCuurentActiveNetworkAndBalenceFromModem();
        
        refrash();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmPopUp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        popupMenu = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
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
        clickShowMyBalence = new javax.swing.JButton();
        rechargeDetailsTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        currentNetworkName = new javax.swing.JLabel();
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
        jToolBar1 = new javax.swing.JToolBar();
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
        editManagmentSetting = new javax.swing.JButton();
        setDefaultSetting = new javax.swing.JButton();
        myProfile1 = new javax.swing.JButton();
        buyOfferPack = new javax.swing.JButton();
        history = new javax.swing.JButton();
        softwareSetting1 = new javax.swing.JButton();
        networkBar5 = new javax.swing.JLabel();
        body_bg5 = new javax.swing.JLabel();
        contractListPanel = new javax.swing.JPanel();
        getNameForSearch = new javax.swing.JTextField();
        clickSerch = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableContractLIst = new javax.swing.JTable();
        clickNewContract = new javax.swing.JButton();
        addNewContractPanel = new javax.swing.JPanel();
        back43 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clickAddContract = new javax.swing.JButton();
        getName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        getPhoneNO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        getSeletedStorage = new javax.swing.JComboBox<>();
        ussdDialPanel = new javax.swing.JPanel();
        backToMobileRecharge = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clickUssdDailDorSend = new javax.swing.JButton();
        getSelectedSim = new javax.swing.JComboBox<>();
        getUssdCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        setResponseShowFromUssd = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        groupRechargePanel1 = new javax.swing.JPanel();
        clickAdd = new javax.swing.JButton();
        getPreOrPostSelection = new javax.swing.JComboBox<>();
        backToMobileRechargeFromGroupREcharge = new javax.swing.JLabel();
        getAmmountEachNumber = new javax.swing.JTextField();
        clickSendGroupRecharge = new javax.swing.JButton();
        getPhoneNo = new javax.swing.JTextField();
        headerLabel = new javax.swing.JLabel();
        RechargeDetailsBar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        groupRechargeListTable = new javax.swing.JTable();
        USSDManagementPanel = new javax.swing.JPanel();
        clickSerch1 = new javax.swing.JLabel();
        backToSetting = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ussdSettedTable = new javax.swing.JTable();
        clickAddNewManagement = new javax.swing.JButton();
        addNewManagementPanel = new javax.swing.JPanel();
        backToUssdManengementPanel = new javax.swing.JLabel();
        dropdownOperatorName = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        clickAddContract1 = new javax.swing.JButton();
        getOperatorName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        getOperatorCode = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        getSeletedAction = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        getRechargeUssdParternPrePaid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        clickChooseIcon = new javax.swing.JButton();
        getBalenceUssdPartern1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        accountPassword = new javax.swing.JPasswordField();
        jLabel30 = new javax.swing.JLabel();
        getRechargeUssdParternPostPaid = new javax.swing.JTextField();
        updateAddedManagementPanel = new javax.swing.JPanel();
        backToUssdManengementPanel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        clickAddContract2 = new javax.swing.JButton();
        getOperatorName1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        getOperatorCode1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        getSeletedAction1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        getRechargeUssdPartern1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        clickChooseIcon1 = new javax.swing.JButton();
        getBalenceUssdPartern2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        BalenceShowPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        clickCross = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableShowSimBalence = new javax.swing.JTable();

        jLabel4.setText("jLabel4");
        confirmPopUp.add(jLabel4);

        popupMenu.setMinimumSize(new java.awt.Dimension(32767, 32767));

        jButton1.setText("jButton1");

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

        clickShowMyBalence.setBackground(new java.awt.Color(153, 153, 255));
        clickShowMyBalence.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        clickShowMyBalence.setForeground(new java.awt.Color(255, 255, 255));
        clickShowMyBalence.setText("Show Current Balence");
        clickShowMyBalence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickShowMyBalenceActionPerformed(evt);
            }
        });
        mobileRechargePanel.add(clickShowMyBalence, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 170, 40));

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

        currentNetworkName.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        currentNetworkName.setForeground(new java.awt.Color(0, 102, 255));
        currentNetworkName.setText("No SIM Avaiable");
        mobileRechargePanel.add(currentNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 40, 390, 40));

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
        clickGroupLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickGroupLoadMouseClicked(evt);
            }
        });
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
        body_bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                body_bgMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(body_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        jToolBar1.setRollover(true);
        mobileRechargePanel.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

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
        settingPanel.add(newServiceAdding, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 1010, 40));

        editManagmentSetting.setText("Edit Managment Setting");
        editManagmentSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editManagmentSettingActionPerformed(evt);
            }
        });
        settingPanel.add(editManagmentSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1010, 40));

        setDefaultSetting.setText("Set Default Setting");
        setDefaultSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDefaultSettingActionPerformed(evt);
            }
        });
        settingPanel.add(setDefaultSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1010, 40));

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
        settingPanel.add(buyOfferPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1010, 40));

        history.setText("History Setting");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        settingPanel.add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1010, 40));

        softwareSetting1.setText("Software Setting");
        softwareSetting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareSetting1ActionPerformed(evt);
            }
        });
        settingPanel.add(softwareSetting1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 1010, 40));

        networkBar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        settingPanel.add(networkBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        body_bg5.setBackground(new java.awt.Color(209, 178, 228));
        body_bg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/settings.png"))); // NOI18N
        body_bg5.setText("frgdfg");
        body_bg5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        settingPanel.add(body_bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 720));

        basePanel.add(settingPanel, "card2");

        contractListPanel.setBackground(new java.awt.Color(255, 255, 255));
        contractListPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getNameForSearch.setBorder(null);
        contractListPanel.add(getNameForSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 164, 340, 45));
        contractListPanel.add(clickSerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 60, 50));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        back.setText("jLabel3");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        contractListPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Contract List");
        contractListPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Search_bg.png"))); // NOI18N
        contractListPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        tableContractLIst.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableContractLIst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Name", "Phone No.", "From"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableContractLIst);

        contractListPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 1000, -1));

        clickNewContract.setBackground(new java.awt.Color(102, 153, 0));
        clickNewContract.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clickNewContract.setForeground(new java.awt.Color(255, 255, 255));
        clickNewContract.setText("Add New Contract");
        clickNewContract.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickNewContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickNewContractActionPerformed(evt);
            }
        });
        contractListPanel.add(clickNewContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 150, 40));

        basePanel.add(contractListPanel, "card2");

        addNewContractPanel.setBackground(new java.awt.Color(255, 255, 255));
        addNewContractPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        back43.setText("jLabel3");
        back43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back43MouseClicked(evt);
            }
        });
        addNewContractPanel.add(back43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("New Contract ");
        addNewContractPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        clickAddContract.setBackground(new java.awt.Color(102, 153, 0));
        clickAddContract.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickAddContract.setForeground(new java.awt.Color(255, 255, 255));
        clickAddContract.setText("Add");
        clickAddContract.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickAddContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAddContractActionPerformed(evt);
            }
        });
        addNewContractPanel.add(clickAddContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 150, 40));
        addNewContractPanel.add(getName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 470, 40));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel8.setText("Name");
        addNewContractPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 175, -1, -1));
        addNewContractPanel.add(getPhoneNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 470, 40));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel9.setText("Phone No.");
        addNewContractPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 245, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel10.setText("Storage");
        addNewContractPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 315, -1, -1));

        getSeletedStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        addNewContractPanel.add(getSeletedStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 470, 40));

        basePanel.add(addNewContractPanel, "card2");

        ussdDialPanel.setBackground(new java.awt.Color(255, 255, 255));
        ussdDialPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backToMobileRecharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToMobileRecharge.setText("jLabel3");
        backToMobileRecharge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToMobileRechargeMouseClicked(evt);
            }
        });
        ussdDialPanel.add(backToMobileRecharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("USSD Dail");
        ussdDialPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        clickUssdDailDorSend.setBackground(new java.awt.Color(102, 153, 0));
        clickUssdDailDorSend.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickUssdDailDorSend.setForeground(new java.awt.Color(255, 255, 255));
        clickUssdDailDorSend.setText("Send");
        clickUssdDailDorSend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickUssdDailDorSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUssdDailDorSendActionPerformed(evt);
            }
        });
        ussdDialPanel.add(clickUssdDailDorSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 150, 40));

        ussdDialPanel.add(getSelectedSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 470, 40));

        getUssdCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ussdDialPanel.add(getUssdCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 470, 40));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel11.setText("Code:");
        ussdDialPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        setResponseShowFromUssd.setColumns(20);
        setResponseShowFromUssd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        setResponseShowFromUssd.setRows(5);
        jScrollPane2.setViewportView(setResponseShowFromUssd);

        ussdDialPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 490, 290));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel12.setText("Select SIM:");
        ussdDialPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        basePanel.add(ussdDialPanel, "card2");

        groupRechargePanel1.setBackground(new java.awt.Color(255, 255, 255));
        groupRechargePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clickAdd.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        clickAdd.setText("Add");
        groupRechargePanel1.add(clickAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 335, 220, 55));

        getPreOrPostSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-paid", "Port-Paid" }));
        groupRechargePanel1.add(getPreOrPostSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 200, 40));

        backToMobileRechargeFromGroupREcharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToMobileRechargeFromGroupREcharge.setText("jLabel3");
        backToMobileRechargeFromGroupREcharge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToMobileRechargeFromGroupREchargeMouseClicked(evt);
            }
        });
        groupRechargePanel1.add(backToMobileRechargeFromGroupREcharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        getAmmountEachNumber.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        getAmmountEachNumber.setBorder(null);
        groupRechargePanel1.add(getAmmountEachNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 520, 90));

        clickSendGroupRecharge.setBackground(new java.awt.Color(102, 153, 0));
        clickSendGroupRecharge.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickSendGroupRecharge.setForeground(new java.awt.Color(255, 255, 255));
        clickSendGroupRecharge.setText("Send All");
        clickSendGroupRecharge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickSendGroupRecharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSendGroupRechargeActionPerformed(evt);
            }
        });
        groupRechargePanel1.add(clickSendGroupRecharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 150, 40));

        getPhoneNo.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        getPhoneNo.setBorder(null);
        groupRechargePanel1.add(getPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 740, 100));

        headerLabel.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(102, 102, 255));
        headerLabel.setText("Group Recharge");
        groupRechargePanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        RechargeDetailsBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/select_recharge_details_bar.png"))); // NOI18N
        groupRechargePanel1.add(RechargeDetailsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        groupRechargeListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Phone Number", "Ammount", "Time & Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(groupRechargeListTable);

        groupRechargePanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1000, 220));

        basePanel.add(groupRechargePanel1, "card2");

        USSDManagementPanel.setBackground(new java.awt.Color(255, 255, 255));
        USSDManagementPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        USSDManagementPanel.add(clickSerch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 60, 50));

        backToSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToSetting.setText("jLabel3");
        backToSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToSettingMouseClicked(evt);
            }
        });
        USSDManagementPanel.add(backToSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("USSD Management");
        USSDManagementPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        ussdSettedTable.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ussdSettedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operator Name", "Operator Code", "Action for", "Recharge USSD Code", "Show Balence Ussd Code", "icon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ussdSettedTable.setToolTipText("");
        ussdSettedTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(ussdSettedTable);

        USSDManagementPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1000, -1));

        clickAddNewManagement.setBackground(new java.awt.Color(102, 153, 0));
        clickAddNewManagement.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickAddNewManagement.setForeground(new java.awt.Color(255, 255, 255));
        clickAddNewManagement.setText("Add");
        clickAddNewManagement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickAddNewManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAddNewManagementActionPerformed(evt);
            }
        });
        USSDManagementPanel.add(clickAddNewManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 150, 40));

        basePanel.add(USSDManagementPanel, "card2");

        addNewManagementPanel.setBackground(new java.awt.Color(255, 255, 255));
        addNewManagementPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backToUssdManengementPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToUssdManengementPanel.setText("jLabel3");
        backToUssdManengementPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToUssdManengementPanelMouseClicked(evt);
            }
        });
        addNewManagementPanel.add(backToUssdManengementPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        addNewManagementPanel.add(dropdownOperatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 470, 40));

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 255));
        jLabel14.setText("Add New USSD Command ");
        addNewManagementPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        clickAddContract1.setBackground(new java.awt.Color(102, 153, 0));
        clickAddContract1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickAddContract1.setForeground(new java.awt.Color(255, 255, 255));
        clickAddContract1.setText("Add");
        clickAddContract1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickAddContract1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAddContract1ActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(clickAddContract1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 150, 40));

        getOperatorName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        addNewManagementPanel.add(getOperatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 470, 40));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel15.setText("Operator Name");
        addNewManagementPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 98, -1, -1));

        getOperatorCode.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        addNewManagementPanel.add(getOperatorCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 470, 40));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel16.setText("Operator Code");
        addNewManagementPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 168, -1, -1));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel17.setText("Action For");
        addNewManagementPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 238, -1, -1));

        getSeletedAction.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getSeletedAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile Recharge" }));
        getSeletedAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSeletedActionActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getSeletedAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 470, 40));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel18.setText("Recharge USSD Code Pattern (Pre-paid)");
        addNewManagementPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        getRechargeUssdParternPrePaid.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPrePaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPrePaidActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getRechargeUssdParternPrePaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 470, 40));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel19.setText("Icon");
        addNewManagementPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        clickChooseIcon.setBackground(new java.awt.Color(255, 255, 255));
        clickChooseIcon.setForeground(new java.awt.Color(102, 102, 255));
        clickChooseIcon.setText("::::::Choose Icon(40px X 30px):::::::");
        clickChooseIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickChooseIconActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(clickChooseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 470, 30));

        getBalenceUssdPartern1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getBalenceUssdPartern1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalenceUssdPartern1ActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getBalenceUssdPartern1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 470, 40));

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel20.setText("Balence show USSD Code Pattern");
        addNewManagementPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel29.setText("Account Password");
        addNewManagementPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        accountPassword.setText("jPasswordField1");
        addNewManagementPanel.add(accountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 470, 40));

        jLabel30.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel30.setText("Recharge USSD Code Pattern(post-paid)");
        addNewManagementPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        getRechargeUssdParternPostPaid.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPostPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPostPaidActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getRechargeUssdParternPostPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 470, 40));

        basePanel.add(addNewManagementPanel, "card2");

        updateAddedManagementPanel.setBackground(new java.awt.Color(255, 255, 255));
        updateAddedManagementPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backToUssdManengementPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToUssdManengementPanel1.setText("jLabel3");
        backToUssdManengementPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToUssdManengementPanel1MouseClicked(evt);
            }
        });
        updateAddedManagementPanel.add(backToUssdManengementPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel21.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 255));
        jLabel21.setText("Update USSD Command ");
        updateAddedManagementPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        clickAddContract2.setBackground(new java.awt.Color(102, 153, 0));
        clickAddContract2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickAddContract2.setForeground(new java.awt.Color(255, 255, 255));
        clickAddContract2.setText("Update");
        clickAddContract2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickAddContract2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAddContract2ActionPerformed(evt);
            }
        });
        updateAddedManagementPanel.add(clickAddContract2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 150, 40));

        getOperatorName1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getOperatorName1.setFocusable(false);
        updateAddedManagementPanel.add(getOperatorName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 470, 40));

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel22.setText("Operator Name");
        updateAddedManagementPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 98, -1, -1));

        getOperatorCode1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        updateAddedManagementPanel.add(getOperatorCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 470, 40));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel23.setText("Operator Code");
        updateAddedManagementPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 168, -1, -1));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel24.setText("Action For");
        updateAddedManagementPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 238, -1, -1));

        getSeletedAction1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getSeletedAction1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile Recharge" }));
        getSeletedAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSeletedAction1ActionPerformed(evt);
            }
        });
        updateAddedManagementPanel.add(getSeletedAction1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 470, 40));

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel25.setText("Recharge USSD Code Pattern");
        updateAddedManagementPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 318, -1, -1));

        getRechargeUssdPartern1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdPartern1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdPartern1ActionPerformed(evt);
            }
        });
        updateAddedManagementPanel.add(getRechargeUssdPartern1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 470, 40));

        jLabel26.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel26.setText("Icon");
        updateAddedManagementPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        clickChooseIcon1.setBackground(new java.awt.Color(255, 255, 255));
        clickChooseIcon1.setForeground(new java.awt.Color(102, 102, 255));
        clickChooseIcon1.setText("::::::Choose Icon(40px X 30px):::::::");
        clickChooseIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickChooseIcon1ActionPerformed(evt);
            }
        });
        updateAddedManagementPanel.add(clickChooseIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 470, 30));

        getBalenceUssdPartern2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getBalenceUssdPartern2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalenceUssdPartern2ActionPerformed(evt);
            }
        });
        updateAddedManagementPanel.add(getBalenceUssdPartern2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 470, 40));

        jLabel27.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel27.setText("Balence show USSD Code Pattern");
        updateAddedManagementPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        basePanel.add(updateAddedManagementPanel, "card2");

        BalenceShowPanel.setBackground(new java.awt.Color(255, 255, 255));
        BalenceShowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Current Balance");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        clickCross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cross.png"))); // NOI18N
        clickCross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickCrossMouseClicked(evt);
            }
        });
        jPanel1.add(clickCross, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        BalenceShowPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 110));

        tableShowSimBalence.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tableShowSimBalence.setForeground(new java.awt.Color(51, 51, 255));
        tableShowSimBalence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operator Name", "Current Ammount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableShowSimBalence.setAlignmentX(1.0F);
        tableShowSimBalence.setAlignmentY(1.0F);
        tableShowSimBalence.setSelectionForeground(new java.awt.Color(255, 153, 153));
        jScrollPane5.setViewportView(tableShowSimBalence);

        BalenceShowPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1000, -1));

        basePanel.add(BalenceShowPanel, "card2");

        getContentPane().add(basePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1020, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clickMobileRechargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMobileRechargeMouseClicked
        refrash();
        switchPanelViaMenu(mobileRechargePanel);
        System.out.println("Switch to Mobile Recharge Panel");
    }//GEN-LAST:event_clickMobileRechargeMouseClicked

    private void clickAddOfferAndResellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAddOfferAndResellerMouseClicked
        refrash();
        switchPanelViaMenu(addOfferAndResellerPanel);
        System.out.println("Switch to Add Offer Panel Panel");
    }//GEN-LAST:event_clickAddOfferAndResellerMouseClicked

    private void clickBillPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBillPaymentMouseClicked
        refrash();
        switchPanelViaMenu(billPaymentPanel);
        System.out.println("Switch to Bill Payment Panel");
    }//GEN-LAST:event_clickBillPaymentMouseClicked

    private void clickMyBalenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMyBalenceMouseClicked
        refrash();
        switchPanelViaMenu(myBalencePanel);
        System.out.println("Switch to My Balence Panel");
    }//GEN-LAST:event_clickMyBalenceMouseClicked

    private void clickPaymentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickPaymentDetailsMouseClicked
        refrash();
        switchPanelViaMenu(paymentDetailsPanel);
        System.out.println("Switch to Payment Details Panel");
    }//GEN-LAST:event_clickPaymentDetailsMouseClicked

    private void clickSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSettingMouseClicked
        refrash();
        switchPanelViaMenu(settingPanel);
        System.out.println("Switch to Setting Panel");
    }//GEN-LAST:event_clickSettingMouseClicked

    private void getPrepaidOrPostpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPrepaidOrPostpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPrepaidOrPostpaidActionPerformed

    private void clickSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSendMouseClicked
        String phoneNumberRequested = getMobileNumber.getText();
        String ammountRequested = getAmmountInTk.getText();
        
        if (!phoneNumberRequested.equals("") && !ammountRequested.equals("")
                && phoneNumberRequested.matches("[0-9]+")
                && ammountRequested.matches("[0-9]+")) {
            
            recharge();
        } else {
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
        switchPanelViaMenu(contractListPanel);
        setContractInTable();
    }//GEN-LAST:event_clickContactListMouseClicked

    private void getSearchViaPhoneNoAndTrnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSearchViaPhoneNoAndTrnIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSearchViaPhoneNoAndTrnIdActionPerformed

    private void clickAdvanceSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAdvanceSearchMouseClicked
        System.out.println("auto.recharge.system.Home.clickAdvanceSearchMouseClicked()");
    }//GEN-LAST:event_clickAdvanceSearchMouseClicked

    private void myProfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myProfile1ActionPerformed

    private void newServiceAddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newServiceAddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newServiceAddingActionPerformed

    private void setDefaultSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDefaultSettingActionPerformed

    }//GEN-LAST:event_setDefaultSettingActionPerformed

    private void editManagmentSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editManagmentSettingActionPerformed
        Home home = new Home();
        loadValuesForUssdManagementTable();
    }//GEN-LAST:event_editManagmentSettingActionPerformed

    private void getMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getMobileNumberActionPerformed

    private void clickUssdDailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailActionPerformed
        switchPanelViaMenu(ussdDialPanel);
        refrash();
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getSelectedSim.addItem(simOperatorIdentifierDto.getOperatorName());
        });
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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_backMouseClicked

    private void clickNewContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickNewContractActionPerformed
        switchPanelViaMenu(addNewContractPanel);
    }//GEN-LAST:event_clickNewContractActionPerformed

    private void back43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back43MouseClicked
        switchPanelViaMenu(contractListPanel);
    }//GEN-LAST:event_back43MouseClicked

    private void clickAddContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clickAddContractActionPerformed

    private void backToMobileRechargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMobileRechargeMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_backToMobileRechargeMouseClicked

    private void clickUssdDailDorSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailDorSendActionPerformed
        
        if (getUssdCode.getText().equals("")) {
            getUssdCode.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
        } else {
            ussdDial();
            getUssdCode.setText("");
        }
    }//GEN-LAST:event_clickUssdDailDorSendActionPerformed

    private void backToMobileRechargeFromGroupREchargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMobileRechargeFromGroupREchargeMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_backToMobileRechargeFromGroupREchargeMouseClicked

    private void clickSendGroupRechargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSendGroupRechargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clickSendGroupRechargeActionPerformed

    private void clickGroupLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickGroupLoadMouseClicked
        switchPanelViaMenu(groupRechargePanel1);
    }//GEN-LAST:event_clickGroupLoadMouseClicked

    private void softwareSetting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareSetting1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_softwareSetting1ActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyActionPerformed

    private void buyOfferPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyOfferPackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyOfferPackActionPerformed

    private void backToSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToSettingMouseClicked
        switchPanelViaMenu(settingPanel);
    }//GEN-LAST:event_backToSettingMouseClicked

    private void clickAddNewManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddNewManagementActionPerformed
        switchPanelViaMenu(addNewManagementPanel);
        
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            dropdownOperatorName.addItem(simOperatorIdentifierDto.getOperatorName());
        }
    }//GEN-LAST:event_clickAddNewManagementActionPerformed

    private void backToUssdManengementPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToUssdManengementPanelMouseClicked
        switchPanelViaMenu(USSDManagementPanel);
    }//GEN-LAST:event_backToUssdManengementPanelMouseClicked

    private void clickAddContract1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContract1ActionPerformed
        
        String rechargeUssdPartern = getRechargeUssdParternPrePaid.getText();
        String operatorName = dropdownOperatorName.getSelectedItem().toString();
        String operatorCode = getOperatorCode.getText();
        String actionFor = getSeletedAction.getSelectedItem().toString();
        String balenceUssdPartern = getBalenceUssdPartern1.getText();
        if (!rechargeUssdPartern.equals("")
                && !operatorName.equals("")
                && !operatorCode.equals("")) {
            
            if (saveToDbCommand()) {
                System.out.println("Adding Successfull");
            }
        } else {
            Popup.error("Empty Field");
        }
    }//GEN-LAST:event_clickAddContract1ActionPerformed

    private void getSeletedActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSeletedActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSeletedActionActionPerformed

    private void getRechargeUssdParternPrePaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPrePaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPrePaidActionPerformed

    private void clickChooseIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickChooseIconActionPerformed
        
        loadImageIcon(dropdownOperatorName.getSelectedItem().toString().toLowerCase());
    }//GEN-LAST:event_clickChooseIconActionPerformed

    private void getBalenceUssdPartern1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBalenceUssdPartern1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBalenceUssdPartern1ActionPerformed

    private void backToUssdManengementPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToUssdManengementPanel1MouseClicked
        switchPanelViaMenu(settingPanel);
    }//GEN-LAST:event_backToUssdManengementPanel1MouseClicked

    private void clickAddContract2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContract2ActionPerformed
        updateToDbCommandByOperator_name();
    }//GEN-LAST:event_clickAddContract2ActionPerformed

    private void getSeletedAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSeletedAction1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSeletedAction1ActionPerformed

    private void getRechargeUssdPartern1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdPartern1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdPartern1ActionPerformed

    private void clickChooseIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickChooseIcon1ActionPerformed
        String rechargeUssdPartern = getRechargeUssdPartern1.getText();
        String operatorName = getOperatorName1.getText();
        String operatorCode = getOperatorCode1.getText();
        String actionFor = getSeletedAction1.getSelectedItem().toString();
        String balenceUssdPartern = getBalenceUssdPartern2.getText();
        if (!rechargeUssdPartern.equals("")
                && !operatorName.equals("")
                && !operatorCode.equals("")) {
            loadImageIcon(getOperatorName1.getText());
            
        } else {
            Popup.error("Empty Field");
        }
    }//GEN-LAST:event_clickChooseIcon1ActionPerformed

    private void getBalenceUssdPartern2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBalenceUssdPartern2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBalenceUssdPartern2ActionPerformed

    private void body_bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_body_bgMouseClicked

    }//GEN-LAST:event_body_bgMouseClicked

    private void clickShowMyBalenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickShowMyBalenceActionPerformed
        switchPanelViaMenu(BalenceShowPanel);
        addBalenceInBalenceShowTable();
    }//GEN-LAST:event_clickShowMyBalenceActionPerformed

    private void clickCrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickCrossMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_clickCrossMouseClicked

    private void getRechargeUssdParternPostPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPostPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPostPaidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BalenceShowPanel;
    private javax.swing.JLabel CurrencyType;
    private javax.swing.JLabel CurrencyType1;
    private javax.swing.JLabel LoggedUserName;
    private javax.swing.JLabel RechargeDetailsBar;
    private javax.swing.JPanel USSDManagementPanel;
    private javax.swing.JPasswordField accountPassword;
    private javax.swing.JPanel addNewContractPanel;
    private javax.swing.JPanel addNewManagementPanel;
    private javax.swing.JPanel addOfferAndResellerPanel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back43;
    private javax.swing.JLabel backToMobileRecharge;
    private javax.swing.JLabel backToMobileRechargeFromGroupREcharge;
    private javax.swing.JLabel backToSetting;
    private javax.swing.JLabel backToUssdManengementPanel;
    private javax.swing.JLabel backToUssdManengementPanel1;
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
    private javax.swing.JButton clickAdd;
    private javax.swing.JButton clickAddContract;
    private javax.swing.JButton clickAddContract1;
    private javax.swing.JButton clickAddContract2;
    private javax.swing.JButton clickAddNewManagement;
    private javax.swing.JLabel clickAddOfferAndReseller;
    private javax.swing.JLabel clickAdvanceSearch;
    private javax.swing.JLabel clickBillPayment;
    private javax.swing.JButton clickChooseIcon;
    private javax.swing.JButton clickChooseIcon1;
    private javax.swing.JLabel clickClose;
    private javax.swing.JLabel clickContactList;
    private javax.swing.JLabel clickCross;
    private javax.swing.JButton clickGroupLoad;
    private javax.swing.JLabel clickMinimize;
    private javax.swing.JLabel clickMobileRecharge;
    private javax.swing.JLabel clickMyBalence;
    private javax.swing.JButton clickNewContract;
    private javax.swing.JLabel clickNewReseller;
    private javax.swing.JLabel clickPackageOffer;
    private javax.swing.JLabel clickPaymentDetails;
    private javax.swing.JLabel clickSend;
    private javax.swing.JLabel clickSend1;
    private javax.swing.JLabel clickSend3;
    private javax.swing.JLabel clickSend4;
    private javax.swing.JButton clickSendGroupRecharge;
    private javax.swing.JLabel clickSerch;
    private javax.swing.JLabel clickSerch1;
    private javax.swing.JLabel clickSetting;
    private javax.swing.JButton clickShowMyBalence;
    private javax.swing.JLabel clickSimOffer;
    private javax.swing.JButton clickUssdDail;
    private javax.swing.JButton clickUssdDailDorSend;
    private javax.swing.JPanel confirmPopUp;
    private javax.swing.JPanel contractListPanel;
    private javax.swing.JLabel currentNetworkName;
    private javax.swing.JComboBox<String> dropdownOperatorName;
    private javax.swing.JButton editManagmentSetting;
    private javax.swing.JTextField getAmmountEachNumber;
    private javax.swing.JTextField getAmmountInTk;
    private javax.swing.JTextField getBalenceUssdPartern1;
    private javax.swing.JTextField getBalenceUssdPartern2;
    private javax.swing.JTextField getMobileNumber;
    private javax.swing.JTextField getName;
    private javax.swing.JTextField getNameForSearch;
    private javax.swing.JTextField getOperatorCode;
    private javax.swing.JTextField getOperatorCode1;
    private javax.swing.JTextField getOperatorName;
    private javax.swing.JTextField getOperatorName1;
    private javax.swing.JTextField getPhoneNO;
    private javax.swing.JTextField getPhoneNo;
    private javax.swing.JComboBox<String> getPreOrPostSelection;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid1;
    private javax.swing.JTextField getRechargeUssdPartern1;
    private javax.swing.JTextField getRechargeUssdParternPostPaid;
    private javax.swing.JTextField getRechargeUssdParternPrePaid;
    private javax.swing.JTextField getSearchViaPhoneNoAndTrnId;
    private javax.swing.JComboBox<String> getSelectedSim;
    private javax.swing.JComboBox<String> getSelectedSimOperator;
    private javax.swing.JComboBox<String> getSeletedAction;
    private javax.swing.JComboBox<String> getSeletedAction1;
    private javax.swing.JComboBox<String> getSeletedStorage;
    private javax.swing.JTextField getUssdCode;
    private javax.swing.JTable groupRechargeListTable;
    private javax.swing.JPanel groupRechargePanel1;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel helpBar;
    private javax.swing.JButton history;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
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
    private javax.swing.JTextArea setResponseShowFromUssd;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JLabel showingAmmountInTk;
    private javax.swing.JLabel showingAmmountInTk1;
    private javax.swing.JButton softwareSetting1;
    private javax.swing.JLabel subTitleOfUserName;
    private javax.swing.JTable tableContractLIst;
    private javax.swing.JTable tableShowSimBalence;
    private javax.swing.JPanel updateAddedManagementPanel;
    private javax.swing.JPanel ussdDialPanel;
    private javax.swing.JTable ussdSettedTable;
    // End of variables declaration//GEN-END:variables

//    ---------------------------------- Custom Methods ----------------------------------------------------
    private void recharge() {
        int result = Popup.display("Recharge Confirmation", getMobileNumber.getText(),
                getAmmountInTk.getText() + " tk | " + getPrepaidOrPostpaid.getSelectedItem().toString(), "OK", "Edit");
        
        if (result == Popup.OK) {
            rechargeDoneProcess();
        } else if (result == Popup.EXIT) {
            Icon icon = new ImageIcon(getClass().getResource("/resources/images/default_operator_icon_1.png"));
            selectedSimOperatorIcon.setIcon(icon);
            getMobileNumber.setText("");
            getAmmountInTk.setText("");
            getMobileNumber.requestFocusInWindow();
            
        }
        
    }
    
    public void setFocus() {
        getMobileNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    setOperatorIcon();
                } else {
                    
                }
            }
        });
        getAmmountInTk.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!getAmmountInTk.getText().equals("") && getAmmountInTk.getText().matches("[0-9]+")) {
                        recharge();
                        getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                    } else {
                        getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                    }
                }
            }
            
        });
    }
    
    private void setOperatorIcon() {
        if (getMobileNumber.getText().equals("") || getMobileNumber.getText().length() != 11 || !getMobileNumber.getText().matches("[0-9]+")) {
            getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
        } else {
            try {
                Icon icon;
                
                ResultSet rs = DbConnection.retrieveAll("command");
                while (rs.next()) {
                    if (rs.getString("operator_code").equals(getMobileNumber.getText().substring(0, 3))) {
                        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                            
                            if (rs.getString("operator_name").equals(simOperatorIdentifierDto.getOperatorName().toUpperCase())) {
                                selectedSimOperatorName = rs.getString("operator_name");
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(rs.getString("icon"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();
                                
                            } else {
                                icon = new ImageIcon(getClass().getResource("/resources/images/default_operator_icon_1.png"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                            }
                        }
                    } else {
                        Object[] options = {"Setup now", "Close"};
                        int seletedOption = JOptionPane.showOptionDialog(null, "You have to need setup for \"" + getMobileNumber.getText().substring(0, 3) + "\" code", "Setup now",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (seletedOption == 0) {
                            switchPanelViaMenu(addNewManagementPanel);
                        }
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    private void rechargeDoneProcess() {
        try {
            String phoneNumberRequested = getMobileNumber.getText();
            String ammountRequested = getAmmountInTk.getText();
            String preOrPostRequested = getPrepaidOrPostpaid.getSelectedItem().toString();
            ResultSet rs = DbConnection.retrieveAll("command");
            while (rs.next()) {
                if (rs.getString("operator_code").equals(getMobileNumber.getText().substring(0, 3))) {
                    for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                        
                        if (rs.getString("operator_name").equals(simOperatorIdentifierDto.getOperatorName().toUpperCase())) {
                            
                            com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
                            if (preOrPostRequested.toLowerCase().equals("pre-paid")) {
                                String rechargeCode = rs.getString("r_ussd_code_pre").replaceAll("number", phoneNumberRequested)
                                        .replaceAll("tk", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), Configaration.getPropertiesValueByKey("secretKey")));
                                System.out.println(com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15"));
                            } else {
                                String rechargeCode = rs.getString("r_ussd_code_post").replaceAll("number", phoneNumberRequested)
                                        .replaceAll("tk", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), Configaration.getPropertiesValueByKey("secretKey")));
                                System.out.println(com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15"));
                            }
                            com.moniruzzaman.Modem.disconnect();
                            
                        }
                    }
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadContractListInTable() {
        DefaultTableModel contractpaymentDetailsTableModel = (DefaultTableModel) tableContractLIst.getModel();
        contractpaymentDetailsTableModel.setDataVector(new Object[][]{
            {"gfgh", "fg", "4534", "dfgdg"},
            {"1", "fg", "4534", "dfgdg"}},
                new String[]{
                    "No", "Name", "Phone No.", "From"
                });
        tableContractLIst.setEnabled(false);
        tableContractLIst.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 2) {     // to detect doble click events
                    Point point = me.getPoint();
                    int column = tableContractLIst.columnAtPoint(point);
                    int row = tableContractLIst.rowAtPoint(point);
                    
                    int result = JOptionPane.showConfirmDialog(null, "Delete now ?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    
                    if (result == Popup.OK) {
                        System.err.println(tableContractLIst.getValueAt(row, 0));
                    }
                }
            }
        });
        
    }
    
    private String copy(String sourcePath, String operatorIconName) {
        
        String[] pathParse = sourcePath.split("\\\\");
        System.out.println("auto.recharge.system.Home.copy()              " + pathParse.length);
        String[] newNames = {pathParse[pathParse.length - 1]};
        Path source = Paths.get(sourcePath); //original file
        clickChooseIcon.setText(source.toString());
        Path targetDir = Paths.get("images/target");
        try {
            Files.createDirectories(targetDir);//in case target directory didn't exist
            for (String name : newNames) {
                Path target = targetDir.resolve(name);// create new path ending with `name` content
                System.out.println("copying into " + target);
                Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
                
            }
            
            return targetDir + "\\" + newNames[0];
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Image not found";
    }
    
    private boolean saveToDbCommand() {
        
        String rechargeUssdParternPre = getRechargeUssdParternPrePaid.getText().toLowerCase();
        String rechargeUssdParternPost = getRechargeUssdParternPostPaid.getText().toLowerCase();
        String operatorName = dropdownOperatorName.getSelectedItem().toString();
        String operatorCode = getOperatorCode.getText();
        String actionFor = getSeletedAction.getSelectedItem().toString();
        String balenceUssdPartern = getBalenceUssdPartern1.getText();
        String acPassword = accountPassword.getText();
        conn = DbConnection.connect();
        try {
            
            String sql = "INSERT INTO command(operator_name,operator_code,action_for,r_ussd_code_pre,r_ussd_code_post,b_s_ussd_code,password,icon) VALUES(?,?,?,?,?,?,?,?)";
            String computerMacAddress = getMacAddress().replace(":", "");
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, operatorName.toUpperCase());
                preparedStatement.setString(2, operatorCode);
                preparedStatement.setString(3, actionFor);
                preparedStatement.setString(4, rechargeUssdParternPre);
                preparedStatement.setString(5, rechargeUssdParternPost);
                preparedStatement.setString(6, balenceUssdPartern);
                preparedStatement.setString(7, AES.encrypt(acPassword, Configaration.getPropertiesValueByKey("secretKey")));
                preparedStatement.setString(8, imagePath);
                preparedStatement.execute();
                switchPanelViaMenu(settingPanel);
                return true;
                
            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (UnknownHostException | SocketException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    private void loadValuesForUssdManagementTable() {
        
        try {
            DefaultTableModel model = new DefaultTableModel(new String[]{
                "Operator Name", "Operator Code", "Action for", "Recharge USSD Code(Prepaind)", "Recharge USSD Code(Postpaind)", "Show Balence Ussd Code", "icon"
            }, 0);
            switchPanelViaMenu(USSDManagementPanel);
            
            ResultSet rs = DbConnection.retrieveAll("command");
            while (rs.next()) {
                
                String operator_name = rs.getString("operator_name");
                String operator_code = rs.getString("operator_code");
                String action_for = rs.getString("action_for");
                String r_ussd_code_pre = rs.getString("r_ussd_code_pre");
                String r_ussd_code_post = rs.getString("r_ussd_code_post");
                String b_s_ussd_code = rs.getString("b_s_ussd_code");
                String icon = rs.getString("icon");
                model.addRow(new Object[]{operator_name, operator_code, action_for, r_ussd_code_pre, r_ussd_code_post, b_s_ussd_code, icon});
                
            }
            ussdSettedTable.setModel(model);
            ussdSettedTable.setEnabled(false);
            ussdSettedTable.addMouseListener(new MouseAdapter() {
                
                @Override
                public void mouseClicked(MouseEvent me) {
                    int seletedOption = 3;
                    Point point = me.getPoint();
                    int row = ussdSettedTable.rowAtPoint(point);
                    Configaration.setErrorLog(me.getClickCount());
                    if (me.getClickCount() == 2) {
                        Object[] options = {"Delete", "Edit"};
                        seletedOption = JOptionPane.showOptionDialog(null, "Choose now ?", "Menu",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        Configaration.setLog(seletedOption);
                    }
                    
                    switch (seletedOption) {
                        case 0:
                            DbConnection.deleteRow("command", "operator_name", ussdSettedTable.getValueAt(row, 0).toString());
                            Home home = new Home();
                            home.showDeshBoardPage();
                            
                            break;
                        case 1:
                            
                            switchPanelViaMenu(updateAddedManagementPanel);
                            getOperatorName1.setText(ussdSettedTable.getValueAt(row, 0).toString());
                            
                            break;
                        default:
                            Configaration.setErrorLog("JOption selection not match");
                            
                            break;
                    }
                }
            });
            
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void showDeshBoardPage() {
        new Home().setVisible(true);
        
    }
    
    protected void switchPanelViaMenu(javax.swing.JPanel requestedPanel) {
        basePanel.removeAll();
        basePanel.repaint();
        basePanel.revalidate();
        
        basePanel.add(requestedPanel);
        basePanel.repaint();
        basePanel.revalidate();
        
    }
    
    private boolean updateToDbCommandByOperator_name() {
        String operatorName = getOperatorName1.getText();
        String rechargeUssdPartern = getRechargeUssdPartern1.getText();
        String operatorCode = getOperatorCode1.getText();
        String actionFor = getSeletedAction1.getSelectedItem().toString();
        String balenceUssdPartern = getBalenceUssdPartern2.getText();
        conn = DbConnection.connect();
        try {
            String sql = "UPDATE command SET  operator_code= ?,action_for = ?, r_ussd_code= ?, b_s_ussd_code= ?, icon= ? WHERE operator_name = \"" + operatorName + "\"";
            System.out.println(sql);
            String computerMacAddress = getMacAddress().replace(":", "");
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, operatorCode);
                preparedStatement.setString(2, actionFor);
                preparedStatement.setString(3, rechargeUssdPartern);
                preparedStatement.setString(4, balenceUssdPartern);
                preparedStatement.setString(5, imagePath);
                preparedStatement.execute();
                Home home = new Home();
                home.showDeshBoardPage();
                return true;
                
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            
        } catch (UnknownHostException | SocketException ex) {
            System.err.println(ex);
        }
        return false;
    }
    
    private void loadImageIcon(String fileName) {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String sname = file.getAbsolutePath();
            imagePath = copy(sname, fileName);
            Configaration.setLog("Icon Load Successful");
        }
    }
    
    private void setContractInTable() {
        int count = 0;
        String[] rowOfContractlist = null;
        DefaultTableModel contractListTableMOdel = new DefaultTableModel(new String[]{"No", "Name", "Phone no", "From"}, 0);
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
            //  System.out.println(com.moniruzzaman.Modem.sendATCommand("AT+CPBR=1,99"));
            rowOfContractlist = com.moniruzzaman.Modem.sendATCommand("AT+CPBR=1,99").replaceAll("\r", "").split("\n");
            
            com.moniruzzaman.Modem.disconnect();
        }
        
        for (String contract : rowOfContractlist) {
            String[] contractPerseDetails = contract.replaceAll("\r", "").replaceAll("\n", "").replaceAll("OK", "")
                    .replaceAll("\"", "").replaceAll(" ", "").split(",");
            
            for (int i = 1; i < contractPerseDetails.length; i++) {
                contractListTableMOdel.addRow(new Object[]{count++, contractPerseDetails[2], contractPerseDetails[4], "Phone"});
            }
            
        }
        tableContractLIst.setRowHeight(25);
        tableContractLIst.setModel(contractListTableMOdel);
    }
    
    private void setCuurentActiveNetworkAndBalenceFromModem() {
        
        String operatorNames = "";
        currentNetworkName.setText("Please wait");
        
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            operatorNames = operatorNames + simOperatorIdentifierDto.getOperatorName() + " | ";
            System.out.println(simOperatorIdentifierDto.getOperatorName() + "  " + simOperatorIdentifierDto.getPortName());
        }
        currentNetworkName.setText(operatorNames);
    }
    
    private void addBalenceInBalenceShowTable() {
        List<String> balancePaseList = new ArrayList<>();
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"SIM Operator", "Current Balence", "Today Load", "Profit"}, 0);
        ModemInfoList.simOperatorIdentifiers.forEach((SimOperatorIdentifierDto simOperatorIdentifierDto) -> {
            try {
                com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
                DbConnection.connect();
                ResultSet rs = DbConnection.retrieveAll("command");
                while (rs.next()) {
                    if (rs.getString("operator_name").equals(simOperatorIdentifierDto.getOperatorName().toUpperCase())) {
                        String[] value = com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"" + rs.getString("b_s_ussd_code") + "\",15").split(",");
                        String balance = (String) Configaration.haxToStringConvert(value[1].replaceAll("\"", ""));
                        Pattern p = Pattern.compile("\\d+");
                        Matcher m = p.matcher(balance);
                        while (m.find()) {
                            balancePaseList.add(m.group());
                            System.out.println(m.group());
                        }
                        
                        defaultTableModel.addRow(new String[]{rs.getString("operator_name"), balancePaseList.get(0) + " Tk", "2000Tk", "1000TK"});
                    }
                }
                com.moniruzzaman.Modem.disconnect();
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        tableShowSimBalence.setRowHeight(30);
        tableShowSimBalence.setModel(defaultTableModel);
    }
    
    private void refrash() {
        getAmmountEachNumber.setText("");
        getAmmountInTk.setText("");
        getBalenceUssdPartern1.setText("");
        getBalenceUssdPartern2.setText("");
        getMobileNumber.setText("");
        getName.setText("");
        getNameForSearch.setText("");
        getOperatorCode.setText("");
        getOperatorCode1.setText("");
        getOperatorName.setText("");
        getOperatorName1.setText("");
        getPhoneNO.setText("");
        getRechargeUssdPartern1.setText("");
        getRechargeUssdParternPostPaid.setText("");
        getSearchViaPhoneNoAndTrnId.setText("");
        getUssdCode.setText("");
        
    }
    
    private void ussdDial() {
        setResponseShowFromUssd.setText("");
        setResponseShowFromUssd.setFocusable(false);
        String response = null;
        String[] responses = null;
        String getOperator = getSelectedSim.getSelectedItem().toString();
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            if (simOperatorIdentifierDto.getOperatorName().toLowerCase().equals(getOperator.toLowerCase())) {
                com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
                String value = com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"" + getUssdCode.getText() + "\",15");
                responses = value.split(",");
                // response = Configaration.haxToStringConvert(value[1]);
                System.err.println(value);
                com.moniruzzaman.Modem.disconnect();
                //setResponseShowFromUssd.setText(Configaration.haxToStringConvert(response));
            }
            
        }
        System.out.println(responses.length);
        if(responses.length == 3){
        for (int i = 0; i < responses.length; i++) {
            response = responses[1].replaceAll("\"", "");
        }
        setResponseShowFromUssd.setText(Configaration.haxToStringConvert(response));
        }
    }
}
