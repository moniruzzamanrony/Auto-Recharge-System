/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import auto.recharge.system.config.MobileRechargeDetailsComparator;
import auto.recharge.system.dto.ContractResponse;
import auto.recharge.system.dto.GroupRechargeResponse;
import auto.recharge.system.dto.MobileBankingBalanceShowDto;
import auto.recharge.system.dto.MobileRechargeDetailsDto;
import auto.recharge.system.dto.ModemInfoList;
import auto.recharge.system.dto.SimOperatorIdentifierDto;
import auto.recharge.system.dto.UserInfo;
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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang3.StringUtils;
import org.jdesktop.swingx.border.DropShadowBorder;

public class Home extends javax.swing.JFrame {
    private String imagePath = "No Image";
    private LoadingScreen l;
    private String selectedSimOperatorName;
    private String[] rowOfContractlist;
    private String trxId;
    private boolean inboxIsActive;
    private String[] perseByCommaInInbox;
    private String[] splitedByCMDValueForInbox = null;
    private String detailsSelectedItems;
    private String search;
    private DefaultListModel defaultListModel = new DefaultListModel();
    private Set<ContractResponse> contractList;
    private final String[] SIM_OPERATORS_NAME = new String[]{"BANGLALINK", "GP", "ROBI", "AIRTEL", "TELETALK"};
    private JDialog processtingLoderDialog;
    private String[] MOBILE_BANKING_NANE = {"bKash", "Rocket", "mCash", "tCash", "Nagad", "SureCash", "MyCash"};
    DBMySQLConnection bMySQLConnection = new DBMySQLConnection();
    private final String TAG_TEST = "Home test: ";
    private Queue<MobileRechargeDetailsDto> mobileRechargeDetailsDtoQueue = new PriorityQueue<MobileRechargeDetailsDto>(5, new MobileRechargeDetailsComparator());

    public Home() {
        initComponents();
        URL url = getClass().getResource("/resources/images/icon.png");
        ImageIcon imgicon = new ImageIcon(url);
        this.setIconImage(imgicon.getImage());
        this.setTitle("Auto Recharge System");
        setFocusInMobileRechargePanel();
        setCuurentActiveNetworksFromModem();
        loadActiveOperatorNameInComboBox();
        loadValueInTableRechargeDetails();
        refrash();
        placeHoderSetter();
        setBorderInManuBar();
        suggList.setModel(defaultListModel);
        popupForSuggestManu.add(suggestPanel);
        processingLoderDialog();
        
        processRequestFromMobileRechargeQueue();

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
        jLabel107 = new javax.swing.JLabel();
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
        clickSIMOffer1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRechargeDetailsShow = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        adsPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        clickInbox = new javax.swing.JButton();
        billPayPanel = new javax.swing.JPanel();
        clickMobileBanking = new javax.swing.JLabel();
        clickBillPayment = new javax.swing.JLabel();
        hoverViewbKash = new javax.swing.JPanel();
        hoverViewrocket = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
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
        setMgsDetails = new javax.swing.JTextArea();
        getSelectedOptionFroTable = new javax.swing.JComboBox<>();
        subItemsComboBox = new javax.swing.JComboBox<>();
        settingsPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        myProfile = new javax.swing.JLabel();
        settingBasePanel = new javax.swing.JPanel();
        myProfilePanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        clickEditInProfile = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        activePackageNameInProfile = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        activeDateInProfile = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        expiryDateInProfile = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        remainDaysInProfile = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        userIdInProfile = new javax.swing.JLabel();
        profile_pic = new javax.swing.JLabel();
        companyNameInProfilePanel = new javax.swing.JLabel();
        nameInProfilePanel1 = new javax.swing.JLabel();
        designationInProfilePanel1 = new javax.swing.JLabel();
        systemBackupPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        clickExportDatabase = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        clickImportDatabase = new javax.swing.JButton();
        passwordChangePanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        passwordForUpdate = new javax.swing.JTextField();
        rePasswordForUpdate = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        clickUpdatePassword = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        trustedEmployeePanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        getEmployeeNameTEmployee = new javax.swing.JTextField();
        getEmployeePhoneNUmberTEmployee = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        getPasswordTEmployee = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        getEmployeePasswordTEmployee = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableTrustedEmployees = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        rechargeSettingsPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ussdSettedTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        clickSerch1 = new javax.swing.JLabel();
        clickAddNewManagement = new javax.swing.JButton();
        MobileBankingSettingsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        getSelectedServiceCombo = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        getSelectedSIMNameCombo = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        getTaskNameInMBS = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        getPIN = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        clickSaveInMobileRechatgeSetting = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        getUssdCodePattren = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        getUssdCodeForBalanceShowPattren = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableMobileBankingSetting = new javax.swing.JTable();
        jLabel86 = new javax.swing.JLabel();
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
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
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
        alartMessageText = new javax.swing.JLabel();
        addNewManagementPanel = new javax.swing.JPanel();
        backToUssdManengementPanel = new javax.swing.JLabel();
        dropdownOperatorName = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        clickAddContract1 = new javax.swing.JButton();
        getOperatorName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
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
        addMobileBankingPanelInBillPay = new javax.swing.JPanel();
        clickSandInMB = new javax.swing.JLabel();
        getSimOperatorName = new javax.swing.JComboBox<>();
        getPhoneNumberInBillPayment = new javax.swing.JTextField();
        getAmmountInBillPayment = new javax.swing.JTextField();
        selectedSimOperatorIcon1 = new javax.swing.JLabel();
        clickContactList1 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        getServiceName = new javax.swing.JComboBox<>();
        jLabel83 = new javax.swing.JLabel();
        getOperationType = new javax.swing.JComboBox<>();
        rechargeBalencePanel1 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane8 = new javax.swing.JScrollPane();
        mobileBankingBalanceShowPanelList = new javax.swing.JList<>();
        processingTextInMobileBanking = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tableMobileBankingDetails = new javax.swing.JTable();
        jLabel84 = new javax.swing.JLabel();
        groupLoadPanel = new javax.swing.JPanel();
        backToMobileRecharge1 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableGroupRecharge = new javax.swing.JTable();
        sendAllRechargeBut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        getPhoneNumberInGroupRecharge = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        getAmountGroupRecharge = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        addButInGroupRecharge = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        getSelectedTypeGroupRecharge = new javax.swing.JComboBox<>();
        getSelectedSimInGroupRecharge1 = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        sendingLogLabel = new javax.swing.JLabel();
        billPaymentPanelInBillPay = new javax.swing.JPanel();
        selectedSimOperatorIcon2 = new javax.swing.JLabel();
        clickContactList2 = new javax.swing.JLabel();
        rechargeBalencePanel2 = new javax.swing.JPanel();
        loaderInBillPayment = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        clickRefrash2 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        getBalanceInBillPayment = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tableBillPaymentDetails = new javax.swing.JTable();
        detailsPanelInBillPay = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        getSimName = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        getServiceTypeInBillPay = new javax.swing.JComboBox<>();
        clickTabUsingBillNO = new javax.swing.JButton();
        clickTabUsingCustomerId = new javax.swing.JButton();
        baseBillPayment = new javax.swing.JPanel();
        usingBillNoPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        getBillNO = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        clickPayIUsingBill = new javax.swing.JButton();
        clickResetPayInUsingBill = new javax.swing.JButton();
        getPasswordInBillPay = new javax.swing.JPasswordField();
        UsingCustomerId = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        getCustomerId = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        payInUsingCustomerId = new javax.swing.JButton();
        resetnUsingCustomerId = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        getyear = new javax.swing.JComboBox<>();
        getMonthNo = new javax.swing.JComboBox<>();
        getPassword = new javax.swing.JPasswordField();

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
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo_header.png"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
            .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 144, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
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

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Mobile Banking");

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
        title3.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        title4.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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
        title5.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(detailsTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/help_bar_v_2.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278)
                .addComponent(netBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addComponent(netBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
        getPrepaidOrPostpaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid", "Skitto" }));

        getAmmountInTk.setFont(new java.awt.Font("Arial", 1, 90)); // NOI18N
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

        getMobileNumber.setFont(new java.awt.Font("Arial", 1, 90)); // NOI18N
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
        getMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMobileNumberActionPerformed(evt);
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
                        .addGap(0, 12, Short.MAX_VALUE)
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

        clickSIMOffer1.setBackground(new java.awt.Color(153, 0, 255));
        clickSIMOffer1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickSIMOffer1.setForeground(new java.awt.Color(255, 255, 255));
        clickSIMOffer1.setText("SIM Offer");
        clickSIMOffer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSIMOffer1ActionPerformed(evt);
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
        tableRechargeDetailsShow.setRowHeight(30);
        tableRechargeDetailsShow.setSelectionBackground(new java.awt.Color(51, 153, 0));
        tableRechargeDetailsShow.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableRechargeDetailsShow.getTableHeader().setReorderingAllowed(false);
        tableRechargeDetailsShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRechargeDetailsShowMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableRechargeDetailsShow);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Today's Recharge");

        adsPanel.setBackground(new java.awt.Color(255, 255, 255));
        adsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ads");

        javax.swing.GroupLayout adsPanelLayout = new javax.swing.GroupLayout(adsPanel);
        adsPanel.setLayout(adsPanelLayout);
        adsPanelLayout.setHorizontalGroup(
            adsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        adsPanelLayout.setVerticalGroup(
            adsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel101.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(204, 0, 51));
        jLabel101.setText("Licences DeadLine: 10-10-2020");

        clickInbox.setBackground(new java.awt.Color(153, 0, 255));
        clickInbox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickInbox.setForeground(new java.awt.Color(255, 255, 255));
        clickInbox.setText("INBOX");
        clickInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickInboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mobileRechargePanelLayout = new javax.swing.GroupLayout(mobileRechargePanel);
        mobileRechargePanel.setLayout(mobileRechargePanelLayout);
        mobileRechargePanelLayout.setHorizontalGroup(
            mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mobileRechargePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(getSeletedOperatorName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clickSIMOffer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clickGroupLoad, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(clickUssdDail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clickInbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                                .addGap(522, 522, 522)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rechargeBalencePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addGap(11, 11, 11)
                                .addComponent(clickInbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clickSIMOffer1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getSeletedOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                        .addComponent(rechargeBalencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel101)
                .addContainerGap())
        );

        basePanel.add(mobileRechargePanel, "card2");

        billPayPanel.setBackground(new java.awt.Color(255, 255, 255));

        clickMobileBanking.setBackground(new java.awt.Color(255, 102, 102));
        clickMobileBanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickMobileBanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/mobile_banking.jpg"))); // NOI18N
        clickMobileBanking.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickMobileBanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMobileBankingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickMobileBankingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickMobileBankingMouseExited(evt);
            }
        });

        clickBillPayment.setBackground(new java.awt.Color(0, 0, 102));
        clickBillPayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickBillPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/bill_payment_edit.png"))); // NOI18N
        clickBillPayment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickBillPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickBillPaymentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickBillPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickBillPaymentMouseExited(evt);
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

        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Mobile Banking");

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Bill Pay");

        javax.swing.GroupLayout billPayPanelLayout = new javax.swing.GroupLayout(billPayPanel);
        billPayPanel.setLayout(billPayPanelLayout);
        billPayPanelLayout.setHorizontalGroup(
            billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPayPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hoverViewbKash, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(clickMobileBanking, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clickBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(hoverViewrocket, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(997, 997, 997))
        );
        billPayPanelLayout.setVerticalGroup(
            billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPayPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clickBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(clickMobileBanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel85))
                .addGap(9, 9, 9)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoverViewbKash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoverViewrocket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(596, Short.MAX_VALUE))
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
                .addContainerGap(978, Short.MAX_VALUE))
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
        tableForDetails.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tableForDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableForDetailsMouseClicked(evt);
            }
        });
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
        clickSearchedReportDownload.setText("Export Database ");
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
                        .addGap(0, 0, Short.MAX_VALUE)
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
                                .addComponent(clickSearchedfromToBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        setMgsDetails.setColumns(20);
        setMgsDetails.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        setMgsDetails.setForeground(new java.awt.Color(255, 102, 102));
        setMgsDetails.setRows(5);
        setMgsDetails.setText("ghbfgh");
        setMgsDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setMgsDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setMgsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getSelectedOptionFroTable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "My Recharge", "Inbox", "Mobile Banking", "Bill Payment" }));
        getSelectedOptionFroTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSelectedOptionFroTableActionPerformed(evt);
            }
        });

        subItemsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemsComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(getSelectedOptionFroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subItemsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addComponent(jScrollPane6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getSelectedOptionFroTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subItemsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clickEditInProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/edit.png"))); // NOI18N
        clickEditInProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickEditInProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickEditInProfileMouseExited(evt);
            }
        });
        jPanel4.add(clickEditInProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Active Package:");

        activePackageNameInProfile.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        activePackageNameInProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        activePackageNameInProfile.setText("Active Package:");

        jLabel57.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel57.setText("Active Date      :");

        activeDateInProfile.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        activeDateInProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        activeDateInProfile.setText("Active Package:");

        jLabel73.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel73.setText("Expired Days   :");

        expiryDateInProfile.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        expiryDateInProfile.setForeground(new java.awt.Color(255, 0, 51));
        expiryDateInProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        expiryDateInProfile.setText("Active Package:");

        jLabel75.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel75.setText("Remain Days   :");

        remainDaysInProfile.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        remainDaysInProfile.setForeground(new java.awt.Color(255, 0, 51));
        remainDaysInProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        remainDaysInProfile.setText("Active Package:");

        jLabel77.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel77.setText("User ID             :");

        userIdInProfile.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        userIdInProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userIdInProfile.setText("Not Found");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userIdInProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(remainDaysInProfile))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(activePackageNameInProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(activeDateInProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(expiryDateInProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(userIdInProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(activePackageNameInProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(activeDateInProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(expiryDateInProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(remainDaysInProfile))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 289, 730, 400));

        profile_pic.setBackground(new java.awt.Color(51, 51, 255));
        profile_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/profile_add.png"))); // NOI18N
        profile_pic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(profile_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 130, 130));

        companyNameInProfilePanel.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        companyNameInProfilePanel.setForeground(new java.awt.Color(255, 51, 51));
        companyNameInProfilePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyNameInProfilePanel.setText("IT Village Ltd.");
        jPanel4.add(companyNameInProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 740, -1));

        nameInProfilePanel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        nameInProfilePanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameInProfilePanel1.setText("Moniruzzaman Roni");
        jPanel4.add(nameInProfilePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 180, 740, -1));

        designationInProfilePanel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        designationInProfilePanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        designationInProfilePanel1.setText("Owner");
        jPanel4.add(designationInProfilePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 740, -1));

        javax.swing.GroupLayout myProfilePanelLayout = new javax.swing.GroupLayout(myProfilePanel);
        myProfilePanel.setLayout(myProfilePanelLayout);
        myProfilePanelLayout.setHorizontalGroup(
            myProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myProfilePanelLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        myProfilePanelLayout.setVerticalGroup(
            myProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myProfilePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        settingBasePanel.add(myProfilePanel, "card2");

        systemBackupPanel.setToolTipText("");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clickExportDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/download.png"))); // NOI18N
        clickExportDatabase.setText("Export This Recharge Report ");
        clickExportDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickExportDatabaseActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Backup Download");

        clickImportDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/download.png"))); // NOI18N
        clickImportDatabase.setText("Import This Recharge Report ");
        clickImportDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickImportDatabaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clickImportDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickExportDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(clickImportDatabase)
                .addGap(28, 28, 28)
                .addComponent(clickExportDatabase)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout systemBackupPanelLayout = new javax.swing.GroupLayout(systemBackupPanel);
        systemBackupPanel.setLayout(systemBackupPanelLayout);
        systemBackupPanelLayout.setHorizontalGroup(
            systemBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemBackupPanelLayout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        systemBackupPanelLayout.setVerticalGroup(
            systemBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemBackupPanelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        settingBasePanel.add(systemBackupPanel, "card2");

        passwordChangePanel.setToolTipText("");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setText("Password: ");

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setText("Re-type password: ");

        clickUpdatePassword.setBackground(new java.awt.Color(102, 0, 255));
        clickUpdatePassword.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        clickUpdatePassword.setForeground(new java.awt.Color(255, 255, 255));
        clickUpdatePassword.setText("Update");
        clickUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUpdatePasswordActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 51, 51));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Password Change");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(rePasswordForUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(passwordForUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(clickUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordForUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rePasswordForUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clickUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout passwordChangePanelLayout = new javax.swing.GroupLayout(passwordChangePanel);
        passwordChangePanel.setLayout(passwordChangePanelLayout);
        passwordChangePanelLayout.setHorizontalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        passwordChangePanelLayout.setVerticalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        settingBasePanel.add(passwordChangePanel, "card2");

        trustedEmployeePanel.setToolTipText("");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Add Trusted Employees");

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel74.setText("Employee Name: ");

        getEmployeeNameTEmployee.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getEmployeeNameTEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEmployeeNameTEmployeeActionPerformed(evt);
            }
        });

        getEmployeePhoneNUmberTEmployee.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel76.setText("Employee's Phone Number: ");

        getPasswordTEmployee.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel78.setText("Password: ");

        getEmployeePasswordTEmployee.setBackground(new java.awt.Color(204, 204, 204));
        getEmployeePasswordTEmployee.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getEmployeePasswordTEmployee.setText("user");
        getEmployeePasswordTEmployee.setFocusable(false);

        jLabel79.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel79.setText("Employee Name: ");

        tableTrustedEmployees.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(tableTrustedEmployees);

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(getPasswordTEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(getEmployeeNameTEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getEmployeePhoneNUmberTEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getEmployeePasswordTEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel19)
                .addGap(98, 98, 98)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(getEmployeeNameTEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(getEmployeePhoneNUmberTEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(getPasswordTEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(getEmployeePasswordTEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout trustedEmployeePanelLayout = new javax.swing.GroupLayout(trustedEmployeePanel);
        trustedEmployeePanel.setLayout(trustedEmployeePanelLayout);
        trustedEmployeePanelLayout.setHorizontalGroup(
            trustedEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trustedEmployeePanelLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        trustedEmployeePanelLayout.setVerticalGroup(
            trustedEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trustedEmployeePanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
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

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add new services");

        getSelectedServiceCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSelectedServiceComboActionPerformed(evt);
            }
        });

        jLabel58.setText("Select Service");

        jLabel59.setText("Select  Default SIM Card");

        getSelectedSIMNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSelectedSIMNameComboActionPerformed(evt);
            }
        });

        jLabel60.setText("Task name");

        jLabel61.setText("PIN");

        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        clickSaveInMobileRechatgeSetting.setForeground(new java.awt.Color(51, 204, 0));
        clickSaveInMobileRechatgeSetting.setText("Save");
        clickSaveInMobileRechatgeSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSaveInMobileRechatgeSettingActionPerformed(evt);
            }
        });

        jLabel87.setText("Ussd Code pattern");

        getUssdCodePattren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getUssdCodePattrenActionPerformed(evt);
            }
        });

        getUssdCodeForBalanceShowPattren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getUssdCodeForBalanceShowPattrenActionPerformed(evt);
            }
        });

        jLabel100.setText("Ussd Code pattern For Balance show");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator9)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getTaskNameInMBS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getSelectedServiceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getSelectedSIMNameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getUssdCodePattren, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getPIN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getUssdCodeForBalanceShowPattren, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clickSaveInMobileRechatgeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
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
                .addComponent(getTaskNameInMBS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getUssdCodePattren, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getUssdCodeForBalanceShowPattren, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickSaveInMobileRechatgeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        tableMobileBankingSetting.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMobileBankingSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMobileBankingSettingMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tableMobileBankingSetting);

        jLabel86.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(51, 51, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Services List");

        javax.swing.GroupLayout MobileBankingSettingsPanelLayout = new javax.swing.GroupLayout(MobileBankingSettingsPanel);
        MobileBankingSettingsPanel.setLayout(MobileBankingSettingsPanelLayout);
        MobileBankingSettingsPanelLayout.setHorizontalGroup(
            MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MobileBankingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MobileBankingSettingsPanelLayout.setVerticalGroup(
            MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
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
                .addContainerGap(230, Short.MAX_VALUE)
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
        addNewManagementPanelSettings.add(clickAddContract2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 710, 150, 40));

        getOperatorName1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        addNewManagementPanelSettings.add(getOperatorName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 470, 40));

        jLabel42.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel42.setText("Operator Name");
        addNewManagementPanelSettings.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 98, -1, -1));

        jLabel45.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel45.setText("Recharge USSD Code Pattern (Pre-paid)");
        addNewManagementPanelSettings.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        getRechargeUssdParternPrePaid1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPrePaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPrePaid1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getRechargeUssdParternPrePaid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 470, 40));

        jLabel46.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel46.setText("Icon");
        addNewManagementPanelSettings.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));

        clickChooseIcon1.setBackground(new java.awt.Color(255, 255, 255));
        clickChooseIcon1.setForeground(new java.awt.Color(102, 102, 255));
        clickChooseIcon1.setText("::::::Choose Icon(40px X 30px):::::::");
        clickChooseIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickChooseIcon1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(clickChooseIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 470, 30));

        getprofitIn1k.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getprofitIn1k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getprofitIn1kActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getprofitIn1k, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 470, 40));

        jLabel47.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel47.setText("Balence show USSD Code Pattern");
        addNewManagementPanelSettings.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel48.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel48.setText("Account Password");
        addNewManagementPanelSettings.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));
        addNewManagementPanelSettings.add(accountPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 470, 40));

        jLabel49.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel49.setText("Recharge USSD Code Pattern(post-paid)");
        addNewManagementPanelSettings.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        getRechargeUssdParternPostPaid1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPostPaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPostPaid1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getRechargeUssdParternPostPaid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 470, 40));

        labelUssdPatternSkitto.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        labelUssdPatternSkitto.setText("Recharge USSD Code Pattern(Skitto)");
        addNewManagementPanelSettings.add(labelUssdPatternSkitto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, -1, -1));

        getRechargeUssdParternSkitto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternSkitto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternSkittoActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getRechargeUssdParternSkitto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 470, 40));

        jLabel62.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel62.setText("Profit in 1000 tk");
        addNewManagementPanelSettings.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        getBalenceUssdPartern3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getBalenceUssdPartern3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalenceUssdPartern3ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getBalenceUssdPartern3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 470, 40));

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

        jPanel9.setBackground(new java.awt.Color(133, 47, 209));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo.png"))); // NOI18N
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 1090, 186));

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 120)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("01788841890");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 471, 1090, -1));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 120)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("01988841890");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 316, 1090, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Contract Us");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 270, 1070, 45));

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("( Afsar Ali )");
        jPanel9.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 618, 1090, -1));

        jLabel99.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Founder of Auto Recharge Software Ltd.");
        jPanel9.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 701, 1094, -1));

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel102.setText("Develop By: IT Village Ltd. ");
        jPanel9.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 864, 260, 20));

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Offer By: Auto Recharge Software Ltd. ");
        jPanel9.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 1080, 45));
        jPanel9.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 736, 1094, 10));
        jPanel9.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 821, 1094, 10));

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/facebook.png"))); // NOI18N
        jPanel9.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 849, -1, -1));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/youtube.png"))); // NOI18N
        jPanel9.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 849, -1, -1));

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/internet.png"))); // NOI18N
        jPanel9.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 849, -1, -1));

        javax.swing.GroupLayout helplinePanelLayout = new javax.swing.GroupLayout(helplinePanel);
        helplinePanel.setLayout(helplinePanelLayout);
        helplinePanelLayout.setHorizontalGroup(
            helplinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplinePanelLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        helplinePanelLayout.setVerticalGroup(
            helplinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        alartMessageText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        alartMessageText.setForeground(new java.awt.Color(204, 0, 51));
        alartMessageText.setText("**No Internet!! Cloud contracts can't be loaded. ");

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
                        .addContainerGap()
                        .addComponent(alartMessageText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
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
                .addGroup(contractListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alartMessageText))
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
        addNewManagementPanel.add(clickAddContract1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 150, 40));

        getOperatorName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        addNewManagementPanel.add(getOperatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 470, 40));

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel29.setText("Operator Name");
        addNewManagementPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 98, -1, -1));

        jLabel31.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel31.setText("Action For");
        addNewManagementPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        getSeletedAction.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getSeletedAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile Recharge" }));
        getSeletedAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSeletedActionActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getSeletedAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 470, 40));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel32.setText("Recharge USSD Code Pattern (Pre-paid)");
        addNewManagementPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        getRechargeUssdParternPrePaid.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPrePaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPrePaidActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getRechargeUssdParternPrePaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 470, 40));

        jLabel33.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel33.setText("Icon");
        addNewManagementPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        clickChooseIcon.setBackground(new java.awt.Color(255, 255, 255));
        clickChooseIcon.setForeground(new java.awt.Color(102, 102, 255));
        clickChooseIcon.setText("::::::Choose Icon(40px X 30px):::::::");
        clickChooseIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickChooseIconActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(clickChooseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 470, 30));

        getBalenceUssdPartern1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getBalenceUssdPartern1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalenceUssdPartern1ActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getBalenceUssdPartern1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 470, 40));

        jLabel34.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel34.setText("Balence show USSD Code Pattern");
        addNewManagementPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel35.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel35.setText("Account Password");
        addNewManagementPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        accountPassword.setText("jPasswordField1");
        addNewManagementPanel.add(accountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 470, 40));

        jLabel36.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel36.setText("Recharge USSD Code Pattern(post-paid)");
        addNewManagementPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        getRechargeUssdParternPostPaid.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPostPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPostPaidActionPerformed(evt);
            }
        });
        addNewManagementPanel.add(getRechargeUssdParternPostPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 470, 40));

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

        addMobileBankingPanelInBillPay.setBackground(new java.awt.Color(255, 255, 255));
        addMobileBankingPanelInBillPay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clickSandInMB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSandInMBMouseClicked(evt);
            }
        });
        addMobileBankingPanelInBillPay.add(clickSandInMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 200, 50));

        getSimOperatorName.setBackground(new java.awt.Color(255, 255, 255));
        getSimOperatorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getSimOperatorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSimOperatorNameActionPerformed(evt);
            }
        });
        addMobileBankingPanelInBillPay.add(getSimOperatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 190, 40));

        getPhoneNumberInBillPayment.setFont(new java.awt.Font("Cambria", 1, 80)); // NOI18N
        getPhoneNumberInBillPayment.setBorder(null);
        getPhoneNumberInBillPayment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getPhoneNumberInBillPaymentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getPhoneNumberInBillPaymentFocusLost(evt);
            }
        });
        getPhoneNumberInBillPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPhoneNumberInBillPaymentActionPerformed(evt);
            }
        });
        addMobileBankingPanelInBillPay.add(getPhoneNumberInBillPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 740, 100));

        getAmmountInBillPayment.setFont(new java.awt.Font("Cambria", 0, 100)); // NOI18N
        getAmmountInBillPayment.setBorder(null);
        getAmmountInBillPayment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getAmmountInBillPaymentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getAmmountInBillPaymentFocusLost(evt);
            }
        });
        addMobileBankingPanelInBillPay.add(getAmmountInBillPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 530, 100));
        addMobileBankingPanelInBillPay.add(selectedSimOperatorIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 50));

        clickContactList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickContactList1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickContactList1MouseEntered(evt);
            }
        });
        addMobileBankingPanelInBillPay.add(clickContactList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 50, 50));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/mobile_banking.png"))); // NOI18N
        addMobileBankingPanelInBillPay.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 1025, 347));

        getServiceName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                getServiceNameItemStateChanged(evt);
            }
        });
        getServiceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getServiceNameActionPerformed(evt);
            }
        });
        addMobileBankingPanelInBillPay.add(getServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 330, 50));

        jLabel83.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 0, 255));
        jLabel83.setText("Service:");
        addMobileBankingPanelInBillPay.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 50));

        getOperationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------ Select Operation ----" }));
        getOperationType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                getOperationTypeItemStateChanged(evt);
            }
        });
        getOperationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getOperationTypeActionPerformed(evt);
            }
        });
        addMobileBankingPanelInBillPay.add(getOperationType, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 350, 50));

        rechargeBalencePanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 102, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Amount panel");

        jSeparator8.setForeground(new java.awt.Color(133, 47, 209));

        mobileBankingBalanceShowPanelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        mobileBankingBalanceShowPanelList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileBankingBalanceShowPanelListMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(mobileBankingBalanceShowPanelList);

        processingTextInMobileBanking.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        processingTextInMobileBanking.setForeground(new java.awt.Color(255, 0, 0));
        processingTextInMobileBanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout rechargeBalencePanel1Layout = new javax.swing.GroupLayout(rechargeBalencePanel1);
        rechargeBalencePanel1.setLayout(rechargeBalencePanel1Layout);
        rechargeBalencePanel1Layout.setHorizontalGroup(
            rechargeBalencePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8)
            .addGroup(rechargeBalencePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rechargeBalencePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(processingTextInMobileBanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rechargeBalencePanel1Layout.setVerticalGroup(
            rechargeBalencePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeBalencePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processingTextInMobileBanking, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        addMobileBankingPanelInBillPay.add(rechargeBalencePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, 320, 420));

        tableMobileBankingDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMobileBankingDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMobileBankingDetailsMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tableMobileBankingDetails);

        addMobileBankingPanelInBillPay.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1550, 350));

        jLabel84.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 0, 255));
        jLabel84.setText("Operation:");
        addMobileBankingPanelInBillPay.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, 50));

        basePanel.add(addMobileBankingPanelInBillPay, "card2");

        groupLoadPanel.setBackground(new java.awt.Color(255, 255, 255));
        groupLoadPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backToMobileRecharge1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToMobileRecharge1.setText("jLabel3");
        backToMobileRecharge1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToMobileRecharge1MouseClicked(evt);
            }
        });
        groupLoadPanel.add(backToMobileRecharge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel66.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Group Load");
        groupLoadPanel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        tableGroupRecharge.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tableGroupRecharge);

        groupLoadPanel.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 990, 600));

        sendAllRechargeBut.setText("Send All Recharge");
        sendAllRechargeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAllRechargeButActionPerformed(evt);
            }
        });
        groupLoadPanel.add(sendAllRechargeBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 160, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 51), null));

        jLabel67.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(153, 0, 153));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Add Recharge");

        getPhoneNumberInGroupRecharge.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jLabel68.setText("Phone No.");

        getAmountGroupRecharge.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jLabel69.setText("Amount");

        addButInGroupRecharge.setText("Add");
        addButInGroupRecharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButInGroupRechargeActionPerformed(evt);
            }
        });

        jLabel70.setText("Type");

        getSelectedTypeGroupRecharge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-paid", "Post-paid", "Skitto" }));

        jLabel71.setText("Send By");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(addButInGroupRecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getPhoneNumberInGroupRecharge)
                    .addComponent(getAmountGroupRecharge)
                    .addComponent(getSelectedTypeGroupRecharge, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getSelectedSimInGroupRecharge1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getPhoneNumberInGroupRecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getAmountGroupRecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSelectedTypeGroupRecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSelectedSimInGroupRecharge1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(addButInGroupRecharge)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        groupLoadPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 300, 640));

        sendingLogLabel.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        sendingLogLabel.setForeground(new java.awt.Color(204, 0, 51));
        sendingLogLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sendingLogLabel.setText("Please Wait...");
        groupLoadPanel.add(sendingLogLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 370, -1));

        basePanel.add(groupLoadPanel, "card2");

        billPaymentPanelInBillPay.setBackground(new java.awt.Color(255, 255, 255));
        billPaymentPanelInBillPay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        billPaymentPanelInBillPay.add(selectedSimOperatorIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 50));

        clickContactList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickContactList2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickContactList2MouseEntered(evt);
            }
        });
        billPaymentPanelInBillPay.add(clickContactList2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 50, 50));

        rechargeBalencePanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        loaderInBillPayment.setBackground(new java.awt.Color(255, 0, 51));
        loaderInBillPayment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loaderInBillPayment.setForeground(new java.awt.Color(255, 0, 0));
        loaderInBillPayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loaderInBillPayment.setText("-------  Reload Now  ---------");

        jLabel90.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(102, 102, 255));
        jLabel90.setText("Amount panel");

        clickRefrash2.setBackground(new java.awt.Color(255, 0, 0));
        clickRefrash2.setForeground(new java.awt.Color(255, 255, 255));
        clickRefrash2.setText("Refrash");
        clickRefrash2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickRefrash2ActionPerformed(evt);
            }
        });

        jSeparator10.setForeground(new java.awt.Color(133, 47, 209));

        getBalanceInBillPayment.setFont(new java.awt.Font("Agency FB", 1, 80)); // NOI18N
        getBalanceInBillPayment.setForeground(new java.awt.Color(153, 0, 0));
        getBalanceInBillPayment.setText("1000000");
        getBalanceInBillPayment.setToolTipText("");

        jLabel88.setFont(new java.awt.Font("Cambria", 1, 70)); // NOI18N
        jLabel88.setText("Tk");

        javax.swing.GroupLayout rechargeBalencePanel2Layout = new javax.swing.GroupLayout(rechargeBalencePanel2);
        rechargeBalencePanel2.setLayout(rechargeBalencePanel2Layout);
        rechargeBalencePanel2Layout.setHorizontalGroup(
            rechargeBalencePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator10)
            .addGroup(rechargeBalencePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rechargeBalencePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rechargeBalencePanel2Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clickRefrash2))
                    .addComponent(loaderInBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getBalanceInBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rechargeBalencePanel2Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rechargeBalencePanel2Layout.setVerticalGroup(
            rechargeBalencePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeBalencePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rechargeBalencePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(clickRefrash2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getBalanceInBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loaderInBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        billPaymentPanelInBillPay.add(rechargeBalencePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 280, 320));

        tableBillPaymentDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        tableBillPaymentDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBillPaymentDetailsMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tableBillPaymentDetails);

        billPaymentPanelInBillPay.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 1550, 300));

        detailsPanelInBillPay.setBackground(new java.awt.Color(133, 47, 209));
        detailsPanelInBillPay.setForeground(new java.awt.Color(102, 0, 255));

        jLabel89.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("SIM: ");

        getSimName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getSimName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teletalk" }));
        getSimName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                getSimNameItemStateChanged(evt);
            }
        });
        getSimName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSimNameActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Service:");

        getServiceTypeInBillPay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getServiceTypeInBillPay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Palli Bidyut Bill" }));
        getServiceTypeInBillPay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                getServiceTypeInBillPayItemStateChanged(evt);
            }
        });
        getServiceTypeInBillPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getServiceTypeInBillPayActionPerformed(evt);
            }
        });

        clickTabUsingBillNO.setBackground(new java.awt.Color(102, 102, 255));
        clickTabUsingBillNO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clickTabUsingBillNO.setForeground(new java.awt.Color(255, 255, 255));
        clickTabUsingBillNO.setText("Using Bill No.");
        clickTabUsingBillNO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clickTabUsingBillNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickTabUsingBillNOActionPerformed(evt);
            }
        });

        clickTabUsingCustomerId.setBackground(new java.awt.Color(102, 102, 255));
        clickTabUsingCustomerId.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clickTabUsingCustomerId.setForeground(new java.awt.Color(255, 255, 255));
        clickTabUsingCustomerId.setText("Using Customer ID");
        clickTabUsingCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickTabUsingCustomerIdActionPerformed(evt);
            }
        });

        baseBillPayment.setBackground(new java.awt.Color(255, 255, 255));
        baseBillPayment.setLayout(new java.awt.CardLayout());

        usingBillNoPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Using Bill No.");

        jLabel97.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel97.setText("Bill No.");

        getBillNO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel98.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel98.setText("Password");

        clickPayIUsingBill.setBackground(new java.awt.Color(0, 153, 51));
        clickPayIUsingBill.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickPayIUsingBill.setForeground(new java.awt.Color(255, 255, 255));
        clickPayIUsingBill.setText("Pay");
        clickPayIUsingBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickPayIUsingBillActionPerformed(evt);
            }
        });

        clickResetPayInUsingBill.setBackground(new java.awt.Color(204, 0, 51));
        clickResetPayInUsingBill.setForeground(new java.awt.Color(255, 255, 255));
        clickResetPayInUsingBill.setText("RESET");
        clickResetPayInUsingBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickResetPayInUsingBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usingBillNoPanelLayout = new javax.swing.GroupLayout(usingBillNoPanel);
        usingBillNoPanel.setLayout(usingBillNoPanelLayout);
        usingBillNoPanelLayout.setHorizontalGroup(
            usingBillNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usingBillNoPanelLayout.createSequentialGroup()
                .addGroup(usingBillNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usingBillNoPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(usingBillNoPanelLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(usingBillNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel97)
                            .addComponent(getBillNO, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                            .addComponent(jLabel98)
                            .addComponent(getPasswordInBillPay)))
                    .addGroup(usingBillNoPanelLayout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(clickPayIUsingBill, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(clickResetPayInUsingBill, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        usingBillNoPanelLayout.setVerticalGroup(
            usingBillNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usingBillNoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel21)
                .addGap(33, 33, 33)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getPasswordInBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(usingBillNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickPayIUsingBill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickResetPayInUsingBill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        baseBillPayment.add(usingBillNoPanel, "card2");

        UsingCustomerId.setBackground(new java.awt.Color(255, 255, 255));

        jLabel92.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Using Customer ID.");

        jLabel93.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel93.setText("Customer ID");

        jLabel94.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel94.setText("Bill Month Name.");

        payInUsingCustomerId.setBackground(new java.awt.Color(0, 153, 0));
        payInUsingCustomerId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        payInUsingCustomerId.setForeground(new java.awt.Color(255, 255, 255));
        payInUsingCustomerId.setText("Pay");
        payInUsingCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInUsingCustomerIdActionPerformed(evt);
            }
        });

        resetnUsingCustomerId.setBackground(new java.awt.Color(204, 0, 0));
        resetnUsingCustomerId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        resetnUsingCustomerId.setForeground(new java.awt.Color(255, 255, 255));
        resetnUsingCustomerId.setText("Reset");
        resetnUsingCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetnUsingCustomerIdActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel95.setText("Bill Year.");

        jLabel96.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel96.setText("Password");

        getyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        getMonthNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout UsingCustomerIdLayout = new javax.swing.GroupLayout(UsingCustomerId);
        UsingCustomerId.setLayout(UsingCustomerIdLayout);
        UsingCustomerIdLayout.setHorizontalGroup(
            UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                .addGroup(UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(payInUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(resetnUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel94)
                            .addComponent(jLabel93)
                            .addComponent(jLabel95)
                            .addComponent(jLabel96)
                            .addComponent(getyear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getMonthNo, 0, 496, Short.MAX_VALUE)
                            .addComponent(getPassword))))
                .addContainerGap(314, Short.MAX_VALUE))
            .addGroup(UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsingCustomerIdLayout.createSequentialGroup()
                    .addContainerGap(334, Short.MAX_VALUE)
                    .addComponent(getCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(316, 316, 316)))
        );
        UsingCustomerIdLayout.setVerticalGroup(
            UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92)
                .addGap(30, 30, 30)
                .addComponent(jLabel93)
                .addGap(59, 59, 59)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getMonthNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getyear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payInUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetnUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(getCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(300, Short.MAX_VALUE)))
        );

        baseBillPayment.add(UsingCustomerId, "card3");

        javax.swing.GroupLayout detailsPanelInBillPayLayout = new javax.swing.GroupLayout(detailsPanelInBillPay);
        detailsPanelInBillPay.setLayout(detailsPanelInBillPayLayout);
        detailsPanelInBillPayLayout.setHorizontalGroup(
            detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                            .addComponent(jLabel89)
                            .addGap(3, 3, 3)
                            .addComponent(getSimName, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jLabel91)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(getServiceTypeInBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35))
                        .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                            .addComponent(clickTabUsingBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clickTabUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(baseBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 1146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        detailsPanelInBillPayLayout.setVerticalGroup(
            detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getSimName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(getServiceTypeInBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clickTabUsingBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickTabUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baseBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        billPaymentPanelInBillPay.add(detailsPanelInBillPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1200, 570));

        basePanel.add(billPaymentPanelInBillPay, "card2");

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
        // colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        // resellerTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));

    }//GEN-LAST:event_billPaymentTabMouseClicked

    private void detailsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTabMouseClicked
        switchPanelViaMenu(detailsPanel, detailsTab, title3, icon3, "details_color", "Details");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        // colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        // resellerTab.setBackground(new Color(133, 47, 209));
        billPaymentTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));

        loadRechargeDetailsInDetailsPanelTable();
        getSelectedOptionFroTable.setSelectedItem("My Recharge");

        processtingLoderDialog.setVisible(false);

        subItemsComboBox.setVisible(false);
    }//GEN-LAST:event_detailsTabMouseClicked

    private void settingTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingTabMouseClicked
        switchPanelViaMenu(settingsPanel1, settingTab, title4, icon4, "settings_color", "Settings");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        //colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        //  resellerTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        billPaymentTab.setBackground(new Color(133, 47, 209));
        helplineTab.setBackground(new Color(133, 47, 209));
        setDataInProfilePanel();
    }//GEN-LAST:event_settingTabMouseClicked

    private void helplineTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helplineTabMouseClicked
        switchPanelViaMenu(helplinePanel, helplineTab, title5, icon5, "helpline_color", "Help Line");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        // colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");

        mobileRechargeTab.setBackground(new Color(133, 47, 209));
        // resellerTab.setBackground(new Color(133, 47, 209));
        detailsTab.setBackground(new Color(133, 47, 209));
        billPaymentTab.setBackground(new Color(133, 47, 209));
        settingTab.setBackground(new Color(133, 47, 209));
    }//GEN-LAST:event_helplineTabMouseClicked

    private void clickUssdDailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailActionPerformed
        switchPanelViaMenu(ussdDialPanel);
        getUssdCode.requestFocusInWindow();
        refrash();
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getSelectedSim.addItem(simOperatorIdentifierDto.getOperatorName());
        });
        addKeyLIsenerInUssdDailPad();
    }//GEN-LAST:event_clickUssdDailActionPerformed

    private void clickGroupLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickGroupLoadActionPerformed
        switchPanelViaMenu(groupLoadPanel);
        getSelectedSimInGroupRecharge1.removeAllItems();
        for (String value : SIM_OPERATORS_NAME) {
            getSelectedSimInGroupRecharge1.addItem(value);

        }
        sendingLogLabel.setVisible(false);
        loadDataInGroupRechargeTable();
        focusAndKeyboardUsedInGroupRecharge();
    }//GEN-LAST:event_clickGroupLoadActionPerformed

    private void clickSIMOffer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSIMOffer1ActionPerformed
        simSimOfferDialog();
    }//GEN-LAST:event_clickSIMOffer1ActionPerformed

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
        // colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");

        //  resellerTab.setBackground(new Color(133, 47, 209));
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
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                processtingLoderDialog.setVisible(true);
                setContractListInJTable();
                System.out.println("Contract Searching...");
                return null;
            }

            @Override
            protected void done() {
                getNameForSearch.setText("");
                getNameForSearch.setUI(new HintTextFieldUI("Search by name"));
                getNameForSearch.requestFocusInWindow();
                processtingLoderDialog.setVisible(false);
                System.out.println("Fatching Successful...");
            }

        };
        swingWorker.execute();


    }//GEN-LAST:event_clickContactListMouseClicked

    private void myProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileMouseClicked
        switchPanelViaSettings(myProfilePanel, myProfile);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
        setDataInProfilePanel();
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

        addKeyLisenerInPasswordChargePanel();
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
        loadTableMobileBankingSettingFromDb();
        getSelectedSIMNameCombo.removeAllItems();
        getSelectedServiceCombo.removeAllItems();
        for (String mBank : MOBILE_BANKING_NANE) {
            getSelectedServiceCombo.addItem(mBank);
        }

        for (String sim : SIM_OPERATORS_NAME) {
            getSelectedSIMNameCombo.addItem(sim);
        }

        addKeyLisenerInMobileBankingSetting();
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
        addKeyListenserInRechargeOffer();
    }//GEN-LAST:event_rechargeOffersMouseClicked

    private void clickAddNewManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddNewManagementActionPerformed
        resetComboBox(getOparetorNameInDropDown);
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getOparetorNameInDropDown.addItem(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")");
        });
        switchPanelViaSettings(addNewManagementPanelSettings, rechargeSettings);
    }//GEN-LAST:event_clickAddNewManagementActionPerformed

    private void clickSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSendMouseClicked

        String phoneNumberRequested = getMobileNumber.getText();
        String ammountRequested = getAmmountInTk.getText();

        if (!phoneNumberRequested.equals("")
                && !ammountRequested.equals("")
                && phoneNumberRequested.matches("[0-9]+")
                && ammountRequested.matches("[0-9]+")) {

            String preOrPostRequested = getPrepaidOrPostpaid.getSelectedItem().toString();
            String selectedPayableSIM = getSeletedOperatorName.getSelectedItem().toString();

            recharge(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM);
        } else {
            getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
            getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));

        }
    }//GEN-LAST:event_clickSendMouseClicked

    private void backToMobileRechargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMobileRechargeMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
        processtingLoderDialog.setVisible(true);
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {

                closeUssdSession();
                return null;
            }

            @Override
            protected void done() {
                processtingLoderDialog.setVisible(false);
            }

        };
        swingWorker.execute();


    }//GEN-LAST:event_backToMobileRechargeMouseClicked

    private void clickUssdSessionCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdSessionCloseActionPerformed
        processtingLoderDialog.setVisible(true);
        clickUssdSessionClose.setEnabled(false);
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {

                closeUssdSession();
                return null;
            }

            @Override
            protected void done() {
                processtingLoderDialog.setVisible(false);
                clickUssdSessionClose.setEnabled(true);
            }

        };
        swingWorker.execute();


    }//GEN-LAST:event_clickUssdSessionCloseActionPerformed

    private void clickUssdDailDorSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailDorSend1ActionPerformed
        clickUssdDailDorSend1.setEnabled(false);
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {

                if (getUssdCode.getText().equals("")) {
                    getUssdCode.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                } else {
                    processtingLoderDialog.setVisible(true);
                    ussdDial();
                    getUssdCode.setText("");
                }
                return null;
            }

            @Override
            protected void done() {
                getUssdCode.requestFocusInWindow();
                processtingLoderDialog.setVisible(false);
                clickUssdDailDorSend1.setEnabled(true);
            }

        };
        swingWorker.execute();


    }//GEN-LAST:event_clickUssdDailDorSend1ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_backMouseClicked

    private void clickNewContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickNewContractActionPerformed
        switchPanelViaMenu(addNewContractPanel);
        getSeletedStorage.removeAllItems();
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            getSeletedStorage.addItem(simOperatorIdentifierDto.getOperatorName().toUpperCase());

        }
        getSeletedStorage.addItem("MEMORY");
        getSeletedStorage.addItem("CLOUD");

        getNameForContract.setText("");
        getPhoneNOForContract.setText("");

        activeKeyPressWorkInNewContractSave();

    }//GEN-LAST:event_clickNewContractActionPerformed

    private void backToUssdManengementPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToUssdManengementPanelMouseClicked
        switchPanelViaMenu(rechargeSettingsPanel);
    }//GEN-LAST:event_backToUssdManengementPanelMouseClicked

    private void clickAddContract1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContract1ActionPerformed

        String rechargeUssdPartern = getRechargeUssdParternPrePaid.getText();
        String operatorName = dropdownOperatorName.getSelectedItem().toString();

        String actionFor = getSeletedAction.getSelectedItem().toString();
        String balenceUssdPartern = getBalenceUssdPartern1.getText();
        if (!rechargeUssdPartern.equals("")
                && !operatorName.equals("")) {

            if (saveToDbCommandInCommand()) {
                System.out.println("Adding Successfull");
            }
        } else {
            Popup.error("Empty Field");
        }
    }//GEN-LAST:event_clickAddContract1ActionPerformed

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
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                processtingLoderDialog.setVisible(true);
                saveContract();
                return null;
            }

            @Override
            protected void done() {
                switchPanelViaMenu(contractListPanel);
                setContractListInJTable();
                processtingLoderDialog.setVisible(false);
            }

        };
        swingWorker.execute();

    }//GEN-LAST:event_clickAddContractActionPerformed

    private void backToUssdManengementPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToUssdManengementPanel1MouseClicked
        switchPanelViaSettings(rechargeSettingsPanel, rechargeSettings);
    }//GEN-LAST:event_backToUssdManengementPanel1MouseClicked

    private void clickAddContract2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContract2ActionPerformed
        String rechargeUssdPartern = getRechargeUssdParternPrePaid1.getText();
        String operatorName = getOparetorNameInDropDown.getSelectedItem().toString();
        String othersCode = getRechargeUssdParternSkitto.getText();
        String balenceUssdPartern = getprofitIn1k.getText();
        String profit = getprofitIn1k.getText();

        if (!rechargeUssdPartern.equals("")
                && !operatorName.equals("")
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
        errorMgsInBalencePanel.setText("Processing...");
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {

                addBalenceInBalenceShowTable();
                return null;
            }

            @Override
            protected void done() {

            }

        };
        swingWorker.execute();

    }//GEN-LAST:event_clickRefrashActionPerformed

    private void getMobileNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getMobileNumberFocusGained
        removePlaceHolder(getMobileNumber, "Mobile Number");
    }//GEN-LAST:event_getMobileNumberFocusGained

    private void getMobileNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getMobileNumberFocusLost
        setPlaceHolder(getMobileNumber, "Mobile Number");
    }//GEN-LAST:event_getMobileNumberFocusLost

    private void getAmmountInTkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getAmmountInTkFocusGained
        removePlaceHolder(getAmmountInTk, "Ammount");
    }//GEN-LAST:event_getAmmountInTkFocusGained

    private void getAmmountInTkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getAmmountInTkFocusLost
        setPlaceHolder(getAmmountInTk, "Ammount");
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
        exportDatabase();
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

        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                processtingLoderDialog.setVisible(true);
                saveSIMOffer();
                return null;
            }

            @Override
            protected void done() {
                processtingLoderDialog.setVisible(false);
                getOfferNameInSeting.setText("");
                getRechargeAmmountInSeetings.setText("");
                getValidityInSetting.setText("");
                getDescriptionInSetting.setText("");
                System.err.println("Added @Done...");
            }

        };
        swingWorker.execute();
    }//GEN-LAST:event_saveNewOfferInSettringsActionPerformed

    private void backToMobileRecharge1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMobileRecharge1MouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_backToMobileRecharge1MouseClicked

    private void sendAllRechargeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAllRechargeButActionPerformed
        sendingLogLabel.setVisible(true);
        sendAllRechargeBut.setFocusable(false);
        int res = Popup.customWarning("Be carefull\n Can't cencel it");
        if (res == 0) {
            sendGroupRecharge();
        } else {
            sendingLogLabel.setVisible(false);
            sendAllRechargeBut.setFocusable(true);
        }
    }//GEN-LAST:event_sendAllRechargeButActionPerformed

    private void addButInGroupRechargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButInGroupRechargeActionPerformed
        if (getPhoneNumberInGroupRecharge.getText().equals("") && getAmountGroupRecharge.getText().equals("")) {
            Popup.customError("Empty field found..");
        } else {
            SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    addInGroupRechargeTable();
                    return null;
                }

                @Override
                protected void done() {
                    processtingLoderDialog.setVisible(false);
                    loadDataInGroupRechargeTable();
                    getPhoneNumberInGroupRecharge.setText("");
                    getAmountGroupRecharge.setText("");
                    getPhoneNumberInGroupRecharge.requestFocusInWindow();
                    System.err.println("Number Add In Recharge List @Done...");
                }

            };
            swingWorker.execute();

        }
    }//GEN-LAST:event_addButInGroupRechargeActionPerformed

    private void clickEditInProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickEditInProfileMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("/resources/images/edit_color.png"));
        clickEditInProfile.setIcon(image);
    }//GEN-LAST:event_clickEditInProfileMouseEntered

    private void clickEditInProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickEditInProfileMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("/resources/images/edit.png"));
        clickEditInProfile.setIcon(image);
    }//GEN-LAST:event_clickEditInProfileMouseExited

    private void clickExportDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickExportDatabaseActionPerformed
        exportDatabase();
    }//GEN-LAST:event_clickExportDatabaseActionPerformed

    private void getEmployeeNameTEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEmployeeNameTEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getEmployeeNameTEmployeeActionPerformed

    private void clickContactList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactList1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clickContactList1MouseClicked

    private void clickContactList1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactList1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clickContactList1MouseEntered

    private void getServiceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getServiceNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getServiceNameActionPerformed

    private void getOperationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOperationTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getOperationTypeActionPerformed

    private void getSelectedServiceComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSelectedServiceComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSelectedServiceComboActionPerformed

    private void getUssdCodePattrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUssdCodePattrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getUssdCodePattrenActionPerformed

    private void clickSaveInMobileRechatgeSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSaveInMobileRechatgeSettingActionPerformed
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                processtingLoderDialog.setVisible(true);
                saveInMobileBanking();
                return null;
            }

            @Override
            protected void done() {
                processtingLoderDialog.setVisible(false);
                getTaskNameInMBS.setText("");
                getUssdCodePattren.setText("");
                getPIN.setText("");
                getUssdCodeForBalanceShowPattren.setText("");
                loadTableMobileBankingSettingFromDb();
                getSelectedServiceCombo.requestFocusInWindow();
                System.err.println("Mobile Banking Service Added in List @Done...");
            }

        };
        swingWorker.execute();


    }//GEN-LAST:event_clickSaveInMobileRechatgeSettingActionPerformed

    private void getServiceNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getServiceNameItemStateChanged

        Connection conn = DbConnection.connect();
        Set<String> taskNames = new HashSet<>();
        try {
            getOperationType.removeAllItems();

            Statement st = conn.createStatement();
            String sql = "SELECT * FROM `mobile_banking` WHERE `services_name`=\"" + evt.getItem().toString() + "\"";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                taskNames.add(rs.getString("task_name"));

                System.err.println(rs.getString("task_name"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect(conn);

        }

        for (String taskName : taskNames) {
            getOperationType.addItem(taskName);
        }

    }//GEN-LAST:event_getServiceNameItemStateChanged

    private void clickSandInMBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSandInMBMouseClicked

        if (mobileBankingPanelValidation()) {
            showMobileBankingConfirmationDialog();
        } else {
            Popup.customError("Any field is empty!!");
        }
    }//GEN-LAST:event_clickSandInMBMouseClicked

    private void getOperationTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getOperationTypeItemStateChanged
        Connection conn = DbConnection.connect();
        try {         
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM `mobile_banking` WHERE `services_name`=\"" + getServiceName.getSelectedItem().toString() + "\"";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (evt.getItem().equals(rs.getString("task_name"))) {
                    getSimOperatorName.setSelectedItem(rs.getString("default_sim"));
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect(conn);

        }
    }//GEN-LAST:event_getOperationTypeItemStateChanged

    private void getSimOperatorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSimOperatorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSimOperatorNameActionPerformed

    private void getPhoneNumberInBillPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPhoneNumberInBillPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPhoneNumberInBillPaymentActionPerformed

    private void getMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getMobileNumberActionPerformed

    private void clickBillPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBillPaymentMouseExited
        hoverRemoveInBillPayPanel(hoverViewrocket);
    }//GEN-LAST:event_clickBillPaymentMouseExited

    private void clickBillPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBillPaymentMouseEntered
        hoverInBillPayPanel(hoverViewrocket);
    }//GEN-LAST:event_clickBillPaymentMouseEntered

    private void clickBillPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBillPaymentMouseClicked
        switchBillPaymentDetailsPaenl(billPaymentPanelInBillPay);
        loadInBillPaymentDetailsByBillNo();
    }//GEN-LAST:event_clickBillPaymentMouseClicked

    private void clickMobileBankingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMobileBankingMouseExited
        hoverRemoveInBillPayPanel(hoverViewbKash);
    }//GEN-LAST:event_clickMobileBankingMouseExited

    private void clickMobileBankingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMobileBankingMouseEntered
        hoverInBillPayPanel(hoverViewbKash);
    }//GEN-LAST:event_clickMobileBankingMouseEntered

    private void clickMobileBankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMobileBankingMouseClicked
        switchBillPaymentDetailsPaenl(addMobileBankingPanelInBillPay);
        Connection conn = DbConnection.connect();
        Set<String> serviceNames = new HashSet<>();
        try {
            serviceNames.clear();

            Statement st = conn.createStatement();
            String sql = "SELECT * FROM `mobile_banking`";
            ResultSet rs = st.executeQuery(sql);
            serviceNames.clear();
            while (rs.next()) {
                serviceNames.add(rs.getString("services_name"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            DbConnection.disconnect(conn);
        }
        getServiceName.removeAllItems();

        getServiceName.addItem("------ Select Service -------");
        for (String serviceName : serviceNames) {

            getServiceName.addItem(serviceName);
        }
        getSimOperatorName.removeAllItems();
        for (String simName : SIM_OPERATORS_NAME) {
            getSimOperatorName.addItem(simName);
        }
        loadMobileBankingBalance();
        loadMobileBankingDetailsTable();

        addKeyListenerAndHoverInMobileBankingPanel();
    }//GEN-LAST:event_clickMobileBankingMouseClicked

    private void clickContactList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactList2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clickContactList2MouseClicked

    private void clickContactList2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactList2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clickContactList2MouseEntered

    private void getSimNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getSimNameItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_getSimNameItemStateChanged

    private void getSimNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSimNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSimNameActionPerformed

    private void getServiceTypeInBillPayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getServiceTypeInBillPayItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_getServiceTypeInBillPayItemStateChanged

    private void getServiceTypeInBillPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getServiceTypeInBillPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getServiceTypeInBillPayActionPerformed

    private void clickRefrash2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickRefrash2ActionPerformed
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                loaderInBillPayment.setText("Processing..");
                loadBalanceINBillPaymentPanel();
                return null;
            }

            @Override
            protected void done() {
                processtingLoderDialog.setVisible(false);
                loaderInBillPayment.setText("Last Updateed: " + Configaration.getCurrentDateAndTime());
                System.err.println("Mobile Banking Service Added in List @Done...");
            }

        };
        swingWorker.execute();


    }//GEN-LAST:event_clickRefrash2ActionPerformed

    private void clickTabUsingBillNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickTabUsingBillNOActionPerformed
        switchPanelInBillPayment(usingBillNoPanel);
        loadInBillPaymentDetailsByBillNo();


    }//GEN-LAST:event_clickTabUsingBillNOActionPerformed

    private void clickTabUsingCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickTabUsingCustomerIdActionPerformed
        switchPanelInBillPayment(UsingCustomerId);
        loadInBillPaymentDetailsByCustomerId();

    }//GEN-LAST:event_clickTabUsingCustomerIdActionPerformed

    private void payInUsingCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInUsingCustomerIdActionPerformed

        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                processtingLoderDialog.setVisible(true);
                payBillByCustomerId();

                return null;
            }

            @Override
            protected void done() {
                resetBillByCustomerId();
                processtingLoderDialog.setVisible(false);
                System.out.println("Fatching Successful...");
            }

        };
        swingWorker.execute();


    }//GEN-LAST:event_payInUsingCustomerIdActionPerformed

    private void clickPayIUsingBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickPayIUsingBillActionPerformed

        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                processtingLoderDialog.setVisible(true);
                payBillByBillNo();

                return null;
            }

            @Override
            protected void done() {
                resetBillByCustomerId();
                processtingLoderDialog.setVisible(false);
                System.out.println("Fatching Successful...");
            }

        };
        swingWorker.execute();

    }//GEN-LAST:event_clickPayIUsingBillActionPerformed

    private void clickResetPayInUsingBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickResetPayInUsingBillActionPerformed
        resetBillByBillNo();
    }//GEN-LAST:event_clickResetPayInUsingBillActionPerformed

    private void resetnUsingCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetnUsingCustomerIdActionPerformed
        resetBillByCustomerId();
    }//GEN-LAST:event_resetnUsingCustomerIdActionPerformed

    private void tableRechargeDetailsShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRechargeDetailsShowMouseClicked
        String mgs, userId, phoneNumberText;
        Point point = evt.getPoint();
        int column = tableRechargeDetailsShow.columnAtPoint(point);
        int row = tableRechargeDetailsShow.rowAtPoint(point);
        mgs = tableRechargeDetailsShow.getValueAt(row, 7).toString();
        userId = tableRechargeDetailsShow.getValueAt(row, 0).toString();
        phoneNumberText = tableRechargeDetailsShow.getValueAt(row, 3).toString();
        MessageDialogShowUI ui = new MessageDialogShowUI(mgs, phoneNumberText);

        JDialog mgsDialog = new JDialog();
        mgsDialog.add(ui);
        mgsDialog.setSize(352, 254);
        mgsDialog.setLocationRelativeTo(null);
        mgsDialog.setUndecorated(true);
        mgsDialog.setVisible(true);

        ui.getClickOk().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mgsDialog.dispose();
            }

        });

        ui.getClickCross().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                mgsDialog.dispose();
            }

        });
        ui.getClickRetry().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                deleteColumeFromRechargeDetails(userId);
                mgsDialog.setVisible(false);
            }

        });
        ui.getClickOk().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    mgsDialog.dispose();
                }
            }
        });
    }//GEN-LAST:event_tableRechargeDetailsShowMouseClicked

    private void tableMobileBankingSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMobileBankingSettingMouseClicked
        String userId;
        Point point = evt.getPoint();

        int row = tableMobileBankingSetting.rowAtPoint(point);
        userId = tableMobileBankingSetting.getValueAt(row, 0).toString();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to remove this?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            if (UserInfo.role.equals("admin")) {
                SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        processtingLoderDialog.setVisible(true);
                        deleteServiceDetailsFromMobileBanking(userId);

                        return null;
                    }

                    @Override
                    protected void done() {
                        loadTableMobileBankingSettingFromDb();
                        processtingLoderDialog.setVisible(false);
                        System.out.println("Delete Successful...@Done");
                    }

                };
                swingWorker.execute();

            } else {
                Popup.customError("Permission Deny");
            }
        } else {

        }

    }//GEN-LAST:event_tableMobileBankingSettingMouseClicked

    private void getUssdCodeForBalanceShowPattrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUssdCodeForBalanceShowPattrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getUssdCodeForBalanceShowPattrenActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        getTaskNameInMBS.setText("");
        getUssdCodePattren.setText("");
        getPIN.setText("");
        getUssdCodeForBalanceShowPattren.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void getPhoneNumberInBillPaymentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getPhoneNumberInBillPaymentFocusGained
        removePlaceHolder(getPhoneNumberInBillPayment, "Mobile Number");
    }//GEN-LAST:event_getPhoneNumberInBillPaymentFocusGained

    private void getPhoneNumberInBillPaymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getPhoneNumberInBillPaymentFocusLost
        setPlaceHolder(getPhoneNumberInBillPayment, "Mobile Number");
    }//GEN-LAST:event_getPhoneNumberInBillPaymentFocusLost

    private void getAmmountInBillPaymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getAmmountInBillPaymentFocusLost
        setPlaceHolder(getAmmountInBillPayment, "Amount");
    }//GEN-LAST:event_getAmmountInBillPaymentFocusLost

    private void getAmmountInBillPaymentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getAmmountInBillPaymentFocusGained
        removePlaceHolder(getAmmountInBillPayment, "Amount");
    }//GEN-LAST:event_getAmmountInBillPaymentFocusGained

    private void mobileBankingBalanceShowPanelListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileBankingBalanceShowPanelListMouseClicked
        JList list = (JList) evt.getSource();
        MobileBankingBalanceShowCard mobileBankingBalanceShowCard = (MobileBankingBalanceShowCard) list.getModel().getElementAt(list.locationToIndex(evt.getPoint()));

        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                processtingLoderDialog.setVisible(true);
                String amount = getMobileBankingBalance(evt, mobileBankingBalanceShowCard.getServiceNameText().getText());
                if (amount.equals("16247")) {
                    Popup.customError("Duplicate Request");
                } else {
                    mobileBankingBalanceShowCard.getAmountBalanceText().setText(amount + " Tk");
                    mobileBankingBalanceShowCard.getLastUpdateTimeText().setText("Last update :" + Configaration.getCurrentDateAndTime());
                }
                return null;
            }

            @Override
            protected void done() {
                processtingLoderDialog.setVisible(false);
                System.out.println("Delete Successful...@Done");
            }

        };
        swingWorker.execute();

        // System.out.println("index: " + );
    }//GEN-LAST:event_mobileBankingBalanceShowPanelListMouseClicked

    private void tableMobileBankingDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMobileBankingDetailsMouseClicked
        String mgs, userId, phoneNumberText, serviceName;
        Point point = evt.getPoint();
        int column = tableMobileBankingDetails.columnAtPoint(point);
        int row = tableMobileBankingDetails.rowAtPoint(point);
        mgs = tableMobileBankingDetails.getValueAt(row, 6).toString();
        userId = tableMobileBankingDetails.getValueAt(row, 0).toString();
        phoneNumberText = tableMobileBankingDetails.getValueAt(row, 3).toString();
        serviceName = tableMobileBankingDetails.getValueAt(row, 1).toString();
        MessageDialogShowUI ui = new MessageDialogShowUI(mgs, serviceName + "-" + phoneNumberText);

        JDialog mgsDialog = new JDialog();
        mgsDialog.add(ui);
        mgsDialog.setSize(352, 254);
        mgsDialog.setLocationRelativeTo(null);
        mgsDialog.setUndecorated(true);
        mgsDialog.setVisible(true);

        ui.getClickOk().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mgsDialog.dispose();
            }

        });

        ui.getClickCross().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                mgsDialog.dispose();
            }

        });
        ui.getClickRetry().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                deleteColumeFromMobileBanking(userId);
                mgsDialog.setVisible(false);
            }

        });
        ui.getClickOk().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    mgsDialog.dispose();
                }
            }
        });

        // TODO add your handling code here:
    }//GEN-LAST:event_tableMobileBankingDetailsMouseClicked

    private void tableBillPaymentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBillPaymentDetailsMouseClicked
        String mgs = null, userId = "fdg", phoneNumberText = null;
        Point point = evt.getPoint();
        int numberOfColume = tableBillPaymentDetails.getColumnCount();
        if (numberOfColume == 6) {
            int column = tableBillPaymentDetails.columnAtPoint(point);
            int row = tableBillPaymentDetails.rowAtPoint(point);
            mgs = tableBillPaymentDetails.getValueAt(row, 5).toString();
            userId = tableBillPaymentDetails.getValueAt(row, 0).toString();
            phoneNumberText = tableBillPaymentDetails.getValueAt(row, 3).toString();
        } else if (numberOfColume == 8) {
            int column = tableBillPaymentDetails.columnAtPoint(point);
            int row = tableBillPaymentDetails.rowAtPoint(point);
            mgs = tableBillPaymentDetails.getValueAt(row, 7).toString();
            userId = tableBillPaymentDetails.getValueAt(row, 0).toString();
            phoneNumberText = tableBillPaymentDetails.getValueAt(row, 3).toString();

        }
        MessageDialogShowUI ui = new MessageDialogShowUI(mgs, phoneNumberText);
        JDialog mgsDialog = new JDialog();
        mgsDialog.add(ui);
        mgsDialog.setSize(352, 254);
        mgsDialog.setLocationRelativeTo(null);
        mgsDialog.setUndecorated(true);
        mgsDialog.setVisible(true);

        ui.getClickOk().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mgsDialog.dispose();
            }

        });

        ui.getClickCross().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                mgsDialog.dispose();
            }

        });
        ui.getClickRetry().setVisible(false);
        ui.getClickOk().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    mgsDialog.dispose();
                }
            }
        });

    }//GEN-LAST:event_tableBillPaymentDetailsMouseClicked

    private void subItemsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemsComboBoxActionPerformed
        String selectedItem = subItemsComboBox.getSelectedItem().toString();
        switch (selectedItem) {
            case "By Bill no":
                loadBillPaymentByBillNoDetailsInDetailsTable();
                break;
            case "By Customer id":
                loadBillPaymentByCostumerIdDetailsInDetails();
                break;
            case "BANGLALINK":
                loadInboxDetailsInDetailsTable();
                break;
            case "GP":
                loadInboxDetailsInDetailsTable();
                break;
            case "ROBI":
                loadInboxDetailsInDetailsTable();
                break;
            case "AIRTEL":
                loadInboxDetailsInDetailsTable();
                break;
            case "TELETALK":
                loadInboxDetailsInDetailsTable();
                break;
            default:
                Popup.customWarning("Selection not match.");
                break;

        }
    }//GEN-LAST:event_subItemsComboBoxActionPerformed

    private void tableForDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableForDetailsMouseClicked
        String mgs = null, userId = "fdg";
        Point point = evt.getPoint();
        int numberOfColume = tableForDetails.getColumnCount();
        if (numberOfColume == 6) {
            int column = tableForDetails.columnAtPoint(point);
            int row = tableForDetails.rowAtPoint(point);
            mgs = tableForDetails.getValueAt(row, 5).toString();
            userId = tableForDetails.getValueAt(row, 0).toString();
        } else if (numberOfColume == 8) {
            int column = tableForDetails.columnAtPoint(point);
            int row = tableForDetails.rowAtPoint(point);
            mgs = tableForDetails.getValueAt(row, 7).toString();
            userId = tableForDetails.getValueAt(row, 0).toString();
        } else if (numberOfColume == 4) {
            int column = tableForDetails.columnAtPoint(point);
            int row = tableForDetails.rowAtPoint(point);
            mgs = tableForDetails.getValueAt(row, 3).toString();
            userId = tableForDetails.getValueAt(row, 0).toString();
        }
        setMgsDetails.setText("Id: " + userId + "\nMessage\n" + mgs);
    }//GEN-LAST:event_tableForDetailsMouseClicked

    private void clickImportDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickImportDatabaseActionPerformed
        importDatabase();
    }//GEN-LAST:event_clickImportDatabaseActionPerformed

    private void clickUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUpdatePasswordActionPerformed
        String password = passwordForUpdate.getText();
        String rePassword = rePasswordForUpdate.getText();
        if (password.equals("") || rePassword.equals("")) {
            Popup.customError("Empty field found.");

        } else {
            if (password.equals(rePassword)) {
                changeAdminPassword(AES.encrypt(password, Configaration.getPropertiesValueByKey("secretKey")));

            } else {
                Popup.customError("Re-type password not match");
            }
        }


    }//GEN-LAST:event_clickUpdatePasswordActionPerformed

    private void clickInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickInboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clickInboxActionPerformed

    private void getSeletedActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSeletedActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSeletedActionActionPerformed

    private void deleteColumeFromMobileBanking(String userId) {
        if (UserInfo.role.equals("admin")) {    
            DbConnection.deleteRow("m_b_details", "TnxId", userId);        
            loadMobileBankingDetailsTable();
        } else {
            Popup.customError("Access Deny..");
        }

    }

    private String getMobileBankingBalance(MouseEvent evt, String serviceName) {

        String amount = "XX";
        Connection conn = DbConnection.connect();
        Set<MobileBankingBalanceShowDto> bankingBalanceShowDtos = new HashSet<>();
        List<String> ussdCodeSerialList = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM `mobile_banking`";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                MobileBankingBalanceShowDto mobileBankingBalanceShowDto = new MobileBankingBalanceShowDto();
                mobileBankingBalanceShowDto.setServiceId(rs.getString("serviceId"));
                mobileBankingBalanceShowDto.setServiceName(rs.getString("services_name"));
                mobileBankingBalanceShowDto.setDefaultSIM(rs.getString("default_sim"));
                mobileBankingBalanceShowDto.setUssdCode(rs.getString("balance_show_ussd").replaceAll("pin", rs.getString("pin")));
                mobileBankingBalanceShowDto.setPin(rs.getString("pin"));
                bankingBalanceShowDtos.add(mobileBankingBalanceShowDto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JListPanelRenderer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect(conn);
        }
        

        for (MobileBankingBalanceShowDto mobileBankingBalanceShowDto : bankingBalanceShowDtos) {

            if (mobileBankingBalanceShowDto.getServiceName().toLowerCase().equals(serviceName.toLowerCase())) {

                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(mobileBankingBalanceShowDto.getUssdCode());
                ussdCodeSerialList.clear();
                while (m.find()) {

                    ussdCodeSerialList.add(m.group());
                }
                String feedBackMgs = sendSerialUSSDCode(ussdCodeSerialList, mobileBankingBalanceShowDto.getDefaultSIM());

                amount = Configaration.stringToNumberList(Configaration.haxToStringConvert(feedBackMgs)).get(0);
                System.err.println("Amount: " + amount);

            }
        }
        return amount;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MobileBankingSettingsPanel;
    private javax.swing.JPanel UsingCustomerId;
    private javax.swing.JPasswordField accountPassword;
    private javax.swing.JPasswordField accountPassword1;
    private javax.swing.JLabel activeDateInProfile;
    private javax.swing.JLabel activePackageNameInProfile;
    private javax.swing.JButton addButInGroupRecharge;
    private javax.swing.JPanel addMobileBankingPanelInBillPay;
    private javax.swing.JPanel addNewContractPanel;
    private javax.swing.JPanel addNewManagementPanel;
    private javax.swing.JPanel addNewManagementPanelSettings;
    private javax.swing.JPanel adsPanel;
    private javax.swing.JLabel alartMessageText;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back43;
    private javax.swing.JLabel backToMobileRecharge;
    private javax.swing.JLabel backToMobileRecharge1;
    private javax.swing.JLabel backToUssdManengementPanel;
    private javax.swing.JLabel backToUssdManengementPanel1;
    private javax.swing.JPanel baseBillPayment;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel billPayPanel;
    private javax.swing.JPanel billPaymentPanelInBillPay;
    private javax.swing.JPanel billPaymentTab;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton clickAddContract;
    private javax.swing.JButton clickAddContract1;
    private javax.swing.JButton clickAddContract2;
    private javax.swing.JButton clickAddNewManagement;
    private javax.swing.JLabel clickBillPayment;
    private javax.swing.JButton clickChooseIcon;
    private javax.swing.JButton clickChooseIcon1;
    private javax.swing.JLabel clickContactList;
    private javax.swing.JLabel clickContactList1;
    private javax.swing.JLabel clickContactList2;
    private javax.swing.JLabel clickEditInProfile;
    private javax.swing.JButton clickExportDatabase;
    private javax.swing.JButton clickGroupLoad;
    private javax.swing.JButton clickImportDatabase;
    private javax.swing.JButton clickInbox;
    private javax.swing.JLabel clickMobileBanking;
    private javax.swing.JButton clickNewContract;
    private javax.swing.JButton clickPayIUsingBill;
    private javax.swing.JButton clickRefrash;
    private javax.swing.JButton clickRefrash2;
    private javax.swing.JButton clickResetBut;
    private javax.swing.JButton clickResetPayInUsingBill;
    private javax.swing.JButton clickSIMOffer1;
    private javax.swing.JLabel clickSandInMB;
    private javax.swing.JButton clickSaveInMobileRechatgeSetting;
    private javax.swing.JButton clickSearchedByPhoneNoBut;
    private javax.swing.JButton clickSearchedReportDownload;
    private javax.swing.JButton clickSearchedfromToBut;
    private javax.swing.JLabel clickSend;
    private javax.swing.JLabel clickSerch1;
    private javax.swing.JButton clickTabUsingBillNO;
    private javax.swing.JButton clickTabUsingCustomerId;
    private javax.swing.JButton clickUpdatePassword;
    private javax.swing.JButton clickUssdDail;
    private javax.swing.JButton clickUssdDailDorSend1;
    private javax.swing.JButton clickUssdSessionClose;
    private javax.swing.JLabel companyNameInProfilePanel;
    private javax.swing.JPanel contractListPanel;
    private javax.swing.JLabel currentNetworkName;
    private javax.swing.JLabel designationInProfilePanel1;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel detailsPanelInBillPay;
    private javax.swing.JPanel detailsTab;
    private javax.swing.JComboBox<String> dropdownOperatorName;
    private javax.swing.JLabel errorMgsInBalencePanel;
    private javax.swing.JLabel expiryDateInProfile;
    private com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JTextField getAmmountInBillPayment;
    private javax.swing.JTextField getAmmountInTk;
    private javax.swing.JTextField getAmountGroupRecharge;
    private javax.swing.JLabel getBalanceInBillPayment;
    private javax.swing.JTextField getBalenceUssdPartern1;
    private javax.swing.JTextField getBalenceUssdPartern3;
    private javax.swing.JTextField getBillNO;
    private javax.swing.JTextField getCustomerId;
    private javax.swing.JTextField getDescriptionInSetting;
    private javax.swing.JTextField getEmployeeNameTEmployee;
    private javax.swing.JTextField getEmployeePasswordTEmployee;
    private javax.swing.JTextField getEmployeePhoneNUmberTEmployee;
    private javax.swing.JTextField getMobileNumber;
    private javax.swing.JComboBox<String> getMonthNo;
    private javax.swing.JTextField getNameForContract;
    private javax.swing.JTextField getNameForSearch;
    private javax.swing.JTextField getOfferNameInSeting;
    private javax.swing.JComboBox<String> getOparetorNameInDropDown;
    private javax.swing.JComboBox<String> getOperationType;
    private javax.swing.JTextField getOperatorName;
    private javax.swing.JTextField getOperatorName1;
    private javax.swing.JPasswordField getPIN;
    private javax.swing.JPasswordField getPassword;
    private javax.swing.JPasswordField getPasswordInBillPay;
    private javax.swing.JTextField getPasswordTEmployee;
    private javax.swing.JTextField getPhoneNOForContract;
    private javax.swing.JTextField getPhoneNoForSearch;
    private javax.swing.JTextField getPhoneNumberInBillPayment;
    private javax.swing.JTextField getPhoneNumberInGroupRecharge;
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
    private javax.swing.JComboBox<String> getSelectedSimInGroupRecharge1;
    private javax.swing.JComboBox<String> getSelectedTypeGroupRecharge;
    private javax.swing.JComboBox<String> getSelectedValidityTimeTypeSetting;
    private javax.swing.JComboBox<String> getSeletedAction;
    private javax.swing.JComboBox<String> getSeletedOperatorName;
    private javax.swing.JComboBox<String> getSeletedStorage;
    private javax.swing.JComboBox<String> getServiceName;
    private javax.swing.JComboBox<String> getServiceTypeInBillPay;
    private javax.swing.JComboBox<String> getSimName;
    private javax.swing.JComboBox<String> getSimOperatorName;
    private javax.swing.JTextField getTaskNameInMBS;
    private javax.swing.JTextField getUssdCode;
    private javax.swing.JTextField getUssdCodeForBalanceShowPattren;
    private javax.swing.JTextField getUssdCodePattren;
    private javax.swing.JTextField getValidityInSetting;
    private javax.swing.JTextField getprofitIn1k;
    private javax.swing.JComboBox<String> getyear;
    private javax.swing.JPanel groupLoadPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel helplinePanel;
    private javax.swing.JPanel helplineTab;
    private javax.swing.JPanel hoverViewbKash;
    private javax.swing.JPanel hoverViewrocket;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
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
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelUssdPatternSkitto;
    private javax.swing.JLabel loaderInBillPayment;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JList<String> mobileBankingBalanceShowPanelList;
    private javax.swing.JLabel mobileBankingSettings;
    private javax.swing.JPanel mobileRechargePanel;
    private javax.swing.JPanel mobileRechargeTab;
    private javax.swing.JLabel myProfile;
    private javax.swing.JPanel myProfilePanel;
    private javax.swing.JLabel nameInProfilePanel1;
    private javax.swing.JPanel netBarPanel;
    private javax.swing.JLabel passwordChange;
    private javax.swing.JPanel passwordChangePanel;
    private javax.swing.JTextField passwordForUpdate;
    private javax.swing.JButton payInUsingCustomerId;
    private javax.swing.JPopupMenu popupForSuggestManu;
    private javax.swing.JLabel processingTextInMobileBanking;
    private javax.swing.JLabel profile_pic;
    private javax.swing.JTextField rePasswordForUpdate;
    private javax.swing.JPanel rechargeBalencePanel;
    private javax.swing.JPanel rechargeBalencePanel1;
    private javax.swing.JPanel rechargeBalencePanel2;
    private javax.swing.JPanel rechargeOfferPanel;
    private javax.swing.JLabel rechargeOffers;
    private javax.swing.JLabel rechargeSettings;
    private javax.swing.JPanel rechargeSettingsPanel;
    private javax.swing.JLabel remainDaysInProfile;
    private javax.swing.JPanel resellerPanel;
    private javax.swing.JButton resetnUsingCustomerId;
    private javax.swing.JButton saveNewOfferInSettrings;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel selectedSimOperatorIcon;
    private javax.swing.JLabel selectedSimOperatorIcon1;
    private javax.swing.JLabel selectedSimOperatorIcon2;
    private javax.swing.JButton sendAllRechargeBut;
    private javax.swing.JLabel sendingLogLabel;
    private javax.swing.JPanel serchBar;
    private javax.swing.JTextArea setMgsDetails;
    private javax.swing.JTextArea setResponseShowFromUssd;
    private javax.swing.JPanel settingBasePanel;
    private javax.swing.JPanel settingTab;
    private javax.swing.JPanel settingsPanel1;
    private javax.swing.JComboBox<String> subItemsComboBox;
    private javax.swing.JList<String> suggList;
    private javax.swing.JPanel suggestPanel;
    private javax.swing.JLabel systemBackup;
    private javax.swing.JPanel systemBackupPanel;
    private javax.swing.JTable tableBillPaymentDetails;
    private javax.swing.JTable tableContractLIst;
    private javax.swing.JTable tableForDetails;
    private javax.swing.JTable tableGroupRecharge;
    private javax.swing.JTable tableMobileBankingDetails;
    private javax.swing.JTable tableMobileBankingSetting;
    private javax.swing.JTable tableRechargeDetailsShow;
    private javax.swing.JTable tableShowSimBalence;
    private javax.swing.JTable tableTrustedEmployees;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private com.toedter.calendar.JDateChooser toDateChooser;
    private javax.swing.JLabel trustedEmployee;
    private javax.swing.JPanel trustedEmployeePanel;
    private javax.swing.JLabel userIdInProfile;
    private javax.swing.JPanel usingBillNoPanel;
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
        Color color = new Color(255, 255, 255);
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
    private void recharge(String phoneNumberRequested, String ammountRequested, String preOrPostRequested, String selectedPayableSIM) {
        Connection conn = DbConnection.connect();
        try {
            DbConnection.connect();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM `recharge_offers` WHERE `recharge_amt`=\"" + ammountRequested + "\"";
            ResultSet rs = st.executeQuery(sql);

            if (!rs.next()) {
                Log.mgs("Test:", "2");
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

                    refrash();
                    SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            jDialog.setVisible(false);
                            getMobileNumber.requestFocusInWindow();
                            Log.mgs("Requested SIM Card: ", selectedPayableSIM);
                            MobileRechargeDetailsDto mobileRechargeDetailsDto = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");

                            addQueue(mobileRechargeDetailsDto);
                            // rechargeDoneProcess(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");

                            return null;
                        }

                        @Override
                        protected void done() {
                            //  refrash();
                            // loadValueInTableRechargeDetails();

                        }

                    };
                    worker.execute();

                });

                ui.getClickConfirm().addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent ke) {
                        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                            refrash();
                            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                                @Override
                                protected Void doInBackground() throws Exception {
                                    jDialog.setVisible(false);
                                    getMobileNumber.requestFocusInWindow();
                                    Log.mgs("Requested SIM Card: ", selectedPayableSIM);
                                    MobileRechargeDetailsDto mobileRechargeDetailsDto = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");
                                    addQueue(mobileRechargeDetailsDto);
                                    //rechargeDoneProcess(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");

                                    return null;
                                }

                                @Override
                                protected void done() {

                                    //loadValueInTableRechargeDetails();
                                }

                            };
                            worker.execute();

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

                ui.getClickConfirm().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent me) {
                        System.err.println("press");

                    }

                    @Override
                    public void mousePressed(MouseEvent me) {
                        System.err.println("press");

                        jDialog.setVisible(false);
                    }

                });
            } else {

                do {
                    Log.mgs("Test:", "1");
                    if (rs.getString("sim_name").toUpperCase().contains(selectedPayableSIM.replaceAll(StringUtils.right(selectedPayableSIM, 5), "").replaceAll("\\(\\)", "").toUpperCase())) {
                        int res = Popup.customWarning("You will be getting " + rs.getString("description") + "/" + rs.getString("validity"));

                        if (res == -1) {
                            Log.mgs("Dialog:", "Recharge Offer dialog closed.");
                        } else {

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

                                refrash();
                                SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                                    @Override
                                    protected Void doInBackground() throws Exception {
                                        jDialog.setVisible(false);
                                        getMobileNumber.requestFocusInWindow();
                                        Log.mgs("Requested SIM Card: ", selectedPayableSIM);
                                        MobileRechargeDetailsDto mobileRechargeDetailsDto = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");
                                        addQueue(mobileRechargeDetailsDto);
                                        //rechargeDoneProcess(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");
                                        jDialog.setVisible(false);
                                        return null;
                                    }

                                    @Override
                                    protected void done() {
                                        refrash();
                                        //loadValueInTableRechargeDetails();

                                    }

                                };
                                worker.execute();

                            });

                            ui.getClickConfirm().addKeyListener(new KeyAdapter() {
                                @Override
                                public void keyPressed(KeyEvent ke) {
                                    if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                                        refrash();
                                        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                                            @Override
                                            protected Void doInBackground() throws Exception {
                                                jDialog.setVisible(false);
                                                getMobileNumber.requestFocusInWindow();
                                                Log.mgs("Requested SIM Card: ", selectedPayableSIM);
                                                MobileRechargeDetailsDto mobileRechargeDetailsDto = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");
                                                addQueue(mobileRechargeDetailsDto);

                                                return null;
                                            }

                                            @Override
                                            protected void done() {
                                                refrash();
                                                // loadValueInTableRechargeDetails();

                                            }

                                        };
                                        worker.execute();

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

                            ui.getClickConfirm().addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseReleased(MouseEvent me) {
                                    System.err.println("press");

                                }

                                @Override
                                public void mousePressed(MouseEvent me) {
                                    System.err.println("press");

                                    jDialog.setVisible(false);
                                }

                            });

                        }
                    } else {
                        int res = Popup.customWarning("You will be getting " + rs.getString("description") + "/" + rs.getString("validity"));

                        if (res == -1) {
                            Log.mgs("Dialog:", "Recharge Offer dialog closed.");
                        } else {

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
                                refrash();
                                SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                                    @Override
                                    protected Void doInBackground() throws Exception {
                                        jDialog.setVisible(false);
                                        getMobileNumber.requestFocusInWindow();
                                        Log.mgs("Requested SIM Card: ", selectedPayableSIM);
                                        MobileRechargeDetailsDto mobileRechargeDetailsDto = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");
                                        addQueue(mobileRechargeDetailsDto);

                                        // rechargeDoneProcess(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");
                                        jDialog.setVisible(false);
                                        return null;
                                    }

                                    @Override
                                    protected void done() {
                                        refrash();
                                        // loadValueInTableRechargeDetails();

                                    }

                                };
                                worker.execute();

                            });

                            ui.getClickConfirm().addKeyListener(new KeyAdapter() {
                                @Override
                                public void keyPressed(KeyEvent ke) {
                                    if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                                        refrash();
                                        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                                            @Override
                                            protected Void doInBackground() throws Exception {
                                                jDialog.setVisible(false);
                                                getMobileNumber.requestFocusInWindow();
                                                Log.mgs("Requested SIM Card: ", selectedPayableSIM);
                                                MobileRechargeDetailsDto mobileRechargeDetailsDto = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");
                                                addQueue(mobileRechargeDetailsDto);
                                                //(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "single");
                                                jDialog.setVisible(false);
                                                return null;
                                            }

                                            @Override
                                            protected void done() {
                                                refrash();

                                            }

                                        };
                                        worker.execute();

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

                            ui.getClickConfirm().addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseReleased(MouseEvent me) {
                                    System.err.println("press");

                                }

                                @Override
                                public void mousePressed(MouseEvent me) {
                                    System.err.println("press");

                                    jDialog.setVisible(false);
                                }

                            });

                        }
                    }

                } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            DbConnection.disconnect(conn);
        }
    }

    private void addQueue(MobileRechargeDetailsDto mobileRechargeDetailsDto) {

        mobileRechargeDetailsDtoQueue.add(mobileRechargeDetailsDto);
        loadValueInTableRechargeDetails();

    }

    private void processRequestFromMobileRechargeQueue() {
        // Runs outside of the Swing UI thread
        new Thread(new Runnable() {
            public void run() {

                while (true) {
                    try {
                        while (!mobileRechargeDetailsDtoQueue.isEmpty()) {

                            MobileRechargeDetailsDto headRechargeDetailsDto = mobileRechargeDetailsDtoQueue.element();
                            rechargeDoneProcess(headRechargeDetailsDto.getTrxId(), headRechargeDetailsDto.getPhoneNumber(), headRechargeDetailsDto.getAmmount(), headRechargeDetailsDto.getPostPaidOrPostPaid(), headRechargeDetailsDto.getSelectableSim(), "single");
                            
                            
                        }
                        java.lang.Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        }).start();

    }

    private void setOperatorIcon() {
        boolean isFoundExpectedSIMCard = false;

        if (getMobileNumber.getText().equals("") || getMobileNumber.getText().length() != 11 || !getMobileNumber.getText().matches("[0-9]+")) {
            getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
        } else {

            try {
                Icon icon;

                String selectedOperatorName = setPayableSIMByPhoneNumber(getMobileNumber.getText()).toUpperCase();
                Log.mgs("Selected SIM By Phone Number", selectedOperatorName);

                ResultSet rs = DbConnection.findByColume("command", "operator_name", selectedOperatorName);

                if (!rs.next()) {
                    Popup.customError("Recharge Setting not found.");
                } else {
                    do {

                        if (rs.getString("operator_name").equals(selectedOperatorName)) {

                            for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {

                                if (rs.getString("operator_name").equals(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")".toUpperCase())) {
                                    selectedSimOperatorName = rs.getString("operator_name") + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")";
                                    getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));
                                    icon = new ImageIcon(rs.getString("icon"));
                                    selectedSimOperatorIcon.setIcon(icon);
                                    getAmmountInTk.requestFocusInWindow();
                                    Log.mgs("Setted Operator Name In getSeletedOperatorName", selectedSimOperatorName);
                                    isFoundExpectedSIMCard = true;
                                }
                            }
                        }
                    } while (rs.next());
                }
                if (isFoundExpectedSIMCard == false) {
                    getAmmountInTk.requestFocusInWindow();
                    getSeletedOperatorName.setSelectedItem(selectedSimOperatorName);
                }

            } catch (SQLException ex) {
                Log.error("SQLException:", ex.getMessage());
            }
        }

    }

    private String setPayableSIMByPhoneNumber(String phoneNumberUserInput) {
        String phoneNumberUserInputSubString = StringUtils.left(phoneNumberUserInput, 3);
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            if (simOperatorIdentifierDto.getOwnPhoneNumber().contains(phoneNumberUserInputSubString)) {
                String selectedSimCardWithNumber = simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")";
                getSeletedOperatorName.setSelectedItem(selectedSimCardWithNumber);
                return selectedSimCardWithNumber;
            }
        }

        return "Expected SIM not found";
    }

    void rechargeDoneProcess(String trxId, String phoneNumberRequested, String ammountRequested, String preOrPostRequested, String selectedPayableSIM, String rechargeType) {
        mobileRechargeDetailsDtoQueue.remove();
        saveToDbCommandInRechargeAdmin(trxId,
                phoneNumberRequested,
                ammountRequested,
                preOrPostRequested,
                selectedPayableSIM,
                "Processing",
                "Processing");
        loadValueInTableRechargeDetails();
        String[] responseArray;
        String cBalance = null;
        String statusMgs = null;
        try {
            ResultSet rs = DbConnection.findByColume("command", "operator_name", selectedPayableSIM);
            while (rs.next()) {

                for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                    if (selectedPayableSIM.toUpperCase()
                            .equals(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")".toUpperCase())) {
                        auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                        if (preOrPostRequested.toLowerCase().equals("pre-paid")) {
                            String rechargeCode = rs.getString("r_ussd_code_pre").replaceAll("number", phoneNumberRequested)
                                    .replaceAll("tk", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), Configaration.getPropertiesValueByKey("secretKey")));
                            Log.mgs("5347", "USSD Code:" + rechargeCode);
                            String response = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15");
                            Configaration.closeUssdSession();
                            if (response.contains(",")) {
                                responseArray = response.split(",");
                                System.err.println();
                                statusMgs = Configaration.haxToStringConvert(responseArray[1].replaceAll("\"", ""));
                                cBalance = getCurrentBalance(selectedPayableSIM.toUpperCase());
                            } else {
                                cBalance = "Failed";
                                statusMgs = "Failed";
                                System.err.println("4672--->Ussd Request Faild");
                            }

                            Configaration.setErrorLog(this.getClass().getName() + "-->1856--->" + response);
                        } else if (preOrPostRequested.toLowerCase().equals("skitto")) {
                            String rechargeCode = rs.getString("action_for").replaceAll("number", phoneNumberRequested)
                                    .replaceAll("tk", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), Configaration.getPropertiesValueByKey("secretKey")));
                            Log.mgs("5347", "USSD Code:" + rechargeCode);
                            String response = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15");
                            Configaration.closeUssdSession();
                            if (response.contains(",")) {
                                responseArray = response.split(",");
                                System.err.println();
                                statusMgs = Configaration.haxToStringConvert(responseArray[1].replaceAll("\"", ""));
                                cBalance = getCurrentBalance(selectedPayableSIM.toUpperCase());
                            } else {
                                cBalance = "Failed";
                                statusMgs = "Failed";
                                System.err.println("4686--->Ussd Request Faild");
                            }

                            Configaration.setErrorLog(this.getClass().getName() + "-->1856--->" + response);
                        } else if (preOrPostRequested.toLowerCase().equals("post-paid")) {
                            String rechargeCode = rs.getString("r_ussd_code_post").replaceAll("number", phoneNumberRequested)
                                    .replaceAll("tk", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), Configaration.getPropertiesValueByKey("secretKey")));
                            Log.mgs("5347", "USSD Code:" + rechargeCode);
                            String response = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15");
                            Configaration.closeUssdSession();
                            if (response.contains(",")) {
                                responseArray = response.split(",");
                                System.err.println();
                                statusMgs = Configaration.haxToStringConvert(responseArray[1].replaceAll("\"", ""));
                                cBalance = getCurrentBalance(selectedPayableSIM.toUpperCase());
                            } else {
                                cBalance = "Failed";
                                statusMgs = "Failed";
                                System.err.println("4700--->Ussd Request Faild");
                            }

                            Configaration.setErrorLog(this.getClass().getName() + "-->1863--->" + response);
                        } else {
                            Popup.customError("Something is wrong.");
                            Log.error("5398", "SIM Type Not Match.");
                        }

                    }
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

        auto.recharge.system.config.Modem.disconnect();
        // UPdate Balance after recharge
        addBalenceInBalenceShowTable();
        loadValueInTableRechargeDetails();
        updateMobileRechargeStatusByTrxId(trxId, statusMgs, cBalance);



        getMobileNumber.requestFocusInWindow();
    }

    private boolean saveToDbCommandInRechargeAdmin(String trxId, String getMobileNumberText,
            String getAmmountInTkText, String getPrepaidOrPostpaidText, String requestedSimOperator,
            String ckeckRechargeSuccessStatus, String currentBalance) {

        String dateTime = Configaration.getCurrentDateAndTime();

        conn = DbConnection.connect();
        String sql = "INSERT INTO recharge_admin(mobile_no,amount,date_time,status,trx_id,type,from_sp,current_balance) VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, getMobileNumberText);
            preparedStatement.setString(2, getAmmountInTkText);
            preparedStatement.setString(3, dateTime);
            preparedStatement.setString(4, ckeckRechargeSuccessStatus);
            preparedStatement.setString(5, trxId);
            preparedStatement.setString(6, getPrepaidOrPostpaidText);
            preparedStatement.setString(7, requestedSimOperator);
            preparedStatement.setString(8, currentBalance);
            preparedStatement.execute();
            preparedStatement.close();
            DbConnection.disconnect();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    private String getCurrentBalance(String operatorName) {
        Log.mgs("", operatorName);
        String balance;
        if (operatorName.contains("BANGLALINK")) {
            balance = sendUssdForBalance("*124#");
        } else if (operatorName.contains("GP")) {
            balance = sendUssdForBalance("*566#");
        } else if (operatorName.contains("GRAMEENPHONE")) {
            balance = sendUssdForBalance("*566#");
        } else if (operatorName.contains("ROBI")) {
            balance = sendUssdForBalance("*222#");
        } else if (operatorName.contains("AIRTEL")) {
            balance = sendUssdForBalance("*778#");
        } else if (operatorName.contains("TELETALK")) {
            balance = sendUssdForBalance("*152#");
        } else {
            balance = "Unknown operator";
        }

        return balance;
    }

    private String sendUssdForBalance(String code) {

        List<String> balancePaseList = new ArrayList<>();
        String res = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + code + "\",15");
        Configaration.closeUssdSession();
        String[] value = res.split(",");
        if (value.length == 1) {
            System.err.println("Balance enquiry failed");

        } else {

            String balance = (String) Configaration.haxToStringConvert(value[1].replaceAll("\"", ""));
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(balance);
            while (m.find()) {
                balancePaseList.add(m.group());
                System.out.println(m.group());
            }
            Log.mgs("5579", "Current Balence " + balancePaseList.get(0));

            return balancePaseList.get(0);

        }
        return "Getting Error";
    }

    private void ussdDial() {
        setResponseShowFromUssd.setText("");
        setResponseShowFromUssd.setFocusable(false);
        String response = null;
        String[] responses = null;
        String getOperator = getSelectedSim.getSelectedItem().toString();
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            if (simOperatorIdentifierDto.getOperatorName().toLowerCase().contains(getOperator.toLowerCase())) {
                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                String value = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + getUssdCode.getText() + "\",15");
                System.out.println(auto.recharge.system.config.Modem.disconnect());
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

    public void loadValueInTableRechargeDetails() {
        // gfhjfgjfj
        int count = 1;
        DefaultTableModel mobileRechargeDetailsInMobileRechargePanel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status"}, 0);
        for (MobileRechargeDetailsDto mobileRechargeDetailsDto : mobileRechargeDetailsDtoQueue) {
            mobileRechargeDetailsInMobileRechargePanel.addRow(new Object[]{
                mobileRechargeDetailsDto.getTrxId(),
                mobileRechargeDetailsDto.getDateAndTime(),
                mobileRechargeDetailsDto.getPostPaidOrPostPaid(),
                mobileRechargeDetailsDto.getPhoneNumber(),
                mobileRechargeDetailsDto.getAmmount(),
                mobileRechargeDetailsDto.getSelectableSim(),
                "Pending",
                "Pending"});

        }
        try {
            rs = DbConnection.retrieveAll("recharge_admin");
            while (rs.next()) {
                if (Configaration.getCurrentDateAndTime().substring(0, 8).equals(rs.getString("date_time").substring(0, 8))) {
                    mobileRechargeDetailsInMobileRechargePanel.addRow(new Object[]{
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
        tableRechargeDetailsShow.setModel(mobileRechargeDetailsInMobileRechargePanel);

    }

    private void deleteColumeFromRechargeDetails(String userId) {
        DbConnection.connect();
        DbConnection.deleteRow("recharge_admin", "trx_id", userId);
        DbConnection.disconnect();

        loadValueInTableRechargeDetails();

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
                    if (!getAmmountInTk.getText().equals("") && getAmmountInTk.getText().matches("[0-9]+")) {
                        String phoneNumberRequested = getMobileNumber.getText();
                        String ammountRequested = getAmmountInTk.getText();
                        String preOrPostRequested = getPrepaidOrPostpaid.getSelectedItem().toString();
                        String selectedPayableSIM = getSeletedOperatorName.getSelectedItem().toString();
                        Log.mgs("=====================================================", selectedPayableSIM);

                        recharge(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM);

                        getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#80ff00")));

                    } else {
                        getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                    }
                }

                if (ke.getKeyCode() == KeyEvent.VK_ALT) {
                    simSimOfferDialog();
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

    public Set<String> searchItemsByPhoneNumberInRechargePanel(String sreach1) {
        try {
            List<String> allPhoneNumber = new ArrayList<>();
            Set<String> filteredPhoneNumber = new HashSet<>();
            DbConnection.connect();
            ResultSet rs = DbConnection.retrieveAll("recharge_admin");
            while (rs.next()) {
                allPhoneNumber.add(rs.getString("mobile_no"));

            }
            DbConnection.disconnect();
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
            subItemsComboBox.setVisible(true);

            openSIMSelectionComboBox();

        } else if (selectedItem.equals("My Recharge")) {
            subItemsComboBox.setVisible(false);
            loadRechargeDetailsInDetailsPanelTable();

        } else if (selectedItem.equals("Mobile Banking")) {
            subItemsComboBox.setVisible(false);
            loadMobileBankingDetailsInDetailsTable();

        } else if (selectedItem.equals("Bill Payment")) {
            subItemsComboBox.setVisible(true);

            loadBillPaymentDetailsInDetailsTable();

        } else {
            System.err.println("Selected Items Not Found");

        }

    }

    private void loadRechargeDetailsInDetailsPanelTable() {

        inboxIsActive = false;
        detailsSelectedItems = "recharge";
        setMgsDetails.setText("");
        DefaultTableModel mobileRechargeDetailsTableForDetailsPanelModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status",}, 0);
        try {

            rs = DbConnection.retrieveAll("recharge_admin");
            while (rs.next()) {
                System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));

                mobileRechargeDetailsTableForDetailsPanelModel.addRow(new Object[]{
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
        tableForDetails.setModel(mobileRechargeDetailsTableForDetailsPanelModel);
    }

    private void setCuurentActiveNetworksFromModem() {
        String operatorNames = "";
        currentNetworkName.setText("Please wait");

        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            String phoneNumber = simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13);
            String networkInfo = simOperatorIdentifierDto.getOperatorName() + "(" + phoneNumber + ") |";
            operatorNames = operatorNames + networkInfo;
            System.out.println(simOperatorIdentifierDto.getOperatorName() + "  " + simOperatorIdentifierDto.getPortName() + "  " + networkInfo + "--->" + simOperatorIdentifierDto.getOwnPhoneNumber());
        }
        currentNetworkName.setText(operatorNames);
    }

//SIM Balance Update 
    private void addBalenceInBalenceShowTable() {

        List<String> balancePaseList = new ArrayList<>();
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Operator Name", "Current Ammount"}, 0);
        ModemInfoList.simOperatorIdentifiers.forEach((SimOperatorIdentifierDto simOperatorIdentifierDto) -> {
            try {
                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                DbConnection.connect();
                rs = DbConnection.retrieveAll("command");
                while (rs.next()) {
                    if (rs.getString("operator_name").equals(simOperatorIdentifierDto.getOperatorName()
                            + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) 
                            + ")".toUpperCase())) {
                        String balanceMgs = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + rs.getString("b_s_ussd_code") + "\",15");
                        Configaration.wait(200);
                        Configaration.closeUssdSession();
                        System.out.println(auto.recharge.system.config.Modem.disconnect());
                        String[] value = balanceMgs.split(",");

                        System.out.println(value.length);
                        if (value.length == 1) {
                            errorMgsInBalencePanel.setText("-------  Try Again !!  ---------");
                            errorMgsInBalencePanel.setVisible(true);
                        } else {
                            String balance = (String) Configaration.haxToStringConvert(value[1].replaceAll("\"", ""));
                            Pattern p = Pattern.compile("\\d+");
                            Matcher m = p.matcher(balance);
                            while (m.find()) {
                                balancePaseList.add(m.group());
                                System.out.println(m.group());
                            }
                            errorMgsInBalencePanel.setText("Last updated : " + Configaration.getCurrentDateAndTime());
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
                         Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
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
            if (simOperatorIdentifierDto.getOperatorName().toLowerCase().contains(getOperator.toLowerCase())) {
                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                String value = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=2");
                auto.recharge.system.config.Modem.disconnect();
                responses = value.split(",");
            }

        }
        setResponseShowFromUssd.setText("Reset Successful");

    }

    public void loadActiveOperatorNameInComboBox() {
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getSeletedOperatorName.addItem(simOperatorIdentifierDto.getOperatorName().toUpperCase() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")");
        });

    }

    private void placeHoderSetter() {
        setPlaceHolder(getAmmountInTk, "Ammount");
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
                    case "BANGLALINK":
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
                getAmmountInTk.requestFocusInWindow();
                jDialog.setVisible(false);
            }
        });
    }

    private void addInGroupRechargeTable() {
        String number = getPhoneNumberInGroupRecharge.getText();
        String amountInTk = getAmountGroupRecharge.getText();
        String requestSIMName = getSelectedSimInGroupRecharge1.getSelectedItem().toString();
        String simType = getSelectedTypeGroupRecharge.getSelectedItem().toString();

        conn = DbConnection.connect();
        String sql = "INSERT INTO group_recharge(phone_number,amount,send_by,date_time,type) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, number);
            preparedStatement.setString(2, amountInTk);
            preparedStatement.setString(3, requestSIMName);
            preparedStatement.setString(4, Configaration.getCurrentDateAndTime());
            preparedStatement.setString(5, simType);
            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect();
        }
    }

    private void focusAndKeyboardUsedInGroupRecharge() {
        getPhoneNumberInGroupRecharge.requestFocusInWindow();
        getPhoneNumberInGroupRecharge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        getAmountGroupRecharge.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }
        });
        getAmountGroupRecharge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        getSelectedTypeGroupRecharge.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }
        });
        getSelectedTypeGroupRecharge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        getSelectedSimInGroupRecharge1.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }
        });
        getSelectedSimInGroupRecharge1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        addButInGroupRecharge.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }
        });
        addButInGroupRecharge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        if (getPhoneNumberInGroupRecharge.getText().equals("") && getAmountGroupRecharge.getText().equals("")) {
                            Popup.customError("Empty field found..");
                        } else {
                            SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                                @Override
                                protected Void doInBackground() throws Exception {
                                    processtingLoderDialog.setVisible(true);
                                    addInGroupRechargeTable();
                                    return null;
                                }

                                @Override
                                protected void done() {
                                    processtingLoderDialog.setVisible(false);
                                    loadDataInGroupRechargeTable();
                                    getPhoneNumberInGroupRecharge.setText("");
                                    getAmountGroupRecharge.setText("");
                                    getPhoneNumberInGroupRecharge.requestFocusInWindow();
                                    System.err.println("Number Add In Recharge List @Done...");
                                }

                            };
                            swingWorker.execute();
                        }
                        break;
                    default:
                        break;
                }
            }
        });

    }

    private void loadDataInGroupRechargeTable() {
        try {
            DefaultTableModel groupRechargeTableModel = new DefaultTableModel(new String[]{
                "Phone no.", "Type", "Ammount", "Send By", "Date And Time"}, 0);
            DbConnection.connect();
            ResultSet rs = DbConnection.retrieveAll("group_recharge");

            while (rs.next()) {
                groupRechargeTableModel.addRow(new String[]{rs.getString("phone_number"), rs.getString("type"), rs.getString("amount"), rs.getString("send_by"), rs.getString("date_time")});

            }

            tableGroupRecharge.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
            tableGroupRecharge.getTableHeader().setOpaque(false);
            tableGroupRecharge.getTableHeader().setBackground(new Color(133, 47, 209));
            tableGroupRecharge.getTableHeader().setForeground(new Color(255, 255, 255));

            //For jTable contant in center
            DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableGroupRecharge.getDefaultRenderer(String.class);
            stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            tableGroupRecharge.setEnabled(false);

            tableGroupRecharge.setRowHeight(25);
            tableGroupRecharge.setModel(groupRechargeTableModel);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendGroupRecharge() {

        List<GroupRechargeResponse> groupRechargeResponsesList = new ArrayList<>();
        try {
            DbConnection.connect();
            ResultSet rs = DbConnection.retrieveAll("group_recharge");

            while (rs.next()) {
                GroupRechargeResponse groupRechargeResponse = new GroupRechargeResponse();
                groupRechargeResponse.setPhoneNumber(rs.getString("phone_number"));
                groupRechargeResponse.setAmount(rs.getString("amount"));
                groupRechargeResponse.setSimType(rs.getString("type"));
                groupRechargeResponse.setPayBy(rs.getString("send_by"));
                groupRechargeResponsesList.add(groupRechargeResponse);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect();
        }
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {

                groupRechargeResponsesList.stream().forEach(values -> {
                    //TODO: For group rechage
                    //   rechargeDoneProcess(values.getPhoneNumber(), values.getAmount(), values.getSimType(), values.getPayBy(), "group");
                    Configaration.wait(1000);

                });
                return null;
            }

            @Override
            protected void done() {

                switchPanelViaMenu(mobileRechargePanel);
                DbConnection.connect();
                loadValueInTableRechargeDetails();
                DbConnection.delete("group_recharge");
                DbConnection.disconnect();
                System.err.println("Recharge Done...");
            }

        };
        swingWorker.execute();

    }

    private void sendMobileBankingRequest() {
        System.out.println("Mobile banking Process start..");
        String service = getServiceName.getSelectedItem().toString();
        String actionType = getOperationType.getSelectedItem().toString();
        String acPhoneNo = getPhoneNumberInBillPayment.getText();
        String amount = getAmmountInBillPayment.getText();
        String sim = getSimOperatorName.getSelectedItem().toString();
        List<String> ussdCodeSerialList = new ArrayList<>();

        boolean isSIMFound = false;
        String res = "Could not get response from server";
        String ussdReplace = null;

        try {
            rs = DbConnection.findByColume("mobile_banking", "services_name", service);
            while (rs.next()) {
                if (actionType.equals(rs.getString("task_name"))) {
                    ussdReplace = rs.getString("ussd_code").replaceAll("number", acPhoneNo).replaceAll("tk", amount).replaceAll("pin", rs.getString("pin"));
                    isSIMFound = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect();

        }

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(ussdReplace);
        ussdCodeSerialList.clear();
        while (m.find()) {

            ussdCodeSerialList.add(m.group());
        }

        if (!isSIMFound) {
            Popup.customError("SIM not found !!");
        }

        System.err.println(ussdCodeSerialList);
        String feedBackMgs = sendSerialUSSDCode(ussdCodeSerialList, sim);
        System.err.println("----------------------------------=========================" + feedBackMgs);

        MessageDialogShowUI ui = new MessageDialogShowUI(Configaration.haxToStringConvert(feedBackMgs), getPhoneNumberInBillPayment.getText());

        JDialog mgsDialog = new JDialog();
        mgsDialog.add(ui);
        mgsDialog.setSize(352, 254);
        mgsDialog.setLocationRelativeTo(null);
        mgsDialog.setUndecorated(true);
        mgsDialog.setVisible(true);

        ui.getClickOk().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mgsDialog.dispose();
            }

        });

        ui.getClickCross().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                mgsDialog.dispose();
            }

        });
        ui.getClickDelete().setVisible(false);
        ui.getClickOk().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    mgsDialog.dispose();
                }
            }
        });
        saveInMobileBankingTable(feedBackMgs);
        getPhoneNumberInBillPayment.setText("");
        getAmmountInBillPayment.setText("");

    }

    private boolean mobileBankingPanelValidation() {
        if ((getServiceName.getSelectedItem().toString().equals("------ Select Service -------")
                || getOperationType.getSelectedItem() == null
                || getPhoneNumberInBillPayment.getText().equals("")
                || getAmmountInBillPayment.getText().equals(""))) {
            return false;
        } else {
            return true;
        }
    }

    private void showMobileBankingConfirmationDialog() {

        MobileBankingConfirmationUI ui = new MobileBankingConfirmationUI("Confirmation",
                getPhoneNumberInBillPayment.getText(),
                getAmmountInBillPayment.getText() + " tk",
                getOperationType.getSelectedItem().toString(),
                getServiceName.getSelectedItem().toString());

        JDialog jDialog = new JDialog();
        jDialog.add(ui);
        jDialog.setSize(1400, 941);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);

        ui.getClickClose().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getPhoneNumberInBillPayment.setText("");
                getAmmountInBillPayment.setText("");
                getMobileNumber.requestFocusInWindow();
                jDialog.setVisible(false);
            }

        });
        ui.getClickClose().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                    getPhoneNumberInBillPayment.setText("");
                    getAmmountInBillPayment.setText("");
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
            clickSend.setEnabled(false);
            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    System.err.println("Confirm click");
                    jDialog.setVisible(false);
                    clickSandInMB.setVisible(false);
                    processtingLoderDialog.setVisible(true);
                    sendMobileBankingRequest();

                    return null;
                }

                @Override
                protected void done() {
                    refrash();
                    loadMobileBankingDetailsTable();
                    getServiceName.requestFocusInWindow();
                    clickSandInMB.setVisible(true);
                    processtingLoderDialog.setVisible(false);
                }

            };
            worker.execute();

        });

        ui.getClickConfirm().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            System.err.println("Confirm click");
                            jDialog.setVisible(false);
                            clickSandInMB.setVisible(false);
                            processtingLoderDialog.setVisible(true);
                            sendMobileBankingRequest();

                            return null;
                        }

                        @Override
                        protected void done() {
                            refrash();
                            loadMobileBankingDetailsTable();
                            getServiceName.requestFocusInWindow();
                            clickSandInMB.setVisible(true);
                            processtingLoderDialog.setVisible(false);

                        }

                    };
                    worker.execute();

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

    private void saveInMobileBankingTable(String finalResultInHax) {
        String result = Configaration.haxToStringConvert(finalResultInHax);
        String service = getServiceName.getSelectedItem().toString();
        String actionType = getOperationType.getSelectedItem().toString();
        String acPhoneNo = getPhoneNumberInBillPayment.getText();
        String amount = getAmmountInBillPayment.getText();
        String sim = getSimOperatorName.getSelectedItem().toString();

        conn = DbConnection.connect();
        String sql = "INSERT INTO m_b_details(service_name,action_type,phone_no,amount,sim,result,date_time,request_by,TnxId) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, service);
            preparedStatement.setString(2, actionType);
            preparedStatement.setString(3, acPhoneNo);
            preparedStatement.setString(4, amount);
            preparedStatement.setString(5, sim);
            preparedStatement.setString(6, result);
            preparedStatement.setString(7, Configaration.getCurrentDateAndTime());
            preparedStatement.setString(8, "ADMIN");
            preparedStatement.setString(9, Configaration.getUUID());

            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect();
        }
        System.out.println("Mobile Banking request details saved.");

    }

    private void loadMobileBankingDetailsTable() {

        try {
            DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Service", "Action", "Ac no", "Amount", "Sim Card", "Status", "Date and Time"}, 0);

            rs = DbConnection.retrieveAll("m_b_details");
            while (rs.next()) {
                if (Configaration.getCurrentDateAndTime().substring(0, 8).equals(rs.getString("date_time").substring(0, 8))) {
                    defaultTableModel.addRow(new String[]{rs.getString("TnxId"), rs.getString("service_name"), rs.getString("action_type"), rs.getString("phone_no"),
                        rs.getString("amount"), rs.getString("sim"), rs.getString("result"), rs.getString("date_time")});
                }

            }

            tableMobileBankingDetails.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            tableMobileBankingDetails.getTableHeader().setOpaque(false);
            tableMobileBankingDetails.getTableHeader().setBackground(new Color(255, 0, 0));
            tableMobileBankingDetails.getTableHeader().setForeground(new Color(255, 255, 255));

            //For jTable contant in center
            DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableMobileBankingDetails.getDefaultRenderer(String.class);
            stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            tableMobileBankingDetails.setEnabled(false);
            tableMobileBankingDetails.setRowHeight(35);
            tableMobileBankingDetails.setModel(defaultTableModel);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        String operatorCode = "no updated";
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

    private void loadValuesForUssdManagementTable() {

        try {
            DefaultTableModel model = new DefaultTableModel(new String[]{
                "Operator Name", "Profit in 1k", "Others Ussd Code", "Recharge USSD Code(Prepaind)", "Recharge USSD Code(Postpaind)", "Show Balence Ussd Code", "icon"
            }, 0);
            switchPanelViaSettings(rechargeSettingsPanel, rechargeSettings);

            rs = DbConnection.retrieveAll("command");
            while (rs.next()) {

                String operator_name = rs.getString("operator_name");
                String profit = rs.getString("profit");
                String action_for = rs.getString("action_for");
                String r_ussd_code_pre = rs.getString("r_ussd_code_pre");
                String r_ussd_code_post = rs.getString("r_ussd_code_post");
                String b_s_ussd_code = rs.getString("b_s_ussd_code");
                String icon = rs.getString("icon");
                model.addRow(new Object[]{operator_name, profit, action_for, r_ussd_code_pre, r_ussd_code_post, b_s_ussd_code, icon});

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
    private void saveInMobileBanking() {
        String service = getSelectedServiceCombo.getSelectedItem().toString();
        String defultSIM = getSelectedSIMNameCombo.getSelectedItem().toString();
        String taskName = getTaskNameInMBS.getText();
        String ussdCode = getUssdCodePattren.getText().toLowerCase();
        String balanceShowUssdCode = getUssdCodeForBalanceShowPattren.getText().toLowerCase();
        String pin = getPIN.getText();
        if (taskName.equals("") || ussdCode.equals("") || balanceShowUssdCode.equals("") || pin.equals("")) {
            Popup.customError("Empty Filed Found");

        } else {
            conn = DbConnection.connect();
            String sql = "INSERT INTO mobile_banking(services_name,default_sim,task_name,ussd_code,pin,serviceId,balance_show_ussd) VALUES(?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, service);
                preparedStatement.setString(2, defultSIM);
                preparedStatement.setString(3, taskName);
                preparedStatement.setString(4, ussdCode);
                preparedStatement.setString(5, pin);
                preparedStatement.setString(6, Configaration.getUUID());
                preparedStatement.setString(7, balanceShowUssdCode);
                preparedStatement.execute();
                Popup.customSuccess();

            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
                Popup.customError("Saving failed");
            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {

                    }
                }
            }
        }
    }

    private void loadTableMobileBankingSettingFromDb() {
        try {
            DefaultTableModel model = new DefaultTableModel(new String[]{"Service Id",
                "Service Name", "Default action SIM card", "Task Name", "Ussd Pattern", "Ussd Pattern For Balance"}, 0);

            rs = DbConnection.retrieveAll("mobile_banking");
            while (rs.next()) {
                String services_id = rs.getString("serviceId");
                String services_name = rs.getString("services_name");
                String default_sim = rs.getString("default_sim");
                String task_name = rs.getString("task_name");
                String ussd_code = rs.getString("ussd_code");
                String balance_ussd_code = rs.getString("balance_show_ussd");

                model.addRow(new Object[]{services_id, services_name, default_sim, task_name, ussd_code, balance_ussd_code});

            }
            tableMobileBankingSetting.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
            tableMobileBankingSetting.getTableHeader().setOpaque(false);
            tableMobileBankingSetting.getTableHeader().setBackground(new Color(133, 47, 209));
            tableMobileBankingSetting.getTableHeader().setForeground(new Color(255, 255, 255));

            //For jTable contant in center
            DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableMobileBankingSetting.getDefaultRenderer(String.class);
            stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            tableMobileBankingSetting.setEnabled(false);

            tableMobileBankingSetting.setRowHeight(25);
            tableMobileBankingSetting.setModel(model);

//            ussdSettedTable.addMouseListener(new MouseAdapter() {
//
//                @Override
//                public void mouseClicked(MouseEvent me) {
//                    int seletedOption = 3;
//                    Point point = me.getPoint();
//                    int row = ussdSettedTable.rowAtPoint(point);
//                    Configaration.setErrorLog(me.getClickCount());
//                    if (me.getClickCount() == 2) {
//                        Object[] options = {"Delete", "Edit"};
//                        seletedOption = JOptionPane.showOptionDialog(null, "Choose now ?", "Menu",
//                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
//                        Configaration.setLog(seletedOption);
//                    }
//
//                    switch (seletedOption) {
//                        case 0:
//                            DbConnection.deleteRow("command", "operator_name", ussdSettedTable.getValueAt(row, 0).toString());
//                            Home.showDeshBoardPage();
//
//                            break;
//                        case 1:
//
//                            //  switchPanelViaMenu(updateAddedManagementPanel);
//                            //  getOperatorName1.setText(ussdSettedTable.getValueAt(row, 0).toString());
//                            break;
//                        default:
//                            Configaration.setErrorLog("JOption selection not match");
//
//                            break;
//                    }
//                }
//            });
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

    /*
        ------------------------------------------  CONTRACT LIST PANEL-----------------------------------------
     */
    private void setContractListInJTable() {
        alartMessageText.setVisible(false);
        try {
            int count = 1;

            contractList = new HashSet<>();
            DefaultTableModel contractListTableMOdel = new DefaultTableModel(new String[]{"Name", "Phone no", "From"}, 0);
            ModemInfoList.simOperatorIdentifiers.stream().map((simOperatorIdentifierDto) -> {
                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                return simOperatorIdentifierDto;
            }).map((_item) -> {
                rowOfContractlist = auto.recharge.system.config.Modem.sendATCommand("AT+CPBR=1,99").replaceAll("\r", "").split("\n");

                return _item;
            }).forEachOrdered((_item) -> {
                auto.recharge.system.config.Modem.disconnect();
            });

            for (String contract : rowOfContractlist) {
                System.err.println(contract);
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

            if (Configaration.netIsAvailable()) {

                DBMySQLConnection bMySQLConnection = new DBMySQLConnection();

                try {
                    java.sql.Statement st = bMySQLConnection.connect().createStatement();
                    String sql = "SELECT * FROM user_contracts_list WHERE userId='" + UserInfo.userId + "';";

                    java.sql.ResultSet resultSet = st.executeQuery(sql);
                    while (resultSet.next()) {
                        ContractResponse contractResponse = new ContractResponse();
                        contractResponse.setId(count++);
                        contractResponse.setName(resultSet.getString("name"));
                        contractResponse.setPhoneNo(resultSet.getString("phone_number"));
                        contractResponse.setStorage(resultSet.getString("storage"));
                        contractList.add(contractResponse);

                    }
                } catch (SQLException ex) {
                    Log.error("6853", ex.getMessage());

                }

            } else {
                alartMessageText.setVisible(true);
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
                        getMobileNumber.requestFocusInWindow();
                        getMobileNumber.setForeground(Color.BLACK);
                        getMobileNumber.setText(selectedNumber.substring(3, 14));

                        System.err.println(selectedNumber.substring(3, 14));
                        System.out.println(selectedNumber);
                    } else {
                        switchPanelViaMenu(mobileRechargePanel);
                        getMobileNumber.requestFocusInWindow();
                        getMobileNumber.setForeground(Color.BLACK);
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
                    if (Configaration.netIsAvailable()) {
                        saveContractInSQL();
                    } else {
                        Popup.customError("No Internet");
                    }
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
                getNameForContract.setText("");
                getPhoneNOForContract.setText("");
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
        String storage = getSeletedStorage.getSelectedItem().toString();

        java.sql.Connection conn1 = bMySQLConnection.connect();
        String sql = "INSERT INTO user_contracts_list(userId,name,phone_number,storage) VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn1.prepareStatement(sql);
            preparedStatement.setString(1, UserInfo.userId);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, phoneNo);
            preparedStatement.setString(4, storage);
            preparedStatement.execute();
            int a = Popup.customSuccess();

            if (a == 0) {
                getNameForContract.setText("");
                getPhoneNOForContract.setText("");
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
        System.out.println("New Contract Add Successful in Cloud");
    }

    private void saveContractInSIMCard() {
        String name = getNameForContract.getText();
        String phoneNo = getPhoneNOForContract.getText();
        String storage = getSeletedStorage.getSelectedItem().toString();
        String result = null;
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {

            if (simOperatorIdentifierDto.getOperatorName().toUpperCase().contains(storage.toUpperCase())) {
                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                result = auto.recharge.system.config.Modem.sendATCommand("AT+CPBW=,\"" + phoneNo + "\",129,\"" + name + "\"");
                auto.recharge.system.config.Modem.disconnect();

            }

        }

        if (result != null) {
            if (result.replaceAll("\n", "").replaceAll("\r", "").replaceAll(",", "").toLowerCase().equals("ok")) {
                int a = Popup.customSuccess();

                if (a == 0) {
                    getNameForContract.setText("");
                    getPhoneNOForContract.setText("");
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
    private void loadIndoxInDetailsTable(String port) {
        inboxIsActive = true;
        detailsSelectedItems = "inbox";
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"No", "From", "Date & Time", "Message"}, 0);

        int count = 0;
        String from = null, dateTime = null, mgs = null;

        ModemInfoList.simOperatorIdentifiers.stream().map(new Function<SimOperatorIdentifierDto, SimOperatorIdentifierDto>() {
            @Override
            public SimOperatorIdentifierDto apply(SimOperatorIdentifierDto simOperatorIdentifierDto) {
                auto.recharge.system.config.Modem.connect(port);
                return simOperatorIdentifierDto;
            }
        }).map((_item) -> {
            // TODO: Move those code in setup Apllication
            auto.recharge.system.config.Modem.sendATCommand("AT+CMGF=1");
            return _item;
        }).map((_item) -> {
            Configaration.wait(1000);
            return _item;
        }).map((_item) -> {
            auto.recharge.system.config.Modem.sendATCommand("AT+CMGF=?");
            return _item;
        }).map((_item) -> {
            Configaration.wait(1000);
            return _item;
        }).map((_item) -> {
            auto.recharge.system.config.Modem.sendATCommand("AT+CPMS=\"SM\"");
            return _item;
        }).map((_item) -> {
            Configaration.wait(1000);
            return _item;
        }).map((_item) -> auto.recharge.system.config.Modem.sendATCommand("AT+CMGL=\"ALL\"").replaceAll("\r", "").replaceAll("\"", "").replaceAll("\n", "")).map((result) -> {
            splitedByCMDValueForInbox = result.split("\\+CMGL:");
            return result;
        }).forEachOrdered((_item) -> {
            auto.recharge.system.config.Modem.disconnect();
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
        //  resellerTab.setBorder(shadow);
        detailsTab.setBorder(shadow);
        settingTab.setBorder(shadow);
        helplineTab.setBorder(shadow);
    }

    private void switchBillPaymentDetailsPaenl(JPanel jPanel) {
        switchPanelViaMenu(jPanel);

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

    protected void switchPanelInBillPayment(javax.swing.JPanel requestedPanel) {

        baseBillPayment.removeAll();
        baseBillPayment.repaint();
        baseBillPayment.revalidate();

        baseBillPayment.add(requestedPanel);
        baseBillPayment.repaint();
        baseBillPayment.revalidate();

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

    private void processingLoderDialog() {

        ProcesseingLoderUI processeingLoderUI = new ProcesseingLoderUI();

        processtingLoderDialog = new JDialog();
        processtingLoderDialog.add(processeingLoderUI);
        processtingLoderDialog.setSize(214, 138);
        processtingLoderDialog.setLocationRelativeTo(null);
        processtingLoderDialog.setUndecorated(true);

    }

    private String sendSerialUSSDCode(List<String> ussdCodeSerialList, String sim) {
        System.err.println("Request List: " + ussdCodeSerialList);

        List<String> responseList = new ArrayList<>();
        String res = "Could not get response from server";
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            if (simOperatorIdentifierDto.getOperatorName().toUpperCase().contains(sim.toUpperCase())) {
                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                for (int i = 0; i <= ussdCodeSerialList.size(); i++) {
                    if (i == 0) {
                        String ussd = "*" + ussdCodeSerialList.get(i) + "#";
                        System.out.println("Sending by " + ussd + ":if");
                        res = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + ussd + "\",15");
                        Configaration.wait(300);
                        responseList.add(res);
                        System.out.println("Response " + res);

                    } else {
                        String ussd = ussdCodeSerialList.get(i);
                        System.out.println("Sending by " + ussd + ":else");
                        res = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + ussd + "\",15");
                        Configaration.wait(300);
                        if (res.split(",").length == 1) {
                            int a = Popup.customError("Sending Failed..");
                            if (a == 0) {
                                Configaration.closeUssdSession();
                                auto.recharge.system.config.Modem.disconnect();
                                return "53656e64696e67204661696c6564";
                            }

                        }
                        responseList.add(res);

                        System.out.println("Response " + res);

                    }
                    if (i == ussdCodeSerialList.size() - 1) {

                        Configaration.closeUssdSession();
                        auto.recharge.system.config.Modem.disconnect();
                        int size = responseList.size();
                        String finalResponse = responseList.get(size - 1);
                        String[] finalResponsePerse = finalResponse.split(",");
                        String finalResultInHax = finalResponsePerse[1].replaceAll("\"", "");
                        System.err.println("00000000000000000000000909090    " + Configaration.haxToStringConvert(finalResultInHax));
                        return finalResultInHax;
                    }
                }
            }
        }
        responseList.clear();
        return "USSD Dial Failed";
    }

    //-------------------------------- Bill Pay Panel------------------------------------
    private void payBillByBillNo() {
        String sim = getSimName.getSelectedItem().toString();
        String getServiceType = getServiceTypeInBillPay.getSelectedItem().toString();
        String billNo = getBillNO.getText();
        String password = getPasswordInBillPay.getText();

        if (billNo.equals("") || password.equals("")) {
            Popup.customError("Empty Field Found");

        } else {
            String ussdCode = "*727*2*" + billNo + "*" + password + "#";
            String status = billPayUssdCodeDial(sim, ussdCode);
            saveIntobill_pay_bill_no(status);
            loadInBillPaymentDetailsByBillNo();

        }
    }

    private void resetBillByBillNo() {
        getBillNO.setText("");

    }

    private void payBillByCustomerId() {

        String sim = getSimName.getSelectedItem().toString();
        String getServiceType = getServiceTypeInBillPay.getSelectedItem().toString();
        String customerId = getCustomerId.getText();
        String monthName = getMonthNo.getSelectedItem().toString();
        String year = getyear.getSelectedItem().toString();
        String password = getPassword.getText();
        String monthNo = null;

        switch (monthName.toLowerCase()) {
            case "january":
                monthNo = "1";
                break;
            case "february":
                monthNo = "2";
                break;
            case "march":
                monthNo = "3";
                break;
            case "april":
                monthNo = "4";
                break;
            case "may":
                monthNo = "5";
                break;
            case "june":
                monthNo = "6";
                break;
            case "july":
                monthNo = "7";
                break;
            case "august":
                monthNo = "8";
                break;
            case "september":
                monthNo = "9";
                break;
            case "october":
                monthNo = "10";
                break;
            case "november":
                monthNo = "11";
                break;
            case "december":
                monthNo = "12";
                break;
            default:
                Popup.customError("Month Not Found");
                break;
        }
        if (customerId.equals("") || password.equals("")) {
            Popup.customError("Empty Field Found");

        } else {
            String ussdCode = "*727*2*" + customerId + "*" + monthNo + "*" + year + "*" + password + "#";
            String status = billPayUssdCodeDial(sim, ussdCode);
            System.err.println(status);
            saveIntobill_payment_customer_id(status);
            loadInBillPaymentDetailsByCustomerId();

        }

    }

    private void resetBillByCustomerId() {
        getCustomerId.setText("");

    }

    private String billPayUssdCodeDial(String sim, String code) {
        String res = "Sending Failed...";
        boolean isPay = false;
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            if (simOperatorIdentifierDto.getOperatorName().toLowerCase().contains(sim.toLowerCase())) {
                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                res = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + code + "\",15");
                auto.recharge.system.config.Modem.disconnect();
                isPay = true;
            }

        }
        if (!isPay) {
            Popup.customError("Teletalk SIM Not Found");
        }
        return res;
    }

    private void saveIntobill_pay_bill_no(String status) {

        String getServiceType = getServiceTypeInBillPay.getSelectedItem().toString();
        String billNo = getBillNO.getText();

        Connection conn1 = DbConnection.connect();
        String sql = "INSERT INTO bill_pay_bill_no(TrxId,bill_no,time_date,c_balance,bill_type,status) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn1.prepareStatement(sql);
            preparedStatement.setString(1, Configaration.getUUID());
            preparedStatement.setString(2, billNo);
            preparedStatement.setString(3, Configaration.getCurrentDateAndTime());
            preparedStatement.setString(4, "6");
            preparedStatement.setString(5, getServiceType);
            preparedStatement.setString(6, status);
            preparedStatement.execute();

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
    }

    private void saveIntobill_payment_customer_id(String status) {
        String getServiceType = getServiceTypeInBillPay.getSelectedItem().toString();
        String customerId = getCustomerId.getText();
        String monthName = getMonthNo.getSelectedItem().toString();
        String year = getyear.getSelectedItem().toString();

        Connection conn1 = DbConnection.connect();
        String sql = "INSERT INTO bill_payment_customer_id(TrxId,customer_id,bill_month,bill_year,time_date,c_balance,bill_type,status) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn1.prepareStatement(sql);
            preparedStatement.setString(1, Configaration.getUUID());
            preparedStatement.setString(2, customerId);
            preparedStatement.setString(3, monthName);
            preparedStatement.setString(4, year);
            preparedStatement.setString(5, Configaration.getCurrentDateAndTime());
            preparedStatement.setString(6, "4");
            preparedStatement.setString(7, getServiceType);
            preparedStatement.setString(8, status);
            preparedStatement.execute();

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
    }

    private void loadInBillPaymentDetailsByBillNo() {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Bill No", "Current balance", "Status"}, 0);
        try {

            rs = DbConnection.retrieveAll("bill_pay_bill_no");
            while (rs.next()) {
                defaultTableModel.addRow(new String[]{rs.getString("TrxId"), rs.getString("time_date"),
                    rs.getString("bill_type"), rs.getString("bill_no"), rs.getString("c_balance"),
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
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableBillPaymentDetails.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tableBillPaymentDetails.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tableBillPaymentDetails.getTableHeader().setOpaque(false);
        tableBillPaymentDetails.getTableHeader().setBackground(new Color(133, 47, 209));
        tableBillPaymentDetails.getTableHeader().setForeground(new Color(255, 255, 255));
        tableBillPaymentDetails.setEnabled(false);
        tableBillPaymentDetails.setRowHeight(30);
        tableBillPaymentDetails.setModel(defaultTableModel);
    }

    private void loadInBillPaymentDetailsByCustomerId() {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Customer ID", "Month", "Year", "Current balance", "Status"}, 0);
        try {

            rs = DbConnection.retrieveAll("bill_payment_customer_id");
            while (rs.next()) {
                defaultTableModel.addRow(new String[]{rs.getString("TrxId"), rs.getString("time_date"),
                    rs.getString("bill_type"), rs.getString("customer_id"), rs.getString("bill_month"), rs.getString("bill_year"), rs.getString("c_balance"),
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
        //For jTable contant in center
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableBillPaymentDetails.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tableBillPaymentDetails.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tableBillPaymentDetails.getTableHeader().setOpaque(false);
        tableBillPaymentDetails.getTableHeader().setBackground(new Color(133, 47, 209));
        tableBillPaymentDetails.getTableHeader().setForeground(new Color(255, 255, 255));
        tableBillPaymentDetails.setEnabled(false);
        tableBillPaymentDetails.setRowHeight(30);
        tableBillPaymentDetails.setModel(defaultTableModel);
    }

    private void setDataInProfilePanel() {
        nameInProfilePanel1.setText(UserInfo.name);
        designationInProfilePanel1.setText("Owner");
        companyNameInProfilePanel.setText(UserInfo.shopName);
        userIdInProfile.setText(UserInfo.userId);
        activePackageNameInProfile.setText(UserInfo.activePackage);
        activeDateInProfile.setText(UserInfo.activeDate);
        expiryDateInProfile.setText(UserInfo.expireDate);
        remainDaysInProfile.setText(UserInfo.name);

    }

    private void rechargeConfirmMessageDialog(String mgs, String phoneNumber) {
        MessageDialogShowUI ui = new MessageDialogShowUI(mgs, phoneNumber);

        JDialog mgsDialog = new JDialog();
        mgsDialog.add(ui);
        mgsDialog.setSize(352, 254);
        mgsDialog.setLocationRelativeTo(null);
        mgsDialog.setUndecorated(true);
        mgsDialog.setVisible(true);

        ui.getClickOk().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mgsDialog.dispose();
            }

        });

        ui.getClickCross().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                mgsDialog.dispose();
            }

        });
        ui.getClickDelete().setVisible(false);
        ui.getClickOk().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    mgsDialog.dispose();
                }
            }
        });
    }

    private void activeKeyPressWorkInNewContractSave() {

        getNameForContract.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getPhoneNOForContract.requestFocusInWindow();
                }
            }
        });
        getPhoneNOForContract.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getSeletedStorage.requestFocusInWindow();
                }
            }
        });
        getSeletedStorage.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickAddContract.requestFocusInWindow();
                }
            }
        });
        clickAddContract.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            processtingLoderDialog.setVisible(true);
                            saveContract();
                            return null;
                        }

                        @Override
                        protected void done() {
                            switchPanelViaMenu(contractListPanel);
                            setContractListInJTable();
                            processtingLoderDialog.setVisible(false);
                        }

                    };
                    swingWorker.execute();
                }
            }
        });

    }

    private void addKeyListenserInRechargeOffer() {
        getSIMOperatorName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getOfferNameInSeting.requestFocusInWindow();
                }
            }
        });
        getOfferNameInSeting.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getRechargeAmmountInSeetings.requestFocusInWindow();
                }
            }
        });
        getRechargeAmmountInSeetings.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getValidityInSetting.requestFocusInWindow();
                }
            }
        });
        getValidityInSetting.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getSelectedValidityTimeTypeSetting.requestFocusInWindow();
                }
            }
        });
        getSelectedValidityTimeTypeSetting.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getDescriptionInSetting.requestFocusInWindow();
                }
            }
        });
        getDescriptionInSetting.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    saveNewOfferInSettrings.requestFocusInWindow();
                }
            }
        });
        saveNewOfferInSettrings.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                    SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            processtingLoderDialog.setVisible(true);
                            saveSIMOffer();
                            return null;
                        }

                        @Override
                        protected void done() {
                            processtingLoderDialog.setVisible(false);
                            getOfferNameInSeting.setText("");
                            getRechargeAmmountInSeetings.setText("");
                            getValidityInSetting.setText("");
                            getDescriptionInSetting.setText("");
                            System.err.println("Added @Done...");
                        }

                    };
                    swingWorker.execute();
                }
            }
        });
    }

    private void addKeyLisenerInMobileBankingSetting() {
        getSelectedServiceCombo.requestFocusInWindow();
        getTaskNameInMBS.setUI(new HintTextFieldUI("Cash In"));
        getUssdCodePattren.setUI(new HintTextFieldUI("*247*2*1*number*tk*pin#"));
        getUssdCodeForBalanceShowPattren.setUI(new HintTextFieldUI("*247*5*pin#"));
        getPIN.setUI(new HintTextFieldUI("******"));

        getSelectedServiceCombo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getSelectedSIMNameCombo.requestFocusInWindow();
                }
            }
        });
        getSelectedSIMNameCombo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getTaskNameInMBS.requestFocusInWindow();
                }
            }
        });
        getTaskNameInMBS.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getUssdCodePattren.requestFocusInWindow();
                }
            }
        });
        getUssdCodePattren.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getUssdCodeForBalanceShowPattren.requestFocusInWindow();
                }
            }
        });
        getUssdCodeForBalanceShowPattren.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getPIN.requestFocusInWindow();
                }
            }
        });
        getPIN.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickSaveInMobileRechatgeSetting.requestFocusInWindow();
                }
            }
        });
        clickSaveInMobileRechatgeSetting.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            processtingLoderDialog.setVisible(true);
                            saveInMobileBanking();
                            return null;
                        }

                        @Override
                        protected void done() {
                            processtingLoderDialog.setVisible(false);
                            getTaskNameInMBS.setText("");
                            getUssdCodePattren.setText("");
                            getPIN.setText("");
                            getUssdCodeForBalanceShowPattren.setText("");
                            getSelectedServiceCombo.requestFocusInWindow();
                            loadTableMobileBankingSettingFromDb();
                            System.err.println("Mobile Banking Service Added in List @Done...");
                        }

                    };
                    swingWorker.execute();
                }
            }
        });

    }

    private void deleteServiceDetailsFromMobileBanking(String serviceId) {
        Log.mgs("8266", "Delete requested id " + serviceId);
        DbConnection.connect();
        DbConnection.deleteRow("mobile_banking", "serviceId", serviceId);
        DbConnection.disconnect();

    }

    private void addKeyListenerAndHoverInMobileBankingPanel() {
        setPlaceHolder(getPhoneNumberInBillPayment, "Mobile Number");
        setPlaceHolder(getAmmountInBillPayment, "Amount");
        getServiceName.requestFocusInWindow();
        getServiceName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getOperationType.requestFocusInWindow();
                }
            }
        });
        getOperationType.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getPhoneNumberInBillPayment.requestFocusInWindow();
                }
            }
        });
        getPhoneNumberInBillPayment.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getAmmountInBillPayment.requestFocusInWindow();
                }
            }
        });
        getAmmountInBillPayment.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (mobileBankingPanelValidation()) {
                        showMobileBankingConfirmationDialog();
                    } else {
                        Popup.customError("Any field is empty!!");
                    }
                }
            }
        });

    }

    private void loadMobileBankingBalance() {
        Set<MobileBankingBalanceShowDto> bankingBalanceShowDtos = new HashSet<>();
        try {
            DefaultListModel Clistmodel = new DefaultListModel();//

            DbConnection.connect();
            ResultSet rs = DbConnection.retrieveAll("mobile_banking");
            while (rs.next()) {
                MobileBankingBalanceShowDto mobileBankingBalanceShowDto = new MobileBankingBalanceShowDto();
                mobileBankingBalanceShowDto.setServiceId(rs.getString("serviceId"));
                mobileBankingBalanceShowDto.setServiceName(rs.getString("services_name"));
                mobileBankingBalanceShowDto.setDefaultSIM(rs.getString("default_sim"));
                mobileBankingBalanceShowDto.setUssdCode(rs.getString("ussd_code"));
                mobileBankingBalanceShowDto.setPin(rs.getString("pin"));
                bankingBalanceShowDtos.add(mobileBankingBalanceShowDto);
            }
            DbConnection.disconnect();

            for (MobileBankingBalanceShowDto mobileBankingBalanceShowDto : bankingBalanceShowDtos) {
                System.err.println(mobileBankingBalanceShowDto.getServiceName());
                MobileBankingBalanceShowCard mobileBankingBalanceShowCard = new MobileBankingBalanceShowCard();
                mobileBankingBalanceShowCard.getServiceNameText().setText(mobileBankingBalanceShowDto.getServiceName());
                mobileBankingBalanceShowCard.getAmountBalanceText().setText("XXXX" + " TK");
                mobileBankingBalanceShowCard.getLastUpdateTimeText().setText("Last update: " + "XX-XX-XX");

                Clistmodel.addElement(mobileBankingBalanceShowCard);//Contact is an JPanel object
            }
            mobileBankingBalanceShowPanelList.setModel(Clistmodel);//GroupList is the List object

            mobileBankingBalanceShowPanelList.setCellRenderer(new JListPanelRenderer());
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void addKeyLIsenerInUssdDailPad() {
        getUssdCode.requestFocusInWindow();
        getUssdCode.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getSelectedSim.requestFocusInWindow();
                }
            }
        });
        getSelectedSim.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickUssdDailDorSend1.requestFocusInWindow();
                }
            }
        });

        clickUssdDailDorSend1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickUssdDailDorSend1.setEnabled(false);
                    SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {

                            if (getUssdCode.getText().equals("")) {
                                getUssdCode.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                            } else {
                                processtingLoderDialog.setVisible(true);
                                ussdDial();
                                getUssdCode.setText("");
                            }
                            return null;
                        }

                        @Override
                        protected void done() {
                            getUssdCode.requestFocusInWindow();
                            processtingLoderDialog.setVisible(false);
                            clickUssdDailDorSend1.setEnabled(true);
                        }

                    };
                    swingWorker.execute();
                }
            }
        });
    }

    private void loadBalanceINBillPaymentPanel() {
        String SIM_NAME = "BANGLALINK";
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {

            if (SIM_NAME.toUpperCase().contains(simOperatorIdentifierDto.getOperatorName().toUpperCase())) {

                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                getBalanceInBillPayment.setText(getCurrentBalance(SIM_NAME));
                Configaration.closeUssdSession();
                auto.recharge.system.config.Modem.disconnect();
            }
        }

    }

    private void loadMobileBankingDetailsInDetailsTable() {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Service Name", "Action Type", "Mobile No", "Ammount", "From", "Status",}, 0);
        try {

            rs = DbConnection.retrieveAll("m_b_details");
            while (rs.next()) {
                System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));

                defaultTableModel.addRow(new Object[]{
                    rs.getString("TnxId"),
                    rs.getString("date_time"),
                    rs.getString("service_name"),
                    rs.getString("action_type"),
                    rs.getString("phone_no"),
                    rs.getString("amount"),
                    rs.getString("sim"),
                    rs.getString("result")});

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

    private void loadBillPaymentDetailsInDetailsTable() {
        subItemsComboBox.addItem("By Bill no");
        subItemsComboBox.addItem("By Customer id");
        System.err.println("Bill no.");
    }

    private void loadBillPaymentByBillNoDetailsInDetailsTable() {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Bill Type", "Bill No", "Current Balance", "Status",}, 0);
        try {

            rs = DbConnection.retrieveAll("bill_pay_bill_no");
            while (rs.next()) {
                System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));

                defaultTableModel.addRow(new Object[]{
                    rs.getString("TrxId"),
                    rs.getString("time_date"),
                    rs.getString("bill_type"),
                    rs.getString("bill_no"),
                    rs.getString("c_balance"),
                    rs.getString("status")
                });

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

    private void loadInboxDetailsInDetailsTable() {

        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                processtingLoderDialog.setVisible(true);
                for (SimOperatorIdentifierDto operatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                    if (operatorIdentifierDto.getOperatorName().toUpperCase().contains(subItemsComboBox.getSelectedItem().toString().toUpperCase())) {
                        loadIndoxInDetailsTable(operatorIdentifierDto.getPortName());

                    }

                }

                return null;
            }

            @Override
            protected void done() {

                processtingLoderDialog.setVisible(false);
                System.out.println("Delete Successful...@Done");
            }

        };
        swingWorker.execute();

    }

    private void loadBillPaymentByCostumerIdDetailsInDetails() {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Bill Type", "Customer Id",
            "Bill Month", "Bill Year", "Current Balance", "Status"}, 0);
        try {

            rs = DbConnection.retrieveAll("bill_payment_customer_id");
            while (rs.next()) {
                System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));

                defaultTableModel.addRow(new Object[]{
                    rs.getString("TrxId"),
                    rs.getString("time_date"),
                    rs.getString("bill_type"),
                    rs.getString("customer_id"),
                    rs.getString("bill_month"),
                    rs.getString("bill_year"),
                    rs.getString("c_balance"),
                    rs.getString("status")
                });

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

    private void openSIMSelectionComboBox() {
        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            subItemsComboBox.addItem(simOperatorIdentifierDto.getOperatorName());
        }
    }

    private void exportDatabase() {
        try {
            JFileChooser f = new JFileChooser();
            f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            f.showSaveDialog(null);

            System.out.println(f.getCurrentDirectory());
            System.out.println(f.getSelectedFile());
            final String inFileName = "Users.sqlite";
            File dbFile = new File(inFileName);
            FileInputStream fis = new FileInputStream(dbFile);
            String path = f.getSelectedFile() + "/";
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            String outFileName = path + "/Users.sqlite";

            OutputStream output = new FileOutputStream(outFileName);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }

            output.flush();
            output.close();
            fis.close();
            Popup.customSuccess();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void importDatabase() {
        try {
            JFileChooser f = new JFileChooser();

            f.showSaveDialog(null);

            System.out.println(f.getCurrentDirectory());
            System.out.println(f.getSelectedFile());

            File from = f.getSelectedFile();
            FileInputStream fis = new FileInputStream(from);

            String outFileName = "Users.sqlite";

            OutputStream output = new FileOutputStream(outFileName);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }

            output.flush();
            output.close();
            fis.close();
            Popup.customSuccess();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void changeAdminPassword(String password) {
        if (UserInfo.role.equals("admin")) {

            conn = DbConnection.connect();
            String sql = "UPDATE user_info SET password = '" + password + "' WHERE user_id = '" + UserInfo.userId + "';";
            try {
                Statement st = conn.createStatement();
                st.execute(sql);
                int a = Popup.customWarning("Password changed\nLagin again please!");
                if (a == 0) {
                    this.setVisible(false);
                    Login login = new Login();
                    login.setVisible(true);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            Popup.customError("Access deny");

        }
    }

    private void addKeyLisenerInPasswordChargePanel() {
        passwordForUpdate.requestFocusInWindow();
        passwordForUpdate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    rePasswordForUpdate.requestFocusInWindow();
                }
            }
        });
        rePasswordForUpdate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickUpdatePassword.requestFocusInWindow();
                }
            }
        });
        clickUpdatePassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    String password = passwordForUpdate.getText();
                    String rePassword = rePasswordForUpdate.getText();
                    if (password.equals("") || rePassword.equals("")) {
                        Popup.customError("Empty field found.");

                    } else {
                        if (password.equals(rePassword)) {
                            changeAdminPassword(AES.encrypt(password, Configaration.getPropertiesValueByKey("secretKey")));

                        } else {
                            Popup.customError("Re-type password not match");
                        }
                    }
                }
            }
        });
    }

    private void updateMobileRechargeStatusByTrxId(String trxId, String status, String currentBalance) {
        Connection conn = DbConnection.connect();
        String sql = "UPDATE recharge_admin SET current_balance = '" + currentBalance + "', status = '" + status + "' WHERE trx_id ='" + trxId + "'";
        try {
            Statement st = conn.createStatement();
            st.execute(sql);

        } catch (SQLException ex) {
            Log.error("updateMobileRechargeStatusByTrxId: ", ex.getMessage());
        }
        DbConnection.disconnect();
        loadValueInTableRechargeDetails();
    }

}
