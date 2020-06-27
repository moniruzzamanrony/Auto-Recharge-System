/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import static auto.recharge.system.Mail.getMacAddress;
import auto.recharge.system.dto.ContractResponse;
import auto.recharge.system.dto.ModemInfoList;
import auto.recharge.system.dto.SimOperatorIdentifierDto;
import com.itvillage.AES;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.border.DropShadowBorder;

public class Home extends javax.swing.JFrame {

    private Connection conn;
    private String imagePath = "No Image";
    private LoadingScreen l;
    private String selectedSimOperatorName;
    private String[] rowOfContractlist;
    private String trxId;
    private ResultSet rs;
    private boolean inboxIsActive;
    private String[] perseByCommaInInbox;
    private String[] splitedByCMDValueForInbox = null;
    private String detailsSelectedItems;
    private String search;
    private DefaultListModel defaultListModel = new DefaultListModel();
    private Set<ContractResponse> contractList;
    private final String[] SIM_OPERATORS_NAME = new String[]{"BANKLALINK", "GP", "ROBI", "AIRTEL", "TELETALK"};

    public Home() {
        initComponents();
        // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //  popupMenu.add(confirmPopUp);
        setFocusInMobileRechargePanel();
        setCuurentActiveNetworkAndBalenceFromModem();
        loadActiveOperatorNameInComboBox();
        initialValueInTableRechargeDetails();
        refrash();
        placeHoderSetter();
        setBorderInManuBar();
        suggList.setModel(defaultListModel);
        popupForSuggestManu.add(suggestPanel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suggestPanel = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        suggList = new javax.swing.JList<>();
        popupForSuggestManu = new javax.swing.JPopupMenu();
        menuPanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        mobileRechargeTab = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        billPaymentTab = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        resellerTab = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        detailsTab = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        settingTab = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        title4 = new javax.swing.JLabel();
        helplineTab = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        netBarPanel = new javax.swing.JPanel();
        currentNetworkName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        basePanel = new javax.swing.JPanel();
        mobileRechargePanel = new javax.swing.JPanel();
        getSeletedOperatorName = new javax.swing.JComboBox<>();
        clickSend = new javax.swing.JLabel();
        getPrepaidOrPostpaid = new javax.swing.JComboBox<>();
        getAmmountInTk = new javax.swing.JTextField();
        getMobileNumber = new javax.swing.JTextField();
        selectedSimOperatorIcon = new javax.swing.JLabel();
        clickContactList = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rechargeBalencePanel = new javax.swing.JPanel();
        errorMgsInBalencePanel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clickRefrash = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShowSimBalence = new javax.swing.JTable();
        clickUssdDail = new javax.swing.JButton();
        clickGroupLoad = new javax.swing.JButton();
        clickSIMOffer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRechargeDetailsShow = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        reportGeneratePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        billPayPanel = new javax.swing.JPanel();
        clickBkash = new javax.swing.JLabel();
        clickSureCash = new javax.swing.JLabel();
        clickNogot = new javax.swing.JLabel();
        clickRocket1 = new javax.swing.JLabel();
        clickMyCash = new javax.swing.JLabel();
        clicktCash = new javax.swing.JLabel();
        clickUCash1 = new javax.swing.JLabel();
        hoverViewbKash = new javax.swing.JPanel();
        hoverViewMyCash = new javax.swing.JPanel();
        hoverViewSureCash = new javax.swing.JPanel();
        hoverViewrocket = new javax.swing.JPanel();
        hoverViewUCash = new javax.swing.JPanel();
        hoverViewnogot = new javax.swing.JPanel();
        hoverViewTCash = new javax.swing.JPanel();
        resellerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        detailsPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableForDetails = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        getPhoneNoForSearch = new javax.swing.JTextField();
        clickSearchedByPhoneNoBut = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        clickSearchedfromToBut = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        clickSearchedReportDownload = new javax.swing.JButton();
        clickResetBut = new javax.swing.JButton();
        fromDateChooser = new com.toedter.calendar.JDateChooser();
        toDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        setMgsDetails = new javax.swing.JTextArea();
        getSelectedOptionFroTable = new javax.swing.JComboBox<>();
        settingsPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        myProfile = new javax.swing.JLabel();
        settingBasePanel = new javax.swing.JPanel();
        myProfilePanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        systemBackupPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        passwordChangePanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        trustedEmployeePanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        rechargeSettingsPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ussdSettedTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        clickSerch1 = new javax.swing.JLabel();
        clickAddNewManagement = new javax.swing.JButton();
        MobileBankingSettingsPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        bKashSettingPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        bKashServiceListTable = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        getSelectedServiceCombo = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        getSelectedSIMNameCombo = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        getbKashPIN = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        rocketSettingPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        surecashSettingPanel = new javax.swing.JPanel();
        myCashSettingPanel2 = new javax.swing.JPanel();
        ucashSettingPanel3 = new javax.swing.JPanel();
        tCashSettingPanel4 = new javax.swing.JPanel();
        nogodSettingPanel5 = new javax.swing.JPanel();
        rechargeOfferPanel = new javax.swing.JPanel();
        getRechargeAmountInSetting = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        getOfferNameInSeting = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        getRechargeAmmountInSeetings = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        getValidityInSetting = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        getDescriptionInSetting = new javax.swing.JTextField();
        getSelectedValidityTimeTypeSetting = new javax.swing.JComboBox<>();
        saveNewOfferInSettrings = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        getSIMOperatorName = new javax.swing.JComboBox<>();
        addNewManagementPanelSettings = new javax.swing.JPanel();
        backToUssdManengementPanel1 = new javax.swing.JLabel();
        getOparetorNameInDropDown = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        clickAddContract2 = new javax.swing.JButton();
        getOperatorName1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        getOperatorCode1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        getRechargeUssdParternPrePaid1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        clickChooseIcon1 = new javax.swing.JButton();
        getprofitIn1k = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        accountPassword1 = new javax.swing.JPasswordField();
        jLabel49 = new javax.swing.JLabel();
        getRechargeUssdParternPostPaid1 = new javax.swing.JTextField();
        labelUssdPatternSkitto = new javax.swing.JLabel();
        getRechargeUssdParternSkitto = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        getBalenceUssdPartern3 = new javax.swing.JTextField();
        systemBackup = new javax.swing.JLabel();
        trustedEmployee = new javax.swing.JLabel();
        passwordChange = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rechargeSettings = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mobileBankingSettings = new javax.swing.JLabel();
        rechargeOffers = new javax.swing.JLabel();
        helplinePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ussdDialPanel = new javax.swing.JPanel();
        backToMobileRecharge = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        clickUssdSessionClose = new javax.swing.JButton();
        getSelectedSim = new javax.swing.JComboBox<>();
        getUssdCode = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        setResponseShowFromUssd = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        clickUssdDailDorSend1 = new javax.swing.JButton();
        contractListPanel = new javax.swing.JPanel();
        serchBar = new javax.swing.JPanel();
        getNameForSearch = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableContractLIst = new javax.swing.JTable();
        clickNewContract = new javax.swing.JButton();
        addNewManagementPanel = new javax.swing.JPanel();
        backToUssdManengementPanel = new javax.swing.JLabel();
        dropdownOperatorName = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        clickAddContract1 = new javax.swing.JButton();
        getOperatorName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        getOperatorCode = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        getSeletedAction = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        getRechargeUssdParternPrePaid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        clickChooseIcon = new javax.swing.JButton();
        getBalenceUssdPartern1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        accountPassword = new javax.swing.JPasswordField();
        jLabel36 = new javax.swing.JLabel();
        getRechargeUssdParternPostPaid = new javax.swing.JTextField();
        addNewContractPanel = new javax.swing.JPanel();
        back43 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        clickAddContract = new javax.swing.JButton();
        getNameForContract = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        getPhoneNOForContract = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        getSeletedStorage = new javax.swing.JComboBox<>();
        addBillPaymentDetailsPanel = new javax.swing.JPanel();
        backToBillPayment = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        comboBoxActiveSIM = new javax.swing.JComboBox<>();
        baseInformationPanel = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();

        suggestPanel.setPreferredSize(new java.awt.Dimension(670, 471));

        suggList.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        suggList.setSelectionBackground(new java.awt.Color(204, 0, 51));
        suggList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        suggList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suggListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suggListMouseEntered(evt);
            }
        });
        jScrollPane9.setViewportView(suggList);

        javax.swing.GroupLayout suggestPanelLayout = new javax.swing.GroupLayout(suggestPanel);
        suggestPanel.setLayout(suggestPanelLayout);
        suggestPanelLayout.setHorizontalGroup(
            suggestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        suggestPanelLayout.setVerticalGroup(
            suggestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        popupForSuggestManu.setBorder(null);
        popupForSuggestManu.setFocusable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(133, 47, 209));
        menuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPanelMouseClicked(evt);
            }
        });

        logoPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/map.png"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        mobileRechargeTab.setBackground(new java.awt.Color(255, 255, 255));
        mobileRechargeTab.setForeground(new java.awt.Color(153, 153, 255));
        mobileRechargeTab.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mobileRechargeTabMouseMoved(evt);
            }
        });
        mobileRechargeTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileRechargeTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobileRechargeTabHover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobileRechargeTabMouseExited(evt);
            }
        });

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/payment_color.png"))); // NOI18N

        title.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(133, 47, 209));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Recharge");

        javax.swing.GroupLayout mobileRechargeTabLayout = new javax.swing.GroupLayout(mobileRechargeTab);
        mobileRechargeTab.setLayout(mobileRechargeTabLayout);
        mobileRechargeTabLayout.setHorizontalGroup(
            mobileRechargeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mobileRechargeTabLayout.setVerticalGroup(
            mobileRechargeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargeTabLayout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        billPaymentTab.setBackground(new java.awt.Color(133, 47, 209));
        billPaymentTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billPaymentTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billPaymentTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billPaymentTabMouseExited(evt);
            }
        });

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/money.png"))); // NOI18N

        title1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(153, 153, 153));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Bill Pay");

        javax.swing.GroupLayout billPaymentTabLayout = new javax.swing.GroupLayout(billPaymentTab);
        billPaymentTab.setLayout(billPaymentTabLayout);
        billPaymentTabLayout.setHorizontalGroup(
            billPaymentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        billPaymentTabLayout.setVerticalGroup(
            billPaymentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPaymentTabLayout.createSequentialGroup()
                .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resellerTab.setBackground(new java.awt.Color(133, 47, 209));
        resellerTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resellerTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resellerTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resellerTabMouseExited(evt);
            }
        });

        icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/reseller.png"))); // NOI18N

        title2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(153, 153, 153));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Reseller");

        javax.swing.GroupLayout resellerTabLayout = new javax.swing.GroupLayout(resellerTab);
        resellerTab.setLayout(resellerTabLayout);
        resellerTabLayout.setHorizontalGroup(
            resellerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        resellerTabLayout.setVerticalGroup(
            resellerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resellerTabLayout.createSequentialGroup()
                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        detailsTab.setBackground(new java.awt.Color(133, 47, 209));
        detailsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detailsTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detailsTabMouseExited(evt);
            }
        });

        icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/details.png"))); // NOI18N

        title3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        title3.setForeground(new java.awt.Color(153, 153, 153));
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("Details");

        javax.swing.GroupLayout detailsTabLayout = new javax.swing.GroupLayout(detailsTab);
        detailsTab.setLayout(detailsTabLayout);
        detailsTabLayout.setHorizontalGroup(
            detailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(detailsTabLayout.createSequentialGroup()
                .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        detailsTabLayout.setVerticalGroup(
            detailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsTabLayout.createSequentialGroup()
                .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        settingTab.setBackground(new java.awt.Color(133, 47, 209));
        settingTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingTabMouseExited(evt);
            }
        });

        icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/settings_1.png"))); // NOI18N

        title4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        title4.setForeground(new java.awt.Color(153, 153, 153));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("settings");

        javax.swing.GroupLayout settingTabLayout = new javax.swing.GroupLayout(settingTab);
        settingTab.setLayout(settingTabLayout);
        settingTabLayout.setHorizontalGroup(
            settingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        settingTabLayout.setVerticalGroup(
            settingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingTabLayout.createSequentialGroup()
                .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        helplineTab.setBackground(new java.awt.Color(133, 47, 209));
        helplineTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helplineTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helplineTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helplineTabMouseExited(evt);
            }
        });

        icon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/helpline.png"))); // NOI18N

        title5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        title5.setForeground(new java.awt.Color(153, 153, 153));
        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("Help Line");

        javax.swing.GroupLayout helplineTabLayout = new javax.swing.GroupLayout(helplineTab);
        helplineTab.setLayout(helplineTabLayout);
        helplineTabLayout.setHorizontalGroup(
            helplineTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        helplineTabLayout.setVerticalGroup(
            helplineTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplineTabLayout.createSequentialGroup()
                .addComponent(icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailsTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(helplineTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mobileRechargeTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(billPaymentTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resellerTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobileRechargeTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billPaymentTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resellerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(detailsTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helplineTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerLabel.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(133, 47, 209));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Mobile Recharge");
        headerLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        netBarPanel.setBackground(new java.awt.Color(255, 255, 255));
        netBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        currentNetworkName.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        currentNetworkName.setForeground(new java.awt.Color(102, 102, 255));
        currentNetworkName.setText("No SIIM Avaiable");
        netBarPanel.add(currentNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 380, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        netBarPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 12, 460, -1));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262)
                .addComponent(netBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(netBarPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        basePanel.setBackground(new java.awt.Color(255, 255, 255));
        basePanel.setLayout(new java.awt.CardLayout());

        mobileRechargePanel.setBackground(new java.awt.Color(255, 255, 255));

        getSeletedOperatorName.setBackground(new java.awt.Color(255, 255, 255));
        getSeletedOperatorName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getSeletedOperatorName.setForeground(new java.awt.Color(204, 0, 0));
        getSeletedOperatorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSeletedOperatorNameActionPerformed(evt);
            }
        });

        clickSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSendMouseClicked(evt);
            }
        });

        getPrepaidOrPostpaid.setBackground(new java.awt.Color(255, 255, 255));
        getPrepaidOrPostpaid.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getPrepaidOrPostpaid.setForeground(new java.awt.Color(255, 153, 153));
        getPrepaidOrPostpaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));

        getAmmountInTk.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        getAmmountInTk.setBorder(null);
        getAmmountInTk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getAmmountInTkFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getAmmountInTkFocusLost(evt);
            }
        });
        getAmmountInTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAmmountInTkActionPerformed(evt);
            }
        });

        getMobileNumber.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        getMobileNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getMobileNumber.setBorder(null);
        getMobileNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getMobileNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getMobileNumberFocusLost(evt);
            }
        });
        getMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getMobileNumberKeyReleased(evt);
            }
        });

        clickContactList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickContactListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickContactListMouseEntered(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/mobile_recharge_bar.png"))); // NOI18N

        rechargeBalencePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        errorMgsInBalencePanel.setBackground(new java.awt.Color(255, 0, 51));
        errorMgsInBalencePanel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        errorMgsInBalencePanel.setForeground(new java.awt.Color(255, 0, 0));
        errorMgsInBalencePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMgsInBalencePanel.setText("-------  Reload Now  ---------");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Amount panel");

        clickRefrash.setBackground(new java.awt.Color(255, 0, 0));
        clickRefrash.setForeground(new java.awt.Color(255, 255, 255));
        clickRefrash.setText("Refrash");
        clickRefrash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickRefrashActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(133, 47, 209));

        tableShowSimBalence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Operator Name", "Cuurent Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableShowSimBalence);

        javax.swing.GroupLayout rechargeBalencePanelLayout = new javax.swing.GroupLayout(rechargeBalencePanel);
        rechargeBalencePanel.setLayout(rechargeBalencePanelLayout);
        rechargeBalencePanelLayout.setHorizontalGroup(
            rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(rechargeBalencePanelLayout.createSequentialGroup()
                .addGroup(rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rechargeBalencePanelLayout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(105, 105, 105)
                        .addComponent(clickRefrash))
                    .addGroup(rechargeBalencePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(errorMgsInBalencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        rechargeBalencePanelLayout.setVerticalGroup(
            rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeBalencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clickRefrash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMgsInBalencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        clickUssdDail.setBackground(new java.awt.Color(204, 153, 255));
        clickUssdDail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickUssdDail.setForeground(new java.awt.Color(255, 255, 255));
        clickUssdDail.setText("Ussd Dial");
        clickUssdDail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUssdDailActionPerformed(evt);
            }
        });

        clickGroupLoad.setBackground(new java.awt.Color(153, 153, 255));
        clickGroupLoad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickGroupLoad.setForeground(new java.awt.Color(255, 255, 255));
        clickGroupLoad.setText("Group Load");
        clickGroupLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickGroupLoadActionPerformed(evt);
            }
        });

        clickSIMOffer.setBackground(new java.awt.Color(153, 0, 255));
        clickSIMOffer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickSIMOffer.setForeground(new java.awt.Color(255, 255, 255));
        clickSIMOffer.setText("SIM Offer");
        clickSIMOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSIMOfferActionPerformed(evt);
            }
        });

        tableRechargeDetailsShow.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tableRechargeDetailsShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TrxId", "Date & Time", "Type", "Mobile No.", "Amount", "From", "Current Balance", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableRechargeDetailsShow.setFocusable(false);
        tableRechargeDetailsShow.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableRechargeDetailsShow.setRowHeight(30);
        tableRechargeDetailsShow.setSelectionBackground(new java.awt.Color(51, 153, 0));
        tableRechargeDetailsShow.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableRechargeDetailsShow.setShowVerticalLines(false);
        tableRechargeDetailsShow.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableRechargeDetailsShow);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Today's Recharge");

        reportGeneratePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Report Genarate");

        jLabel11.setText("Operator Name: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("From: ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("To: ");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setBackground(new java.awt.Color(133, 47, 209));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generate Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportGeneratePanelLayout = new javax.swing.GroupLayout(reportGeneratePanel);
        reportGeneratePanel.setLayout(reportGeneratePanelLayout);
        reportGeneratePanelLayout.setHorizontalGroup(
            reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportGeneratePanelLayout.createSequentialGroup()
                .addGroup(reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportGeneratePanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportGeneratePanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(reportGeneratePanelLayout.createSequentialGroup()
                                .addGroup(reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(70, 70, 70)
                                .addGroup(reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(reportGeneratePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportGeneratePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(92, 92, 92))
        );
        reportGeneratePanelLayout.setVerticalGroup(
            reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportGeneratePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(reportGeneratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mobileRechargePanelLayout = new javax.swing.GroupLayout(mobileRechargePanel);
        mobileRechargePanel.setLayout(mobileRechargePanelLayout);
        mobileRechargePanelLayout.setHorizontalGroup(
            mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                        .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(672, 672, 672)
                                .addComponent(getPrepaidOrPostpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(selectedSimOperatorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(672, 672, 672)
                                .addComponent(clickSend, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(getMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(clickContactList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(getAmmountInTk, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clickUssdDail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clickGroupLoad)
                            .addComponent(clickSIMOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getSeletedOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                        .addGap(522, 522, 522)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rechargeBalencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportGeneratePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mobileRechargePanelLayout.setVerticalGroup(
            mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                        .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(getPrepaidOrPostpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(selectedSimOperatorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(clickSend, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(getMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(clickContactList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(getAmmountInTk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(clickUssdDail)
                                .addGap(12, 12, 12)
                                .addComponent(clickGroupLoad)
                                .addGap(12, 12, 12)
                                .addComponent(clickSIMOffer)
                                .addGap(10, 10, 10)
                                .addComponent(getSeletedOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                        .addComponent(rechargeBalencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reportGeneratePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        basePanel.add(mobileRechargePanel, "card2");

        billPayPanel.setBackground(new java.awt.Color(255, 255, 255));

        clickBkash.setBackground(new java.awt.Color(255, 102, 102));
        clickBkash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickBkash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/bkash_logo_edited.png"))); // NOI18N
        clickBkash.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickBkash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickBkashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickBkashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickBkashMouseExited(evt);
            }
        });

        clickSureCash.setBackground(new java.awt.Color(51, 51, 255));
        clickSureCash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickSureCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/surecash_logo_edited.png"))); // NOI18N
        clickSureCash.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickSureCash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSureCashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickSureCashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickSureCashMouseExited(evt);
            }
        });

        clickNogot.setBackground(new java.awt.Color(255, 102, 102));
        clickNogot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickNogot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/nogot_logo_edited.png"))); // NOI18N
        clickNogot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickNogot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickNogotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickNogotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickNogotMouseExited(evt);
            }
        });

        clickRocket1.setBackground(new java.awt.Color(153, 0, 255));
        clickRocket1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickRocket1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/rocket_icon_edited.png"))); // NOI18N
        clickRocket1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickRocket1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickRocket1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickRocket1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickRocket1MouseExited(evt);
            }
        });

        clickMyCash.setBackground(new java.awt.Color(51, 204, 0));
        clickMyCash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickMyCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/mycash_icon_edited.png"))); // NOI18N
        clickMyCash.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickMyCash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMyCashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickMyCashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickMyCashMouseExited(evt);
            }
        });

        clicktCash.setBackground(new java.awt.Color(204, 0, 51));
        clicktCash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clicktCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/tcash_icon_edited.png"))); // NOI18N
        clicktCash.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clicktCash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicktCashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clicktCashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clicktCashMouseExited(evt);
            }
        });

        clickUCash1.setBackground(new java.awt.Color(204, 204, 0));
        clickUCash1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickUCash1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/uxasg_icon_edited.png"))); // NOI18N
        clickUCash1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickUCash1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickUCash1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickUCash1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickUCash1MouseExited(evt);
            }
        });

        hoverViewbKash.setBackground(new java.awt.Color(255, 255, 255));
        hoverViewbKash.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout hoverViewbKashLayout = new javax.swing.GroupLayout(hoverViewbKash);
        hoverViewbKash.setLayout(hoverViewbKashLayout);
        hoverViewbKashLayout.setHorizontalGroup(
            hoverViewbKashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hoverViewbKashLayout.setVerticalGroup(
            hoverViewbKashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        hoverViewMyCash.setBackground(new java.awt.Color(255, 255, 255));
        hoverViewMyCash.setPreferredSize(new java.awt.Dimension(206, 5));

        javax.swing.GroupLayout hoverViewMyCashLayout = new javax.swing.GroupLayout(hoverViewMyCash);
        hoverViewMyCash.setLayout(hoverViewMyCashLayout);
        hoverViewMyCashLayout.setHorizontalGroup(
            hoverViewMyCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hoverViewMyCashLayout.setVerticalGroup(
            hoverViewMyCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        hoverViewSureCash.setBackground(new java.awt.Color(255, 255, 255));
        hoverViewSureCash.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout hoverViewSureCashLayout = new javax.swing.GroupLayout(hoverViewSureCash);
        hoverViewSureCash.setLayout(hoverViewSureCashLayout);
        hoverViewSureCashLayout.setHorizontalGroup(
            hoverViewSureCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hoverViewSureCashLayout.setVerticalGroup(
            hoverViewSureCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        hoverViewrocket.setBackground(new java.awt.Color(255, 255, 255));
        hoverViewrocket.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout hoverViewrocketLayout = new javax.swing.GroupLayout(hoverViewrocket);
        hoverViewrocket.setLayout(hoverViewrocketLayout);
        hoverViewrocketLayout.setHorizontalGroup(
            hoverViewrocketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );
        hoverViewrocketLayout.setVerticalGroup(
            hoverViewrocketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        hoverViewUCash.setBackground(new java.awt.Color(255, 255, 255));
        hoverViewUCash.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout hoverViewUCashLayout = new javax.swing.GroupLayout(hoverViewUCash);
        hoverViewUCash.setLayout(hoverViewUCashLayout);
        hoverViewUCashLayout.setHorizontalGroup(
            hoverViewUCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hoverViewUCashLayout.setVerticalGroup(
            hoverViewUCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        hoverViewnogot.setBackground(new java.awt.Color(255, 255, 255));
        hoverViewnogot.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout hoverViewnogotLayout = new javax.swing.GroupLayout(hoverViewnogot);
        hoverViewnogot.setLayout(hoverViewnogotLayout);
        hoverViewnogotLayout.setHorizontalGroup(
            hoverViewnogotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );
        hoverViewnogotLayout.setVerticalGroup(
            hoverViewnogotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        hoverViewTCash.setBackground(new java.awt.Color(255, 255, 255));
        hoverViewTCash.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout hoverViewTCashLayout = new javax.swing.GroupLayout(hoverViewTCash);
        hoverViewTCash.setLayout(hoverViewTCashLayout);
        hoverViewTCashLayout.setHorizontalGroup(
            hoverViewTCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hoverViewTCashLayout.setVerticalGroup(
            hoverViewTCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout billPayPanelLayout = new javax.swing.GroupLayout(billPayPanel);
        billPayPanel.setLayout(billPayPanelLayout);
        billPayPanelLayout.setHorizontalGroup(
            billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPayPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hoverViewbKash, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(clicktCash, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(clickBkash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hoverViewTCash, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hoverViewnogot, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(clickNogot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clickRocket1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(hoverViewrocket, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addGap(147, 147, 147)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hoverViewSureCash, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(clickSureCash, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(144, 144, 144)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clickMyCash, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(hoverViewMyCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(99, 99, 99)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clickUCash1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(hoverViewUCash, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap())
        );
        billPayPanelLayout.setVerticalGroup(
            billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPayPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clickBkash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clickRocket1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(clickUCash1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(clickMyCash, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(clickSureCash, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billPayPanelLayout.createSequentialGroup()
                        .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoverViewbKash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoverViewrocket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoverViewSureCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoverViewMyCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clicktCash, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(clickNogot, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                    .addComponent(hoverViewUCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hoverViewTCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hoverViewnogot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        basePanel.add(billPayPanel, "card2");

        resellerPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("re seller");

        javax.swing.GroupLayout resellerPanelLayout = new javax.swing.GroupLayout(resellerPanel);
        resellerPanel.setLayout(resellerPanelLayout);
        resellerPanelLayout.setHorizontalGroup(
            resellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resellerPanelLayout.createSequentialGroup()
                .addGap(566, 566, 566)
                .addComponent(jLabel3)
                .addContainerGap(981, Short.MAX_VALUE))
        );
        resellerPanelLayout.setVerticalGroup(
            resellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resellerPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel3)
                .addContainerGap(680, Short.MAX_VALUE))
        );

        basePanel.add(resellerPanel, "card2");

        detailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        tableForDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tableForDetails);

        searchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search");

        jLabel50.setText("Phone Number: ");

        clickSearchedByPhoneNoBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search.png"))); // NOI18N
        clickSearchedByPhoneNoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSearchedByPhoneNoButActionPerformed(evt);
            }
        });

        jLabel53.setText("From");

        clickSearchedfromToBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search.png"))); // NOI18N
        clickSearchedfromToBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSearchedfromToButActionPerformed(evt);
            }
        });

        jLabel54.setText("To");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Download Reports");

        clickSearchedReportDownload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/download.png"))); // NOI18N
        clickSearchedReportDownload.setText("Export This Recharge Report ");
        clickSearchedReportDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSearchedReportDownloadActionPerformed(evt);
            }
        });

        clickResetBut.setBackground(new java.awt.Color(255, 102, 102));
        clickResetBut.setForeground(new java.awt.Color(255, 255, 255));
        clickResetBut.setText("Refrash");
        clickResetBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickResetButActionPerformed(evt);
            }
        });

        fromDateChooser.setDateFormatString("yy/MM/dd");

        toDateChooser.setDateFormatString("yy/MM/dd");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator7)
            .addComponent(jSeparator6)
            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(clickResetBut)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                                .addComponent(clickSearchedReportDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                                .addComponent(getPhoneNoForSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clickSearchedByPhoneNoBut))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clickSearchedfromToBut, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel53))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fromDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickResetBut)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clickSearchedByPhoneNoBut)
                    .addComponent(getPhoneNoForSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel53)
                .addGap(7, 7, 7)
                .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clickSearchedfromToBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(160, 160, 160)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel56)
                .addGap(42, 42, 42)
                .addComponent(clickSearchedReportDownload)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        setMgsDetails.setColumns(20);
        setMgsDetails.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        setMgsDetails.setForeground(new java.awt.Color(255, 102, 102));
        setMgsDetails.setRows(5);
        setMgsDetails.setText("ghbfgh");
        jScrollPane7.setViewportView(setMgsDetails);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        getSelectedOptionFroTable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "My Recharge", "Inbox" }));
        getSelectedOptionFroTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSelectedOptionFroTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getSelectedOptionFroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getSelectedOptionFroTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        basePanel.add(detailsPanel, "card2");

        settingsPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Account");

        myProfile.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        myProfile.setForeground(new java.awt.Color(51, 0, 204));
        myProfile.setText("My Profile");
        myProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myProfileMouseClicked(evt);
            }
        });

        settingBasePanel.setLayout(new java.awt.CardLayout());

        myProfilePanel.setToolTipText("");

        jLabel16.setText("progile");

        javax.swing.GroupLayout myProfilePanelLayout = new javax.swing.GroupLayout(myProfilePanel);
        myProfilePanel.setLayout(myProfilePanelLayout);
        myProfilePanelLayout.setHorizontalGroup(
            myProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myProfilePanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel16)
                .addContainerGap(833, Short.MAX_VALUE))
        );
        myProfilePanelLayout.setVerticalGroup(
            myProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myProfilePanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel16)
                .addContainerGap(636, Short.MAX_VALUE))
        );

        settingBasePanel.add(myProfilePanel, "card2");

        systemBackupPanel.setToolTipText("");

        jLabel17.setText("System backup");

        javax.swing.GroupLayout systemBackupPanelLayout = new javax.swing.GroupLayout(systemBackupPanel);
        systemBackupPanel.setLayout(systemBackupPanelLayout);
        systemBackupPanelLayout.setHorizontalGroup(
            systemBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemBackupPanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel17)
                .addContainerGap(784, Short.MAX_VALUE))
        );
        systemBackupPanelLayout.setVerticalGroup(
            systemBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemBackupPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel17)
                .addContainerGap(636, Short.MAX_VALUE))
        );

        settingBasePanel.add(systemBackupPanel, "card2");

        passwordChangePanel.setToolTipText("");

        jLabel18.setText("System backup");

        javax.swing.GroupLayout passwordChangePanelLayout = new javax.swing.GroupLayout(passwordChangePanel);
        passwordChangePanel.setLayout(passwordChangePanelLayout);
        passwordChangePanelLayout.setHorizontalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel18)
                .addContainerGap(784, Short.MAX_VALUE))
        );
        passwordChangePanelLayout.setVerticalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel18)
                .addContainerGap(636, Short.MAX_VALUE))
        );

        settingBasePanel.add(passwordChangePanel, "card2");

        trustedEmployeePanel.setToolTipText("");

        jLabel19.setText("Trusted Employee");

        javax.swing.GroupLayout trustedEmployeePanelLayout = new javax.swing.GroupLayout(trustedEmployeePanel);
        trustedEmployeePanel.setLayout(trustedEmployeePanelLayout);
        trustedEmployeePanelLayout.setHorizontalGroup(
            trustedEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trustedEmployeePanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel19)
                .addContainerGap(770, Short.MAX_VALUE))
        );
        trustedEmployeePanelLayout.setVerticalGroup(
            trustedEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trustedEmployeePanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel19)
                .addContainerGap(636, Short.MAX_VALUE))
        );

        settingBasePanel.add(trustedEmployeePanel, "card2");

        rechargeSettingsPanel.setToolTipText("");

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

        jLabel23.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Recharge Settings");

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

        javax.swing.GroupLayout rechargeSettingsPanelLayout = new javax.swing.GroupLayout(rechargeSettingsPanel);
        rechargeSettingsPanel.setLayout(rechargeSettingsPanelLayout);
        rechargeSettingsPanelLayout.setHorizontalGroup(
            rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                        .addGroup(rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(313, 313, 313)
                                .addComponent(clickAddNewManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                        .addGap(940, 940, 940)
                        .addComponent(clickSerch1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        rechargeSettingsPanelLayout.setVerticalGroup(
            rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clickAddNewManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(82, 82, 82)
                .addGroup(rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(clickSerch1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        settingBasePanel.add(rechargeSettingsPanel, "card2");

        MobileBankingSettingsPanel.setToolTipText("");

        bKashServiceListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(bKashServiceListTable);

        jLabel51.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Services");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add new services");

        getSelectedServiceCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSelectedServiceComboActionPerformed(evt);
            }
        });

        jLabel58.setText("Select Service");

        jLabel59.setText("Select SIM Name");

        getSelectedSIMNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSelectedSIMNameComboActionPerformed(evt);
            }
        });

        jLabel60.setText("Ussd Code pattern");

        jLabel61.setText("bKash PIN");

        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Reset");

        Save.setForeground(new java.awt.Color(51, 204, 0));
        Save.setText("Save");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getbKashPIN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getSelectedServiceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getSelectedSIMNameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel61)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSelectedServiceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSelectedSIMNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getbKashPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(Save))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bKashSettingPanelLayout = new javax.swing.GroupLayout(bKashSettingPanel);
        bKashSettingPanel.setLayout(bKashSettingPanelLayout);
        bKashSettingPanelLayout.setHorizontalGroup(
            bKashSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bKashSettingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bKashSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bKashSettingPanelLayout.setVerticalGroup(
            bKashSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bKashSettingPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(bKashSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bKashSettingPanelLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("bKash", bKashSettingPanel);

        jLabel21.setText("roket");

        javax.swing.GroupLayout rocketSettingPanelLayout = new javax.swing.GroupLayout(rocketSettingPanel);
        rocketSettingPanel.setLayout(rocketSettingPanelLayout);
        rocketSettingPanelLayout.setHorizontalGroup(
            rocketSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rocketSettingPanelLayout.createSequentialGroup()
                .addContainerGap(633, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(597, 597, 597))
        );
        rocketSettingPanelLayout.setVerticalGroup(
            rocketSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rocketSettingPanelLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel21)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rocket", rocketSettingPanel);

        javax.swing.GroupLayout surecashSettingPanelLayout = new javax.swing.GroupLayout(surecashSettingPanel);
        surecashSettingPanel.setLayout(surecashSettingPanelLayout);
        surecashSettingPanelLayout.setHorizontalGroup(
            surecashSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        surecashSettingPanelLayout.setVerticalGroup(
            surecashSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sure Cash", surecashSettingPanel);

        javax.swing.GroupLayout myCashSettingPanel2Layout = new javax.swing.GroupLayout(myCashSettingPanel2);
        myCashSettingPanel2.setLayout(myCashSettingPanel2Layout);
        myCashSettingPanel2Layout.setHorizontalGroup(
            myCashSettingPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        myCashSettingPanel2Layout.setVerticalGroup(
            myCashSettingPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("My Cash", myCashSettingPanel2);

        javax.swing.GroupLayout ucashSettingPanel3Layout = new javax.swing.GroupLayout(ucashSettingPanel3);
        ucashSettingPanel3.setLayout(ucashSettingPanel3Layout);
        ucashSettingPanel3Layout.setHorizontalGroup(
            ucashSettingPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        ucashSettingPanel3Layout.setVerticalGroup(
            ucashSettingPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("U Cash", ucashSettingPanel3);

        javax.swing.GroupLayout tCashSettingPanel4Layout = new javax.swing.GroupLayout(tCashSettingPanel4);
        tCashSettingPanel4.setLayout(tCashSettingPanel4Layout);
        tCashSettingPanel4Layout.setHorizontalGroup(
            tCashSettingPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        tCashSettingPanel4Layout.setVerticalGroup(
            tCashSettingPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tCash", tCashSettingPanel4);

        javax.swing.GroupLayout nogodSettingPanel5Layout = new javax.swing.GroupLayout(nogodSettingPanel5);
        nogodSettingPanel5.setLayout(nogodSettingPanel5Layout);
        nogodSettingPanel5Layout.setHorizontalGroup(
            nogodSettingPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        nogodSettingPanel5Layout.setVerticalGroup(
            nogodSettingPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nagod", nogodSettingPanel5);

        javax.swing.GroupLayout MobileBankingSettingsPanelLayout = new javax.swing.GroupLayout(MobileBankingSettingsPanel);
        MobileBankingSettingsPanel.setLayout(MobileBankingSettingsPanelLayout);
        MobileBankingSettingsPanelLayout.setHorizontalGroup(
            MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        MobileBankingSettingsPanelLayout.setVerticalGroup(
            MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingBasePanel.add(MobileBankingSettingsPanel, "card2");

        rechargeOfferPanel.setToolTipText("");

        getRechargeAmountInSetting.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 23)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Offer Name");

        getOfferNameInSeting.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Cambria", 1, 23)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Recharge Amount");

        getRechargeAmmountInSeetings.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N

        jLabel63.setFont(new java.awt.Font("Cambria", 1, 23)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Validity");

        getValidityInSetting.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N

        jLabel64.setFont(new java.awt.Font("Cambria", 1, 23)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Description");

        getDescriptionInSetting.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N

        getSelectedValidityTimeTypeSetting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hours", "Days", "Years" }));

        saveNewOfferInSettrings.setBackground(new java.awt.Color(51, 204, 0));
        saveNewOfferInSettrings.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        saveNewOfferInSettrings.setForeground(new java.awt.Color(255, 255, 255));
        saveNewOfferInSettrings.setText("Save");
        saveNewOfferInSettrings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewOfferInSettringsActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Cambria", 1, 23)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("SIM Operator");

        javax.swing.GroupLayout getRechargeAmountInSettingLayout = new javax.swing.GroupLayout(getRechargeAmountInSetting);
        getRechargeAmountInSetting.setLayout(getRechargeAmountInSettingLayout);
        getRechargeAmountInSettingLayout.setHorizontalGroup(
            getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getRechargeAmountInSettingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveNewOfferInSettrings, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
            .addGroup(getRechargeAmountInSettingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getRechargeAmountInSettingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getRechargeAmountInSettingLayout.createSequentialGroup()
                                .addComponent(getOfferNameInSeting, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getRechargeAmountInSettingLayout.createSequentialGroup()
                                .addComponent(getValidityInSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getSelectedValidityTimeTypeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))))
                    .addGroup(getRechargeAmountInSettingLayout.createSequentialGroup()
                        .addGroup(getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getRechargeAmountInSettingLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getRechargeAmmountInSeetings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getDescriptionInSetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)))
                        .addContainerGap())))
            .addGroup(getRechargeAmountInSettingLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(getSIMOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getRechargeAmountInSettingLayout.setVerticalGroup(
            getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getRechargeAmountInSettingLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSIMOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getOfferNameInSeting, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getRechargeAmmountInSeetings, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getValidityInSetting)
                    .addComponent(getSelectedValidityTimeTypeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getDescriptionInSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveNewOfferInSettrings, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rechargeOfferPanelLayout = new javax.swing.GroupLayout(rechargeOfferPanel);
        rechargeOfferPanel.setLayout(rechargeOfferPanelLayout);
        rechargeOfferPanelLayout.setHorizontalGroup(
            rechargeOfferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rechargeOfferPanelLayout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(getRechargeAmountInSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        rechargeOfferPanelLayout.setVerticalGroup(
            rechargeOfferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeOfferPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getRechargeAmountInSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        settingBasePanel.add(rechargeOfferPanel, "card2");

        addNewManagementPanelSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backToUssdManengementPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToUssdManengementPanel1.setText("jLabel3");
        backToUssdManengementPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                backToUssdManengementPanel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        backToUssdManengementPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToUssdManengementPanel1MouseClicked(evt);
            }
        });
        addNewManagementPanelSettings.add(backToUssdManengementPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        getOparetorNameInDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getOparetorNameInDropDownActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getOparetorNameInDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 470, 40));

        jLabel41.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 255));
        jLabel41.setText("Add New USSD Command ");
        addNewManagementPanelSettings.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        clickAddContract2.setBackground(new java.awt.Color(102, 153, 0));
        clickAddContract2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickAddContract2.setForeground(new java.awt.Color(255, 255, 255));
        clickAddContract2.setText("Add");
        clickAddContract2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickAddContract2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAddContract2ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(clickAddContract2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 780, 150, 40));

        getOperatorName1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        addNewManagementPanelSettings.add(getOperatorName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 470, 40));

        jLabel42.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel42.setText("Operator Name");
        addNewManagementPanelSettings.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 98, -1, -1));

        getOperatorCode1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        addNewManagementPanelSettings.add(getOperatorCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 470, 40));

        jLabel43.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel43.setText("Operator Code");
        addNewManagementPanelSettings.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 168, -1, -1));

        jLabel45.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel45.setText("Recharge USSD Code Pattern (Pre-paid)");
        addNewManagementPanelSettings.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        getRechargeUssdParternPrePaid1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPrePaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPrePaid1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getRechargeUssdParternPrePaid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 470, 40));

        jLabel46.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel46.setText("Icon");
        addNewManagementPanelSettings.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, -1, -1));

        clickChooseIcon1.setBackground(new java.awt.Color(255, 255, 255));
        clickChooseIcon1.setForeground(new java.awt.Color(102, 102, 255));
        clickChooseIcon1.setText("::::::Choose Icon(40px X 30px):::::::");
        clickChooseIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickChooseIcon1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(clickChooseIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, 470, 30));

        getprofitIn1k.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getprofitIn1k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getprofitIn1kActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getprofitIn1k, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 470, 40));

        jLabel47.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel47.setText("Balence show USSD Code Pattern");
        addNewManagementPanelSettings.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel48.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel48.setText("Account Password");
        addNewManagementPanelSettings.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));
        addNewManagementPanelSettings.add(accountPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 470, 40));

        jLabel49.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel49.setText("Recharge USSD Code Pattern(post-paid)");
        addNewManagementPanelSettings.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        getRechargeUssdParternPostPaid1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPostPaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPostPaid1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getRechargeUssdParternPostPaid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 470, 40));

        labelUssdPatternSkitto.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        labelUssdPatternSkitto.setText("Recharge USSD Code Pattern(Skitto)");
        addNewManagementPanelSettings.add(labelUssdPatternSkitto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 700, -1, -1));

        getRechargeUssdParternSkitto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternSkitto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternSkittoActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getRechargeUssdParternSkitto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 730, 470, 40));

        jLabel62.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel62.setText("Profit in 1000 tk");
        addNewManagementPanelSettings.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        getBalenceUssdPartern3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getBalenceUssdPartern3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalenceUssdPartern3ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getBalenceUssdPartern3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 470, 40));

        settingBasePanel.add(addNewManagementPanelSettings, "card2");

        systemBackup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        systemBackup.setText("System Backup");
        systemBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                systemBackupMouseClicked(evt);
            }
        });

        trustedEmployee.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        trustedEmployee.setText("Trusted Employees");
        trustedEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trustedEmployeeMouseClicked(evt);
            }
        });

        passwordChange.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordChange.setText("Password Change");
        passwordChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordChangeMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Security");

        rechargeSettings.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rechargeSettings.setText("Recharge settings");
        rechargeSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechargeSettingsMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("System Settings");

        mobileBankingSettings.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mobileBankingSettings.setText("Mobile Banking settings");
        mobileBankingSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileBankingSettingsMouseClicked(evt);
            }
        });

        rechargeOffers.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rechargeOffers.setText("Recharge Offers");
        rechargeOffers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechargeOffersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout settingsPanel1Layout = new javax.swing.GroupLayout(settingsPanel1);
        settingsPanel1.setLayout(settingsPanel1Layout);
        settingsPanel1Layout.setHorizontalGroup(
            settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanel1Layout.createSequentialGroup()
                .addGroup(settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(settingsPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel5))
                        .addGroup(settingsPanel1Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(systemBackup)
                                .addComponent(myProfile)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel14)
                            .addGap(100, 100, 100)))
                    .addGroup(settingsPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trustedEmployee)
                            .addComponent(passwordChange)))
                    .addGroup(settingsPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(settingsPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rechargeSettings)
                                    .addComponent(mobileBankingSettings)
                                    .addComponent(rechargeOffers))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingBasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingsPanel1Layout.setVerticalGroup(
            settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(settingsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingBasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(settingsPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myProfile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systemBackup)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trustedEmployee)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rechargeSettings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mobileBankingSettings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rechargeOffers)
                        .addContainerGap())))
        );

        basePanel.add(settingsPanel1, "card2");

        helplinePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("helpline");

        javax.swing.GroupLayout helplinePanelLayout = new javax.swing.GroupLayout(helplinePanel);
        helplinePanel.setLayout(helplinePanelLayout);
        helplinePanelLayout.setHorizontalGroup(
            helplinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplinePanelLayout.createSequentialGroup()
                .addGap(566, 566, 566)
                .addComponent(jLabel8)
                .addContainerGap(984, Short.MAX_VALUE))
        );
        helplinePanelLayout.setVerticalGroup(
            helplinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplinePanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel8)
                .addContainerGap(680, Short.MAX_VALUE))
        );

        basePanel.add(helplinePanel, "card2");

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

        jLabel20.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("USSD Dail");
        ussdDialPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        clickUssdSessionClose.setBackground(new java.awt.Color(255, 102, 102));
        clickUssdSessionClose.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickUssdSessionClose.setForeground(new java.awt.Color(255, 255, 255));
        clickUssdSessionClose.setText("Reset");
        clickUssdSessionClose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickUssdSessionClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUssdSessionCloseActionPerformed(evt);
            }
        });
        ussdDialPanel.add(clickUssdSessionClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 150, 40));

        ussdDialPanel.add(getSelectedSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 470, 40));

        getUssdCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ussdDialPanel.add(getUssdCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 470, 40));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel24.setText("Code:");
        ussdDialPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        setResponseShowFromUssd.setColumns(20);
        setResponseShowFromUssd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        setResponseShowFromUssd.setRows(5);
        jScrollPane3.setViewportView(setResponseShowFromUssd);

        ussdDialPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 490, 290));

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel25.setText("Select SIM:");
        ussdDialPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        clickUssdDailDorSend1.setBackground(new java.awt.Color(102, 153, 0));
        clickUssdDailDorSend1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickUssdDailDorSend1.setForeground(new java.awt.Color(255, 255, 255));
        clickUssdDailDorSend1.setText("Send");
        clickUssdDailDorSend1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickUssdDailDorSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUssdDailDorSend1ActionPerformed(evt);
            }
        });
        ussdDialPanel.add(clickUssdDailDorSend1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 150, 40));

        basePanel.add(ussdDialPanel, "card2");

        contractListPanel.setBackground(new java.awt.Color(255, 255, 255));

        serchBar.setBackground(new java.awt.Color(255, 255, 255));
        serchBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getNameForSearch.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        getNameForSearch.setBorder(null);
        getNameForSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getNameForSearchKeyReleased(evt);
            }
        });
        serchBar.add(getNameForSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 3, 390, 45));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Search_bg.png"))); // NOI18N
        serchBar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        back.setText("jLabel3");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 255));
        jLabel26.setText("Contract List");

        tableContractLIst.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
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
        jScrollPane5.setViewportView(tableContractLIst);

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

        javax.swing.GroupLayout contractListPanelLayout = new javax.swing.GroupLayout(contractListPanel);
        contractListPanel.setLayout(contractListPanelLayout);
        contractListPanelLayout.setHorizontalGroup(
            contractListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contractListPanelLayout.createSequentialGroup()
                .addGroup(contractListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contractListPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clickNewContract, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contractListPanelLayout.createSequentialGroup()
                        .addContainerGap(573, Short.MAX_VALUE)
                        .addComponent(serchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contractListPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );
        contractListPanelLayout.setVerticalGroup(
            contractListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contractListPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(contractListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contractListPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(contractListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(clickNewContract, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addComponent(serchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap())
        );

        basePanel.add(contractListPanel, "card2");

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

        jLabel28.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 255));
        jLabel28.setText("Add New USSD Command ");
        addNewManagementPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

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

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel29.setText("Operator Name");
        addNewManagementPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 98, -1, -1));

        getOperatorCode.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        addNewManagementPanel.add(getOperatorCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 470, 40));

        jLabel30.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel30.setText("Operator Code");
        addNewManagementPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 168, -1, -1));

        jLabel31.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel31.setText("Action For");
        addNewManagementPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 238, -1, -1));

        getSeletedAction.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getSeletedAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile Recharge" }));
        getSeletedAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSeletedActionActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getSeletedAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 470, 40));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel32.setText("Recharge USSD Code Pattern (Pre-paid)");
        addNewManagementPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        getRechargeUssdParternPrePaid.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPrePaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPrePaidActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getRechargeUssdParternPrePaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 470, 40));

        jLabel33.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel33.setText("Icon");
        addNewManagementPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

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

        jLabel34.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel34.setText("Balence show USSD Code Pattern");
        addNewManagementPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel35.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel35.setText("Account Password");
        addNewManagementPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        accountPassword.setText("jPasswordField1");
        addNewManagementPanel.add(accountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 470, 40));

        jLabel36.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel36.setText("Recharge USSD Code Pattern(post-paid)");
        addNewManagementPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        getRechargeUssdParternPostPaid.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPostPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPostPaidActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getRechargeUssdParternPostPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 470, 40));

        basePanel.add(addNewManagementPanel, "card2");

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

        jLabel37.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 255));
        jLabel37.setText("New Contract ");
        addNewContractPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

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

        getNameForContract.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addNewContractPanel.add(getNameForContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 470, 40));

        jLabel38.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel38.setText("Name");
        addNewContractPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 175, -1, -1));

        getPhoneNOForContract.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addNewContractPanel.add(getPhoneNOForContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 470, 40));

        jLabel39.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel39.setText("Phone No.");
        addNewContractPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 245, -1, -1));

        jLabel40.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel40.setText("Storage");
        addNewContractPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 315, -1, -1));

        addNewContractPanel.add(getSeletedStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 470, 40));

        basePanel.add(addNewContractPanel, "card2");

        addBillPaymentDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        backToBillPayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backToBillPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cross.png"))); // NOI18N
        backToBillPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToBillPaymentMouseClicked(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 0, 51));
        jLabel52.setText("Select Option");

        jLabel57.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 51, 51));
        jLabel57.setText("Payable SIM");

        comboBoxActiveSIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActiveSIMActionPerformed(evt);
            }
        });

        baseInformationPanel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout baseInformationPanelLayout = new javax.swing.GroupLayout(baseInformationPanel);
        baseInformationPanel.setLayout(baseInformationPanelLayout);
        baseInformationPanelLayout.setHorizontalGroup(
            baseInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        baseInformationPanelLayout.setVerticalGroup(
            baseInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout addBillPaymentDetailsPanelLayout = new javax.swing.GroupLayout(addBillPaymentDetailsPanel);
        addBillPaymentDetailsPanel.setLayout(addBillPaymentDetailsPanelLayout);
        addBillPaymentDetailsPanelLayout.setHorizontalGroup(
            addBillPaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBillPaymentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBillPaymentDetailsPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(addBillPaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(baseInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addBillPaymentDetailsPanelLayout.createSequentialGroup()
                        .addGroup(addBillPaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addBillPaymentDetailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(0, 729, Short.MAX_VALUE))
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addBillPaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxActiveSIM, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))))
                .addGap(50, 50, 50))
        );
        addBillPaymentDetailsPanelLayout.setVerticalGroup(
            addBillPaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBillPaymentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backToBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(addBillPaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addBillPaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxActiveSIM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addBillPaymentDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jComboBox4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addComponent(baseInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        basePanel.add(addBillPaymentDetailsPanel, "card2");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void billPaymentTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentTabMouseClicked
        switchPanelViaMenu(billPayPanel, billPaymentTab, title1, icon1, "money_color", "Bill Payment");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        resellerTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));

    }//GEN-LAST:event_billPaymentTabMouseClicked

    private void resellerTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resellerTabMouseClicked
        switchPanelViaMenu(resellerPanel, resellerTab, title2, icon2, "reseller_color", "Reseller");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        billPaymentTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));
    }//GEN-LAST:event_resellerTabMouseClicked

    private void detailsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTabMouseClicked
        switchPanelViaMenu(detailsPanel, detailsTab, title3, icon3, "details_color", "Details");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        resellerTab.setBackground(new Color(133, 47, 209));
        billPaymentTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));

        loadRechargeDetailsInDetailsTable();
        getSelectedOptionFroTable.setSelectedItem("My Recharge");
    }//GEN-LAST:event_detailsTabMouseClicked

    private void settingTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingTabMouseClicked
        switchPanelViaMenu(settingsPanel1, settingTab, title4, icon4, "settings_color", "Settings");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        resellerTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        billPaymentTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));
    }//GEN-LAST:event_settingTabMouseClicked

    private void helplineTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helplineTabMouseClicked
        switchPanelViaMenu(helplinePanel, helplineTab, title5, icon5, "helpline_color", "Help Line");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        resellerTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        billPaymentTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
    }//GEN-LAST:event_helplineTabMouseClicked

    private void clickUssdDailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailActionPerformed
        switchPanelViaMenu(ussdDialPanel);
        refrash();
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getSelectedSim.addItem(simOperatorIdentifierDto.getOperatorName());
        });
    }//GEN-LAST:event_clickUssdDailActionPerformed

    private void clickGroupLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickGroupLoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clickGroupLoadActionPerformed

    private void clickSIMOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSIMOfferActionPerformed
        simSimOfferDialog();
    }//GEN-LAST:event_clickSIMOfferActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mobileRechargeTabMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeTabMouseMoved

    }//GEN-LAST:event_mobileRechargeTabMouseMoved

    private void mobileRechargeTabHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeTabHover
        //hover(mobileRechargeTab);
    }//GEN-LAST:event_mobileRechargeTabHover

    private void mobileRechargeTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeTabMouseExited
        // hoverRemove(mobileRechargeTab);
    }//GEN-LAST:event_mobileRechargeTabMouseExited

    private void mobileRechargeTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeTabMouseClicked
        switchPanelViaMenu(mobileRechargePanel, mobileRechargeTab, title, icon, "payment_color", "Mobile Recharge");

        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        resellerTab.setBackground(new Color(133, 47, 209));
        billPaymentTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));

        setFocusInMobileRechargePanel();
    }//GEN-LAST:event_mobileRechargeTabMouseClicked

    private void billPaymentTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentTabMouseEntered
        // hover(billPaymentTab);
    }//GEN-LAST:event_billPaymentTabMouseEntered

    private void billPaymentTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentTabMouseExited
        // hoverRemove(billPaymentTab);
    }//GEN-LAST:event_billPaymentTabMouseExited

    private void resellerTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resellerTabMouseEntered
        // hover(resellerTab);
    }//GEN-LAST:event_resellerTabMouseEntered

    private void resellerTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resellerTabMouseExited
        //  hoverRemove(resellerTab);
    }//GEN-LAST:event_resellerTabMouseExited

    private void detailsTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTabMouseEntered
        //hover(detailsTab);
    }//GEN-LAST:event_detailsTabMouseEntered

    private void detailsTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTabMouseExited
        // hoverRemove(detailsTab);
    }//GEN-LAST:event_detailsTabMouseExited

    private void settingTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingTabMouseEntered
        // hover(settingTab);
    }//GEN-LAST:event_settingTabMouseEntered

    private void settingTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingTabMouseExited
        // hoverRemove(settingTab);
    }//GEN-LAST:event_settingTabMouseExited

    private void helplineTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helplineTabMouseEntered
        //  hover(helplineTab);
    }//GEN-LAST:event_helplineTabMouseEntered

    private void helplineTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helplineTabMouseExited
        //  hoverRemove(helplineTab);
    }//GEN-LAST:event_helplineTabMouseExited

    private void clickContactListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactListMouseClicked
        switchPanelViaMenu(contractListPanel);
        setContractListInJTable();
        getNameForSearch.setUI(new HintTextFieldUI("Search by name"));
        getNameForSearch.requestFocusInWindow();
    }//GEN-LAST:event_clickContactListMouseClicked

    private void myProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileMouseClicked
        switchPanelViaSettings(myProfilePanel, myProfile);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
    }//GEN-LAST:event_myProfileMouseClicked

    private void systemBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemBackupMouseClicked
        switchPanelViaSettings(systemBackupPanel, systemBackup);
        myProfile.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
    }//GEN-LAST:event_systemBackupMouseClicked

    private void passwordChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordChangeMouseClicked
        switchPanelViaSettings(passwordChangePanel, passwordChange);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
    }//GEN-LAST:event_passwordChangeMouseClicked

    private void trustedEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trustedEmployeeMouseClicked
        switchPanelViaSettings(trustedEmployeePanel, trustedEmployee);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
    }//GEN-LAST:event_trustedEmployeeMouseClicked

    private void rechargeSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechargeSettingsMouseClicked
        switchPanelViaSettings(rechargeSettingsPanel, rechargeSettings);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        trustedEmployee.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);

        loadValuesForUssdManagementTable();
    }//GEN-LAST:event_rechargeSettingsMouseClicked

    private void mobileBankingSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileBankingSettingsMouseClicked
        switchPanelViaSettings(MobileBankingSettingsPanel, mobileBankingSettings);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
    }//GEN-LAST:event_mobileBankingSettingsMouseClicked

    private void rechargeOffersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechargeOffersMouseClicked

        switchPanelViaSettings(rechargeOfferPanel, rechargeOffers);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);

        getSIMOperatorName.removeAllItems();
        for (String string : SIM_OPERATORS_NAME) {
            getSIMOperatorName.addItem(string);

        }
    }//GEN-LAST:event_rechargeOffersMouseClicked

    private void clickAddNewManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddNewManagementActionPerformed
        resetComboBox(getOparetorNameInDropDown);
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getOparetorNameInDropDown.addItem(simOperatorIdentifierDto.getOperatorName());
            getOparetorNameInDropDown.addItem("GP");
            getOparetorNameInDropDown.addItem("Grameen Phone");
        });
        switchPanelViaSettings(addNewManagementPanelSettings, rechargeSettings);
    }//GEN-LAST:event_clickAddNewManagementActionPerformed

    private void clickSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSendMouseClicked

        String phoneNumberRequested = getMobileNumber.getText();
        String ammountRequested = getAmmountInTk.getText();

        if (!phoneNumberRequested.equals("")
                && !ammountRequested.equals("")
                && getSeletedOperatorName.getSelectedIndex() != -1
                && phoneNumberRequested.matches("[0-9]+")
                && ammountRequested.matches("[0-9]+")) {

            recharge();
        } else {
            getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
            getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
            getSeletedOperatorName.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00"), 3));
        }
    }//GEN-LAST:event_clickSendMouseClicked

    private void backToMobileRechargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMobileRechargeMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
        closeUssdSession();
    }//GEN-LAST:event_backToMobileRechargeMouseClicked

    private void clickUssdSessionCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdSessionCloseActionPerformed
        closeUssdSession();
    }//GEN-LAST:event_clickUssdSessionCloseActionPerformed

    private void clickUssdDailDorSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailDorSend1ActionPerformed
        if (getUssdCode.getText().equals("")) {
            getUssdCode.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
        } else {
            ussdDial();
            getUssdCode.setText("");
        }
    }//GEN-LAST:event_clickUssdDailDorSend1ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_backMouseClicked

    private void clickNewContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickNewContractActionPerformed
        switchPanelViaMenu(addNewContractPanel);
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            getSeletedStorage.addItem(simOperatorIdentifierDto.getOperatorName().toUpperCase());

        }
        getSeletedStorage.addItem("MEMORY");
        getSeletedStorage.addItem("CLOUD");

        getNameForContract.setText("");
        getPhoneNOForContract.setText("");

    }//GEN-LAST:event_clickNewContractActionPerformed

    private void backToUssdManengementPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToUssdManengementPanelMouseClicked
        switchPanelViaMenu(rechargeSettingsPanel);
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

            if (saveToDbCommandInCommand()) {
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

    private void getRechargeUssdParternPostPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPostPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPostPaidActionPerformed

    private void back43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back43MouseClicked
        switchPanelViaMenu(contractListPanel);
    }//GEN-LAST:event_back43MouseClicked

    private void clickAddContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContractActionPerformed
        saveContract();
    }//GEN-LAST:event_clickAddContractActionPerformed

    private void backToUssdManengementPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToUssdManengementPanel1MouseClicked
        switchPanelViaSettings(rechargeSettingsPanel, rechargeSettings);
    }//GEN-LAST:event_backToUssdManengementPanel1MouseClicked

    private void clickAddContract2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContract2ActionPerformed
        String rechargeUssdPartern = getRechargeUssdParternPrePaid1.getText();
        String operatorName = getOparetorNameInDropDown.getSelectedItem().toString();
        String operatorCode = getOperatorCode1.getText();
        String othersCode = getRechargeUssdParternSkitto.getText();
        String balenceUssdPartern = getprofitIn1k.getText();
        String profit = getprofitIn1k.getText();
        System.err.println(rechargeUssdPartern + " " + operatorName + "  " + operatorCode);
        if (!rechargeUssdPartern.equals("")
                && !operatorName.equals("")
                && !operatorCode.equals("")
                && !profit.equals("")) {

            if (saveToDbCommandInCommand()) {
                System.out.println("Adding Successfull");
            }
        } else {
            Popup.error("Empty Field");
        }
    }//GEN-LAST:event_clickAddContract2ActionPerformed

    private void getRechargeUssdParternPrePaid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPrePaid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPrePaid1ActionPerformed

    private void clickChooseIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickChooseIcon1ActionPerformed
        loadImageIcon(getOparetorNameInDropDown.getSelectedItem().toString().toLowerCase());
    }//GEN-LAST:event_clickChooseIcon1ActionPerformed

    private void getprofitIn1kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getprofitIn1kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getprofitIn1kActionPerformed

    private void getRechargeUssdParternPostPaid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPostPaid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPostPaid1ActionPerformed

    private void backToUssdManengementPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_backToUssdManengementPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_backToUssdManengementPanel1AncestorAdded

    private void clickRefrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickRefrashActionPerformed
        addBalenceInBalenceShowTable();
    }//GEN-LAST:event_clickRefrashActionPerformed

    private void getMobileNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getMobileNumberFocusGained
        removePlaceHolder(getMobileNumber, "01XXXXXXX");
    }//GEN-LAST:event_getMobileNumberFocusGained

    private void getMobileNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getMobileNumberFocusLost
        setPlaceHolder(getMobileNumber, "01XXXXXXX");
    }//GEN-LAST:event_getMobileNumberFocusLost

    private void getAmmountInTkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getAmmountInTkFocusGained
        removePlaceHolder(getAmmountInTk, "Tk");
    }//GEN-LAST:event_getAmmountInTkFocusGained

    private void getAmmountInTkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getAmmountInTkFocusLost
        setPlaceHolder(getAmmountInTk, "Tk");
    }//GEN-LAST:event_getAmmountInTkFocusLost

    private void getSeletedOperatorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSeletedOperatorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSeletedOperatorNameActionPerformed

    private void getAmmountInTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAmmountInTkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getAmmountInTkActionPerformed

    private void getSelectedOptionFroTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSelectedOptionFroTableActionPerformed
        loadValuesInTableForDetails(getSelectedOptionFroTable.getSelectedItem().toString());
    }//GEN-LAST:event_getSelectedOptionFroTableActionPerformed

    private void menuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPanelMouseClicked

    private void clickResetButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickResetButActionPerformed
        resetSearchItems();
    }//GEN-LAST:event_clickResetButActionPerformed

    private void clickSearchedReportDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSearchedReportDownloadActionPerformed
        Configaration.export(tableForDetails);
    }//GEN-LAST:event_clickSearchedReportDownloadActionPerformed

    private void clickSearchedfromToButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSearchedfromToButActionPerformed
        if (fromDateChooser.getDate() == null && toDateChooser.getDate() == null) {
            Popup.customError("Date Is Empty");
        } else {
            searchByDate(Configaration.getJustDate(fromDateChooser.getDate()), Configaration.getJustDate(toDateChooser.getDate()));
        }

    }//GEN-LAST:event_clickSearchedfromToButActionPerformed

    private void clickSearchedByPhoneNoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSearchedByPhoneNoButActionPerformed
        searchByPhoneNumber();
    }//GEN-LAST:event_clickSearchedByPhoneNoButActionPerformed

    private void clickBkashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBkashMouseEntered
        hoverInBillPayPanel(hoverViewbKash);

    }//GEN-LAST:event_clickBkashMouseEntered

    private void clickBkashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBkashMouseExited
        hoverRemoveInBillPayPanel(hoverViewbKash);
    }//GEN-LAST:event_clickBkashMouseExited

    private void clickSureCashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSureCashMouseEntered
        hoverInBillPayPanel(hoverViewSureCash);
    }//GEN-LAST:event_clickSureCashMouseEntered

    private void clickSureCashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSureCashMouseExited
        hoverRemoveInBillPayPanel(hoverViewSureCash);
    }//GEN-LAST:event_clickSureCashMouseExited

    private void clickNogotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNogotMouseEntered
        hoverInBillPayPanel(hoverViewnogot);
    }//GEN-LAST:event_clickNogotMouseEntered

    private void clickNogotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNogotMouseExited
        hoverRemoveInBillPayPanel(hoverViewnogot);
    }//GEN-LAST:event_clickNogotMouseExited

    private void clickRocket1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRocket1MouseEntered
        hoverInBillPayPanel(hoverViewrocket);
    }//GEN-LAST:event_clickRocket1MouseEntered

    private void clickRocket1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRocket1MouseExited
        hoverRemoveInBillPayPanel(hoverViewrocket);
    }//GEN-LAST:event_clickRocket1MouseExited

    private void clickMyCashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMyCashMouseEntered
        hoverInBillPayPanel(hoverViewMyCash);
    }//GEN-LAST:event_clickMyCashMouseEntered

    private void clickMyCashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMyCashMouseExited
        hoverRemoveInBillPayPanel(hoverViewMyCash);
    }//GEN-LAST:event_clickMyCashMouseExited

    private void clicktCashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicktCashMouseEntered
        hoverInBillPayPanel(hoverViewTCash);
    }//GEN-LAST:event_clicktCashMouseEntered

    private void clicktCashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicktCashMouseExited
        hoverRemoveInBillPayPanel(hoverViewTCash);
    }//GEN-LAST:event_clicktCashMouseExited

    private void clickUCash1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickUCash1MouseEntered
        hoverInBillPayPanel(hoverViewUCash);
    }//GEN-LAST:event_clickUCash1MouseEntered

    private void clickUCash1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickUCash1MouseExited
        hoverRemoveInBillPayPanel(hoverViewUCash);
    }//GEN-LAST:event_clickUCash1MouseExited

    private void clickBkashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBkashMouseClicked
        switchBillPaymentDetailsPaenl("bkash");
    }//GEN-LAST:event_clickBkashMouseClicked

    private void backToBillPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToBillPaymentMouseClicked
        switchPanelViaMenu(billPayPanel, billPaymentTab, title1, icon1, "money_color", "Bill Payment");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        resellerTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));


    }//GEN-LAST:event_backToBillPaymentMouseClicked

    private void clickSureCashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSureCashMouseClicked
        switchBillPaymentDetailsPaenl("surecash");
    }//GEN-LAST:event_clickSureCashMouseClicked

    private void clickNogotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNogotMouseClicked
        switchBillPaymentDetailsPaenl("nogot");
    }//GEN-LAST:event_clickNogotMouseClicked

    private void clickRocket1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRocket1MouseClicked
        switchBillPaymentDetailsPaenl("rocket");
    }//GEN-LAST:event_clickRocket1MouseClicked

    private void clickMyCashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMyCashMouseClicked
        switchBillPaymentDetailsPaenl("mycash");
    }//GEN-LAST:event_clickMyCashMouseClicked

    private void clicktCashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicktCashMouseClicked
        switchBillPaymentDetailsPaenl("tcash");
    }//GEN-LAST:event_clicktCashMouseClicked

    private void clickUCash1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickUCash1MouseClicked
        switchBillPaymentDetailsPaenl("ucash");
    }//GEN-LAST:event_clickUCash1MouseClicked

    private void comboBoxActiveSIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActiveSIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActiveSIMActionPerformed

    private void getSelectedServiceComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSelectedServiceComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSelectedServiceComboActionPerformed

    private void getSelectedSIMNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSelectedSIMNameComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSelectedSIMNameComboActionPerformed

    private void getRechargeUssdParternSkittoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternSkittoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternSkittoActionPerformed

    private void getOparetorNameInDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOparetorNameInDropDownActionPerformed
        System.err.println(getOparetorNameInDropDown.getSelectedItem());

        if (getOparetorNameInDropDown.getSelectedItem() == null) {
            System.err.println("Null Value Found");
        } else {
            switch (getOparetorNameInDropDown.getSelectedItem().toString().toLowerCase().replaceAll(" ", "")) {
                case "gp":
                    labelUssdPatternSkitto.setVisible(true);
                    getRechargeUssdParternSkitto.setVisible(true);
                    break;
                case "grameenphone":
                    labelUssdPatternSkitto.setVisible(true);
                    getRechargeUssdParternSkitto.setVisible(true);
                    break;
                default:
                    labelUssdPatternSkitto.setVisible(false);
                    getRechargeUssdParternSkitto.setVisible(false);
                    break;
            }
        }
    }//GEN-LAST:event_getOparetorNameInDropDownActionPerformed

    private void getBalenceUssdPartern3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBalenceUssdPartern3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBalenceUssdPartern3ActionPerformed

    private void getMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getMobileNumberKeyReleased
        System.err.println("Key re");

        if (getMobileNumber.getText().equals("")) {
            popupForSuggestManu.setVisible(false);
        } else {

            if (searchItemsByPhoneNumberInRechargePanel(getMobileNumber.getText()).isEmpty()) {
                popupForSuggestManu.setVisible(false);
            } else {
                popupForSuggestManu.setVisible(true);
                defaultListModel.removeAllElements();
                popupForSuggestManu.show(getMobileNumber, 0, getMobileNumber.getHeight());
                searchItemsByPhoneNumberInRechargePanel(getMobileNumber.getText())
                        .stream().forEach(number -> {
                            defaultListModel.addElement(number);
                        });

            }

        }
    }//GEN-LAST:event_getMobileNumberKeyReleased

    private void suggListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suggListMouseClicked
        getMobileNumber.setText(suggList.getSelectedValue());
        popupForSuggestManu.setVisible(false);
    }//GEN-LAST:event_suggListMouseClicked

    private void suggListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suggListMouseEntered

    }//GEN-LAST:event_suggListMouseEntered

    private void getNameForSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getNameForSearchKeyReleased

        searchByName(contractList, getNameForSearch.getText());
    }//GEN-LAST:event_getNameForSearchKeyReleased

    private void clickContactListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clickContactListMouseEntered

    private void saveNewOfferInSettringsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewOfferInSettringsActionPerformed
        saveSIMOffer();
    }//GEN-LAST:event_saveNewOfferInSettringsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MobileBankingSettingsPanel;
    private javax.swing.JButton Save;
    private javax.swing.JPasswordField accountPassword;
    private javax.swing.JPasswordField accountPassword1;
    private javax.swing.JPanel addBillPaymentDetailsPanel;
    private javax.swing.JPanel addNewContractPanel;
    private javax.swing.JPanel addNewManagementPanel;
    private javax.swing.JPanel addNewManagementPanelSettings;
    private javax.swing.JTable bKashServiceListTable;
    private javax.swing.JPanel bKashSettingPanel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back43;
    private javax.swing.JLabel backToBillPayment;
    private javax.swing.JLabel backToMobileRecharge;
    private javax.swing.JLabel backToUssdManengementPanel;
    private javax.swing.JLabel backToUssdManengementPanel1;
    private javax.swing.JPanel baseInformationPanel;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel billPayPanel;
    private javax.swing.JPanel billPaymentTab;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton clickAddContract;
    private javax.swing.JButton clickAddContract1;
    private javax.swing.JButton clickAddContract2;
    private javax.swing.JButton clickAddNewManagement;
    private javax.swing.JLabel clickBkash;
    private javax.swing.JButton clickChooseIcon;
    private javax.swing.JButton clickChooseIcon1;
    private javax.swing.JLabel clickContactList;
    private javax.swing.JButton clickGroupLoad;
    private javax.swing.JLabel clickMyCash;
    private javax.swing.JButton clickNewContract;
    private javax.swing.JLabel clickNogot;
    private javax.swing.JButton clickRefrash;
    private javax.swing.JButton clickResetBut;
    private javax.swing.JLabel clickRocket1;
    private javax.swing.JButton clickSIMOffer;
    private javax.swing.JButton clickSearchedByPhoneNoBut;
    private javax.swing.JButton clickSearchedReportDownload;
    private javax.swing.JButton clickSearchedfromToBut;
    private javax.swing.JLabel clickSend;
    private javax.swing.JLabel clickSerch1;
    private javax.swing.JLabel clickSureCash;
    private javax.swing.JLabel clickUCash1;
    private javax.swing.JButton clickUssdDail;
    private javax.swing.JButton clickUssdDailDorSend1;
    private javax.swing.JButton clickUssdSessionClose;
    private javax.swing.JLabel clicktCash;
    private javax.swing.JComboBox<String> comboBoxActiveSIM;
    private javax.swing.JPanel contractListPanel;
    private javax.swing.JLabel currentNetworkName;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel detailsTab;
    private javax.swing.JComboBox<String> dropdownOperatorName;
    private javax.swing.JLabel errorMgsInBalencePanel;
    private com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JTextField getAmmountInTk;
    private javax.swing.JTextField getBalenceUssdPartern1;
    private javax.swing.JTextField getBalenceUssdPartern3;
    private javax.swing.JTextField getDescriptionInSetting;
    private javax.swing.JTextField getMobileNumber;
    private javax.swing.JTextField getNameForContract;
    private javax.swing.JTextField getNameForSearch;
    private javax.swing.JTextField getOfferNameInSeting;
    private javax.swing.JComboBox<String> getOparetorNameInDropDown;
    private javax.swing.JTextField getOperatorCode;
    private javax.swing.JTextField getOperatorCode1;
    private javax.swing.JTextField getOperatorName;
    private javax.swing.JTextField getOperatorName1;
    private javax.swing.JTextField getPhoneNOForContract;
    private javax.swing.JTextField getPhoneNoForSearch;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid;
    private javax.swing.JTextField getRechargeAmmountInSeetings;
    private javax.swing.JPanel getRechargeAmountInSetting;
    private javax.swing.JTextField getRechargeUssdParternPostPaid;
    private javax.swing.JTextField getRechargeUssdParternPostPaid1;
    private javax.swing.JTextField getRechargeUssdParternPrePaid;
    private javax.swing.JTextField getRechargeUssdParternPrePaid1;
    private javax.swing.JTextField getRechargeUssdParternSkitto;
    private javax.swing.JComboBox<String> getSIMOperatorName;
    private javax.swing.JComboBox<String> getSelectedOptionFroTable;
    private javax.swing.JComboBox<String> getSelectedSIMNameCombo;
    private javax.swing.JComboBox<String> getSelectedServiceCombo;
    private javax.swing.JComboBox<String> getSelectedSim;
    private javax.swing.JComboBox<String> getSelectedValidityTimeTypeSetting;
    private javax.swing.JComboBox<String> getSeletedAction;
    private javax.swing.JComboBox<String> getSeletedOperatorName;
    private javax.swing.JComboBox<String> getSeletedStorage;
    private javax.swing.JTextField getUssdCode;
    private javax.swing.JTextField getValidityInSetting;
    private javax.swing.JPasswordField getbKashPIN;
    private javax.swing.JTextField getprofitIn1k;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel helplinePanel;
    private javax.swing.JPanel helplineTab;
    private javax.swing.JPanel hoverViewMyCash;
    private javax.swing.JPanel hoverViewSureCash;
    private javax.swing.JPanel hoverViewTCash;
    private javax.swing.JPanel hoverViewUCash;
    private javax.swing.JPanel hoverViewbKash;
    private javax.swing.JPanel hoverViewnogot;
    private javax.swing.JPanel hoverViewrocket;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelUssdPatternSkitto;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel mobileBankingSettings;
    private javax.swing.JPanel mobileRechargePanel;
    private javax.swing.JPanel mobileRechargeTab;
    private javax.swing.JPanel myCashSettingPanel2;
    private javax.swing.JLabel myProfile;
    private javax.swing.JPanel myProfilePanel;
    private javax.swing.JPanel netBarPanel;
    private javax.swing.JPanel nogodSettingPanel5;
    private javax.swing.JLabel passwordChange;
    private javax.swing.JPanel passwordChangePanel;
    private javax.swing.JPopupMenu popupForSuggestManu;
    private javax.swing.JPanel rechargeBalencePanel;
    private javax.swing.JPanel rechargeOfferPanel;
    private javax.swing.JLabel rechargeOffers;
    private javax.swing.JLabel rechargeSettings;
    private javax.swing.JPanel rechargeSettingsPanel;
    private javax.swing.JPanel reportGeneratePanel;
    private javax.swing.JPanel resellerPanel;
    private javax.swing.JPanel resellerTab;
    private javax.swing.JPanel rocketSettingPanel;
    private javax.swing.JButton saveNewOfferInSettrings;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel selectedSimOperatorIcon;
    private javax.swing.JPanel serchBar;
    private javax.swing.JTextArea setMgsDetails;
    private javax.swing.JTextArea setResponseShowFromUssd;
    private javax.swing.JPanel settingBasePanel;
    private javax.swing.JPanel settingTab;
    private javax.swing.JPanel settingsPanel1;
    private javax.swing.JList<String> suggList;
    private javax.swing.JPanel suggestPanel;
    private javax.swing.JPanel surecashSettingPanel;
    private javax.swing.JLabel systemBackup;
    private javax.swing.JPanel systemBackupPanel;
    private javax.swing.JPanel tCashSettingPanel4;
    private javax.swing.JTable tableContractLIst;
    private javax.swing.JTable tableForDetails;
    private javax.swing.JTable tableRechargeDetailsShow;
    private javax.swing.JTable tableShowSimBalence;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private com.toedter.calendar.JDateChooser toDateChooser;
    private javax.swing.JLabel trustedEmployee;
    private javax.swing.JPanel trustedEmployeePanel;
    private javax.swing.JPanel ucashSettingPanel3;
    private javax.swing.JPanel ussdDialPanel;
    private javax.swing.JTable ussdSettedTable;
    // End of variables declaration//GEN-END:variables

    protected void switchPanelViaMenu(JPanel requestedPanel, JPanel tabPanel, JLabel title, JLabel icon, String iconName, String header) {

        colorSwitcherWithHighlight(tabPanel, title, icon, iconName, header);

        basePanel.removeAll();
        basePanel.repaint();
        basePanel.revalidate();

        basePanel.add(requestedPanel);
        basePanel.repaint();
        basePanel.revalidate();

    }

    protected void switchPanelViaSettings(javax.swing.JPanel requestedPanel, JLabel title) {

        Font font = title.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        title.setFont(font.deriveFont(attributes));
        title.setForeground(Color.blue);

        settingBasePanel.removeAll();
        settingBasePanel.repaint();
        settingBasePanel.revalidate();

        settingBasePanel.add(requestedPanel);
        settingBasePanel.repaint();
        settingBasePanel.revalidate();

    }

    public void colorSwitcherWithHighlight(JPanel requestedPanel, JLabel title, JLabel icon, String iconName, String header) {
        ImageIcon image = new ImageIcon(getClass().getResource("/resources/images/" + iconName + ".png"));
        icon.setIcon(image);
        Color color = new Color(133, 47, 209);
        title.setForeground(color);
        headerLabel.setText(header);

        requestedPanel.setBackground(Color.WHITE);
    }

    public void colorSwitcherWithRegular(JLabel title, JLabel icon, String iconName) {
        ImageIcon image = new ImageIcon(getClass().getResource("/resources/images/" + iconName + ".png"));
        icon.setIcon(image);
        Color color = new Color(153, 153, 153);
        title.setForeground(color);
    }

    public static void showDeshBoardPage() {
        Home h = new Home();
        h.setVisible(true);
    }

    private void hover(JPanel panel) {
        Color color = new Color(255, 255, 255);
        panel.setBackground(color);
    }

    private void hoverRemove(JPanel panel) {
        Color color = new Color(255, 255, 255);
        panel.setBackground(color);
    }

    /*  
    ------------------------ MOBILE RECHARGE PANEL--------------------------------------   
     */
    private void recharge() {

        RechargeConfirmationDialogUI ui
                = new RechargeConfirmationDialogUI("Recharge Confirmation",
                        getMobileNumber.getText(),
                        getAmmountInTk.getText() + " tk",
                        getPrepaidOrPostpaid.getSelectedItem().toString(),
                        getSeletedOperatorName.getSelectedItem().toString());

        JDialog jDialog = new JDialog();
        jDialog.add(ui);
        jDialog.setSize(1400, 941);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);

        ui.getClickClose().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Icon icon = new ImageIcon(getClass()
                        .getResource("/resources/images/default_operator_icon_1.png"));

                selectedSimOperatorIcon.setIcon(icon);
                getMobileNumber.setText("");
                getAmmountInTk.setText("");
                getMobileNumber.requestFocusInWindow();
                jDialog.setVisible(false);
            }

        });
        ui.getClickClose().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    Icon icon = new ImageIcon(getClass()
                            .getResource("/resources/images/default_operator_icon_1.png"));
                    selectedSimOperatorIcon.setIcon(icon);
                    getMobileNumber.setText("");
                    getAmmountInTk.setText("");
                    getMobileNumber.requestFocusInWindow();
                    jDialog.setVisible(false);

                }
                if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                    ui.getClickEdit().requestFocusInWindow();
                } else {

                }
            }
        });

        ui.getClickConfirm().addActionListener((ActionEvent ae) -> {

            rechargeDoneProcess();
            refrash();
            jDialog.setVisible(false);

        });

        ui.getClickConfirm().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    rechargeDoneProcess();
                    refrash();
                    jDialog.setVisible(false);
                }
                if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ui.getClickEdit().requestFocusInWindow();
                } else {

                }
            }
        });

        ui.getClickEdit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jDialog.setVisible(false);
            }

        });
        ui.getClickEdit().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    jDialog.setVisible(false);
                }
                if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ui.getClickClose().requestFocusInWindow();
                }
                if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                    ui.getClickConfirm().requestFocusInWindow();
                } else {

                }
            }
        });

    }

    private void setOperatorIcon() {
        boolean isFoundExpectedSIMCard = false;
        if (getMobileNumber.getText().equals("") || getMobileNumber.getText().length() != 11 || !getMobileNumber.getText().matches("[0-9]+")) {
            getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
        } else {
            try {
                Icon icon;

                ResultSet rs = DbConnection.findByColume("command", "operator_code", getMobileNumber.getText().substring(0, 3));

                while (rs.next()) {
                    System.err.println("-----------------" + rs.getString("operator_code"));
                    System.err.println(rs.getString("operator_name"));
                    if (rs.getString("operator_code").equals(getMobileNumber.getText().substring(0, 3))) {
                        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {

                            if (rs.getString("operator_name").equals(simOperatorIdentifierDto.getOperatorName().toUpperCase())) {
                                selectedSimOperatorName = rs.getString("operator_name");
                                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                icon = new ImageIcon(rs.getString("icon"));
                                selectedSimOperatorIcon.setIcon(icon);
                                getAmmountInTk.requestFocusInWindow();
                                getSeletedOperatorName.setSelectedItem(selectedSimOperatorName);
                                isFoundExpectedSIMCard = true;
                            }
                        }
                    }
                }
                if (isFoundExpectedSIMCard == false) {
                    getAmmountInTk.requestFocusInWindow();
                    getSeletedOperatorName.setSelectedItem(selectedSimOperatorName);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    void rechargeDoneProcess() {
        int responseCount = 0;

        try {
            String phoneNumberRequested = getMobileNumber.getText();
            String ammountRequested = getAmmountInTk.getText();
            String preOrPostRequested = getPrepaidOrPostpaid.getSelectedItem().toString();
            String selectedPayableSIM = getSeletedOperatorName.getSelectedItem().toString();
            ResultSet rs = DbConnection.findByColume("command", "operator_name", selectedPayableSIM);
            while (rs.next()) {

                for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {

                    if (selectedPayableSIM.toUpperCase().equals(simOperatorIdentifierDto.getOperatorName().toUpperCase())) {
                        System.out.println("-------------------" + getSeletedOperatorName.getSelectedItem());
                        com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
                        if (preOrPostRequested.toLowerCase().equals("pre-paid")) {
                            String rechargeCode = rs.getString("r_ussd_code_pre").replaceAll("number", phoneNumberRequested)
                                    .replaceAll("tk", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), Configaration.getPropertiesValueByKey("secretKey")));
                            String response = com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15");
                            responseCount = response.split(",").length;
                            Configaration.setErrorLog(this.getClass().getName() + "-->1856--->" + response);
                        } else {
                            String rechargeCode = rs.getString("r_ussd_code_post").replaceAll("number", phoneNumberRequested)
                                    .replaceAll("tk", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), Configaration.getPropertiesValueByKey("secretKey")));
                            String response = com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15");
                            responseCount = response.split(",").length;

                            Configaration.setErrorLog(this.getClass().getName() + "-->1863--->" + response);
                        }
                        com.moniruzzaman.Modem.disconnect();

                    }
                }

            }
            saveToDbCommandInRechargeAdmin();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        initialValueInTableRechargeDetails();
        getMobileNumber.requestFocusInWindow();
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
                System.out.println(com.moniruzzaman.Modem.disconnect());
                responses = value.split(",");
                // response = Configaration.haxToStringConvert(value[1]);
                System.err.println(value);

                //setResponseShowFromUssd.setText(Configaration.haxToStringConvert(response));
            }

        }
        System.out.println(responses.length);
        if (responses.length == 3) {
            for (int i = 0; i < responses.length; i++) {
                response = responses[1].replaceAll("\"", "");
            }
            setResponseShowFromUssd.setText(Configaration.haxToStringConvert(response));
        }
    }

    public void initialValueInTableRechargeDetails() {
        int count = 1;
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status"}, 0);
        try {

            rs = DbConnection.retrieveAll("recharge_admin");
            while (rs.next()) {
                System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));
                if (Configaration.getCurrentDateAndTime().substring(0, 8).equals(rs.getString("date_time").substring(0, 8))) {
                    defaultTableModel.addRow(new Object[]{
                        rs.getString("trx_id"),
                        rs.getString("date_time"),
                        rs.getString("type"),
                        rs.getString("mobile_no"),
                        rs.getString("amount"),
                        rs.getString("from_sp"),
                        rs.getString("current_balance"),
                        rs.getString("status")});
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
        tableRechargeDetailsShow.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tableRechargeDetailsShow.getTableHeader().setOpaque(false);
        tableRechargeDetailsShow.getTableHeader().setBackground(new Color(133, 47, 209));
        tableRechargeDetailsShow.getTableHeader().setForeground(new Color(255, 255, 255));

        //For jTable contant in center
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableRechargeDetailsShow.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tableRechargeDetailsShow.setEnabled(false);
        tableRechargeDetailsShow.setRowHeight(35);
        tableRechargeDetailsShow.setModel(defaultTableModel);
    }

    public void setFocusInMobileRechargePanel() {

        getMobileNumber.requestFocusInWindow();
        getMobileNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        setOperatorIcon();
                        break;
                    case KeyEvent.VK_DOWN:
                        suggList.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }
        });
        getAmmountInTk.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!getAmmountInTk.getText().equals("") && getAmmountInTk.getText().matches("[0-9]+")
                            && getSeletedOperatorName.getSelectedIndex() != -1) {
                        recharge();
                        getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                    } else {
                        getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                        getSeletedOperatorName.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00"), 3));
                    }
                }
            }

        });

        suggList.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getMobileNumber.setText(suggList.getSelectedValue());
                    popupForSuggestManu.setVisible(false);
                    setOperatorIcon();
                }
            }

        });

    }

    public ArrayList<String> searchItemsByPhoneNumberInRechargePanel(String sreach1) {
        try {
            ArrayList<String> allPhoneNumber = new ArrayList<>();
            ArrayList<String> filteredPhoneNumber = new ArrayList<>();
            DbConnection.connect();
            ResultSet rs = DbConnection.retrieveAll("recharge_admin");
            while (rs.next()) {
                allPhoneNumber.add(rs.getString("mobile_no"));

            }
            allPhoneNumber.stream().forEach(number -> {
                if (number.toLowerCase().contains(sreach1.toLowerCase())) {
                    filteredPhoneNumber.add(number);
                }

            });

            return filteredPhoneNumber;

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    private void loadValuesInTableForDetails(String selectedItem) {
        if (selectedItem.equals("Inbox")) {
            loadIndoxInDetailsTable();
            System.err.println(selectedItem);
        } else if (selectedItem.equals("My Recharge")) {
            loadRechargeDetailsInDetailsTable();

        } else {
            System.err.println("Selected Items Not Found");

        }

    }

    private void loadRechargeDetailsInDetailsTable() {
        inboxIsActive = false;
        detailsSelectedItems = "recharge";
        setMgsDetails.setText("");
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status",}, 0);
        try {

            rs = DbConnection.retrieveAll("recharge_admin");
            while (rs.next()) {
                System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));

                defaultTableModel.addRow(new Object[]{
                    rs.getString("trx_id"),
                    rs.getString("date_time"),
                    rs.getString("type"),
                    rs.getString("mobile_no"),
                    rs.getString("amount"),
                    rs.getString("from_sp"),
                    rs.getString("current_balance"),
                    rs.getString("status")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
        tableForDetails.setEnabled(false);
        tableForDetails.setRowHeight(30);
        tableForDetails.setModel(defaultTableModel);
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
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Operator Name", "Current Ammount"}, 0);
        ModemInfoList.simOperatorIdentifiers.forEach((SimOperatorIdentifierDto simOperatorIdentifierDto) -> {
            try {
                com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
                DbConnection.connect();
                rs = DbConnection.retrieveAll("command");
                while (rs.next()) {
                    if (rs.getString("operator_name").equals(simOperatorIdentifierDto.getOperatorName().toUpperCase())) {
                        String[] value = com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"" + rs.getString("b_s_ussd_code") + "\",15").split(",");
                        System.out.println(com.moniruzzaman.Modem.disconnect());
                        System.out.println(value.length);
                        if (value.length == 1) {
                            errorMgsInBalencePanel.setText("-------  Try Again !!  ---------");
                            errorMgsInBalencePanel.setVisible(true);
                        } else {
                            errorMgsInBalencePanel.setVisible(false);
                            String balance = (String) Configaration.haxToStringConvert(value[1].replaceAll("\"", ""));
                            Pattern p = Pattern.compile("\\d+");
                            Matcher m = p.matcher(balance);
                            while (m.find()) {
                                balancePaseList.add(m.group());
                                System.out.println(m.group());
                            }

                            defaultTableModel.addRow(new String[]{rs.getString("operator_name"), balancePaseList.get(0) + " Tk"});
                        }
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                    }
                }
            }
        });

        tableShowSimBalence.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableShowSimBalence.getTableHeader().setOpaque(false);
        tableShowSimBalence.getTableHeader().setBackground(new Color(255, 0, 0));
        tableShowSimBalence.getTableHeader().setForeground(new Color(255, 255, 255));

        //For jTable contant in center
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableShowSimBalence.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tableShowSimBalence.setEnabled(false);
        tableShowSimBalence.setRowHeight(35);
        tableShowSimBalence.setModel(defaultTableModel);

    }

    private void closeUssdSession() {
        setResponseShowFromUssd.setText("");
        setResponseShowFromUssd.setFocusable(false);
        String response = null;
        String[] responses = null;
        String getOperator = getSelectedSim.getSelectedItem().toString();
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            if (simOperatorIdentifierDto.getOperatorName().toLowerCase().equals(getOperator.toLowerCase())) {
                com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
                String value = com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\'#xxx#\',15");
                com.moniruzzaman.Modem.disconnect();
                responses = value.split(",");
                // response = Configaration.haxToStringConvert(value[1]);
                System.err.println(value);

                //setResponseShowFromUssd.setText(Configaration.haxToStringConvert(response));
            }

        }
        System.out.println(responses.length);
        if (responses.length == 3) {
            for (String response1 : responses) {
                response = responses[1].replaceAll("\"", "");
            }
            setResponseShowFromUssd.setText("Reset Successful");
        }
    }

    public void loadActiveOperatorNameInComboBox() {
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getSeletedOperatorName.addItem("robi");
            getSeletedOperatorName.addItem(simOperatorIdentifierDto.getOperatorName().toUpperCase());
        });

    }

    private void placeHoderSetter() {
        setPlaceHolder(getAmmountInTk, "Tk");
    }

    private void simSimOfferDialog() {
        try {
            JDialog offerDialog = new JDialog();
            SimOfferViewPanelUi ui = new SimOfferViewPanelUi();
            DefaultTableModel defaultTableModelBL, defaultTableModelGP, defaultTableModelRobi, defaultTableModelAirtel, defaultTableModelTeletalk;
            ui.getCross().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent me) {
                    offerDialog.setVisible(false);
                }

            });

            defaultTableModelBL = new DefaultTableModel(new String[]{"Offer Name", "Recharge Ammount (tk)", "Validity", "Description"}, 0);

            
            defaultTableModelGP = new DefaultTableModel(new String[]{"Offer Name", "Recharge Ammount (tk)", "Validity", "Description"}, 0);

            
            defaultTableModelRobi = new DefaultTableModel(new String[]{"Offer Name", "Recharge Ammount (tk)", "Validity", "Description"}, 0);

            
            defaultTableModelAirtel = new DefaultTableModel(new String[]{"Offer Name", "Recharge Ammount (tk)", "Validity", "Description"}, 0);

            
            defaultTableModelTeletalk = new DefaultTableModel(new String[]{"Offer Name", "Recharge Ammount (tk)", "Validity", "Description"}, 0);

            
            DbConnection.connect();
            ResultSet rs = DbConnection.retrieveAll("recharge_offers");
            while (rs.next()) {

                switch (rs.getString("sim_name")) {
                    case "BANKLALINK":
                        defaultTableModelBL.addRow(new String[]{rs.getString("offer_name"), rs.getString("recharge_amt"), rs.getString("validity"), rs.getString("description")});
                        break;
                    case "GP":
                         defaultTableModelGP.addRow(new String[]{rs.getString("offer_name"), rs.getString("recharge_amt"), rs.getString("validity"), rs.getString("description")});
                        break;
                    case "ROBI":
                         defaultTableModelRobi.addRow(new String[]{rs.getString("offer_name"), rs.getString("recharge_amt"), rs.getString("validity"), rs.getString("description")});
                        break;
                    case "AIRTEL":
                         defaultTableModelAirtel.addRow(new String[]{rs.getString("offer_name"), rs.getString("recharge_amt"), rs.getString("validity"), rs.getString("description")});
                        break;
                    case "TELETALK":
                         defaultTableModelTeletalk.addRow(new String[]{rs.getString("offer_name"), rs.getString("recharge_amt"), rs.getString("validity"), rs.getString("description")});
                        break;
                }

            }
                        
            addTableUIDesignForOfferDialog(ui.getTableBanglalinkOffers(), offerDialog);
            ui.getTableBanglalinkOffers().setModel(defaultTableModelBL);
            
            
            addTableUIDesignForOfferDialog(ui.getTableGpOffers(), offerDialog);
            ui.getTableGpOffers().setModel(defaultTableModelGP);
            

            addTableUIDesignForOfferDialog(ui.getTableRobiOffers(), offerDialog);
            ui.getTableRobiOffers().setModel(defaultTableModelRobi);
            

            addTableUIDesignForOfferDialog(ui.getTableAirtelOffers(), offerDialog);
            ui.getTableAirtelOffers().setModel(defaultTableModelAirtel);
            

            addTableUIDesignForOfferDialog(ui.getTableTeletalkOffers(), offerDialog);
            ui.getTableTeletalkOffers().setModel(defaultTableModelTeletalk);
            
            
            offerDialog.add(ui);
            offerDialog.setSize(1000, 800);
            offerDialog.setLocationRelativeTo(null);
            offerDialog.setUndecorated(true);
            offerDialog.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addTableUIDesignForOfferDialog(JTable jTable, JDialog jDialog) {
        jTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        jTable.getTableHeader().setOpaque(false);
        jTable.getTableHeader().setBackground(new Color(133, 47, 209));
        jTable.getTableHeader().setForeground(new Color(255, 255, 255));
        //For jTable contant in center
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) jTable.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTable.setEnabled(false);
        jTable.setRowHeight(25);

        jTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                String ammount;
                Point point = me.getPoint();
                int column = jTable.columnAtPoint(point);
                int row = jTable.rowAtPoint(point);
                ammount = jTable.getValueAt(row, 1).toString();
                getAmmountInTk.setText(ammount);
                getAmmountInTk.setForeground(Color.black);
                jDialog.setVisible(false);
            }
        });
    }

    /*
    
    ------------------------ SETTING PANEL--------------------------------------
    
     */
    private String copy(String sourcePath, String operatorIconName) {

        String[] pathParse = sourcePath.split("\\\\");
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

    private boolean saveToDbCommandInCommand() {

        String rechargeUssdParternPre = getRechargeUssdParternPrePaid1.getText().toLowerCase();
        String rechargeUssdParternPost = getRechargeUssdParternPostPaid1.getText().toLowerCase();
        String operatorName = getOparetorNameInDropDown.getSelectedItem().toString();
        String operatorCode = getOperatorCode1.getText();
        String othersCode = getRechargeUssdParternSkitto.getText();
        String balenceUssdPartern = getprofitIn1k.getText();
        String acPassword = accountPassword1.getText();
        String profit = getprofitIn1k.getText();
        conn = DbConnection.connect();
        String sql = "INSERT INTO command(operator_name,operator_code,action_for,r_ussd_code_pre,r_ussd_code_post,b_s_ussd_code,password,icon,profit) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, operatorName.toUpperCase());
            preparedStatement.setString(2, operatorCode);
            preparedStatement.setString(3, othersCode);
            preparedStatement.setString(4, rechargeUssdParternPre);
            preparedStatement.setString(5, rechargeUssdParternPost);
            preparedStatement.setString(6, balenceUssdPartern);
            preparedStatement.setString(7, AES.encrypt(acPassword, Configaration.getPropertiesValueByKey("secretKey")));
            preparedStatement.setString(8, imagePath);
            preparedStatement.setString(9, profit);
            preparedStatement.execute();
            switchPanelViaSettings(myProfilePanel, myProfile);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {

                }
            }
        }
        return false;

    }

    private boolean saveToDbCommandInRechargeAdmin() {

        String getMobileNumberText = getMobileNumber.getText().toLowerCase();
        String getAmmountInTkText = getAmmountInTk.getText().toLowerCase();
        String getPrepaidOrPostpaidText = getPrepaidOrPostpaid.getSelectedItem().toString();
        trxId = UUID.randomUUID().toString();
        String dateTime = Configaration.getCurrentDateAndTime();

        Connection conn1 = DbConnection.connect();
        try {

            String sql = "INSERT INTO recharge_admin(mobile_no,amount,date_time,status,trx_id,type,from_sp,current_balance) VALUES(?,?,?,?,?,?,?,?)";
            String computerMacAddress = getMacAddress().replace(":", "");
            try {
                PreparedStatement preparedStatement = conn1.prepareStatement(sql);
                preparedStatement.setString(1, getMobileNumberText);
                preparedStatement.setString(2, getAmmountInTkText);
                preparedStatement.setString(3, dateTime);
                preparedStatement.setString(4, "Panding");
                preparedStatement.setString(5, trxId);
                preparedStatement.setString(6, getPrepaidOrPostpaidText);
                preparedStatement.setString(7, getSeletedOperatorName.getSelectedItem().toString());
                preparedStatement.setString(8, "Panding");
                preparedStatement.execute();
                switchPanelViaMenu(mobileRechargePanel);

                return true;

            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (conn1 != null) {
                    try {
                        conn1.close();
                    } catch (SQLException e) {

                    }
                }
            }

        } catch (UnknownHostException | SocketException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    private void loadValuesForUssdManagementTable() {

        try {
            DefaultTableModel model = new DefaultTableModel(new String[]{
                "Operator Name", "Operator Code", "Profit in 1k", "Others Ussd Code", "Recharge USSD Code(Prepaind)", "Recharge USSD Code(Postpaind)", "Show Balence Ussd Code", "icon"
            }, 0);
            switchPanelViaSettings(rechargeSettingsPanel, rechargeSettings);

            rs = DbConnection.retrieveAll("command");
            while (rs.next()) {

                String operator_name = rs.getString("operator_name");
                String operator_code = rs.getString("operator_code");
                String profit = rs.getString("profit");
                String action_for = rs.getString("action_for");
                String r_ussd_code_pre = rs.getString("r_ussd_code_pre");
                String r_ussd_code_post = rs.getString("r_ussd_code_post");
                String b_s_ussd_code = rs.getString("b_s_ussd_code");
                String icon = rs.getString("icon");
                model.addRow(new Object[]{operator_name, operator_code, profit, action_for, r_ussd_code_pre, r_ussd_code_post, b_s_ussd_code, icon});

            }
            ussdSettedTable.setModel(model);
            ussdSettedTable.setEnabled(false);
            ussdSettedTable.setRowHeight(30);
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
                            Home.showDeshBoardPage();

                            break;
                        case 1:

                            //  switchPanelViaMenu(updateAddedManagementPanel);
                            //  getOperatorName1.setText(ussdSettedTable.getValueAt(row, 0).toString());
                            break;
                        default:
                            Configaration.setErrorLog("JOption selection not match");

                            break;
                    }
                }
            });

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    private void loadImageIcon(String fileName) {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String sname = file.getAbsolutePath();
            imagePath = copy(sname, fileName);
            Configaration.setLog("Icon Load Successful");
            clickChooseIcon1.setText(fileName);
        }
    }

    private void saveSIMOffer() {

        String offerName = getOfferNameInSeting.getText();
        String rechargeAmount = getRechargeAmmountInSeetings.getText();
        String validity = getValidityInSetting.getText() + " " + getSelectedValidityTimeTypeSetting.getSelectedItem();
        String description = getDescriptionInSetting.getText();
        String simOperator = getSIMOperatorName.getSelectedItem().toString().toUpperCase();

        conn = DbConnection.connect();
        String sql = "INSERT INTO recharge_offers(offer_name,recharge_amt,validity,description,sim_name) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, offerName);
            preparedStatement.setString(2, rechargeAmount);
            preparedStatement.setString(3, validity);
            preparedStatement.setString(4, description);
            preparedStatement.setString(5, simOperator);
            preparedStatement.execute();

            Popup.customSuccess();

            getOfferNameInSeting.setText("");
            getRechargeAmmountInSeetings.setText("");
            getValidityInSetting.setText("");
            getDescriptionInSetting.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {

                }
            }
        }
    }

//    private boolean updateToDbCommandByOperator_name() {
//        String operatorName = getOperatorName1.getText();
//        String rechargeUssdPartern = getRechargeUssdPartern1.getText();
//        String operatorCode = getOperatorCode1.getText();
//        String actionFor = getSeletedAction1.getSelectedItem().toString();
//        String balenceUssdPartern = getBalenceUssdPartern2.getText();
//        conn = DbConnection.connect();
//        try {
//            String sql = "UPDATE command SET operator_code= ?,action_for = ?, r_ussd_code= ?, b_s_ussd_code= ?, icon= ? WHERE operator_name = \"" + operatorName + "\"";
//            System.out.println(sql);
//            String computerMacAddress = getMacAddress().replace(":", "");
//            try {
//                PreparedStatement preparedStatement = conn.prepareStatement(sql);
//                preparedStatement.setString(1, operatorCode);
//                preparedStatement.setString(2, actionFor);
//                preparedStatement.setString(3, rechargeUssdPartern);
//                preparedStatement.setString(4, balenceUssdPartern);
//                preparedStatement.setString(5, imagePath);
//                preparedStatement.execute();
//
//                Home.showDeshBoardPage();
//                return true;
//
//            } catch (SQLException ex) {
//                System.err.println(ex);
//            } finally {
//                if (conn != null) {
//                    try {
//                        conn.close();
//                    } catch (SQLException e) {
//                    }
//                }
//            }
//
//        } catch (UnknownHostException | SocketException ex) {
//            System.err.println(ex);
//        }
//        return false;
//    }
    /*
    
      ------------------------------------------  CONTRACT LIST PANEL-----------------------------------------
     */
    private void setContractListInJTable() {
        try {
            int count = 1;
            String contractName = null;
            String contractNumber = null;
            String from = null;

            // List<ContractResponse> contractList = new ArrayList<>();
            contractList = new HashSet<>();
            DefaultTableModel contractListTableMOdel = new DefaultTableModel(new String[]{"Name", "Phone no", "From"}, 0);
            ModemInfoList.simOperatorIdentifiers.stream().map((simOperatorIdentifierDto) -> {
                com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
                return simOperatorIdentifierDto;
            }).map((_item) -> {
                rowOfContractlist = com.moniruzzaman.Modem.sendATCommand("AT+CPBR=1,99").replaceAll("\r", "").split("\n");

                return _item;
            }).forEachOrdered((_item) -> {
                com.moniruzzaman.Modem.disconnect();
            });

            for (String contract : rowOfContractlist) {
                String[] contractPerseDetails = contract.replaceAll("\r", "").replaceAll("\n", "").replaceAll("OK", "")
                        .replaceAll("\"", "").split(",");
                for (int i = 1; i < contractPerseDetails.length; i++) {
                    ContractResponse contractResponse = new ContractResponse();
                    contractResponse.setId(count++);
                    contractResponse.setName(contractPerseDetails[4]);
                    contractResponse.setPhoneNo(contractPerseDetails[2]);
                    contractResponse.setStorage("SIM");
                    contractList.add(contractResponse);
                }
            }

            DbConnection.connect();
            ResultSet rs = DbConnection.retrieveAll("contract");
            while (rs.next()) {
                ContractResponse contractResponse = new ContractResponse();
                contractResponse.setId(count++);
                contractResponse.setName(rs.getString("name"));
                contractResponse.setPhoneNo(rs.getString("phone_no"));
                contractResponse.setStorage(rs.getString("memory"));
                contractList.add(contractResponse);

            }

            contractList.stream().forEach(contract -> {

                contractListTableMOdel.addRow(new Object[]{contract.getName(), contract.getPhoneNo(), contract.getStorage()});
            });

            tableContractLIst.setEnabled(false);
            tableContractLIst.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    String selectedNumber;
                    Point point = me.getPoint();
                    int column = tableContractLIst.columnAtPoint(point);
                    int row = tableContractLIst.rowAtPoint(point);
                    selectedNumber = tableContractLIst.getValueAt(row, 1).toString();
                    System.out.println(selectedNumber.length());
                    if (selectedNumber.length() == 14) {
                        switchPanelViaMenu(mobileRechargePanel);
                        getMobileNumber.setText(selectedNumber.substring(3, 14));
                        System.err.println(selectedNumber.substring(3, 14));
                        System.out.println(selectedNumber);
                    } else {
                        switchPanelViaMenu(mobileRechargePanel);
                        getMobileNumber.setText(selectedNumber);
                    }

                }
            });

            tableContractLIst.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
            tableContractLIst.getTableHeader().setOpaque(false);
            tableContractLIst.getTableHeader().setBackground(new Color(133, 47, 209));
            tableContractLIst.getTableHeader().setForeground(new Color(255, 255, 255));

            //For jTable contant in center
            DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableContractLIst.getDefaultRenderer(String.class);
            stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            tableContractLIst.setEnabled(false);

            tableContractLIst.setRowHeight(25);
            tableContractLIst.setModel(contractListTableMOdel);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchByName(Set<ContractResponse> contractList, String serchValue) {
        System.err.println(serchValue);
        Set<ContractResponse> contractResponsesSet = new HashSet<>();
        DefaultTableModel contractListTableMOdel = new DefaultTableModel(new String[]{"Name", "Phone no", "From"}, 0);

        contractList.stream().forEach(contractResponseValue -> {
            System.err.println(serchValue.toLowerCase().contains(contractResponseValue.getName().toLowerCase().toLowerCase().replaceAll("\r", "").replaceAll(" ", "")));
            if (contractResponseValue.getName().toLowerCase().toLowerCase().contains(serchValue.toLowerCase())) {
                ContractResponse contractResponse = new ContractResponse();
                contractResponse.setId(contractResponseValue.getId());
                contractResponse.setName(contractResponseValue.getName());
                contractResponse.setPhoneNo(contractResponseValue.getPhoneNo());
                contractResponse.setStorage(contractResponseValue.getStorage());
                contractResponsesSet.add(contractResponse);

            }

        });

        contractResponsesSet.stream().forEach(value -> {
            contractListTableMOdel.addRow(new Object[]{value.getName(), value.getPhoneNo(), value.getStorage()});
        });

        tableContractLIst.setRowHeight(25);
        tableContractLIst.setModel(contractListTableMOdel);
    }

    private void saveContract() {
        String storage = getSeletedStorage.getSelectedItem().toString();
        String name = getNameForContract.getText();
        String phoneNo = getPhoneNOForContract.getText();

        if (phoneNo.equals("") && name.equals("")) {
            Popup.customError("Filed is empty");

        } else {
            switch (storage) {
                case "MEMORY":
                    saveContractInSQLite();
                    break;
                case "CLOUD":
                    saveContractInSQL();
                    break;
                default:
                    saveContractInSIMCard();
                    break;

            }
        }
    }

    private void saveContractInSQLite() {
        String name = getNameForContract.getText();
        String phoneNo = getPhoneNOForContract.getText();
        String storage = getSeletedStorage.getSelectedItem().toString();

        Connection conn1 = DbConnection.connect();
        String sql = "INSERT INTO contract(name,phone_no,memory) VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = conn1.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, phoneNo);
            preparedStatement.setString(3, storage);
            preparedStatement.execute();
            int a = Popup.customSuccess();

            if (a == 0) {
                switchPanelViaMenu(contractListPanel);
                setContractListInJTable();
            } else {
                getNameForContract.setText("");
                getPhoneNOForContract.setText("");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn1 != null) {
                try {
                    conn1.close();
                } catch (SQLException e) {

                }
            }
        }
        System.out.println("New Contract Add Successful in Desktop memory");
    }

    private void saveContractInSQL() {
        String name = getNameForContract.getText();
        String phoneNo = getPhoneNOForContract.getText();
        System.err.println("SQL");
    }

    private void saveContractInSIMCard() {
        String name = getNameForContract.getText();
        String phoneNo = getPhoneNOForContract.getText();
        String storage = getSeletedStorage.getSelectedItem().toString();
        String result = null;
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {

            if (simOperatorIdentifierDto.getOperatorName().toUpperCase().equals(storage.toUpperCase())) {
                com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
                result = com.moniruzzaman.Modem.sendATCommand("AT+CPBW=,\"" + phoneNo + "\",129,\"" + name + "\"");
                com.moniruzzaman.Modem.disconnect();

            }

        }

        if (result != null) {
            if (result.replaceAll("\n", "").replaceAll("\r", "").replaceAll(",", "").toLowerCase().equals("ok")) {
                int a = Popup.customSuccess();

                if (a == 0) {
                    switchPanelViaMenu(contractListPanel);
                    setContractListInJTable();
                } else {
                    getNameForContract.setText("");
                    getPhoneNOForContract.setText("");

                }
            } else {
                Popup.customError(result.replaceAll("\n", "").replaceAll("\r", "").replaceAll(",", "").split(":")[1]);
            }

        }
    }

    /*
    *
    *--------------------------------------- DETAILS PANEL -------------------------------------------------------
    *
     */
    private void loadIndoxInDetailsTable() {
        inboxIsActive = true;
        detailsSelectedItems = "inbox";
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"No", "From", "Date & Time", "Message"}, 0);

        int count = 0;
        String from = null, dateTime = null, mgs = null;

        ModemInfoList.simOperatorIdentifiers.stream().map((simOperatorIdentifierDto) -> {
            com.moniruzzaman.Modem.connect(simOperatorIdentifierDto.getPortName());
            return simOperatorIdentifierDto;
        }).map((_item) -> {
            // TODO: Move those code in setup Apllication
            com.moniruzzaman.Modem.sendATCommand("AT+CMGF=1");
            return _item;
        }).map((_item) -> {
            Configaration.wait(1000);
            return _item;
        }).map((_item) -> {
            com.moniruzzaman.Modem.sendATCommand("AT+CMGF=?");
            return _item;
        }).map((_item) -> {
            Configaration.wait(1000);
            return _item;
        }).map((_item) -> {
            com.moniruzzaman.Modem.sendATCommand("AT+CPMS=\"SM\"");
            return _item;
        }).map((_item) -> {
            Configaration.wait(1000);
            return _item;
        }).map((_item) -> com.moniruzzaman.Modem.sendATCommand("AT+CMGL=\"ALL\"").replaceAll("\r", "").replaceAll("\"", "").replaceAll("\n", "")).map((result) -> {
            splitedByCMDValueForInbox = result.split("\\+CMGL:");
            return result;
        }).forEachOrdered((_item) -> {
            com.moniruzzaman.Modem.disconnect();
        });
        for (String value : splitedByCMDValueForInbox) {

            perseByCommaInInbox = value.replaceAll("OK", "").split(",");
            for (int i = 1; i < perseByCommaInInbox.length; i++) {
                //2--phn number
                //4-5 date time
                //6 mgs

                from = perseByCommaInInbox[2];
                if (from.length() >= 13) {
                    from = from.substring(2, 13);
                }
                dateTime = perseByCommaInInbox[4] + " " + perseByCommaInInbox[5];
                if (Configaration.isHexadecimal(perseByCommaInInbox[6])) {
                    mgs = Configaration.haxToStringConvert(perseByCommaInInbox[6]);
                } else {
                    mgs = perseByCommaInInbox[6];
                }

            }
            defaultTableModel.addRow(new Object[]{count++, from, dateTime, mgs});
        }
        tableForDetails.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                if (inboxIsActive) {
                    Point point = me.getPoint();
                    int row = tableForDetails.rowAtPoint(point);
                    Configaration.setErrorLog(me.getClickCount());
                    setMgsDetails.setText("");
                    String showableMgs = "From: " + tableForDetails.getValueAt(row, 1).toString() + "\n"
                            + "Date & Time: "
                            + tableForDetails.getValueAt(row, 2).toString()
                            + "\n\n" + "Message:\n" + tableForDetails.getValueAt(row, 3).toString();
                    setMgsDetails.setText(showableMgs);
                }
            }
        });
        tableForDetails.setEnabled(false);
        tableForDetails.setRowHeight(30);
        tableForDetails.setModel(defaultTableModel);

    }

    private void searchByPhoneNumber() {

        if (getPhoneNoForSearch.getText().equals("")) {
            Popup.customError("Empty Field Found..");
        } else {
            int count = 0;
            String from = null, dateTime = null, mgs = null, fromSearch = null;
            if (detailsSelectedItems.equals("inbox")) {
                DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"No", "From", "Date & Time", "Message"}, 0);
                for (String value : splitedByCMDValueForInbox) {

                    perseByCommaInInbox = value.replaceAll("OK", "").replaceAll("\\+", "").split(",");
                    for (int i = 1; i < perseByCommaInInbox.length; i++) {
                        //2--phn number
                        //4-5 date time
                        //6 mgs
                        System.out.println("---" + perseByCommaInInbox[6]);
                        from = perseByCommaInInbox[2];
                        if (from.length() >= 13) {
                            from = from.substring(2, 13);
                        }
                        if (from.equals(getPhoneNoForSearch.getText())) {
                            fromSearch = from;
                            dateTime = perseByCommaInInbox[4] + " " + perseByCommaInInbox[5];
                            if (Configaration.isHexadecimal(perseByCommaInInbox[6])) {
                                mgs = Configaration.haxToStringConvert(perseByCommaInInbox[6]);
                            } else {
                                mgs = perseByCommaInInbox[6];
                            }

                        }

                    }

                    defaultTableModel.addRow(new Object[]{count++, fromSearch, dateTime, mgs});

                }
                tableForDetails.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent me) {
                        if (inboxIsActive) {
                            Point point = me.getPoint();
                            int row = tableForDetails.rowAtPoint(point);
                            Configaration.setErrorLog(me.getClickCount());
                            setMgsDetails.setText("");
                            String showableMgs = "From: " + tableForDetails.getValueAt(row, 1).toString() + "\n"
                                    + "Date & Time: "
                                    + tableForDetails.getValueAt(row, 2).toString()
                                    + "\n\n" + "Message:\n" + tableForDetails.getValueAt(row, 3).toString();
                            setMgsDetails.setText(showableMgs);
                        }
                    }
                });

                tableForDetails.setEnabled(false);
                tableForDetails.setRowHeight(30);
                tableForDetails.setModel(defaultTableModel);
            } else if (detailsSelectedItems.equals("recharge")) {
                String phnNo = null;

                DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status",}, 0);
                try {

                    rs = DbConnection.retrieveAll("recharge_admin");
                    while (rs.next()) {
                        System.err.println("--" + Configaration.getCurrentDateAndTime().substring(0, 8));

                        if (rs.getString("mobile_no").equals(getPhoneNoForSearch.getText())) {
                            defaultTableModel.addRow(new Object[]{
                                rs.getString("trx_id"),
                                rs.getString("date_time"),
                                rs.getString("type"),
                                rs.getString("mobile_no"),
                                rs.getString("amount"),
                                rs.getString("from_sp"),
                                rs.getString("current_balance"),
                                rs.getString("status")});
                        }

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    if (rs != null) {
                        try {
                            rs.close();
                        } catch (SQLException e) {
                        }
                    }
                }
                tableForDetails.setEnabled(false);
                tableForDetails.setRowHeight(30);
                tableForDetails.setModel(defaultTableModel);

            }
        }
    }

    private void resetSearchItems() {
        getPhoneNoForSearch.setText("");
        fromDateChooser.setDate(null);
        toDateChooser.setDate(null);
        int count = 0;
        String from = null, dateTime = null, mgs = null, fromSearch = null;
        if (detailsSelectedItems.equals("inbox")) {
            DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"No", "From", "Date & Time", "Message"}, 0);
            for (String value : splitedByCMDValueForInbox) {

                perseByCommaInInbox = value.replaceAll("OK", "").replaceAll("\\+", "").split(",");
                for (int i = 1; i < perseByCommaInInbox.length; i++) {
                    //2--phn number
                    //4-5 date time
                    //6 mgs

                    from = perseByCommaInInbox[2];
                    if (from.length() >= 13) {
                        from = from.substring(2, 13);
                    }

                    dateTime = perseByCommaInInbox[4] + " " + perseByCommaInInbox[5];
                    if (Configaration.isHexadecimal(perseByCommaInInbox[6])) {
                        mgs = Configaration.haxToStringConvert(perseByCommaInInbox[6]);
                    } else {
                        mgs = perseByCommaInInbox[6];
                    }

                }
                defaultTableModel.addRow(new Object[]{count++, from, dateTime, mgs});
            }
            tableForDetails.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    if (inboxIsActive) {
                        Point point = me.getPoint();
                        int row = tableForDetails.rowAtPoint(point);
                        Configaration.setErrorLog(me.getClickCount());
                        setMgsDetails.setText("");
                        String showableMgs = "From: " + tableForDetails.getValueAt(row, 1).toString() + "\n"
                                + "Date & Time: "
                                + tableForDetails.getValueAt(row, 2).toString()
                                + "\n\n" + "Message:\n" + tableForDetails.getValueAt(row, 3).toString();
                        setMgsDetails.setText(showableMgs);
                    }
                }
            });
            tableForDetails.setEnabled(false);
            tableForDetails.setRowHeight(30);
            tableForDetails.setModel(defaultTableModel);
        } else if (detailsSelectedItems.equals("recharge")) {
            inboxIsActive = false;
            detailsSelectedItems = "recharge";
            setMgsDetails.setText("");
            DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status",}, 0);
            try {

                rs = DbConnection.retrieveAll("recharge_admin");
                while (rs.next()) {
                    System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));

                    defaultTableModel.addRow(new Object[]{
                        rs.getString("trx_id"),
                        rs.getString("date_time"),
                        rs.getString("type"),
                        rs.getString("mobile_no"),
                        rs.getString("amount"),
                        rs.getString("from_sp"),
                        rs.getString("current_balance"),
                        rs.getString("status")});

                }

            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                    }
                }
            }
            tableForDetails.setEnabled(false);
            tableForDetails.setRowHeight(30);
            tableForDetails.setModel(defaultTableModel);

        }
    }

    private void searchByDate(String stratDate, String endDate) {
        int count = 0;
        String from = null, dateTime = null, mgs = null, fromSearch = null;
        if (detailsSelectedItems.equals("inbox")) {
            DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"No", "From", "Date & Time", "Message"}, 0);
            for (String value : splitedByCMDValueForInbox) {

                perseByCommaInInbox = value.replaceAll("OK", "").replaceAll("\\+", "").split(",");
                for (int i = 1; i < perseByCommaInInbox.length; i++) {
                    //2--phn number
                    //4-5 date time
                    //6 mgs

                    if (Configaration.stringToDateType(stratDate).before(Configaration.stringToDateType(perseByCommaInInbox[4]))
                            && Configaration.stringToDateType(endDate).after(Configaration.stringToDateType(perseByCommaInInbox[4]))) {
                        from = perseByCommaInInbox[2];
                        if (from.length() >= 13) {
                            from = from.substring(2, 13);
                        }
                        dateTime = perseByCommaInInbox[4] + " " + perseByCommaInInbox[5];
                        if (Configaration.isHexadecimal(perseByCommaInInbox[6])) {
                            mgs = Configaration.haxToStringConvert(perseByCommaInInbox[6]);
                        } else {
                            mgs = perseByCommaInInbox[6];
                        }
                        defaultTableModel.addRow(new Object[]{count++, from, dateTime, mgs});
                    }

                }

            }
            tableForDetails.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    if (inboxIsActive) {
                        Point point = me.getPoint();
                        int row = tableForDetails.rowAtPoint(point);
                        Configaration.setErrorLog(me.getClickCount());
                        setMgsDetails.setText("");
                        String showableMgs = "From: " + tableForDetails.getValueAt(row, 1).toString() + "\n"
                                + "Date & Time: "
                                + tableForDetails.getValueAt(row, 2).toString()
                                + "\n\n" + "Message:\n" + tableForDetails.getValueAt(row, 3).toString();
                        setMgsDetails.setText(showableMgs);
                    }
                }
            });
            tableForDetails.setEnabled(false);
            tableForDetails.setRowHeight(30);
            tableForDetails.setModel(defaultTableModel);
        } else if (detailsSelectedItems.equals("recharge")) {

            DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status",}, 0);
            try {

                rs = DbConnection.retrieveAll("recharge_admin");
                while (rs.next()) {
                    System.out.println("----->" + rs.getString("date_time").substring(0, 8));
                    System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));
                    if (Configaration.stringToDateType(stratDate).before(Configaration.stringToDateType(rs.getString("date_time").substring(0, 8)))
                            && Configaration.stringToDateType(endDate).after(Configaration.stringToDateType(rs.getString("date_time").substring(0, 8)))) {
                        defaultTableModel.addRow(new Object[]{
                            rs.getString("trx_id"),
                            rs.getString("date_time"),
                            rs.getString("type"),
                            rs.getString("mobile_no"),
                            rs.getString("amount"),
                            rs.getString("from_sp"),
                            rs.getString("current_balance"),
                            rs.getString("status")});

                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                    }
                }
            }
            tableForDetails.setEnabled(false);
            tableForDetails.setRowHeight(30);
            tableForDetails.setModel(defaultTableModel);
        }
    }

    private void setBorderInManuBar() {
        DropShadowBorder shadow = new DropShadowBorder();

        shadow.setShadowColor(Color.BLACK);
        shadow.setShowLeftShadow(true);
        shadow.setShowRightShadow(true);
        shadow.setShowBottomShadow(true);
        shadow.setShowTopShadow(true);

        mobileRechargeTab.setBorder(shadow);
        billPaymentTab.setBorder(shadow);
        resellerTab.setBorder(shadow);
        detailsTab.setBorder(shadow);
        settingTab.setBorder(shadow);
        helplineTab.setBorder(shadow);
    }

    private void switchBillPaymentDetailsPaenl(String optionName) {
        switchPanelViaMenu(addBillPaymentDetailsPanel);
        headerLabel.setText("Payment Details");

        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            comboBoxActiveSIM.addItem(simOperatorIdentifierDto.getOperatorName());
        });
        switch (optionName) {
            case "bkash":

                break;

        }
    }

    /*
    *
    ------------------------- EXTRA METHOD-------------------------------------------
    *
     */
    protected void switchPanelViaMenu(javax.swing.JPanel requestedPanel) {

        basePanel.removeAll();
        basePanel.repaint();
        basePanel.revalidate();

        basePanel.add(requestedPanel);
        basePanel.repaint();
        basePanel.revalidate();

    }

    private void refrash() {
        selectedSimOperatorIcon.setIcon(null);
        //getAmmountEachNumber.setText("");
        getAmmountInTk.setText("");
        getBalenceUssdPartern1.setText("");
        //  getBalenceUssdPartern2.setText("");
        getMobileNumber.setText("");
        getNameForContract.setText("");
        getNameForSearch.setText("");
        getOperatorCode.setText("");
        // getOperatorCode1.setText("");
        getOperatorName.setText("");
        // getOperatorName1.setText("");
        getPhoneNOForContract.setText("");
        //getRechargeUssdPartern1.setText("");
        getRechargeUssdParternPostPaid.setText("");
        // getSearchViaPhoneNoAndTrnId.setText("");
        getUssdCode.setText("");
        //switchPanelViaMenu(basePanel);

    }

    private void removePlaceHolder(JTextField editText, String value) {
        if (editText.getText().equals(value)) {
            editText.setText("");
            Color color = new Color(51, 51, 51);
            editText.setForeground(color);
        }
    }

    private void setPlaceHolder(JTextField editText, String value) {
        if (editText.getText().equals("")) {
            editText.setText(value);
            Color color = new Color(153, 153, 153);
            editText.setForeground(color);
        }
    }

    private void hoverInBillPayPanel(JPanel jPanel) {

        jPanel.setBackground(Color.red);
    }

    private void hoverRemoveInBillPayPanel(JPanel jPanel) {
        jPanel.setBackground(Color.white);
    }

    public void resetComboBox(JComboBox jComboBox) {
        jComboBox.removeAllItems();

    }

}
