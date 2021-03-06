/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import auto.recharge.system.config.MobileRechargeDetailsComparator;
import auto.recharge.system.dto.*;
import auto.recharge.system.enumClasses.UssdRequestType;
import com.itvillage.AES;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
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
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.lang3.StringUtils;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.border.DropShadowBorder;

public class Home extends javax.swing.JFrame {

    // Final variables
    private final String[] SIM_OPERATORS_NAME = new String[]{"BANGLALINK", "GP", "ROBI", "AIRTEL", "TELETALK"};
    private final String[] MOBILE_BANKING_NANE = {"bKash", "Rocket", "mCash", "tCash", "Nagad", "SureCash", "MyCash", "uCash", "P-Cash", "TeleCash", "IFIC", "OkWallet"};
    private final String TAG = "Home.java";
    private final DBMySQLConnection MYSQL_CONNECTION = new DBMySQLConnection();
    private final Map<String, Queue<Object>> CREATE_HASH_MAP_BY_CONNECTED_PORTS = new HashMap<>();
    private final Set<MobileRechargeDetailsForSearchingDto> MOBILE_RECHARGE_DETAILS_FOR_SEARCHING_DTOS = new HashSet<>();
    private final Set<MobileBankingDetailsForSearchingDto> MOBILE_BANKING_DETAILS_FOR_SEARCHING_DTO = new HashSet<>();
    private final HashMap<String, String> MOBILE_BANKING_BALENCE_HASH_MAP = new HashMap<>();
    private final List<String> ALL_PHONE_NUMBER_LIST_FROM_MOBILE_RECHARGE_TABLE = new ArrayList<>();
    private final DefaultListModel DEFAULT_LIST_MODEL = new DefaultListModel();
    
    // Genaral Variable
    private int countForSellTable = 0;
    private String imagePath = "No Image";
    private LoadingScreen l;
    private String selectedSimOperatorName;
    private String trxId;
    private String[] perseByCommaInInbox;
    private Set<ContractResponse> contractList;
    private JDialog processtingLoderDialog;
    private Double returnForSellTable = 0.0;
    private Double totalPayableAmt = 0.0;
    private Double discountInSellProduct = 0.0;
    private DefaultTableModel product_sell_table_model = new DefaultTableModel(
            new String[]{"SL", "Sell Type", "Bar Code", "Group", "Product Name",
                "QTY", "Price", "SUBTOTAL WITH DISCOUNT"}, 0);
    private double returnAmtInProductSellInDouble = 0.0,
            vatInProductSellInDouble = 0.0,
            payableAmtInProductSellInDouble = 0.0,
            totalItemsInProductSellInDouble = 0.0,
            discountAmtInProductSellInDouble = 0.0,
            dueInProductSellInDouble = 0.0,
            totalPayableAmtAfterDiscountInProductSellInDouble = 0.0;

    public Home() {
        initComponents();
        
        //Load Navication icon and tilte
        URL url = getClass().getResource("/resources/images/logo64.png");
        ImageIcon imgicon = new ImageIcon(url);
        this.setIconImage(imgicon.getImage());
        this.setTitle("Auto Recharge with Managment");

        //Software pre configration
        refrashForWholeSoftware();
        loadDefaultPlaceHolderInWholeSoftware();     
        setBorderInManuBar();
        processingLoderDialog();
        stratApplicationByRoleWise();
        displaySizeConfigaration();
        
        suggList.setModel(DEFAULT_LIST_MODEL);
        popupForSuggestManu.add(suggestPanel);
        
        //Enter Press Method
        //settingPanelEnterPressWork();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suggestPanel = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        suggList = new javax.swing.JList<>();
        popupForSuggestManu = new javax.swing.JPopupMenu();
        dateChooserPanelBeanInfo1 = new com.toedter.calendar.demo.DateChooserPanelBeanInfo();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel19 = new javax.swing.JPanel();
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
        helplineTab = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        settingTab = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        title4 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        netBarPanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        currentNetworkName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pandingRequestCounter = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        basePanel = new javax.swing.JPanel();
        mobileRechargePanel = new javax.swing.JPanel();
        rechargeBalencePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bl = new javax.swing.JPanel();
        blSimName = new javax.swing.JLabel();
        blSimAmount = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        gp = new javax.swing.JPanel();
        gpSimName = new javax.swing.JLabel();
        gpSimAmount = new javax.swing.JLabel();
        gpSimStart = new javax.swing.JButton();
        gpSimClose = new javax.swing.JButton();
        ar = new javax.swing.JPanel();
        arSimName = new javax.swing.JLabel();
        arSimAmount = new javax.swing.JLabel();
        arSimStart = new javax.swing.JButton();
        arSimClose = new javax.swing.JButton();
        rb = new javax.swing.JPanel();
        rbSimName = new javax.swing.JLabel();
        rbSimAmount = new javax.swing.JLabel();
        rbStopBut = new javax.swing.JButton();
        rbStartBut = new javax.swing.JButton();
        tele = new javax.swing.JPanel();
        teleSimName = new javax.swing.JLabel();
        teleSimAmount = new javax.swing.JLabel();
        teleStopBut = new javax.swing.JButton();
        teleStartBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRechargeDetailsShow = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        deviceStartStatus = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        getMobileNumberForSearch = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        selectedSimOperatorIcon = new javax.swing.JLabel();
        clickContactList = new javax.swing.JLabel();
        getPrepaidOrPostpaid = new javax.swing.JComboBox<>();
        clickSend = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        getMobileNumber = new javax.swing.JTextField();
        getAmmountInTk = new javax.swing.JTextField();
        clickUssdDail = new javax.swing.JButton();
        clickGroupLoad = new javax.swing.JButton();
        clickInbox = new javax.swing.JButton();
        clickSIMOffer1 = new javax.swing.JButton();
        generateBarCode = new javax.swing.JButton();
        getSeletedOperatorName = new javax.swing.JComboBox<>();
        billPayPanel = new javax.swing.JPanel();
        clickMobileBanking = new javax.swing.JLabel();
        clickBillPayment = new javax.swing.JLabel();
        hoverViewbKash = new javax.swing.JPanel();
        hoverViewrocket = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        resellerPanel = new javax.swing.JPanel();
        detailsPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        productInfo = new javax.swing.JPanel();
        ProductPurchasePanel1 = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        productDetailsTable = new javax.swing.JTable();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        groupInProductDetails = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        pNameInProductDetails = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        brandInProductDetails = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        buyRateInProductDetails = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        sellRateInProductDetails = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        saveInProductPurchase1 = new javax.swing.JButton();
        searchByGroupInRatio = new javax.swing.JRadioButton();
        listOfBarCodeOrGroupComboBox = new javax.swing.JComboBox<>();
        addPerchangeSelection = new javax.swing.JCheckBox();
        productMasurementProductDetails = new javax.swing.JComboBox<>();
        qtyInProductDetails = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        oderLimitInProductDetails = new javax.swing.JTextField();
        saveInProductPurchase2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel151 = new javax.swing.JLabel();
        warrentyInProductDetails = new javax.swing.JTextField();
        timeTypeProductDetails = new javax.swing.JComboBox<>();
        jLabel135 = new javax.swing.JLabel();
        invoiceINProductDetails = new javax.swing.JLabel();
        barCodeInProductDetails = new javax.swing.JComboBox<>();
        productPurchase = new javax.swing.JPanel();
        ProductPurchasePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        invoiceInProductPurchases = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        supplierInProductPurchases = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        dateInProductPurchases = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        totalAmt = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        tAmountInPPurchaseInSummary = new javax.swing.JLabel();
        totalItems = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        tItemsInPPurchaseInSummary = new javax.swing.JLabel();
        paid = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        tPaidInPPurchase3 = new javax.swing.JLabel();
        comission = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        tCommissionInPPurchaseInSummary = new javax.swing.JLabel();
        paid1 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        tReturnAmountInPPurchase4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        productPurchaseTable = new javax.swing.JTable();
        jLabel126 = new javax.swing.JLabel();
        barCodeInProductPurchases = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        pNameInProductPurchases = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        qtyInProductPurchases = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        buyRateInProductPurchases = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        sellRateInProductPurchases = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        typeInProductPurchasesComboBox = new javax.swing.JComboBox<>();
        makeNewInProductPurchase = new javax.swing.JButton();
        saveInProductPurchase3 = new javax.swing.JButton();
        groupInProductPurchases = new javax.swing.JTextField();
        warrantyTab = new javax.swing.JPanel();
        ProductPurchasePanel3 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        invoiceInProductWarranty = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        customerIdINProductWanrranty = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        comission2 = new javax.swing.JPanel();
        jLabel176 = new javax.swing.JLabel();
        payableInProductWanrranty = new javax.swing.JLabel();
        paid4 = new javax.swing.JPanel();
        jLabel178 = new javax.swing.JLabel();
        paidInProductWanrranty = new javax.swing.JLabel();
        dueInProductWanrranty = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        productWarrantyTable = new javax.swing.JTable();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        fullNameInProductWanrranty = new javax.swing.JTextField();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        addressInProductWanrranty = new javax.swing.JTextField();
        jLabel185 = new javax.swing.JLabel();
        phoneNOInProductWanrranty = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        dateInProductWanrranty = new com.toedter.calendar.JDateChooser();
        delevaryDateDateInProductWanrranty = new com.toedter.calendar.JDateChooser();
        jPanel13 = new javax.swing.JPanel();
        jLabel188 = new javax.swing.JLabel();
        brandInProductWanrranty = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        warrantyInProductWanrranty = new javax.swing.JTextField();
        jLabel190 = new javax.swing.JLabel();
        paidPaymentInProductWanrranty = new javax.swing.JTextField();
        discpuntInProductWanrranty = new javax.swing.JTextField();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        billInProductWanrranty = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        statusInProductWanrrantyComboBox = new javax.swing.JComboBox<>();
        jScrollPane17 = new javax.swing.JScrollPane();
        problemInProductWanrranty = new javax.swing.JTextPane();
        updateClickProductWanrranty = new javax.swing.JButton();
        printClickProductWanrranty = new javax.swing.JButton();
        jLabel187 = new javax.swing.JLabel();
        refNameInProductWanrranty = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        printClickProductWanrranty1 = new javax.swing.JButton();
        billPanel = new javax.swing.JPanel();
        ProductPurchasePanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        invoiceInProductSell = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        customerIdINProductSell = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        totalAmt1 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        totalItemsInProductSell = new javax.swing.JLabel();
        returnInProductSell = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        discountInProductSell = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        vatInProductSell = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        totalAmountInProductSell1 = new javax.swing.JLabel();
        comission1 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        payableInProductSell = new javax.swing.JLabel();
        paid3 = new javax.swing.JPanel();
        jLabel156 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        paidInProductSell = new javax.swing.JLabel();
        duePaymentInProductSell = new javax.swing.JLabel();
        dueInProductSell = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        paymentWayInProductSell = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        productSellTable = new javax.swing.JTable();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        fullNameInProductSell = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        addressInProductSell = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        phoneNOInProductSell = new javax.swing.JTextField();
        jLabel160 = new javax.swing.JLabel();
        panddingListnProductSellComboBox = new javax.swing.JComboBox<>();
        jLabel138 = new javax.swing.JLabel();
        dateInProductSell = new com.toedter.calendar.JDateChooser();
        dueDateInProductSell = new com.toedter.calendar.JDateChooser();
        actionTypeInProductSellCOmboBox = new javax.swing.JComboBox<>();
        panddingInProductSellCheckBOx = new javax.swing.JCheckBox();
        noteInProductSell = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel164 = new javax.swing.JLabel();
        paymentInProductBill = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        warrantyInProductBill = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        duePaymentInProductBill = new javax.swing.JTextField();
        paymentTypeInProductSell = new javax.swing.JComboBox<>();
        jLabel171 = new javax.swing.JLabel();
        barCodeInProductSell = new javax.swing.JComboBox<>();
        discpuntInProductBill = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
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
        jLabel23 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        clickAddNewManagement = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        ussdSettedTable = new javax.swing.JTable();
        MobileBankingSettingsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        getSelectedServiceCombo = new javax.swing.JTextField();
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
        jPanel18 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        clickAddContract2 = new javax.swing.JButton();
        getprofitIn1k = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        getOparetorNameInUssdCommand = new javax.swing.JComboBox<>();
        clickChooseIcon1 = new javax.swing.JButton();
        getRechargeUssdParternPrePaid1 = new javax.swing.JTextField();
        accountPassword1 = new javax.swing.JPasswordField();
        jLabel47 = new javax.swing.JLabel();
        labelUssdPatternSkitto = new javax.swing.JLabel();
        getRechargeUssdParternSkitto = new javax.swing.JTextField();
        getRechargeUssdParternPostPaid1 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        getBalenceUssdPartern3 = new javax.swing.JTextField();
        systemBackup = new javax.swing.JLabel();
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
        jLabel103 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel24 = new javax.swing.JPanel();
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
        back = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableContractLIst = new javax.swing.JTable();
        clickNewContract = new javax.swing.JButton();
        getNameForSearch = new javax.swing.JTextField();
        addNewManagementPanel = new javax.swing.JPanel();
        backToUssdManengementPanel = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        clickAddContract1 = new javax.swing.JButton();
        getOperatorName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
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
        getServiceName = new javax.swing.JComboBox<>();
        jLabel83 = new javax.swing.JLabel();
        getOperationType = new javax.swing.JComboBox<>();
        rechargeBalencePanel1 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane8 = new javax.swing.JScrollPane();
        mobileBankingBalanceShowPanelList = new javax.swing.JList<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        tableMobileBankingDetails = new javax.swing.JTable();
        jLabel84 = new javax.swing.JLabel();
        contractListClick = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        searchingByName = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        getPhoneNumberInBillPayment = new javax.swing.JTextField();
        getAmmountInBillPayment = new javax.swing.JTextField();
        getSimOperatorName = new javax.swing.JComboBox<>();
        clickSandInMB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        UsingCustomerId = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        getCustomerId = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        payInUsingCustomerId = new javax.swing.JButton();
        resetnUsingCustomerId = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        getPassword = new javax.swing.JPasswordField();
        dateInProductBillPay = new com.toedter.calendar.JDateChooser();
        usingBillNoPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        getBillNO = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        clickPayIUsingBill = new javax.swing.JButton();
        clickResetPayInUsingBill = new javax.swing.JButton();
        getPasswordInBillPay = new javax.swing.JPasswordField();
        inboxJpanel = new javax.swing.JPanel();
        back1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        inboxTable = new javax.swing.JTable();
        searchInInbox = new javax.swing.JTextField();
        getRechargeName = new javax.swing.JPanel();
        back44 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        forBarCodePhoneNumber3 = new javax.swing.JTextField();
        clickAddForRechargeBarCode = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        getNameForRechargeBarCode1 = new javax.swing.JTextField();
        forBarCodePhoneNumber4 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        forBarCodePhoneNumber2 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        forBarCodePhoneNumber5 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        forBarCodePhoneNumber6 = new javax.swing.JTextField();
        forBarCodePhoneNumber7 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        forBarCodePhoneNumber8 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        forBarCodePhoneNumber9 = new javax.swing.JTextField();
        forBarCodePhoneNumber10 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();

        suggestPanel.setPreferredSize(new java.awt.Dimension(670, 471));

        suggList.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        suggList.setSelectionBackground(new java.awt.Color(204, 0, 51));
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

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(133, 47, 209));
        menuPanel.setPreferredSize(new java.awt.Dimension(200, 1004));
        menuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPanelMouseClicked(evt);
            }
        });

        logoPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setBackground(new java.awt.Color(255, 102, 102));
        jLabel55.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Auto Recharge System");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mobileRechargeTab.setBackground(new java.awt.Color(255, 255, 255));
        mobileRechargeTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mobileRechargeTab.setForeground(new java.awt.Color(153, 153, 255));
        mobileRechargeTab.setMaximumSize(new java.awt.Dimension(100, 100));
        mobileRechargeTab.setPreferredSize(new java.awt.Dimension(100, 100));
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

        title.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        title.setForeground(new java.awt.Color(133, 47, 209));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Recharge");

        javax.swing.GroupLayout mobileRechargeTabLayout = new javax.swing.GroupLayout(mobileRechargeTab);
        mobileRechargeTab.setLayout(mobileRechargeTabLayout);
        mobileRechargeTabLayout.setHorizontalGroup(
            mobileRechargeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mobileRechargeTabLayout.setVerticalGroup(
            mobileRechargeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargeTabLayout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        billPaymentTab.setBackground(new java.awt.Color(133, 47, 209));
        billPaymentTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        title1.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Mobile Banking");

        javax.swing.GroupLayout billPaymentTabLayout = new javax.swing.GroupLayout(billPaymentTab);
        billPaymentTab.setLayout(billPaymentTabLayout);
        billPaymentTabLayout.setHorizontalGroup(
            billPaymentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPaymentTabLayout.createSequentialGroup()
                .addGroup(billPaymentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(icon1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        billPaymentTabLayout.setVerticalGroup(
            billPaymentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPaymentTabLayout.createSequentialGroup()
                .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title1)
                .addContainerGap())
        );

        detailsTab.setBackground(new java.awt.Color(133, 47, 209));
        detailsTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        title3.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        title3.setForeground(new java.awt.Color(255, 255, 255));
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("Shop Management");

        javax.swing.GroupLayout detailsTabLayout = new javax.swing.GroupLayout(detailsTab);
        detailsTab.setLayout(detailsTabLayout);
        detailsTabLayout.setHorizontalGroup(
            detailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsTabLayout.createSequentialGroup()
                .addGroup(detailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(icon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        detailsTabLayout.setVerticalGroup(
            detailsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsTabLayout.createSequentialGroup()
                .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        helplineTab.setBackground(new java.awt.Color(133, 47, 209));
        helplineTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        title5.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        title5.setForeground(new java.awt.Color(255, 255, 255));
        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("Help Line");

        javax.swing.GroupLayout helplineTabLayout = new javax.swing.GroupLayout(helplineTab);
        helplineTab.setLayout(helplineTabLayout);
        helplineTabLayout.setHorizontalGroup(
            helplineTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplineTabLayout.createSequentialGroup()
                .addGroup(helplineTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(icon5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        helplineTabLayout.setVerticalGroup(
            helplineTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplineTabLayout.createSequentialGroup()
                .addComponent(icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingTab.setBackground(new java.awt.Color(133, 47, 209));
        settingTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        title4.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        title4.setForeground(new java.awt.Color(255, 255, 255));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("settings");

        javax.swing.GroupLayout settingTabLayout = new javax.swing.GroupLayout(settingTab);
        settingTab.setLayout(settingTabLayout);
        settingTabLayout.setHorizontalGroup(
            settingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(icon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        settingTabLayout.setVerticalGroup(
            settingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingTabLayout.createSequentialGroup()
                .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(helplineTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(billPaymentTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detailsTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mobileRechargeTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addComponent(settingTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobileRechargeTab, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billPaymentTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helplineTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerLabel.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(133, 47, 209));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        headerLabel.setText("Mobile Recharge");
        headerLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        netBarPanel.setBackground(new java.awt.Color(133, 47, 209));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        currentNetworkName.setBackground(new java.awt.Color(255, 255, 255));
        currentNetworkName.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        currentNetworkName.setForeground(new java.awt.Color(102, 102, 255));
        currentNetworkName.setText("No SIIM Avaiable");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentNetworkName, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_icon.png"))); // NOI18N

        javax.swing.GroupLayout netBarPanelLayout = new javax.swing.GroupLayout(netBarPanel);
        netBarPanel.setLayout(netBarPanelLayout);
        netBarPanelLayout.setHorizontalGroup(
            netBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, netBarPanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        netBarPanelLayout.setVerticalGroup(
            netBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(netBarPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(netBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pandingRequestCounter.setBackground(new java.awt.Color(255, 255, 255));
        pandingRequestCounter.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        pandingRequestCounter.setForeground(new java.awt.Color(51, 0, 102));
        pandingRequestCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pandingRequestCounter.setText("0");

        jLabel43.setBackground(new java.awt.Color(255, 0, 51));
        jLabel43.setFont(new java.awt.Font("Agency FB", 1, 11)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Pandding request");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("For Buy, ");

        jLabel56.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Md Afsar Ali");

        jLabel101.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(204, 0, 51));
        jLabel101.setText("01816385858,01913350462");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel101))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pandingRequestCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(netBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(netBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pandingRequestCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        basePanel.setBackground(new java.awt.Color(255, 255, 255));
        basePanel.setLayout(new java.awt.CardLayout());

        mobileRechargePanel.setBackground(new java.awt.Color(255, 255, 255));

        rechargeBalencePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIM Panel");

        jSeparator1.setForeground(new java.awt.Color(133, 47, 209));

        bl.setForeground(new java.awt.Color(204, 204, 255));

        blSimName.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        blSimName.setText("BL");

        blSimAmount.setFont(new java.awt.Font("Source Sans Pro", 1, 10)); // NOI18N
        blSimAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blSimAmount.setText("100000 tk");

        jButton8.setBackground(new java.awt.Color(204, 51, 0));
        jButton8.setText("Stop");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 153, 0));
        jButton9.setText("Start");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout blLayout = new javax.swing.GroupLayout(bl);
        bl.setLayout(blLayout);
        blLayout.setHorizontalGroup(
            blLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(blSimName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blSimAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(0, 0, 0))
        );
        blLayout.setVerticalGroup(
            blLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(blSimName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(blSimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton8)
                .addComponent(jButton9))
        );

        gpSimName.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        gpSimName.setText("GP");

        gpSimAmount.setFont(new java.awt.Font("Source Sans Pro", 1, 10)); // NOI18N
        gpSimAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpSimAmount.setText("100000 tk");

        gpSimStart.setBackground(new java.awt.Color(204, 51, 0));
        gpSimStart.setText("Stop");
        gpSimStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpSimStartActionPerformed(evt);
            }
        });

        gpSimClose.setBackground(new java.awt.Color(0, 153, 0));
        gpSimClose.setText("Start");
        gpSimClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpSimCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gpLayout = new javax.swing.GroupLayout(gp);
        gp.setLayout(gpLayout);
        gpLayout.setHorizontalGroup(
            gpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(gpSimName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpSimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpSimClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpSimStart))
        );
        gpLayout.setVerticalGroup(
            gpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gpSimName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gpSimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gpSimClose)
            .addComponent(gpSimStart)
        );

        arSimName.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        arSimName.setText("AR");

        arSimAmount.setFont(new java.awt.Font("Source Sans Pro", 1, 10)); // NOI18N
        arSimAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arSimAmount.setText("100000 tk");

        arSimStart.setBackground(new java.awt.Color(204, 51, 0));
        arSimStart.setText("Stop");
        arSimStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arSimStartActionPerformed(evt);
            }
        });

        arSimClose.setBackground(new java.awt.Color(0, 153, 0));
        arSimClose.setText("Start");
        arSimClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arSimCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout arLayout = new javax.swing.GroupLayout(ar);
        ar.setLayout(arLayout);
        arLayout.setHorizontalGroup(
            arLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(arSimName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arSimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arSimClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arSimStart))
        );
        arLayout.setVerticalGroup(
            arLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(arSimName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(arSimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(arSimClose)
            .addComponent(arSimStart)
        );

        rbSimName.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        rbSimName.setText("RB");

        rbSimAmount.setFont(new java.awt.Font("Source Sans Pro", 1, 10)); // NOI18N
        rbSimAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbSimAmount.setText("100000 tk");

        rbStopBut.setBackground(new java.awt.Color(204, 51, 0));
        rbStopBut.setText("Stop");
        rbStopBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStopButActionPerformed(evt);
            }
        });

        rbStartBut.setBackground(new java.awt.Color(0, 153, 0));
        rbStartBut.setText("Start");
        rbStartBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStartButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rbLayout = new javax.swing.GroupLayout(rb);
        rb.setLayout(rbLayout);
        rbLayout.setHorizontalGroup(
            rbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rbLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(rbSimName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSimAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbStartBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbStopBut)
                .addGap(0, 0, 0))
        );
        rbLayout.setVerticalGroup(
            rbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbSimName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rbSimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rbStopBut)
                .addComponent(rbStartBut))
        );

        teleSimName.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        teleSimName.setText("TELE");

        teleSimAmount.setFont(new java.awt.Font("Source Sans Pro", 1, 10)); // NOI18N
        teleSimAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teleSimAmount.setText("100000 tk");

        teleStopBut.setBackground(new java.awt.Color(204, 51, 0));
        teleStopBut.setText("Stop");
        teleStopBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleStopButActionPerformed(evt);
            }
        });

        teleStartBut.setBackground(new java.awt.Color(0, 153, 0));
        teleStartBut.setText("Start");
        teleStartBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleStartButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teleLayout = new javax.swing.GroupLayout(tele);
        tele.setLayout(teleLayout);
        teleLayout.setHorizontalGroup(
            teleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teleLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(teleSimName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teleSimAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teleStartBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teleStopBut)
                .addGap(0, 0, 0))
        );
        teleLayout.setVerticalGroup(
            teleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(teleSimName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(teleSimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(teleStopBut)
                .addComponent(teleStartBut))
        );

        javax.swing.GroupLayout rechargeBalencePanelLayout = new javax.swing.GroupLayout(rechargeBalencePanel);
        rechargeBalencePanel.setLayout(rechargeBalencePanelLayout);
        rechargeBalencePanelLayout.setHorizontalGroup(
            rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(bl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rechargeBalencePanelLayout.setVerticalGroup(
            rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeBalencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        tableRechargeDetailsShow.getTableHeader().setReorderingAllowed(false);
        tableRechargeDetailsShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRechargeDetailsShowMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableRechargeDetailsShow);

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Today's Recharge");

        deviceStartStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deviceStartStatus.setForeground(new java.awt.Color(204, 0, 51));

        jLabel172.setBackground(new java.awt.Color(51, 0, 102));
        jLabel172.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(51, 0, 102));
        jLabel172.setText("Search By Date or Phone Number Or Amount");

        getMobileNumberForSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMobileNumberForSearchActionPerformed(evt);
            }
        });
        getMobileNumberForSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getMobileNumberForSearchKeyReleased(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(153, 0, 255));

        selectedSimOperatorIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedSimOperatorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/default_operator_icon_1.png"))); // NOI18N

        clickContactList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clickContactList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/phone_book.png"))); // NOI18N
        clickContactList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickContactListMouseClicked(evt);
            }
        });

        getPrepaidOrPostpaid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getPrepaidOrPostpaid.setForeground(new java.awt.Color(255, 153, 153));
        getPrepaidOrPostpaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid", "Skitto" }));
        getPrepaidOrPostpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrepaidOrPostpaidActionPerformed(evt);
            }
        });

        clickSend.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        clickSend.setText("Send");
        clickSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectedSimOperatorIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clickSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getPrepaidOrPostpaid, 0, 152, Short.MAX_VALUE)
                    .addComponent(clickContactList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(clickContactList, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedSimOperatorIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getPrepaidOrPostpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clickSend, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getMobileNumber.setFont(new java.awt.Font("Arial", 1, 90)); // NOI18N
        getMobileNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getMobileNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        getAmmountInTk.setFont(new java.awt.Font("Arial", 1, 90)); // NOI18N
        getAmmountInTk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 102), null, null));
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

        clickUssdDail.setBackground(new java.awt.Color(153, 0, 255));
        clickUssdDail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickUssdDail.setForeground(new java.awt.Color(255, 255, 255));
        clickUssdDail.setText("Ussd Dial");
        clickUssdDail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUssdDailActionPerformed(evt);
            }
        });

        clickGroupLoad.setBackground(new java.awt.Color(153, 0, 255));
        clickGroupLoad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickGroupLoad.setForeground(new java.awt.Color(255, 255, 255));
        clickGroupLoad.setText("Group Load");
        clickGroupLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickGroupLoadActionPerformed(evt);
            }
        });

        clickInbox.setBackground(new java.awt.Color(153, 0, 255));
        clickInbox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickInbox.setForeground(new java.awt.Color(255, 255, 255));
        clickInbox.setText("INBOX");
        clickInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickInboxActionPerformed(evt);
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

        generateBarCode.setBackground(new java.awt.Color(153, 0, 255));
        generateBarCode.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        generateBarCode.setForeground(new java.awt.Color(255, 255, 255));
        generateBarCode.setText("Bar Code");
        generateBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBarCodeActionPerformed(evt);
            }
        });

        getSeletedOperatorName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getSeletedOperatorName.setForeground(new java.awt.Color(204, 0, 0));
        getSeletedOperatorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSeletedOperatorNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(getAmmountInTk, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addComponent(clickInbox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(getSeletedOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(clickUssdDail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clickSIMOffer1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(clickGroupLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(generateBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clickUssdDail)
                            .addComponent(clickSIMOffer1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clickGroupLoad)
                            .addComponent(generateBarCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clickInbox)
                            .addComponent(getSeletedOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(getAmmountInTk, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout mobileRechargePanelLayout = new javax.swing.GroupLayout(mobileRechargePanel);
        mobileRechargePanel.setLayout(mobileRechargePanelLayout);
        mobileRechargePanelLayout.setHorizontalGroup(
            mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mobileRechargePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deviceStartStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                        .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mobileRechargePanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(283, 283, 283)
                                .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getMobileNumberForSearch))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mobileRechargePanelLayout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rechargeBalencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        mobileRechargePanelLayout.setVerticalGroup(
            mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rechargeBalencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mobileRechargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(getMobileNumberForSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deviceStartStatus))
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
                .addContainerGap()
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hoverViewbKash, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(clickMobileBanking, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clickBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hoverViewrocket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(736, Short.MAX_VALUE))
        );
        billPayPanelLayout.setVerticalGroup(
            billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clickMobileBanking, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(clickBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel85))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hoverViewbKash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoverViewrocket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        basePanel.add(billPayPanel, "card2");

        resellerPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout resellerPanelLayout = new javax.swing.GroupLayout(resellerPanel);
        resellerPanel.setLayout(resellerPanelLayout);
        resellerPanelLayout.setHorizontalGroup(
            resellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1183, Short.MAX_VALUE)
        );
        resellerPanelLayout.setVerticalGroup(
            resellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );

        basePanel.add(resellerPanel, "card2");

        detailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        detailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsPanelMouseClicked(evt);
            }
        });

        productInfo.setBackground(new java.awt.Color(204, 204, 255));

        ProductPurchasePanel1.setBackground(new java.awt.Color(204, 204, 255));
        ProductPurchasePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductPurchasePanel1MouseClicked(evt);
            }
        });

        jLabel136.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel136.setText("Search By");

        productDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Barcode", "Group", "Pro", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(productDetailsTable);
        if (productDetailsTable.getColumnModel().getColumnCount() > 0) {
            productDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            productDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            productDetailsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel143.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel143.setText("Barcode      ");

        jLabel144.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel144.setText("Group        ");

        groupInProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupInProductDetailsActionPerformed(evt);
            }
        });

        jLabel145.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel145.setText("Product Name :");

        jLabel146.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel146.setText("Brand  ");

        jLabel147.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel147.setText("BUY RATE   ");

        jLabel148.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel148.setText("SELL RATE  :");

        jLabel149.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel149.setText("Stock Openning: ");

        saveInProductPurchase1.setBackground(new java.awt.Color(255, 102, 102));
        saveInProductPurchase1.setForeground(new java.awt.Color(255, 255, 255));
        saveInProductPurchase1.setText("Update");
        saveInProductPurchase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveInProductPurchase1MouseClicked(evt);
            }
        });
        saveInProductPurchase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInProductPurchase1ActionPerformed(evt);
            }
        });

        searchByGroupInRatio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchByGroupInRatio.setText("scarch by group");
        searchByGroupInRatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByGroupInRatioActionPerformed(evt);
            }
        });

        listOfBarCodeOrGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfBarCodeOrGroupComboBoxActionPerformed(evt);
            }
        });

        addPerchangeSelection.setBackground(new java.awt.Color(204, 204, 255));
        addPerchangeSelection.setText("%");

        productMasurementProductDetails.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pics", "Kg", "Litter", "Meter", "Feet", "Bag", "Bundle", "Dozon", " " }));

        jLabel150.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel150.setText("Ordar LImit ");

        oderLimitInProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oderLimitInProductDetailsActionPerformed(evt);
            }
        });

        saveInProductPurchase2.setBackground(new java.awt.Color(255, 102, 102));
        saveInProductPurchase2.setForeground(new java.awt.Color(255, 255, 255));
        saveInProductPurchase2.setText("DELETE");
        saveInProductPurchase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveInProductPurchase2MouseClicked(evt);
            }
        });
        saveInProductPurchase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInProductPurchase2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Bar code");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel151.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel151.setText("Warranty    ");

        timeTypeProductDetails.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "day", "month", "year" }));

        jLabel135.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 51, 51));
        jLabel135.setText("INVOICE #");

        invoiceINProductDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        barCodeInProductDetails.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout ProductPurchasePanel1Layout = new javax.swing.GroupLayout(ProductPurchasePanel1);
        ProductPurchasePanel1.setLayout(ProductPurchasePanel1Layout);
        ProductPurchasePanel1Layout.setHorizontalGroup(
            ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                .addComponent(jLabel135)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceINProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchByGroupInRatio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listOfBarCodeOrGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel146)
                                    .addComponent(jLabel150)
                                    .addComponent(jLabel143))
                                .addGap(30, 30, 30)
                                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(oderLimitInProductDetails)
                                    .addComponent(brandInProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(barCodeInProductDetails, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel147)
                                    .addComponent(jLabel151)
                                    .addComponent(jLabel144, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                        .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buyRateInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                                .addComponent(warrentyInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(timeTypeProductDetails, 0, 1, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel148)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addPerchangeSelection))
                                            .addComponent(jLabel149))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                                .addComponent(qtyInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(saveInProductPurchase2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                                .addComponent(sellRateInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(productMasurementProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                                    .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                        .addComponent(groupInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel145)
                                        .addGap(36, 36, 36)
                                        .addComponent(pNameInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveInProductPurchase1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        ProductPurchasePanel1Layout.setVerticalGroup(
            ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel136)
                        .addComponent(searchByGroupInRatio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listOfBarCodeOrGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(invoiceINProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel135)))
                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(groupInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel145)
                                .addComponent(jLabel144))
                            .addComponent(jLabel143)
                            .addComponent(pNameInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveInProductPurchase1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barCodeInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buyRateInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel147)
                            .addComponent(jLabel149)))
                    .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                        .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel146)
                                    .addComponent(brandInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ProductPurchasePanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(saveInProductPurchase2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qtyInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel150)
                                .addComponent(oderLimitInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(warrentyInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel151)
                                .addComponent(jLabel148)
                                .addComponent(addPerchangeSelection)
                                .addComponent(sellRateInProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(productMasurementProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(timeTypeProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout productInfoLayout = new javax.swing.GroupLayout(productInfo);
        productInfo.setLayout(productInfoLayout);
        productInfoLayout.setHorizontalGroup(
            productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductPurchasePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productInfoLayout.setVerticalGroup(
            productInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productInfoLayout.createSequentialGroup()
                .addComponent(ProductPurchasePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Product Information", productInfo);

        productPurchase.setBackground(new java.awt.Color(204, 204, 255));
        productPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productPurchaseMouseClicked(evt);
            }
        });

        ProductPurchasePanel.setBackground(new java.awt.Color(204, 204, 255));
        ProductPurchasePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductPurchasePanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setText("INVOICE ");

        invoiceInProductPurchases.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        invoiceInProductPurchases.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        invoiceInProductPurchases.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                invoiceInProductPurchasesKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setText("SUPPLIER ");

        supplierInProductPurchases.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        supplierInProductPurchases.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel119.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel119.setText("DATE ");

        jLabel131.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 102, 102));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("Summary");

        totalAmt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel120.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("TOTAL AMOUNT");

        tAmountInPPurchaseInSummary.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tAmountInPPurchaseInSummary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tAmountInPPurchaseInSummary.setText("0.0");

        javax.swing.GroupLayout totalAmtLayout = new javax.swing.GroupLayout(totalAmt);
        totalAmt.setLayout(totalAmtLayout);
        totalAmtLayout.setHorizontalGroup(
            totalAmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalAmtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tAmountInPPurchaseInSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(totalAmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(totalAmtLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel120, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        totalAmtLayout.setVerticalGroup(
            totalAmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalAmtLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(tAmountInPPurchaseInSummary))
            .addGroup(totalAmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(totalAmtLayout.createSequentialGroup()
                    .addComponent(jLabel120)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        totalItems.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel122.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("TOTAL ITEMS");

        tItemsInPPurchaseInSummary.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tItemsInPPurchaseInSummary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tItemsInPPurchaseInSummary.setText("0.0");

        javax.swing.GroupLayout totalItemsLayout = new javax.swing.GroupLayout(totalItems);
        totalItems.setLayout(totalItemsLayout);
        totalItemsLayout.setHorizontalGroup(
            totalItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tItemsInPPurchaseInSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        totalItemsLayout.setVerticalGroup(
            totalItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalItemsLayout.createSequentialGroup()
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tItemsInPPurchaseInSummary))
        );

        paid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel124.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("PAID");

        tPaidInPPurchase3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tPaidInPPurchase3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tPaidInPPurchase3.setText("0.0");

        javax.swing.GroupLayout paidLayout = new javax.swing.GroupLayout(paid);
        paid.setLayout(paidLayout);
        paidLayout.setHorizontalGroup(
            paidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paidLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tPaidInPPurchase3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paidLayout.setVerticalGroup(
            paidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paidLayout.createSequentialGroup()
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPaidInPPurchase3))
        );

        comission.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel123.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("COMMISSION");

        tCommissionInPPurchaseInSummary.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tCommissionInPPurchaseInSummary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tCommissionInPPurchaseInSummary.setText("0.0");

        javax.swing.GroupLayout comissionLayout = new javax.swing.GroupLayout(comission);
        comission.setLayout(comissionLayout);
        comissionLayout.setHorizontalGroup(
            comissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comissionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tCommissionInPPurchaseInSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        comissionLayout.setVerticalGroup(
            comissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comissionLayout.createSequentialGroup()
                .addComponent(jLabel123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCommissionInPPurchaseInSummary)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        paid1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel125.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("RETURN AMOUNT");

        tReturnAmountInPPurchase4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tReturnAmountInPPurchase4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tReturnAmountInPPurchase4.setText("0.0");

        javax.swing.GroupLayout paid1Layout = new javax.swing.GroupLayout(paid1);
        paid1.setLayout(paid1Layout);
        paid1Layout.setHorizontalGroup(
            paid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paid1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(tReturnAmountInPPurchase4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paid1Layout.setVerticalGroup(
            paid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paid1Layout.createSequentialGroup()
                .addComponent(jLabel125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tReturnAmountInPPurchase4))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comission, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productPurchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Barcode", "Group", "Pro", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(productPurchaseTable);
        if (productPurchaseTable.getColumnModel().getColumnCount() > 0) {
            productPurchaseTable.getColumnModel().getColumn(1).setResizable(false);
            productPurchaseTable.getColumnModel().getColumn(2).setResizable(false);
            productPurchaseTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel126.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel126.setText("Barcode :");

        jLabel127.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel127.setText("Group:");

        jLabel128.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel128.setText("Product Name:");

        jLabel129.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel129.setText("QTY :");

        jLabel130.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel130.setText("BUY RATE:");

        jLabel132.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel132.setText("SELL RATE:");

        jLabel133.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel133.setText("TYPE :");

        typeInProductPurchasesComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typeInProductPurchasesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PURCHASE", "RETURN", "OFFER" }));

        makeNewInProductPurchase.setBackground(new java.awt.Color(255, 102, 102));
        makeNewInProductPurchase.setForeground(new java.awt.Color(255, 255, 255));
        makeNewInProductPurchase.setText("New Invoice");
        makeNewInProductPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makeNewInProductPurchaseMouseClicked(evt);
            }
        });
        makeNewInProductPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeNewInProductPurchaseActionPerformed(evt);
            }
        });

        saveInProductPurchase3.setBackground(new java.awt.Color(255, 102, 102));
        saveInProductPurchase3.setForeground(new java.awt.Color(255, 255, 255));
        saveInProductPurchase3.setText("Add");
        saveInProductPurchase3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInProductPurchase3ActionPerformed(evt);
            }
        });

        groupInProductPurchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupInProductPurchasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductPurchasePanelLayout = new javax.swing.GroupLayout(ProductPurchasePanel);
        ProductPurchasePanel.setLayout(ProductPurchasePanelLayout);
        ProductPurchasePanelLayout.setHorizontalGroup(
            ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                        .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtyInProductPurchases))
                            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceInProductPurchases)
                                    .addComponent(barCodeInProductPurchases))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                .addComponent(buyRateInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeInProductPurchasesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(supplierInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(groupInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel128)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pNameInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sellRateInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(saveInProductPurchase3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(makeNewInProductPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ProductPurchasePanelLayout.setVerticalGroup(
            ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateInProductPurchases, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(invoiceInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(supplierInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel128)
                        .addComponent(pNameInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(barCodeInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel127))
                            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel126)))
                        .addGap(6, 6, 6)
                        .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel129))
                            .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(qtyInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel130))))
                    .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                        .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(groupInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel132)))
                            .addGroup(ProductPurchasePanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(sellRateInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buyRateInProductPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel133))
                            .addComponent(typeInProductPurchasesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveInProductPurchase3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeNewInProductPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProductPurchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout productPurchaseLayout = new javax.swing.GroupLayout(productPurchase);
        productPurchase.setLayout(productPurchaseLayout);
        productPurchaseLayout.setHorizontalGroup(
            productPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPurchaseLayout.createSequentialGroup()
                .addComponent(ProductPurchasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        productPurchaseLayout.setVerticalGroup(
            productPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPurchaseLayout.createSequentialGroup()
                .addComponent(ProductPurchasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Product Purchase", productPurchase);

        warrantyTab.setBackground(new java.awt.Color(204, 204, 255));

        ProductPurchasePanel3.setBackground(new java.awt.Color(204, 204, 255));
        ProductPurchasePanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductPurchasePanel3MouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel50.setText("INVOICE #");

        invoiceInProductWarranty.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        invoiceInProductWarranty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        invoiceInProductWarranty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                invoiceInProductWarrantyKeyReleased(evt);
            }
        });

        jLabel169.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel169.setText("Customer Id");

        customerIdINProductWanrranty.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        customerIdINProductWanrranty.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel170.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 102, 102));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel170.setText("Summary");

        comission2.setBackground(new java.awt.Color(255, 204, 51));
        comission2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel176.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(51, 51, 51));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel176.setText("PAYABLE");

        payableInProductWanrranty.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        payableInProductWanrranty.setForeground(new java.awt.Color(51, 51, 51));
        payableInProductWanrranty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payableInProductWanrranty.setText("0.0");

        javax.swing.GroupLayout comission2Layout = new javax.swing.GroupLayout(comission2);
        comission2.setLayout(comission2Layout);
        comission2Layout.setHorizontalGroup(
            comission2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comission2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(payableInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        comission2Layout.setVerticalGroup(
            comission2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comission2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(comission2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payableInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        paid4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel178.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel178.setText("PAID: ");

        paidInProductWanrranty.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        paidInProductWanrranty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paidInProductWanrranty.setText("0.0");

        dueInProductWanrranty.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        dueInProductWanrranty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dueInProductWanrranty.setText("0.0");

        jLabel179.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel179.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel179.setText("DUE: ");

        javax.swing.GroupLayout paid4Layout = new javax.swing.GroupLayout(paid4);
        paid4.setLayout(paid4Layout);
        paid4Layout.setHorizontalGroup(
            paid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paid4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paid4Layout.createSequentialGroup()
                        .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paidInProductWanrranty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paid4Layout.createSequentialGroup()
                        .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(dueInProductWanrranty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paid4Layout.setVerticalGroup(
            paid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paid4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paidInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel170, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comission2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paid4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel170)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comission2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paid4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productWarrantyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Barcode", "Group", "Pro", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productWarrantyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productWarrantyTableMouseClicked(evt);
            }
        });
        productWarrantyTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productWarrantyTableKeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(productWarrantyTable);
        if (productWarrantyTable.getColumnModel().getColumnCount() > 0) {
            productWarrantyTable.getColumnModel().getColumn(1).setResizable(false);
            productWarrantyTable.getColumnModel().getColumn(2).setResizable(false);
            productWarrantyTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel181.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel181.setText("Date :");

        jLabel182.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel182.setText("Full Name: ");

        fullNameInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameInProductWanrrantyActionPerformed(evt);
            }
        });
        fullNameInProductWanrranty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fullNameInProductWanrrantyKeyReleased(evt);
            }
        });

        jLabel183.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel183.setText("Delivary Date: ");

        jLabel184.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel184.setText("Address");

        addressInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressInProductWanrrantyActionPerformed(evt);
            }
        });

        jLabel185.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel185.setText("Mobile No.");

        phoneNOInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNOInProductWanrrantyActionPerformed(evt);
            }
        });

        jLabel186.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel186.setText("Problam");

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));

        jLabel188.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel188.setText("Bill       :");

        brandInProductWanrranty.setText("None");
        brandInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandInProductWanrrantyActionPerformed(evt);
            }
        });

        jLabel189.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel189.setText("Warranty");

        warrantyInProductWanrranty.setText("0.0");
        warrantyInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyInProductWanrrantyActionPerformed(evt);
            }
        });

        jLabel190.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel190.setText("Paid     :");

        paidPaymentInProductWanrranty.setText("0.0");
        paidPaymentInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidPaymentInProductWanrrantyActionPerformed(evt);
            }
        });

        discpuntInProductWanrranty.setText("0.0");
        discpuntInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discpuntInProductWanrrantyActionPerformed(evt);
            }
        });

        jLabel191.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel191.setText("Discount(%)    ");

        jLabel192.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel192.setText("Brand   :");

        billInProductWanrranty.setText("0.0");
        billInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billInProductWanrrantyActionPerformed(evt);
            }
        });

        jLabel193.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel193.setText("Status");

        statusInProductWanrrantyComboBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        statusInProductWanrrantyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pandding", "Success", "Return" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel188)
                            .addComponent(jLabel190))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paidPaymentInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel192)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brandInProductWanrranty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel191))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discpuntInProductWanrranty)
                            .addComponent(warrantyInProductWanrranty)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusInProductWanrrantyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel192)
                        .addComponent(brandInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel193))
                    .addComponent(statusInProductWanrrantyComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel188)
                    .addComponent(jLabel189)
                    .addComponent(warrantyInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel190)
                        .addComponent(paidPaymentInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel191)
                        .addComponent(discpuntInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jScrollPane17.setViewportView(problemInProductWanrranty);

        updateClickProductWanrranty.setText("Update");
        updateClickProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateClickProductWanrrantyActionPerformed(evt);
            }
        });

        printClickProductWanrranty.setBackground(new java.awt.Color(0, 153, 0));
        printClickProductWanrranty.setText("Save");
        printClickProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printClickProductWanrrantyActionPerformed(evt);
            }
        });

        jLabel187.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel187.setText("Ref Name.");

        refNameInProductWanrranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refNameInProductWanrrantyActionPerformed(evt);
            }
        });

        jButton7.setText("All Warrenty Products");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        printClickProductWanrranty1.setBackground(new java.awt.Color(0, 153, 0));
        printClickProductWanrranty1.setText("Print");
        printClickProductWanrranty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printClickProductWanrranty1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductPurchasePanel3Layout = new javax.swing.GroupLayout(ProductPurchasePanel3);
        ProductPurchasePanel3.setLayout(ProductPurchasePanel3Layout);
        ProductPurchasePanel3Layout.setHorizontalGroup(
            ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductPurchasePanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(dateInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fullNameInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductPurchasePanel3Layout.createSequentialGroup()
                                    .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel183)
                                        .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel186, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel187, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(22, 22, 22)
                                    .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                            .addComponent(refNameInProductWanrranty)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel185)
                                            .addGap(23, 23, 23)
                                            .addComponent(phoneNOInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                            .addComponent(delevaryDateDateInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39)
                                            .addComponent(addressInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane17)))
                                .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addGap(16, 16, 16)
                                .addComponent(invoiceInProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel169)
                                .addGap(2, 2, 2)
                                .addComponent(customerIdINProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                            .addComponent(jButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateClickProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(printClickProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(printClickProductWanrranty1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ProductPurchasePanel3Layout.setVerticalGroup(
            ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                        .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(invoiceInProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel169))
                            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(customerIdINProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(fullNameInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delevaryDateDateInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel184)
                                    .addComponent(addressInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(refNameInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel185))
                                            .addComponent(phoneNOInProductWanrranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ProductPurchasePanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel187)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel186)))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductPurchasePanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ProductPurchasePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printClickProductWanrranty)
                            .addComponent(updateClickProductWanrranty)
                            .addComponent(printClickProductWanrranty1)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout warrantyTabLayout = new javax.swing.GroupLayout(warrantyTab);
        warrantyTab.setLayout(warrantyTabLayout);
        warrantyTabLayout.setHorizontalGroup(
            warrantyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warrantyTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProductPurchasePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        warrantyTabLayout.setVerticalGroup(
            warrantyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warrantyTabLayout.createSequentialGroup()
                .addComponent(ProductPurchasePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 279, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Product Warranty ", warrantyTab);

        billPanel.setBackground(new java.awt.Color(204, 204, 255));

        ProductPurchasePanel2.setBackground(new java.awt.Color(204, 204, 255));
        ProductPurchasePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductPurchasePanel2MouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel30.setText("INVOICE #");

        invoiceInProductSell.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        invoiceInProductSell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        invoiceInProductSell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                invoiceInProductSellKeyReleased(evt);
            }
        });

        jLabel137.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel137.setText("Customer Id");

        customerIdINProductSell.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        customerIdINProductSell.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel139.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 102, 102));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("Summary");

        totalAmt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel140.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel140.setText("TOTAL ITEMS: ");

        totalItemsInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        totalItemsInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalItemsInProductSell.setText("0.0");

        returnInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        returnInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnInProductSell.setText("0.0");

        jLabel141.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel141.setText("Return(-): ");

        discountInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        discountInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        discountInProductSell.setText("0.0");

        jLabel142.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel142.setText("Discount(TK): ");

        vatInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        vatInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vatInProductSell.setText("0.0");

        jLabel152.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel152.setText("VAT:");

        jLabel168.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel168.setText("Total Amount: ");

        totalAmountInProductSell1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        totalAmountInProductSell1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAmountInProductSell1.setText("0.0");

        javax.swing.GroupLayout totalAmt1Layout = new javax.swing.GroupLayout(totalAmt1);
        totalAmt1.setLayout(totalAmt1Layout);
        totalAmt1Layout.setHorizontalGroup(
            totalAmt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalAmt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalAmt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalAmt1Layout.createSequentialGroup()
                        .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(totalItemsInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(totalAmt1Layout.createSequentialGroup()
                        .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(totalAmt1Layout.createSequentialGroup()
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(discountInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(totalAmt1Layout.createSequentialGroup()
                        .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vatInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalAmt1Layout.createSequentialGroup()
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalAmountInProductSell1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        totalAmt1Layout.setVerticalGroup(
            totalAmt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalAmt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalAmt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalItemsInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(totalAmt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(totalAmt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAmountInProductSell1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(totalAmt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(totalAmt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vatInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comission1.setBackground(new java.awt.Color(255, 204, 51));
        comission1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel153.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(51, 51, 51));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel153.setText("PAYABLE");

        payableInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        payableInProductSell.setForeground(new java.awt.Color(51, 51, 51));
        payableInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payableInProductSell.setText("0.0");

        javax.swing.GroupLayout comission1Layout = new javax.swing.GroupLayout(comission1);
        comission1.setLayout(comission1Layout);
        comission1Layout.setHorizontalGroup(
            comission1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(comission1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(comission1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payableInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        comission1Layout.setVerticalGroup(
            comission1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(comission1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(comission1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(comission1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(payableInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        paid3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel156.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel156.setText("DUE PAYMENT: ");

        jLabel161.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel161.setText("PAID: ");

        paidInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        paidInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paidInProductSell.setText("0.0");

        duePaymentInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        duePaymentInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        duePaymentInProductSell.setText("0.0");

        dueInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        dueInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dueInProductSell.setText("0.0");

        jLabel162.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel162.setText("DUE: ");

        jLabel163.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel163.setText("PAYMENT WAY:");

        paymentWayInProductSell.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        paymentWayInProductSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentWayInProductSell.setText("0.0");

        javax.swing.GroupLayout paid3Layout = new javax.swing.GroupLayout(paid3);
        paid3.setLayout(paid3Layout);
        paid3Layout.setHorizontalGroup(
            paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paid3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paid3Layout.createSequentialGroup()
                        .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paidInProductSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paid3Layout.createSequentialGroup()
                        .addGroup(paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dueInProductSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentWayInProductSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(paid3Layout.createSequentialGroup()
                        .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(duePaymentInProductSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paid3Layout.setVerticalGroup(
            paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paid3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paidInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duePaymentInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentWayInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 51, 255));
        jButton6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalAmt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel139, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comission1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paid3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comission1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        productSellTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Barcode", "Group", "Pro", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productSellTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productSellTableMouseClicked(evt);
            }
        });
        productSellTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productSellTableKeyPressed(evt);
            }
        });
        jScrollPane12.setViewportView(productSellTable);
        if (productSellTable.getColumnModel().getColumnCount() > 0) {
            productSellTable.getColumnModel().getColumn(1).setResizable(false);
            productSellTable.getColumnModel().getColumn(2).setResizable(false);
            productSellTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel154.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel154.setText("Date :");

        jLabel155.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel155.setText("Full Name: ");

        fullNameInProductSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameInProductSellActionPerformed(evt);
            }
        });
        fullNameInProductSell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fullNameInProductSellKeyReleased(evt);
            }
        });

        jLabel157.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel157.setText("Due Date: ");

        jLabel158.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel158.setText("Address");

        jLabel159.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel159.setText("Mobile No.");

        phoneNOInProductSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNOInProductSellActionPerformed(evt);
            }
        });

        jLabel160.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel160.setText("Ref Name");

        panddingListnProductSellComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panddingListnProductSellComboBoxActionPerformed(evt);
            }
        });

        jLabel138.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("Pandding List");

        actionTypeInProductSellCOmboBox.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        actionTypeInProductSellCOmboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sell", "Return" }));

        panddingInProductSellCheckBOx.setText("Pandding");

        noteInProductSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteInProductSellActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));

        jLabel164.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel164.setText("Payment       :");

        paymentInProductBill.setText("0.0");
        paymentInProductBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentInProductBillActionPerformed(evt);
            }
        });

        jLabel165.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel165.setText("Warranty");

        warrantyInProductBill.setText("0.0");
        warrantyInProductBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyInProductBillActionPerformed(evt);
            }
        });

        jLabel166.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel166.setText("Due Payment :");

        duePaymentInProductBill.setText("0.0");
        duePaymentInProductBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duePaymentInProductBillActionPerformed(evt);
            }
        });

        paymentTypeInProductSell.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        paymentTypeInProductSell.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "BKash", "Rokect", "Nagat", "Visa Card", "Master Card", "Dabit Card", "Creadit Card", " " }));

        jLabel171.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel171.setText("Pay by");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel164)
                    .addComponent(jLabel166))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duePaymentInProductBill, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentInProductBill, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warrantyInProductBill, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(paymentTypeInProductSell, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel164)
                    .addComponent(jLabel165)
                    .addComponent(warrantyInProductBill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentInProductBill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel166)
                    .addComponent(duePaymentInProductBill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentTypeInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel171))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        barCodeInProductSell.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        barCodeInProductSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barCodeInProductSellActionPerformed(evt);
            }
        });

        discpuntInProductBill.setText("0.0");
        discpuntInProductBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discpuntInProductBillActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 51));
        jLabel31.setText("Bar Code");

        jLabel41.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 51, 51));
        jLabel41.setText("Discount Per Product");

        javax.swing.GroupLayout ProductPurchasePanel2Layout = new javax.swing.GroupLayout(ProductPurchasePanel2);
        ProductPurchasePanel2.setLayout(ProductPurchasePanel2Layout);
        ProductPurchasePanel2Layout.setHorizontalGroup(
            ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                        .addComponent(panddingInProductSellCheckBOx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 755, Short.MAX_VALUE)
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel138, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductPurchasePanel2Layout.createSequentialGroup()
                                .addComponent(panddingListnProductSellComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                .addComponent(actionTypeInProductSellCOmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(barCodeInProductSell, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discpuntInProductBill, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(invoiceInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductPurchasePanel2Layout.createSequentialGroup()
                                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel157, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel160, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)))
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateInProductSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dueDateInProductSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(noteInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel137, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel159))))
                        .addGap(2, 2, 2)
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressInProductSell, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNOInProductSell, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fullNameInProductSell, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerIdINProductSell))
                        .addGap(313, 313, 313))))
        );
        ProductPurchasePanel2Layout.setVerticalGroup(
            ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel138)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panddingListnProductSellComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(panddingInProductSellCheckBOx)
                        .addGap(18, 18, 18)
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel137)
                                    .addComponent(invoiceInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerIdINProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel158)))
                            .addGroup(ProductPurchasePanel2Layout.createSequentialGroup()
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dueDateInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel160)
                                    .addComponent(jLabel159)
                                    .addComponent(phoneNOInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noteInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel41))
                        .addGap(2, 2, 2)
                        .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actionTypeInProductSellCOmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ProductPurchasePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(barCodeInProductSell, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(discpuntInProductBill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout billPanelLayout = new javax.swing.GroupLayout(billPanel);
        billPanel.setLayout(billPanelLayout);
        billPanelLayout.setHorizontalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductPurchasePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        billPanelLayout.setVerticalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProductPurchasePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Product Sell", billPanel);

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1)
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

        clickEditInProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/edit.png"))); // NOI18N
        clickEditInProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickEditInProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickEditInProfileMouseExited(evt);
            }
        });

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
                .addContainerGap(24, Short.MAX_VALUE))
        );

        profile_pic.setBackground(new java.awt.Color(51, 51, 255));
        profile_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/profile_add.png"))); // NOI18N
        profile_pic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        companyNameInProfilePanel.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        companyNameInProfilePanel.setForeground(new java.awt.Color(255, 51, 51));
        companyNameInProfilePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyNameInProfilePanel.setText("IT Village Ltd.");

        nameInProfilePanel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        nameInProfilePanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameInProfilePanel1.setText("Moniruzzaman Roni");

        designationInProfilePanel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        designationInProfilePanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        designationInProfilePanel1.setText("Owner");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(profile_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(clickEditInProfile))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nameInProfilePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(designationInProfilePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(companyNameInProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(profile_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clickEditInProfile))
                .addGap(10, 10, 10)
                .addComponent(nameInProfilePanel1)
                .addGap(1, 1, 1)
                .addComponent(designationInProfilePanel1)
                .addGap(3, 3, 3)
                .addComponent(companyNameInProfilePanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout myProfilePanelLayout = new javax.swing.GroupLayout(myProfilePanel);
        myProfilePanel.setLayout(myProfilePanelLayout);
        myProfilePanelLayout.setHorizontalGroup(
            myProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        myProfilePanelLayout.setVerticalGroup(
            myProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myProfilePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
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
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(clickImportDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(clickExportDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72)
                .addGap(51, 51, 51)
                .addComponent(clickImportDatabase)
                .addGap(18, 18, 18)
                .addComponent(clickExportDatabase)
                .addContainerGap(657, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout systemBackupPanelLayout = new javax.swing.GroupLayout(systemBackupPanel);
        systemBackupPanel.setLayout(systemBackupPanelLayout);
        systemBackupPanelLayout.setHorizontalGroup(
            systemBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemBackupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        systemBackupPanelLayout.setVerticalGroup(
            systemBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemBackupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        settingBasePanel.add(systemBackupPanel, "card2");

        passwordChangePanel.setToolTipText("");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Password: ");

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                    .addComponent(passwordForUpdate)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rePasswordForUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clickUpdatePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rePasswordForUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clickUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout passwordChangePanelLayout = new javax.swing.GroupLayout(passwordChangePanel);
        passwordChangePanel.setLayout(passwordChangePanelLayout);
        passwordChangePanelLayout.setHorizontalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        passwordChangePanelLayout.setVerticalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane10))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout trustedEmployeePanelLayout = new javax.swing.GroupLayout(trustedEmployeePanel);
        trustedEmployeePanel.setLayout(trustedEmployeePanelLayout);
        trustedEmployeePanelLayout.setHorizontalGroup(
            trustedEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trustedEmployeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trustedEmployeePanelLayout.setVerticalGroup(
            trustedEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trustedEmployeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingBasePanel.add(trustedEmployeePanel, "card2");

        rechargeSettingsPanel.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 255));
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

        ussdSettedTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ussdSettedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ussdSettedTableMouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(ussdSettedTable);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clickAddNewManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clickAddNewManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout rechargeSettingsPanelLayout = new javax.swing.GroupLayout(rechargeSettingsPanel);
        rechargeSettingsPanel.setLayout(rechargeSettingsPanelLayout);
        rechargeSettingsPanelLayout.setHorizontalGroup(
            rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rechargeSettingsPanelLayout.setVerticalGroup(
            rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingBasePanel.add(rechargeSettingsPanel, "card2");

        MobileBankingSettingsPanel.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add new services");

        jLabel58.setText("Select Service");

        jLabel59.setText("Select  Default SIM Card");

        getSelectedSIMNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSelectedSIMNameComboActionPerformed(evt);
            }
        });

        jLabel60.setText("Task name");

        jLabel61.setText("PIN");

        getPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPINActionPerformed(evt);
            }
        });

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
            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(getSelectedSIMNameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(getTaskNameInMBS)
            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(getUssdCodePattren)
            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(getUssdCodeForBalanceShowPattren)
            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(getPIN)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(clickSaveInMobileRechatgeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator9)
            .addComponent(getSelectedServiceCombo)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSelectedServiceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickSaveInMobileRechatgeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        MobileBankingSettingsPanelLayout.setVerticalGroup(
            MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86)
                .addGap(18, 18, 18)
                .addGroup(MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(308, Short.MAX_VALUE))
        );

        settingBasePanel.add(MobileBankingSettingsPanel, "card2");

        rechargeOfferPanel.setToolTipText("");

        getRechargeAmountInSetting.setBackground(new java.awt.Color(255, 255, 255));
        getRechargeAmountInSetting.setPreferredSize(new java.awt.Dimension(1366, 768));

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

        getSelectedValidityTimeTypeSetting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "Day", "Month", "Year" }));

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
            .addGroup(getRechargeAmountInSettingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getRechargeAmmountInSeetings, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getRechargeAmountInSettingLayout.createSequentialGroup()
                        .addComponent(getValidityInSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getSelectedValidityTimeTypeSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getSIMOperatorName, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getOfferNameInSeting, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getDescriptionInSetting)
                    .addGroup(getRechargeAmountInSettingLayout.createSequentialGroup()
                        .addComponent(saveNewOfferInSettrings, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        getRechargeAmountInSettingLayout.setVerticalGroup(
            getRechargeAmountInSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getRechargeAmountInSettingLayout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(349, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rechargeOfferPanelLayout = new javax.swing.GroupLayout(rechargeOfferPanel);
        rechargeOfferPanel.setLayout(rechargeOfferPanelLayout);
        rechargeOfferPanelLayout.setHorizontalGroup(
            rechargeOfferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeOfferPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getRechargeAmountInSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        rechargeOfferPanelLayout.setVerticalGroup(
            rechargeOfferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeOfferPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getRechargeAmountInSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                .addContainerGap())
        );

        settingBasePanel.add(rechargeOfferPanel, "card2");

        jPanel18.setPreferredSize(new java.awt.Dimension(1188, 634));

        jLabel42.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel42.setText("Operator Name");

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

        getprofitIn1k.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getprofitIn1k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getprofitIn1kActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel45.setText("Recharge USSD Code Pattern (Pre-paid)");

        jLabel49.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel49.setText("Recharge USSD Code Pattern(post-paid)");

        jLabel46.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel46.setText("Icon");

        jLabel48.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel48.setText("Account Password");

        getOparetorNameInUssdCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getOparetorNameInUssdCommandActionPerformed(evt);
            }
        });

        clickChooseIcon1.setBackground(new java.awt.Color(255, 255, 255));
        clickChooseIcon1.setForeground(new java.awt.Color(102, 102, 255));
        clickChooseIcon1.setText("::::::Choose Icon(40px X 30px):::::::");
        clickChooseIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickChooseIcon1ActionPerformed(evt);
            }
        });

        getRechargeUssdParternPrePaid1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPrePaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPrePaid1ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel47.setText("Balence show USSD Code Pattern");

        labelUssdPatternSkitto.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        labelUssdPatternSkitto.setText("Recharge USSD Code Pattern(Skitto)");

        getRechargeUssdParternSkitto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternSkitto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternSkittoActionPerformed(evt);
            }
        });

        getRechargeUssdParternPostPaid1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPostPaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPostPaid1ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel62.setText("Profit in 1000 tk");

        getBalenceUssdPartern3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getBalenceUssdPartern3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalenceUssdPartern3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getOparetorNameInUssdCommand, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addComponent(getRechargeUssdParternPrePaid1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getRechargeUssdParternPostPaid1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getBalenceUssdPartern3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getprofitIn1k, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountPassword1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clickChooseIcon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUssdPatternSkitto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getRechargeUssdParternSkitto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clickAddContract2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getOparetorNameInUssdCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getRechargeUssdParternPrePaid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getRechargeUssdParternPostPaid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getBalenceUssdPartern3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getprofitIn1k, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clickChooseIcon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUssdPatternSkitto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getRechargeUssdParternSkitto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clickAddContract2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addNewManagementPanelSettingsLayout = new javax.swing.GroupLayout(addNewManagementPanelSettings);
        addNewManagementPanelSettings.setLayout(addNewManagementPanelSettingsLayout);
        addNewManagementPanelSettingsLayout.setHorizontalGroup(
            addNewManagementPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewManagementPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addContainerGap())
        );
        addNewManagementPanelSettingsLayout.setVerticalGroup(
            addNewManagementPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addNewManagementPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                .addContainerGap())
        );

        settingBasePanel.add(addNewManagementPanelSettings, "card2");

        systemBackup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        systemBackup.setText("System Backup");
        systemBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                systemBackupMouseClicked(evt);
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
                        .addComponent(passwordChange))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 60)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("01913350462");

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 60)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("01816385858");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Contract Us");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("( Afsar Ali )");

        jLabel99.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Founder of Auto Recharge Software Ltd.");

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Offer By: Auto Recharge Software Ltd. ");

        jPanel24.setBackground(new java.awt.Color(133, 47, 209));

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/facebook.png"))); // NOI18N

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/youtube.png"))); // NOI18N

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/internet.png"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106)
                    .addComponent(jLabel105)
                    .addComponent(jLabel104))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel13)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jLabel51)
                .addGap(6, 6, 6)
                .addComponent(jLabel99)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout helplinePanelLayout = new javax.swing.GroupLayout(helplinePanel);
        helplinePanel.setLayout(helplinePanelLayout);
        helplinePanelLayout.setHorizontalGroup(
            helplinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        helplinePanelLayout.setVerticalGroup(
            helplinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        basePanel.add(helplinePanel, "card2");

        ussdDialPanel.setBackground(new java.awt.Color(255, 255, 255));

        backToMobileRecharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToMobileRecharge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToMobileRechargeMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 255));
        jLabel20.setText("USSD Dail");

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

        getUssdCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel24.setText("Code:");

        setResponseShowFromUssd.setColumns(20);
        setResponseShowFromUssd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        setResponseShowFromUssd.setRows(5);
        jScrollPane3.setViewportView(setResponseShowFromUssd);

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel25.setText("Select SIM:");

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

        javax.swing.GroupLayout ussdDialPanelLayout = new javax.swing.GroupLayout(ussdDialPanel);
        ussdDialPanel.setLayout(ussdDialPanelLayout);
        ussdDialPanelLayout.setHorizontalGroup(
            ussdDialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ussdDialPanelLayout.createSequentialGroup()
                .addGroup(ussdDialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ussdDialPanelLayout.createSequentialGroup()
                        .addComponent(backToMobileRecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ussdDialPanelLayout.createSequentialGroup()
                        .addGroup(ussdDialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ussdDialPanelLayout.createSequentialGroup()
                                .addComponent(clickUssdDailDorSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clickUssdSessionClose, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(getUssdCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getSelectedSim, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 625, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ussdDialPanelLayout.setVerticalGroup(
            ussdDialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ussdDialPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ussdDialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backToMobileRecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGap(1, 1, 1)
                .addComponent(getUssdCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel25)
                .addGap(1, 1, 1)
                .addComponent(getSelectedSim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(ussdDialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clickUssdDailDorSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickUssdSessionClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        basePanel.add(ussdDialPanel, "card2");

        contractListPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        getNameForSearch.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        getNameForSearch.setBorder(null);
        getNameForSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNameForSearchActionPerformed(evt);
            }
        });
        getNameForSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getNameForSearchKeyReleased(evt);
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
                        .addGap(881, 914, Short.MAX_VALUE))
                    .addComponent(jScrollPane5)
                    .addComponent(getNameForSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clickNewContract, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clickNewContract, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getNameForSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        basePanel.add(contractListPanel, "card2");

        addNewManagementPanel.setBackground(new java.awt.Color(255, 255, 255));

        backToUssdManengementPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToUssdManengementPanel.setText("jLabel3");
        backToUssdManengementPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToUssdManengementPanelMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 255));
        jLabel28.setText("Add New USSD Command ");

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

        getOperatorName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel29.setText("Operator Name");

        jLabel32.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel32.setText("Recharge USSD Code Pattern (Pre-paid)");

        getRechargeUssdParternPrePaid.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPrePaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPrePaidActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel33.setText("Icon");

        clickChooseIcon.setBackground(new java.awt.Color(255, 255, 255));
        clickChooseIcon.setForeground(new java.awt.Color(102, 102, 255));
        clickChooseIcon.setText("::::::Choose Icon(40px X 30px):::::::");
        clickChooseIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickChooseIconActionPerformed(evt);
            }
        });

        getBalenceUssdPartern1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getBalenceUssdPartern1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalenceUssdPartern1ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel34.setText("Balence show USSD Code Pattern");

        jLabel35.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel35.setText("Account Password");

        jLabel36.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel36.setText("Recharge USSD Code Pattern(post-paid)");

        getRechargeUssdParternPostPaid.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPostPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPostPaidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addNewManagementPanelLayout = new javax.swing.GroupLayout(addNewManagementPanel);
        addNewManagementPanel.setLayout(addNewManagementPanelLayout);
        addNewManagementPanelLayout.setHorizontalGroup(
            addNewManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewManagementPanelLayout.createSequentialGroup()
                .addGroup(addNewManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addNewManagementPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(backToUssdManengementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 1087, Short.MAX_VALUE))
                    .addGroup(addNewManagementPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29))
                    .addGroup(addNewManagementPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addNewManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getOperatorName)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getRechargeUssdParternPrePaid)
                            .addComponent(getRechargeUssdParternPostPaid)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getBalenceUssdPartern1)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accountPassword)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clickChooseIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clickAddContract1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        addNewManagementPanelLayout.setVerticalGroup(
            addNewManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewManagementPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(addNewManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backToUssdManengementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel29)
                .addGap(0, 0, 0)
                .addComponent(getOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(addNewManagementPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(getRechargeUssdParternPrePaid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getRechargeUssdParternPostPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getBalenceUssdPartern1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel35)
                .addGap(8, 8, 8)
                .addComponent(accountPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel33)
                .addGap(8, 8, 8)
                .addComponent(clickChooseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clickAddContract1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        basePanel.add(addNewManagementPanel, "card2");

        addNewContractPanel.setBackground(new java.awt.Color(255, 255, 255));

        back43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        back43.setText("jLabel3");
        back43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back43MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 255));
        jLabel37.setText("New Contract ");

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

        getNameForContract.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel38.setText("Name");

        getPhoneNOForContract.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel39.setText("Phone No.");

        jLabel40.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel40.setText("Storage");

        javax.swing.GroupLayout addNewContractPanelLayout = new javax.swing.GroupLayout(addNewContractPanel);
        addNewContractPanel.setLayout(addNewContractPanelLayout);
        addNewContractPanelLayout.setHorizontalGroup(
            addNewContractPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewContractPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(back43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
            .addGroup(addNewContractPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addNewContractPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(getNameForContract)
                    .addComponent(getPhoneNOForContract)
                    .addComponent(getSeletedStorage, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clickAddContract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        addNewContractPanelLayout.setVerticalGroup(
            addNewContractPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewContractPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(addNewContractPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addNewContractPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addGap(3, 3, 3)
                .addComponent(getNameForContract, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel39)
                .addGap(3, 3, 3)
                .addComponent(getPhoneNOForContract, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel40)
                .addGap(3, 3, 3)
                .addComponent(getSeletedStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clickAddContract, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(575, Short.MAX_VALUE))
        );

        basePanel.add(addNewContractPanel, "card2");

        addMobileBankingPanelInBillPay.setBackground(new java.awt.Color(255, 255, 255));
        addMobileBankingPanelInBillPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMobileBankingPanelInBillPayMouseClicked(evt);
            }
        });

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

        jLabel83.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 0, 255));
        jLabel83.setText("Service:");

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

        rechargeBalencePanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel81.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 102, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Amount panel");

        jSeparator8.setForeground(new java.awt.Color(133, 47, 209));

        mobileBankingBalanceShowPanelList.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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

        javax.swing.GroupLayout rechargeBalencePanel1Layout = new javax.swing.GroupLayout(rechargeBalencePanel1);
        rechargeBalencePanel1.setLayout(rechargeBalencePanel1Layout);
        rechargeBalencePanel1Layout.setHorizontalGroup(
            rechargeBalencePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeBalencePanel1Layout.createSequentialGroup()
                .addGroup(rechargeBalencePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addGroup(rechargeBalencePanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rechargeBalencePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))))
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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

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

        jLabel84.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 0, 255));
        jLabel84.setText("Operation:");

        contractListClick.setText("Contact List");
        contractListClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contractListClickActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(102, 51, 255));
        jLabel95.setText("Today Details");

        searchingByName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchingByNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchingByNameKeyReleased(evt);
            }
        });

        jPanel23.setBackground(new java.awt.Color(102, 0, 255));

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

        getSimOperatorName.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        getSimOperatorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getSimOperatorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSimOperatorNameActionPerformed(evt);
            }
        });

        clickSandInMB.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        clickSandInMB.setText("SEND");
        clickSandInMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSandInMBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getPhoneNumberInBillPayment)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(getAmmountInBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getSimOperatorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clickSandInMB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getPhoneNumberInBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getAmmountInBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(getSimOperatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clickSandInMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Search By Date or Phone Number Or Amount");

        javax.swing.GroupLayout addMobileBankingPanelInBillPayLayout = new javax.swing.GroupLayout(addMobileBankingPanelInBillPay);
        addMobileBankingPanelInBillPay.setLayout(addMobileBankingPanelInBillPayLayout);
        addMobileBankingPanelInBillPayLayout.setHorizontalGroup(
            addMobileBankingPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMobileBankingPanelInBillPayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addMobileBankingPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13)
                    .addGroup(addMobileBankingPanelInBillPayLayout.createSequentialGroup()
                        .addGroup(addMobileBankingPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addMobileBankingPanelInBillPayLayout.createSequentialGroup()
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getOperationType, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addMobileBankingPanelInBillPayLayout.createSequentialGroup()
                                .addGap(722, 722, 722)
                                .addComponent(contractListClick, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(rechargeBalencePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addMobileBankingPanelInBillPayLayout.createSequentialGroup()
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchingByName)))
                .addContainerGap())
        );
        addMobileBankingPanelInBillPayLayout.setVerticalGroup(
            addMobileBankingPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMobileBankingPanelInBillPayLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addMobileBankingPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addMobileBankingPanelInBillPayLayout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(addMobileBankingPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(getServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84)
                            .addComponent(getOperationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contractListClick, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rechargeBalencePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addMobileBankingPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchingByName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );

        basePanel.add(addMobileBankingPanelInBillPay, "card2");

        groupLoadPanel.setBackground(new java.awt.Color(255, 255, 255));

        backToMobileRecharge1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        backToMobileRecharge1.setText("jLabel3");
        backToMobileRecharge1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToMobileRecharge1MouseClicked(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Group Load");

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

        sendAllRechargeBut.setText("Send All Recharge");
        sendAllRechargeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAllRechargeButActionPerformed(evt);
            }
        });

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
                .addContainerGap(135, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sendingLogLabel.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        sendingLogLabel.setForeground(new java.awt.Color(204, 0, 51));
        sendingLogLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sendingLogLabel.setText("Please Wait...");

        javax.swing.GroupLayout groupLoadPanelLayout = new javax.swing.GroupLayout(groupLoadPanel);
        groupLoadPanel.setLayout(groupLoadPanelLayout);
        groupLoadPanelLayout.setHorizontalGroup(
            groupLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupLoadPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(groupLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(groupLoadPanelLayout.createSequentialGroup()
                        .addComponent(backToMobileRecharge1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendingLogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(sendAllRechargeBut, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(groupLoadPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        groupLoadPanelLayout.setVerticalGroup(
            groupLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupLoadPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(groupLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backToMobileRecharge1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(groupLoadPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel66))
                    .addGroup(groupLoadPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(groupLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sendingLogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendAllRechargeBut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(groupLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        basePanel.add(groupLoadPanel, "card2");

        billPaymentPanelInBillPay.setBackground(new java.awt.Color(255, 255, 255));

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
        getBalanceInBillPayment.setText("00");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(clickRefrash2))
                    .addComponent(loaderInBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getBalanceInBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getBalanceInBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loaderInBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        detailsPanelInBillPay.setBackground(new java.awt.Color(133, 47, 209));
        detailsPanelInBillPay.setForeground(new java.awt.Color(102, 0, 255));

        jLabel89.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
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

        jLabel91.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
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
        baseBillPayment.setPreferredSize(new java.awt.Dimension(1146, 367));
        baseBillPayment.setLayout(new java.awt.CardLayout());

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

        jLabel96.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel96.setText("Password");

        javax.swing.GroupLayout UsingCustomerIdLayout = new javax.swing.GroupLayout(UsingCustomerId);
        UsingCustomerId.setLayout(UsingCustomerIdLayout);
        UsingCustomerIdLayout.setHorizontalGroup(
            UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(710, Short.MAX_VALUE))
            .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel94)
                    .addComponent(jLabel93)
                    .addComponent(jLabel96)
                    .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                        .addComponent(payInUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetnUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(getCustomerId)
                    .addComponent(getPassword)
                    .addComponent(dateInProductBillPay, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UsingCustomerIdLayout.setVerticalGroup(
            UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsingCustomerIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateInProductBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(UsingCustomerIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payInUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetnUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        baseBillPayment.add(UsingCustomerId, "card3");

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
                .addContainerGap()
                .addGroup(usingBillNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getBillNO)
                    .addGroup(usingBillNoPanelLayout.createSequentialGroup()
                        .addGroup(usingBillNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel97)
                            .addComponent(jLabel98)
                            .addGroup(usingBillNoPanelLayout.createSequentialGroup()
                                .addComponent(clickPayIUsingBill, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(clickResetPayInUsingBill, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 595, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usingBillNoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(getPasswordInBillPay))
                .addContainerGap())
        );
        usingBillNoPanelLayout.setVerticalGroup(
            usingBillNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usingBillNoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        javax.swing.GroupLayout detailsPanelInBillPayLayout = new javax.swing.GroupLayout(detailsPanelInBillPay);
        detailsPanelInBillPay.setLayout(detailsPanelInBillPayLayout);
        detailsPanelInBillPayLayout.setHorizontalGroup(
            detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(baseBillPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                        .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelInBillPayLayout.createSequentialGroup()
                                .addComponent(jLabel89)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getSimName, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clickTabUsingBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getServiceTypeInBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clickTabUsingCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailsPanelInBillPayLayout.setVerticalGroup(
            detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(detailsPanelInBillPayLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(getSimName))
                        .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(getServiceTypeInBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clickTabUsingBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickTabUsingCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baseBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout billPaymentPanelInBillPayLayout = new javax.swing.GroupLayout(billPaymentPanelInBillPay);
        billPaymentPanelInBillPay.setLayout(billPaymentPanelInBillPayLayout);
        billPaymentPanelInBillPayLayout.setHorizontalGroup(
            billPaymentPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPaymentPanelInBillPayLayout.createSequentialGroup()
                .addGroup(billPaymentPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billPaymentPanelInBillPayLayout.createSequentialGroup()
                        .addComponent(detailsPanelInBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rechargeBalencePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane16))
                .addContainerGap())
        );
        billPaymentPanelInBillPayLayout.setVerticalGroup(
            billPaymentPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPaymentPanelInBillPayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billPaymentPanelInBillPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsPanelInBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechargeBalencePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        basePanel.add(billPaymentPanelInBillPay, "card2");

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        back1.setText("jLabel3");
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 255));
        jLabel27.setText("Inbox");

        inboxTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inboxTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane18.setViewportView(inboxTable);

        searchInInbox.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        searchInInbox.setBorder(null);
        searchInInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInInboxActionPerformed(evt);
            }
        });
        searchInInbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchInInboxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout inboxJpanelLayout = new javax.swing.GroupLayout(inboxJpanel);
        inboxJpanel.setLayout(inboxJpanelLayout);
        inboxJpanelLayout.setHorizontalGroup(
            inboxJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inboxJpanelLayout.createSequentialGroup()
                .addGroup(inboxJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inboxJpanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addGap(956, 1016, Short.MAX_VALUE))
                    .addComponent(jScrollPane18)
                    .addComponent(searchInInbox, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        inboxJpanelLayout.setVerticalGroup(
            inboxJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inboxJpanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(inboxJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inboxJpanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27)))
                .addGap(58, 58, 58)
                .addComponent(searchInInbox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        basePanel.add(inboxJpanel, "card15");

        getRechargeName.setBackground(new java.awt.Color(255, 255, 255));

        back44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        back44.setText("jLabel3");
        back44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back44MouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 255));
        jLabel53.setText("Meke Bar Code");

        jPanel17.setMaximumSize(new java.awt.Dimension(1366, 768));

        forBarCodePhoneNumber3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber3.setText("00");
        forBarCodePhoneNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber3ActionPerformed(evt);
            }
        });

        clickAddForRechargeBarCode.setBackground(new java.awt.Color(102, 153, 0));
        clickAddForRechargeBarCode.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clickAddForRechargeBarCode.setForeground(new java.awt.Color(255, 255, 255));
        clickAddForRechargeBarCode.setText("Add");
        clickAddForRechargeBarCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), null, new java.awt.Color(204, 204, 204)));
        clickAddForRechargeBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAddForRechargeBarCodeActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel54.setText("Phone Number 3");

        jLabel80.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel80.setText("Name");

        getNameForRechargeBarCode1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getNameForRechargeBarCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNameForRechargeBarCode1ActionPerformed(evt);
            }
        });

        forBarCodePhoneNumber4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber4.setText("00");
        forBarCodePhoneNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber4ActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel102.setText("Phone Number 4");

        jLabel107.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel107.setText("Phone Number 2");

        forBarCodePhoneNumber2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber2.setText("00");
        forBarCodePhoneNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber2ActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel108.setText("Phone Number 5");

        forBarCodePhoneNumber5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber5.setText("00");
        forBarCodePhoneNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber5ActionPerformed(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel109.setText("Phone Number 6");

        forBarCodePhoneNumber6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber6.setText("00");
        forBarCodePhoneNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber6ActionPerformed(evt);
            }
        });

        forBarCodePhoneNumber7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber7.setText("00");
        forBarCodePhoneNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber7ActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel110.setText("Phone Number 7");

        jLabel111.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel111.setText("Phone Number 8");

        forBarCodePhoneNumber8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber8.setText("00");
        forBarCodePhoneNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber8ActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel112.setText("Phone Number 9");

        forBarCodePhoneNumber9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber9.setText("00");
        forBarCodePhoneNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber9ActionPerformed(evt);
            }
        });

        forBarCodePhoneNumber10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        forBarCodePhoneNumber10.setText("00");
        forBarCodePhoneNumber10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forBarCodePhoneNumber10ActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel113.setText("Phone Number 10");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber3)
                    .addComponent(clickAddForRechargeBarCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber4)
                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber2)
                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber5)
                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber6)
                    .addComponent(getNameForRechargeBarCode1)
                    .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber7)
                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber8)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber9)
                    .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(forBarCodePhoneNumber10))
                .addContainerGap())
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(getNameForRechargeBarCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBarCodePhoneNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(clickAddForRechargeBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel80)
                    .addContainerGap(797, Short.MAX_VALUE)))
        );

        jScrollPane4.setViewportView(jPanel17);

        javax.swing.GroupLayout getRechargeNameLayout = new javax.swing.GroupLayout(getRechargeName);
        getRechargeName.setLayout(getRechargeNameLayout);
        getRechargeNameLayout.setHorizontalGroup(
            getRechargeNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getRechargeNameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(back44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
            .addGroup(getRechargeNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        getRechargeNameLayout.setVerticalGroup(
            getRechargeNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getRechargeNameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(getRechargeNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(getRechargeNameLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel53)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        basePanel.add(getRechargeName, "card2");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
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

        processtingLoderDialog.setVisible(false);
        setupTabsInShopManagment();


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

    private void myProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileMouseClicked
        switchPanelViaSettings(myProfilePanel, myProfile);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        // trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
        setDataInProfilePanel();
        setLoggedUserDataInProfile();
    }//GEN-LAST:event_myProfileMouseClicked

    private void systemBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemBackupMouseClicked
        switchPanelViaSettings(systemBackupPanel, systemBackup);
        myProfile.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        //trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
    }//GEN-LAST:event_systemBackupMouseClicked

    private void passwordChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordChangeMouseClicked
        switchPanelViaSettings(passwordChangePanel, passwordChange);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        //  trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);

        addKeyLisenerInPasswordChargePanel();
    }//GEN-LAST:event_passwordChangeMouseClicked

    private void rechargeSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechargeSettingsMouseClicked
        switchPanelViaSettings(rechargeSettingsPanel, rechargeSettings);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
        //  trustedEmployee.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);

        loadValuesForUssdManagementTable();
    }//GEN-LAST:event_rechargeSettingsMouseClicked

    private void mobileBankingSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileBankingSettingsMouseClicked

        switchPanelViaSettings(MobileBankingSettingsPanel, mobileBankingSettings);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
//        trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        rechargeOffers.setForeground(Color.black);
        loadTableMobileBankingSettingFromDb();
        getSelectedSIMNameCombo.removeAllItems();
//        getSelectedServiceCombo.removeAllItems();
//        for (String mBank : MOBILE_BANKING_NANE) {
//            getSelectedServiceCombo.addItem(mBank);
//        }
        if (UserInfo.role.equals("demo")) {

        } else {
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                    getSelectedSIMNameCombo.addItem(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")".toUpperCase());
                }
            }
        }
        addKeyLisenerInMobileBankingSetting();
    }//GEN-LAST:event_mobileBankingSettingsMouseClicked

    private void rechargeOffersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechargeOffersMouseClicked

        switchPanelViaSettings(rechargeOfferPanel, rechargeOffers);
        myProfile.setForeground(Color.black);
        systemBackup.setForeground(Color.black);
        passwordChange.setForeground(Color.black);
//        trustedEmployee.setForeground(Color.black);
        rechargeSettings.setForeground(Color.black);
        mobileBankingSettings.setForeground(Color.black);

        getSIMOperatorName.removeAllItems();
        for (String string : SIM_OPERATORS_NAME) {
            getSIMOperatorName.addItem(string);

        }
        addKeyListenserInRechargeOffer();
    }//GEN-LAST:event_rechargeOffersMouseClicked

    private void clickAddNewManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddNewManagementActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            resetComboBox(getOparetorNameInUssdCommand);
            ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
                getOparetorNameInUssdCommand.addItem(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")");
            });
            initHintInEditText();
            switchPanelViaSettings(addNewManagementPanelSettings, rechargeSettings);

        }
    }//GEN-LAST:event_clickAddNewManagementActionPerformed

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
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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
        }

    }//GEN-LAST:event_clickUssdSessionCloseActionPerformed

    private void clickUssdDailDorSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailDorSend1ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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
    }//GEN-LAST:event_clickUssdDailDorSend1ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_backMouseClicked

    private void clickNewContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickNewContractActionPerformed
        switchPanelViaMenu(addNewContractPanel);
        getSeletedStorage.removeAllItems();
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");

        } else {
//            if (UserInfo.role.equals("demo")) {
//                System.err.println("Access dny in DEMO Panel");
//
//            } else {
//                for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
//                    getSeletedStorage.addItem(simOperatorIdentifierDto.getOperatorName().toUpperCase());
//
//                }
//            }
        }
        getSeletedStorage.addItem("MEMORY");
        getNameForContract.setText("");
        getPhoneNOForContract.setText("");

        activeKeyPressWorkInNewContractSave();

    }//GEN-LAST:event_clickNewContractActionPerformed

    private void backToUssdManengementPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToUssdManengementPanelMouseClicked
        switchPanelViaMenu(rechargeSettingsPanel);
    }//GEN-LAST:event_backToUssdManengementPanelMouseClicked

    private void clickAddContract1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContract1ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            String rechargeUssdPartern = getRechargeUssdParternPrePaid.getText();
            String operatorName = getOparetorNameInUssdCommand.getSelectedItem().toString();

            String actionFor = "mobile";
            String balenceUssdPartern = getBalenceUssdPartern1.getText();
            if (!rechargeUssdPartern.equals("")
                    && !operatorName.equals("")) {

                if (saveToDbCommandInCommand()) {
                    System.out.println("Adding Successfull");
                }
            } else {
                Popup.error("Empty Field");
            }
        }
    }//GEN-LAST:event_clickAddContract1ActionPerformed

    private void getRechargeUssdParternPrePaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPrePaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPrePaidActionPerformed

    private void clickChooseIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickChooseIconActionPerformed

        loadImageIcon(getOparetorNameInUssdCommand.getSelectedItem().toString().toLowerCase());
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
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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
                    setContractListInJTable("mobile_recharge");
                    processtingLoderDialog.setVisible(false);
                }

            };
            swingWorker.execute();
        }
    }//GEN-LAST:event_clickAddContractActionPerformed

    private void menuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPanelMouseClicked

    private void getSelectedSIMNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSelectedSIMNameComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSelectedSIMNameComboActionPerformed

    private void suggListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suggListMouseClicked
        getMobileNumber.setText(suggList.getSelectedValue());
        popupForSuggestManu.setVisible(false);
    }//GEN-LAST:event_suggListMouseClicked

    private void suggListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suggListMouseEntered

    }//GEN-LAST:event_suggListMouseEntered

    private void getNameForSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getNameForSearchKeyReleased

        searchByName(contractList, getNameForSearch.getText());
    }//GEN-LAST:event_getNameForSearchKeyReleased

    private void saveNewOfferInSettringsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewOfferInSettringsActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            exportDatabase();
        }
    }//GEN-LAST:event_clickExportDatabaseActionPerformed

    private void getEmployeeNameTEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEmployeeNameTEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getEmployeeNameTEmployeeActionPerformed

    private void getServiceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getServiceNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getServiceNameActionPerformed

    private void getOperationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOperationTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getOperationTypeActionPerformed

    private void getUssdCodePattrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getUssdCodePattrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getUssdCodePattrenActionPerformed

    private void clickSaveInMobileRechatgeSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSaveInMobileRechatgeSettingActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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

        }
    }//GEN-LAST:event_clickSaveInMobileRechatgeSettingActionPerformed

    private void getServiceNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getServiceNameItemStateChanged
        Set<String> taskNames = new HashSet<>();

        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {

            Connection conn = DbConnection.connect();

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
        }

    }//GEN-LAST:event_getServiceNameItemStateChanged

    private void getOperationTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_getOperationTypeItemStateChanged
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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
        }
    }//GEN-LAST:event_getOperationTypeItemStateChanged

    private void getSimOperatorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSimOperatorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSimOperatorNameActionPerformed

    private void getPhoneNumberInBillPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPhoneNumberInBillPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPhoneNumberInBillPaymentActionPerformed

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
        if (UserInfo.role.equals("demo")) {

        } else {
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
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                if (UserInfo.role.equals("demo")) {
                    System.err.println("Access dny in DEMO Panel");

                } else {
                    for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                        getSimOperatorName.addItem(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")".toUpperCase());
                    }
                }
            }

            SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    if (MOBILE_BANKING_BALENCE_HASH_MAP.isEmpty()) {
                        getMobileBankingBalance();
                    }

                    return null;
                }

                @Override
                protected void done() {
                    loadMobileBankingBalance();
                    processtingLoderDialog.setVisible(false);
                    System.out.println("Delete Successful...@Done");
                }

            };
            swingWorker.execute();

            loadMobileBankingDetailsTable();

        }
        addKeyListenerAndHoverInMobileBankingPanel();
    }//GEN-LAST:event_clickMobileBankingMouseClicked

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
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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
        }

    }//GEN-LAST:event_payInUsingCustomerIdActionPerformed

    private void clickPayIUsingBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickPayIUsingBillActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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
        }

    }//GEN-LAST:event_clickPayIUsingBillActionPerformed

    private void clickResetPayInUsingBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickResetPayInUsingBillActionPerformed
        resetBillByBillNo();
    }//GEN-LAST:event_clickResetPayInUsingBillActionPerformed

    private void resetnUsingCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetnUsingCustomerIdActionPerformed
        resetBillByCustomerId();
    }//GEN-LAST:event_resetnUsingCustomerIdActionPerformed

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
//        JList list = (JList) evt.getSource();
//        MobileBankingBalanceShowCard mobileBankingBalanceShowCard = (MobileBankingBalanceShowCard) list.getModel().getElementAt(list.locationToIndex(evt.getPoint()));
//
//        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
//            @Override
//            protected Void doInBackground() throws Exception {
//                processtingLoderDialog.setVisible(true);
//                String amount = getMobileBankingBalance(evt, mobileBankingBalanceShowCard.getServiceNameText().getText());
//
//                if (amount.equals("16247")) {
//                    Popup.customError("Duplicate Request");
//                } else {
//                    mobileBankingBalanceShowCard.getAmountBalanceText().setText(amount + " Tk");
//                    mobileBankingBalanceShowCard.getLastUpdateTimeText().setText("Last update :" + Configaration.getCurrentDateAndTime());
//                }
//                return null;
//            }
//
//            @Override
//            protected void done() {
//                processtingLoderDialog.setVisible(false);
//                System.out.println("Delete Successful...@Done");
//            }
//
//        };
//        swingWorker.execute();

        // System.out.println("index: " + );
    }//GEN-LAST:event_mobileBankingBalanceShowPanelListMouseClicked

    private void tableMobileBankingDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMobileBankingDetailsMouseClicked
        String mgs, userId, phoneNumberText, serviceName, amount;
        Point point = evt.getPoint();
        int column = tableMobileBankingDetails.columnAtPoint(point);
        int row = tableMobileBankingDetails.rowAtPoint(point);
        mgs = tableMobileBankingDetails.getValueAt(row, 9).toString();
        userId = tableMobileBankingDetails.getValueAt(row, 0).toString();
        phoneNumberText = tableMobileBankingDetails.getValueAt(row, 3).toString();
        amount = tableMobileBankingDetails.getValueAt(row, 4).toString();
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
                updateInfoInMObileBankingByuserId(userId, ui.getSetMessageText().getText());
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
                getPhoneNumberInBillPayment.setText(phoneNumberText);
                getAmmountInBillPayment.setText(amount);
                deleteColumeFromMobileBanking(userId);
                mgsDialog.setVisible(false);
                mgsDialog.dispose();
            }

        });
        ui.getClickOk().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    updateInfoInMObileBankingByuserId(userId, ui.getSetMessageText().getText());
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
        ui.getClickOk().setEnabled(false);

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

    private void clickImportDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickImportDatabaseActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {

            importDatabase();
        }
    }//GEN-LAST:event_clickImportDatabaseActionPerformed

    private void clickUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUpdatePasswordActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            String password = passwordForUpdate.getText();
            String rePassword = rePasswordForUpdate.getText();
            if (password.equals("") || rePassword.equals("")) {
                Popup.customError("Empty field found.");

            } else {
                if (password.equals(rePassword)) {
                    changeAdminPassword(AES.encrypt(password, "itvillage428854"));

                } else {
                    Popup.customError("Re-type password not match");
                }
            }

        }
    }//GEN-LAST:event_clickUpdatePasswordActionPerformed

    private void addMobileBankingPanelInBillPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMobileBankingPanelInBillPayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMobileBankingPanelInBillPayMouseClicked

    private void productPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPurchaseMouseClicked
        System.err.println("gfhdgd");
    }//GEN-LAST:event_productPurchaseMouseClicked

    private void ProductPurchasePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductPurchasePanelMouseClicked
        setupTabsInShopManagment();
        System.err.println("gfhdgd");
    }//GEN-LAST:event_ProductPurchasePanelMouseClicked

    private void detailsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsPanelMouseClicked

    }//GEN-LAST:event_detailsPanelMouseClicked

    private void makeNewInProductPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makeNewInProductPurchaseMouseClicked

    }//GEN-LAST:event_makeNewInProductPurchaseMouseClicked

    private void invoiceInProductPurchasesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoiceInProductPurchasesKeyReleased
        if (UserInfo.role.equals("demo")) {

        } else {
            List<String> list = new ArrayList<>();
            String to_check = null;

            Connection conn = DbConnection.connect();
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `product_purchase`";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    list.add(rs.getString("invoice"));

                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }

            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {

            } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                showDataInProductPurchaseFromDB(invoiceInProductPurchases.getText());
                supplierInProductPurchases.requestFocusInWindow();
            } else {
                to_check = invoiceInProductPurchases.getText();
                int to_check_len = to_check.length();
                for (String data : list) {
                    String check_from_data = "";
                    for (int i = 0; i < to_check_len; i++) {
                        if (to_check_len <= data.length()) {
                            check_from_data = check_from_data + data.charAt(i);
                        }
                    }

                    if (check_from_data.equals(to_check)) {

                        invoiceInProductPurchases.setText(data);
                        invoiceInProductPurchases.setSelectionStart(to_check_len);
                        invoiceInProductPurchases.setSelectionEnd(data.length());
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_invoiceInProductPurchasesKeyReleased

    private void groupInProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupInProductDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupInProductDetailsActionPerformed

    private void saveInProductPurchase1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveInProductPurchase1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saveInProductPurchase1MouseClicked

    private void ProductPurchasePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductPurchasePanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductPurchasePanel1MouseClicked

    private void searchByGroupInRatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByGroupInRatioActionPerformed
        if (UserInfo.role.equals("demo")) {

        } else {
            listOfBarCodeOrGroupComboBox.removeAllItems();
            if (evt.getSource() == searchByGroupInRatio) {

                Boolean isActive = false;
                if (searchByGroupInRatio.isSelected()) {
                    isActive = true;
                }

                if (isActive) {
                    if (UserInfo.role.equals("demo")) {
                        System.err.println("Access dny in DEMO Panel");

                    } else {
                        Connection conn = DbConnection.connect();
                        try {
                            Statement st = conn.createStatement();
                            String sql = "SELECT * FROM `product_purchase`";
                            ResultSet rs = st.executeQuery(sql);

                            while (rs.next()) {
                                listOfBarCodeOrGroupComboBox.addItem(rs.getString("invoice").toString() + "  " + rs.getString("group_products").toString());
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
                            DbConnection.disconnect(conn);
                        }
                    }

                } else {
                    Connection conn = DbConnection.connect();
                    try {
                        Statement st = conn.createStatement();
                        String sql = "SELECT * FROM `product_purchase`";
                        ResultSet rs = st.executeQuery(sql);

                        while (rs.next()) {
                            listOfBarCodeOrGroupComboBox.addItem(rs.getString("invoice").toString());
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        DbConnection.disconnect(conn);
                    }

                }

            }
        }
    }//GEN-LAST:event_searchByGroupInRatioActionPerformed

    private void listOfBarCodeOrGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfBarCodeOrGroupComboBoxActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            if (listOfBarCodeOrGroupComboBox.getSelectedItem() != null) {
                if (listOfBarCodeOrGroupComboBox.getSelectedItem().toString().contains(" ")) {
                    System.err.println(listOfBarCodeOrGroupComboBox.getSelectedItem().toString().split(" ")[0]);
                    showDataInProductDetailsPurchaseFromDB(listOfBarCodeOrGroupComboBox.getSelectedItem().toString().split(" ")[0]);

                } else {

                    showDataInProductDetailsPurchaseFromDB(listOfBarCodeOrGroupComboBox.getSelectedItem().toString());
                }

            }
        }

    }//GEN-LAST:event_listOfBarCodeOrGroupComboBoxActionPerformed

    private void saveInProductPurchase2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveInProductPurchase2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saveInProductPurchase2MouseClicked

    private void productDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDetailsTableMouseClicked
        String productId, productGroup, productName, buyRate, sellPrice, brand, lastModify, qty, warranty;
        Point point = evt.getPoint();
        int column = productDetailsTable.columnAtPoint(point);
        int row = productDetailsTable.rowAtPoint(point);
        productId = productDetailsTable.getValueAt(row, 0).toString();
        productGroup = productDetailsTable.getValueAt(row, 1).toString();
        productName = productDetailsTable.getValueAt(row, 2).toString();
        buyRate = productDetailsTable.getValueAt(row, 4).toString();
        sellPrice = productDetailsTable.getValueAt(row, 5).toString();
        brand = productDetailsTable.getValueAt(row, 6).toString();
        qty = productDetailsTable.getValueAt(row, 3).toString();
        warranty = productDetailsTable.getValueAt(row, 7).toString();
        lastModify = productDetailsTable.getValueAt(row, 8).toString();
        System.err.println(productId + "+" + productGroup);

        //SET VALUE IN EDITTEXT
        barCodeInProductDetails.setSelectedItem(productId);
        groupInProductDetails.setText(productGroup);
        pNameInProductDetails.setText(productName);
        buyRateInProductDetails.setText(buyRate);
        sellRateInProductDetails.setText(sellPrice);
        brandInProductDetails.setText(sellPrice);
        qtyInProductDetails.setText(qty);
        warrentyInProductDetails.setText(warranty);


    }//GEN-LAST:event_productDetailsTableMouseClicked

    private void saveInProductPurchase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInProductPurchase1ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            updateStoredItemByBarCode(invoiceINProductDetails.getText(), barCodeInProductDetails.getSelectedItem().toString(), String.valueOf(Double.valueOf(sellRateInProductDetails.getText())));
            addPerchangeSelection.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    Double sellRate = Double.valueOf(sellRateInProductDetails.getText());
                    if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                        sellRate = Double.valueOf(buyRateInProductDetails.getText()) + ((Double.valueOf(sellRateInProductDetails.getText()) * Double.valueOf(buyRateInProductDetails.getText())) / 100);
                        updateStoredItemByBarCode(invoiceINProductDetails.getText(), barCodeInProductDetails.getSelectedItem().toString(), String.valueOf(sellRate));
                    } else {//checkbox has been deselected
                        updateStoredItemByBarCode(invoiceINProductDetails.getText(), barCodeInProductDetails.getSelectedItem().toString(), String.valueOf(sellRate));
                    }
                    ;
                }
            });
            barCodeInProductDetails.setSelectedItem("");
            groupInProductDetails.setText("");
            pNameInProductDetails.setText("");
            buyRateInProductDetails.setText("");
            sellRateInProductDetails.setText("");
            brandInProductDetails.setText("");
            qtyInProductDetails.setText("");
            warrentyInProductDetails.setText("");
        }
    }//GEN-LAST:event_saveInProductPurchase1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    genarateBarCode(barCodeInProductDetails.getSelectedItem().toString());
                    return null;
                }

                @Override
                protected void done() {
                    processtingLoderDialog.setVisible(false);
                }

            };
            worker.execute();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void invoiceInProductSellKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoiceInProductSellKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceInProductSellKeyReleased

    private void fullNameInProductSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameInProductSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameInProductSellActionPerformed

    private void fullNameInProductSellKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameInProductSellKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameInProductSellKeyReleased

    private void ProductPurchasePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductPurchasePanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductPurchasePanel2MouseClicked

    private void phoneNOInProductSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNOInProductSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNOInProductSellActionPerformed

    private void panddingListnProductSellComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panddingListnProductSellComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panddingListnProductSellComboBoxActionPerformed

    private void noteInProductSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteInProductSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteInProductSellActionPerformed

    private void paymentInProductBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentInProductBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentInProductBillActionPerformed

    private void warrantyInProductBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrantyInProductBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warrantyInProductBillActionPerformed

    private void duePaymentInProductBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duePaymentInProductBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duePaymentInProductBillActionPerformed

    private void discpuntInProductBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discpuntInProductBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discpuntInProductBillActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            clearBillforProduct();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void productSellTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productSellTableMouseClicked
        Point point = evt.getPoint();
        int column = productWarrantyTable.columnAtPoint(point);
        int row = productWarrantyTable.rowAtPoint(point);
        String barcode = productWarrantyTable.getValueAt(row, 2).toString();
        String rowNo = productWarrantyTable.getValueAt(row, 0).toString();
        deteteFromProductListTable(barcode, rowNo);
    }//GEN-LAST:event_productSellTableMouseClicked

    private void productSellTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productSellTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.err.println("VK_ENTER");
        }
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            System.err.println("VK_TAB");
        }
    }//GEN-LAST:event_productSellTableKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {

            printMemo();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void invoiceInProductWarrantyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoiceInProductWarrantyKeyReleased
        if (UserInfo.role.equals("demo")) {

        } else {
            List<String> list = new ArrayList<>();
            String to_check = null;

            Connection conn = DbConnection.connect();
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `warranty_table`";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    list.add(rs.getString("invoice"));

                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }

            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {

            } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                showDataInProductWarentyByInvoiceFromDB(invoiceInProductWarranty.getText());
                supplierInProductPurchases.requestFocusInWindow();
            } else {
                to_check = invoiceInProductWarranty.getText();
                int to_check_len = to_check.length();
                for (String data : list) {
                    String check_from_data = "";
                    for (int i = 0; i < to_check_len; i++) {
                        if (to_check_len <= data.length()) {
                            check_from_data = check_from_data + data.charAt(i);
                        }
                    }

                    if (check_from_data.equals(to_check)) {

                        invoiceInProductWarranty.setText(data);
                        invoiceInProductWarranty.setSelectionStart(to_check_len);
                        invoiceInProductWarranty.setSelectionEnd(data.length());
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_invoiceInProductWarrantyKeyReleased

    private void productWarrantyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productWarrantyTableMouseClicked
        String customerId, fullName, phoneNo, status, paid, due, brand, total, problem, invoice;
        Point point = evt.getPoint();
        int column = productWarrantyTable.columnAtPoint(point);
        int row = productWarrantyTable.rowAtPoint(point);
        invoice = productWarrantyTable.getValueAt(row, 0).toString();
        customerId = productWarrantyTable.getValueAt(row, 1).toString();
        fullName = productWarrantyTable.getValueAt(row, 2).toString();
        phoneNo = productWarrantyTable.getValueAt(row, 3).toString();
        status = productWarrantyTable.getValueAt(row, 10).toString();
        paid = productWarrantyTable.getValueAt(row, 8).toString();
        due = productWarrantyTable.getValueAt(row, 9).toString();
        brand = productWarrantyTable.getValueAt(row, 11).toString();
        total = productWarrantyTable.getValueAt(row, 7).toString();
        problem = productWarrantyTable.getValueAt(row, 6).toString();

        //SET VALUE IN EDITTEXT
        customerIdINProductWanrranty.setText(customerId);
        fullNameInProductWanrranty.setText(fullName);
        phoneNOInProductWanrranty.setText(phoneNo);
        statusInProductWanrrantyComboBox.setSelectedItem(status);
        problemInProductWanrranty.setText(problem);
        paidInProductWanrranty.setText(paid);
        dueInProductWanrranty.setText(due);
        billInProductWanrranty.setText(total);
        paidPaymentInProductWanrranty.setText(paid);
        payableInProductWanrranty.setText(total);
        brandInProductWanrranty.setText(brand);
        invoiceInProductWarranty.setText(invoice);
    }//GEN-LAST:event_productWarrantyTableMouseClicked

    private void productWarrantyTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productWarrantyTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_productWarrantyTableKeyPressed

    private void fullNameInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameInProductWanrrantyActionPerformed

    private void fullNameInProductWanrrantyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameInProductWanrrantyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameInProductWanrrantyKeyReleased

    private void phoneNOInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNOInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNOInProductWanrrantyActionPerformed

    private void brandInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandInProductWanrrantyActionPerformed

    private void warrantyInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrantyInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warrantyInProductWanrrantyActionPerformed

    private void discpuntInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discpuntInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discpuntInProductWanrrantyActionPerformed

    private void ProductPurchasePanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductPurchasePanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductPurchasePanel3MouseClicked

    private void paidPaymentInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidPaymentInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paidPaymentInProductWanrrantyActionPerformed

    private void billInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billInProductWanrrantyActionPerformed

    private void refNameInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refNameInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refNameInProductWanrrantyActionPerformed

    private void printClickProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printClickProductWanrrantyActionPerformed

        SaveInWarrenty();
    }//GEN-LAST:event_printClickProductWanrrantyActionPerformed

    private void saveInProductPurchase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInProductPurchase2ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            DbConnection.deleteRow("product_purchase", "bar_code", barCodeInProductDetails.getSelectedItem().toString());
        }
    }//GEN-LAST:event_saveInProductPurchase2ActionPerformed

    private void updateClickProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateClickProductWanrrantyActionPerformed

        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            updateWarrantyInfoByInvoice();
        }

    }//GEN-LAST:event_updateClickProductWanrrantyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void generateBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBarCodeActionPerformed

        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            switchPanelViaMenu(getRechargeName);

        }
    }//GEN-LAST:event_generateBarCodeActionPerformed

    private void clickInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickInboxActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    detectUnreadSms();
                    System.out.println("Contract Searching...");
                    return null;
                }

                @Override
                protected void done() {
                    loadDataInInboxTable();
                    switchPanelViaMenu(inboxJpanel);
                    processtingLoderDialog.setVisible(false);
                    System.out.println("Fatching Successful...");
                }

            };
            swingWorker.execute();
        }
    }//GEN-LAST:event_clickInboxActionPerformed

    private void tableRechargeDetailsShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRechargeDetailsShowMouseClicked
        String mgs, userId, phoneNumberText;
        Point point = evt.getPoint();
        int column = tableRechargeDetailsShow.columnAtPoint(point);
        int row = tableRechargeDetailsShow.rowAtPoint(point);
        mgs = tableRechargeDetailsShow.getValueAt(row, 7).toString();
        userId = tableRechargeDetailsShow.getValueAt(row, 0).toString();
        phoneNumberText = tableRechargeDetailsShow.getValueAt(row, 3).toString();
        String ammountText = tableRechargeDetailsShow.getValueAt(row, 4).toString();
        MessageDialogShowUI ui = new MessageDialogShowUI(mgs, phoneNumberText);

        JDialog mgsDialog = new JDialog();
        mgsDialog.add(ui);
        mgsDialog.setSize(352, 254);
        mgsDialog.setLocationRelativeTo(null);
        mgsDialog.setUndecorated(true);
        mgsDialog.setVisible(true);
        ui.getClickOk().setEnabled(false);
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
                getMobileNumber.setText(phoneNumberText);
                getMobileNumber.setForeground(Color.black);
                getAmmountInTk.setText(ammountText);
                getAmmountInTk.setForeground(Color.black);

                deleteColumeFromRechargeDetails(userId);
                mgsDialog.setVisible(false);
                mgsDialog.dispose();
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

    private void clickSIMOffer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSIMOffer1ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            simSimOfferDialog();
        }
    }//GEN-LAST:event_clickSIMOffer1ActionPerformed

    private void clickGroupLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickGroupLoadActionPerformed
        switchPanelViaMenu(groupLoadPanel);
        getSelectedSimInGroupRecharge1.removeAllItems();
        if (UserInfo.role.equals("demo")) {

        } else {

            for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                getSelectedSimInGroupRecharge1.addItem(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")".toUpperCase());
            }

        }
        sendingLogLabel.setVisible(false);
        loadDataInGroupRechargeTable();
        focusAndKeyboardUsedInGroupRecharge();
    }//GEN-LAST:event_clickGroupLoadActionPerformed

    private void clickUssdDailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUssdDailActionPerformed

        switchPanelViaMenu(ussdDialPanel);
        getSelectedSim.removeAllItems();
        getUssdCode.requestFocusInWindow();
        refrashForWholeSoftware();
        if (UserInfo.role.equals("demo")) {

        } else {
            ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
                getSelectedSim.addItem(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")");
            });
        }
        addKeyLIsenerInUssdDailPad();
    }//GEN-LAST:event_clickUssdDailActionPerformed

    private void getMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getMobileNumberKeyReleased
        if (getMobileNumber.getText().equals("")) {
            popupForSuggestManu.setVisible(false);
        } else {

            if (searchItemsByPhoneNumberInRechargePanel(getMobileNumber.getText()).isEmpty()) {
                popupForSuggestManu.setVisible(false);
            } else {
                popupForSuggestManu.setVisible(true);
                DEFAULT_LIST_MODEL.removeAllElements();
                popupForSuggestManu.show(getMobileNumber, 0, getMobileNumber.getHeight());
                searchItemsByPhoneNumberInRechargePanel(getMobileNumber.getText())
                        .stream().forEach(number -> {
                            DEFAULT_LIST_MODEL.addElement(number);
                        });

            }

        }
    }//GEN-LAST:event_getMobileNumberKeyReleased

    private void getMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getMobileNumberActionPerformed

    private void getMobileNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getMobileNumberFocusLost
        setPlaceHolder(getMobileNumber, "Mobile Number");
    }//GEN-LAST:event_getMobileNumberFocusLost

    private void getMobileNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getMobileNumberFocusGained
        removePlaceHolder(getMobileNumber, "Mobile Number");
    }//GEN-LAST:event_getMobileNumberFocusGained

    private void getAmmountInTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAmmountInTkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getAmmountInTkActionPerformed

    private void getAmmountInTkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getAmmountInTkFocusLost
        setPlaceHolder(getAmmountInTk, "Ammount");
    }//GEN-LAST:event_getAmmountInTkFocusLost

    private void getAmmountInTkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getAmmountInTkFocusGained
        removePlaceHolder(getAmmountInTk, "Ammount");
    }//GEN-LAST:event_getAmmountInTkFocusGained

    private void getSeletedOperatorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSeletedOperatorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSeletedOperatorNameActionPerformed


    private void contractListClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contractListClickActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {

            switchPanelViaMenu(contractListPanel);
            SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    setContractListInJTable("mobile_banking");
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
        }
    }//GEN-LAST:event_contractListClickActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void getNameForSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNameForSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNameForSearchActionPerformed

    private void getMobileNumberForSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getMobileNumberForSearchKeyReleased
        searchByPhoneNumberInRechargeDetails(MOBILE_RECHARGE_DETAILS_FOR_SEARCHING_DTOS, getMobileNumberForSearch.getText());
    }//GEN-LAST:event_getMobileNumberForSearchKeyReleased

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back1MouseClicked

    private void searchInInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInInboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInInboxActionPerformed

    private void searchInInboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInInboxKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInInboxKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        clearBillforProduct();
        invoiceInProductSell.setText(String.valueOf(Configaration.getRandInt(1345, 100000)));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void getMobileNumberForSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMobileNumberForSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getMobileNumberForSearchActionPerformed

    private void back44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back44MouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_back44MouseClicked

    private void clickAddForRechargeBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddForRechargeBarCodeActionPerformed
        if (UserInfo.role.equals("demo")) {

        } else {
            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    genarateBarCodeForContractNumber(getMobileNumber.getText(), getNameForRechargeBarCode1.getText(), forBarCodePhoneNumber2.getText(), forBarCodePhoneNumber3.getText(), forBarCodePhoneNumber4.getText(), forBarCodePhoneNumber5.getText(), forBarCodePhoneNumber6.getText(), forBarCodePhoneNumber7.getText(), forBarCodePhoneNumber8.getText(), forBarCodePhoneNumber9.getText(), forBarCodePhoneNumber10.getText());
                    return null;
                }

                @Override
                protected void done() {
                    processtingLoderDialog.setVisible(false);
                }

            };
            worker.execute();

        }

    }//GEN-LAST:event_clickAddForRechargeBarCodeActionPerformed

    private void clickSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSendActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            String phoneNumberRequested = getMobileNumber.getText();
            String ammountRequested = getAmmountInTk.getText();

            if (!phoneNumberRequested.equals("")
                    && !ammountRequested.equals("")
                    && phoneNumberRequested.matches("[0-9]+")
                    && ammountRequested.matches("[0-9]+")) {
                if (isRechargeModemSetUpDone()) {
                    String preOrPostRequested = getPrepaidOrPostpaid.getSelectedItem().toString();
                    String selectedPayableSIM = getSeletedOperatorName.getSelectedItem().toString();

                    recharge(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM);
                } else {
                    Popup.customError("Recharge Setting not found.");
                }
            } else {
                getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));

            }
        }
    }//GEN-LAST:event_clickSendActionPerformed

    private void clickContactListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactListMouseClicked
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {

            switchPanelViaMenu(contractListPanel);
            SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    setContractListInJTable("mobile_recharge");
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
        }
    }//GEN-LAST:event_clickContactListMouseClicked

    private void oderLimitInProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oderLimitInProductDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oderLimitInProductDetailsActionPerformed

    private void forBarCodePhoneNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber3ActionPerformed

    private void getPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPINActionPerformed

    private void getBalenceUssdPartern3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBalenceUssdPartern3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBalenceUssdPartern3ActionPerformed

    private void getRechargeUssdParternPostPaid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPostPaid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPostPaid1ActionPerformed

    private void getRechargeUssdParternSkittoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternSkittoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternSkittoActionPerformed

    private void getRechargeUssdParternPrePaid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPrePaid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPrePaid1ActionPerformed

    private void clickChooseIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickChooseIcon1ActionPerformed
        loadImageIcon(getOparetorNameInUssdCommand.getSelectedItem().toString().toLowerCase());
    }//GEN-LAST:event_clickChooseIcon1ActionPerformed

    private void getprofitIn1kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getprofitIn1kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getprofitIn1kActionPerformed

    private void clickAddContract2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContract2ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            String rechargeUssdPartern = getRechargeUssdParternPrePaid1.getText();
            String operatorName = getOparetorNameInUssdCommand.getSelectedItem().toString();
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
        }
    }//GEN-LAST:event_clickAddContract2ActionPerformed

    private void getPrepaidOrPostpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPrepaidOrPostpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getPrepaidOrPostpaidActionPerformed

    private void getOparetorNameInUssdCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOparetorNameInUssdCommandActionPerformed
        System.err.println(getOparetorNameInUssdCommand.getSelectedItem());

        if (getOparetorNameInUssdCommand.getSelectedItem() == null) {
            System.err.println("Null Value Found");
        } else {
            switch (getOparetorNameInUssdCommand.getSelectedItem().toString().toLowerCase().replaceAll(" ", "")) {
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
    }//GEN-LAST:event_getOparetorNameInUssdCommandActionPerformed

    private void ussdSettedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussdSettedTableMouseClicked
        Point point = evt.getPoint();
        int column = ussdSettedTable.columnAtPoint(point);
        int row = ussdSettedTable.rowAtPoint(point);
        int seletedOption = 6;
        if (evt.getClickCount() == 2) {
            Object[] options = {"Delete", "Close"};
            seletedOption = JOptionPane.showOptionDialog(null, "Choose now ?", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        }

        switch (seletedOption) {
            case 0:
                DbConnection.deleteRow("command", "operator_name", ussdSettedTable.getValueAt(row, 0).toString());
                loadValuesForUssdManagementTable();
                break;
            case 1:

                //  switchPanelViaMenu(updateAddedManagementPanel);
                //  getOperatorName1.setText(ussdSettedTable.getValueAt(row, 0).toString());
                break;
            default:
                Configaration.setErrorLog("JOption selection not match");

                break;
        }
    }//GEN-LAST:event_ussdSettedTableMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        loadDataInWarrentyTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void searchingByNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchingByNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchingByNameKeyPressed

    private void addressInProductWanrrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressInProductWanrrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressInProductWanrrantyActionPerformed

    private void clickSandInMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSandInMBActionPerformed
        if (mobileBankingPanelValidation()) {
            showMobileBankingConfirmationDialog();
        } else {
            Popup.customError("Any field is empty!!");
        }
    }//GEN-LAST:event_clickSandInMBActionPerformed

    private void getNameForRechargeBarCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNameForRechargeBarCode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNameForRechargeBarCode1ActionPerformed

    private void forBarCodePhoneNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber4ActionPerformed

    private void forBarCodePhoneNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber2ActionPerformed

    private void forBarCodePhoneNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber5ActionPerformed

    private void forBarCodePhoneNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber6ActionPerformed

    private void forBarCodePhoneNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber7ActionPerformed

    private void forBarCodePhoneNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber8ActionPerformed

    private void forBarCodePhoneNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber9ActionPerformed

    private void forBarCodePhoneNumber10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forBarCodePhoneNumber10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forBarCodePhoneNumber10ActionPerformed

    private void makeNewInProductPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeNewInProductPurchaseActionPerformed
        invoiceInProductPurchases.requestFocusInWindow();
        invoiceInProductPurchases.setText("");
        supplierInProductPurchases.setText("");
        barCodeInProductPurchases.setText(String.valueOf(Configaration.getRandInt(5, 10)));
        pNameInProductPurchases.setText("");
        qtyInProductPurchases.setText("");
        buyRateInProductPurchases.setText("");
        sellRateInProductPurchases.setText("");
        typeInProductPurchasesComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_makeNewInProductPurchaseActionPerformed

    private void saveInProductPurchase3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInProductPurchase3ActionPerformed
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            saveInProductPurchaseDB();
            showDataInProductPurchaseFromDB(invoiceInProductPurchases.getText());
            refrashProductPurchaseTable();
        }
    }//GEN-LAST:event_saveInProductPurchase3ActionPerformed

    private void groupInProductPurchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupInProductPurchasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupInProductPurchasesActionPerformed

    private void barCodeInProductSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barCodeInProductSellActionPerformed
        System.err.println(barCodeInProductSell.getSelectedItem());
        discpuntInProductBill.requestFocusInWindow();
    }//GEN-LAST:event_barCodeInProductSellActionPerformed

    private void printClickProductWanrranty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printClickProductWanrranty1ActionPerformed
        printAndSaveInWarrenty();
    }//GEN-LAST:event_printClickProductWanrranty1ActionPerformed

    private void searchingByNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchingByNameKeyReleased
        searchByPhoneNumberInMobileBankingDetails(MOBILE_BANKING_DETAILS_FOR_SEARCHING_DTO, searchingByName.getText());
    }//GEN-LAST:event_searchingByNameKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void gpSimStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpSimStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpSimStartActionPerformed

    private void gpSimCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpSimCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpSimCloseActionPerformed

    private void arSimStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arSimStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arSimStartActionPerformed

    private void arSimCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arSimCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arSimCloseActionPerformed

    private void rbStopButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStopButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbStopButActionPerformed

    private void rbStartButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStartButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbStartButActionPerformed

    private void teleStopButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleStopButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleStopButActionPerformed

    private void teleStartButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleStartButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleStartButActionPerformed

    private void deleteColumeFromMobileBanking(String userId) {
        if (UserInfo.role.equals("admin")) {
            DbConnection.deleteRow("m_b_details", "TnxId", userId);
            loadMobileBankingDetailsTable();
        } else {
            Popup.customError("Access Deny..");
        }

    }

    private HashMap<String, String> getMobileBankingBalance() {
        System.out.println("action here");

        String amount = "0.0";
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
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

                for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                    String activeSimNameWithPhoneNO = simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")";

                    if (mobileBankingBalanceShowDto.getDefaultSIM().toLowerCase().equals(activeSimNameWithPhoneNO.toLowerCase())) {

                        Pattern p = Pattern.compile("\\d+");
                        Matcher m = p.matcher(mobileBankingBalanceShowDto.getUssdCode());
                        ussdCodeSerialList.clear();
                        while (m.find()) {

                            ussdCodeSerialList.add(m.group());
                        }

                        //GET BALANNCE
                        String feedBackMgs = sendSerialUSSDCode(ussdCodeSerialList, simOperatorIdentifierDto.getPortName());
                        amount = Configaration.stringToNumberList(Configaration.haxToStringConvert(feedBackMgs)).get(0);
                        MOBILE_BANKING_BALENCE_HASH_MAP.put(mobileBankingBalanceShowDto.getServiceName() + "(" + activeSimNameWithPhoneNO + ")", amount);

                    }
                }

            }

        }
        return MOBILE_BANKING_BALENCE_HASH_MAP;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MobileBankingSettingsPanel;
    private javax.swing.JPanel ProductPurchasePanel;
    private javax.swing.JPanel ProductPurchasePanel1;
    private javax.swing.JPanel ProductPurchasePanel2;
    private javax.swing.JPanel ProductPurchasePanel3;
    private javax.swing.JPanel UsingCustomerId;
    private javax.swing.JPasswordField accountPassword;
    private javax.swing.JPasswordField accountPassword1;
    private javax.swing.JComboBox<String> actionTypeInProductSellCOmboBox;
    private javax.swing.JLabel activeDateInProfile;
    private javax.swing.JLabel activePackageNameInProfile;
    private javax.swing.JButton addButInGroupRecharge;
    private javax.swing.JPanel addMobileBankingPanelInBillPay;
    private javax.swing.JPanel addNewContractPanel;
    private javax.swing.JPanel addNewManagementPanel;
    private javax.swing.JPanel addNewManagementPanelSettings;
    private javax.swing.JCheckBox addPerchangeSelection;
    private javax.swing.JTextField addressInProductSell;
    private javax.swing.JTextField addressInProductWanrranty;
    private javax.swing.JPanel ar;
    private javax.swing.JLabel arSimAmount;
    private javax.swing.JButton arSimClose;
    private javax.swing.JLabel arSimName;
    private javax.swing.JButton arSimStart;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel back43;
    private javax.swing.JLabel back44;
    private javax.swing.JLabel backToMobileRecharge;
    private javax.swing.JLabel backToMobileRecharge1;
    private javax.swing.JLabel backToUssdManengementPanel;
    private javax.swing.JComboBox<String> barCodeInProductDetails;
    private javax.swing.JTextField barCodeInProductPurchases;
    private javax.swing.JComboBox<String> barCodeInProductSell;
    private javax.swing.JPanel baseBillPayment;
    private javax.swing.JPanel basePanel;
    private javax.swing.JTextField billInProductWanrranty;
    private javax.swing.JPanel billPanel;
    private javax.swing.JPanel billPayPanel;
    private javax.swing.JPanel billPaymentPanelInBillPay;
    private javax.swing.JPanel billPaymentTab;
    private javax.swing.JPanel bl;
    private javax.swing.JLabel blSimAmount;
    private javax.swing.JLabel blSimName;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JTextField brandInProductDetails;
    private javax.swing.JTextField brandInProductWanrranty;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField buyRateInProductDetails;
    private javax.swing.JTextField buyRateInProductPurchases;
    private javax.swing.JButton clickAddContract;
    private javax.swing.JButton clickAddContract1;
    private javax.swing.JButton clickAddContract2;
    private javax.swing.JButton clickAddForRechargeBarCode;
    private javax.swing.JButton clickAddNewManagement;
    private javax.swing.JLabel clickBillPayment;
    private javax.swing.JButton clickChooseIcon;
    private javax.swing.JButton clickChooseIcon1;
    private javax.swing.JLabel clickContactList;
    private javax.swing.JLabel clickEditInProfile;
    private javax.swing.JButton clickExportDatabase;
    private javax.swing.JButton clickGroupLoad;
    private javax.swing.JButton clickImportDatabase;
    private javax.swing.JButton clickInbox;
    private javax.swing.JLabel clickMobileBanking;
    private javax.swing.JButton clickNewContract;
    private javax.swing.JButton clickPayIUsingBill;
    private javax.swing.JButton clickRefrash2;
    private javax.swing.JButton clickResetPayInUsingBill;
    private javax.swing.JButton clickSIMOffer1;
    private javax.swing.JButton clickSandInMB;
    private javax.swing.JButton clickSaveInMobileRechatgeSetting;
    private javax.swing.JButton clickSend;
    private javax.swing.JButton clickTabUsingBillNO;
    private javax.swing.JButton clickTabUsingCustomerId;
    private javax.swing.JButton clickUpdatePassword;
    private javax.swing.JButton clickUssdDail;
    private javax.swing.JButton clickUssdDailDorSend1;
    private javax.swing.JButton clickUssdSessionClose;
    private javax.swing.JPanel comission;
    private javax.swing.JPanel comission1;
    private javax.swing.JPanel comission2;
    private javax.swing.JLabel companyNameInProfilePanel;
    private javax.swing.JButton contractListClick;
    private javax.swing.JPanel contractListPanel;
    private javax.swing.JLabel currentNetworkName;
    private javax.swing.JTextField customerIdINProductSell;
    private javax.swing.JTextField customerIdINProductWanrranty;
    private com.toedter.calendar.demo.DateChooserPanelBeanInfo dateChooserPanelBeanInfo1;
    private com.toedter.calendar.JDateChooser dateInProductBillPay;
    private com.toedter.calendar.JDateChooser dateInProductPurchases;
    private com.toedter.calendar.JDateChooser dateInProductSell;
    private com.toedter.calendar.JDateChooser dateInProductWanrranty;
    private com.toedter.calendar.JDateChooser delevaryDateDateInProductWanrranty;
    private javax.swing.JLabel designationInProfilePanel1;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel detailsPanelInBillPay;
    private javax.swing.JPanel detailsTab;
    private javax.swing.JLabel deviceStartStatus;
    private javax.swing.JLabel discountInProductSell;
    private javax.swing.JTextField discpuntInProductBill;
    private javax.swing.JTextField discpuntInProductWanrranty;
    private com.toedter.calendar.JDateChooser dueDateInProductSell;
    private javax.swing.JLabel dueInProductSell;
    private javax.swing.JLabel dueInProductWanrranty;
    private javax.swing.JTextField duePaymentInProductBill;
    private javax.swing.JLabel duePaymentInProductSell;
    private javax.swing.JLabel expiryDateInProfile;
    private javax.swing.JTextField forBarCodePhoneNumber10;
    private javax.swing.JTextField forBarCodePhoneNumber2;
    private javax.swing.JTextField forBarCodePhoneNumber3;
    private javax.swing.JTextField forBarCodePhoneNumber4;
    private javax.swing.JTextField forBarCodePhoneNumber5;
    private javax.swing.JTextField forBarCodePhoneNumber6;
    private javax.swing.JTextField forBarCodePhoneNumber7;
    private javax.swing.JTextField forBarCodePhoneNumber8;
    private javax.swing.JTextField forBarCodePhoneNumber9;
    private javax.swing.JTextField fullNameInProductSell;
    private javax.swing.JTextField fullNameInProductWanrranty;
    private javax.swing.JButton generateBarCode;
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
    private javax.swing.JTextField getMobileNumberForSearch;
    private javax.swing.JTextField getNameForContract;
    private javax.swing.JTextField getNameForRechargeBarCode1;
    private javax.swing.JTextField getNameForSearch;
    private javax.swing.JTextField getOfferNameInSeting;
    private javax.swing.JComboBox<String> getOparetorNameInUssdCommand;
    private javax.swing.JComboBox<String> getOperationType;
    private javax.swing.JTextField getOperatorName;
    private javax.swing.JPasswordField getPIN;
    private javax.swing.JPasswordField getPassword;
    private javax.swing.JPasswordField getPasswordInBillPay;
    private javax.swing.JTextField getPasswordTEmployee;
    private javax.swing.JTextField getPhoneNOForContract;
    private javax.swing.JTextField getPhoneNumberInBillPayment;
    private javax.swing.JTextField getPhoneNumberInGroupRecharge;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid;
    private javax.swing.JTextField getRechargeAmmountInSeetings;
    private javax.swing.JPanel getRechargeAmountInSetting;
    private javax.swing.JPanel getRechargeName;
    private javax.swing.JTextField getRechargeUssdParternPostPaid;
    private javax.swing.JTextField getRechargeUssdParternPostPaid1;
    private javax.swing.JTextField getRechargeUssdParternPrePaid;
    private javax.swing.JTextField getRechargeUssdParternPrePaid1;
    private javax.swing.JTextField getRechargeUssdParternSkitto;
    private javax.swing.JComboBox<String> getSIMOperatorName;
    private javax.swing.JComboBox<String> getSelectedSIMNameCombo;
    private javax.swing.JTextField getSelectedServiceCombo;
    private javax.swing.JComboBox<String> getSelectedSim;
    private javax.swing.JComboBox<String> getSelectedSimInGroupRecharge1;
    private javax.swing.JComboBox<String> getSelectedTypeGroupRecharge;
    private javax.swing.JComboBox<String> getSelectedValidityTimeTypeSetting;
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
    private javax.swing.JPanel gp;
    private javax.swing.JLabel gpSimAmount;
    private javax.swing.JButton gpSimClose;
    private javax.swing.JLabel gpSimName;
    private javax.swing.JButton gpSimStart;
    private javax.swing.JTextField groupInProductDetails;
    private javax.swing.JTextField groupInProductPurchases;
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
    private javax.swing.JPanel inboxJpanel;
    private javax.swing.JTable inboxTable;
    private javax.swing.JLabel invoiceINProductDetails;
    private javax.swing.JTextField invoiceInProductPurchases;
    private javax.swing.JTextField invoiceInProductSell;
    private javax.swing.JTextField invoiceInProductWarranty;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelUssdPatternSkitto;
    private javax.swing.JComboBox<String> listOfBarCodeOrGroupComboBox;
    private javax.swing.JLabel loaderInBillPayment;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton makeNewInProductPurchase;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JList<String> mobileBankingBalanceShowPanelList;
    private javax.swing.JLabel mobileBankingSettings;
    private javax.swing.JPanel mobileRechargePanel;
    private javax.swing.JPanel mobileRechargeTab;
    private javax.swing.JLabel myProfile;
    private javax.swing.JPanel myProfilePanel;
    private javax.swing.JLabel nameInProfilePanel1;
    private javax.swing.JPanel netBarPanel;
    private javax.swing.JTextField noteInProductSell;
    private javax.swing.JTextField oderLimitInProductDetails;
    private javax.swing.JTextField pNameInProductDetails;
    private javax.swing.JTextField pNameInProductPurchases;
    private javax.swing.JPanel paid;
    private javax.swing.JPanel paid1;
    private javax.swing.JPanel paid3;
    private javax.swing.JPanel paid4;
    private javax.swing.JLabel paidInProductSell;
    private javax.swing.JLabel paidInProductWanrranty;
    private javax.swing.JTextField paidPaymentInProductWanrranty;
    private javax.swing.JCheckBox panddingInProductSellCheckBOx;
    private javax.swing.JComboBox<String> panddingListnProductSellComboBox;
    private javax.swing.JLabel pandingRequestCounter;
    private javax.swing.JLabel passwordChange;
    private javax.swing.JPanel passwordChangePanel;
    private javax.swing.JTextField passwordForUpdate;
    private javax.swing.JButton payInUsingCustomerId;
    private javax.swing.JLabel payableInProductSell;
    private javax.swing.JLabel payableInProductWanrranty;
    private javax.swing.JTextField paymentInProductBill;
    private javax.swing.JComboBox<String> paymentTypeInProductSell;
    private javax.swing.JLabel paymentWayInProductSell;
    private javax.swing.JTextField phoneNOInProductSell;
    private javax.swing.JTextField phoneNOInProductWanrranty;
    private javax.swing.JPopupMenu popupForSuggestManu;
    private javax.swing.JButton printClickProductWanrranty;
    private javax.swing.JButton printClickProductWanrranty1;
    private javax.swing.JTextPane problemInProductWanrranty;
    private javax.swing.JTable productDetailsTable;
    private javax.swing.JPanel productInfo;
    private javax.swing.JComboBox<String> productMasurementProductDetails;
    private javax.swing.JPanel productPurchase;
    private javax.swing.JTable productPurchaseTable;
    private javax.swing.JTable productSellTable;
    private javax.swing.JTable productWarrantyTable;
    private javax.swing.JLabel profile_pic;
    private javax.swing.JTextField qtyInProductDetails;
    private javax.swing.JTextField qtyInProductPurchases;
    private javax.swing.JPanel rb;
    private javax.swing.JLabel rbSimAmount;
    private javax.swing.JLabel rbSimName;
    private javax.swing.JButton rbStartBut;
    private javax.swing.JButton rbStopBut;
    private javax.swing.JTextField rePasswordForUpdate;
    private javax.swing.JPanel rechargeBalencePanel;
    private javax.swing.JPanel rechargeBalencePanel1;
    private javax.swing.JPanel rechargeBalencePanel2;
    private javax.swing.JPanel rechargeOfferPanel;
    private javax.swing.JLabel rechargeOffers;
    private javax.swing.JLabel rechargeSettings;
    private javax.swing.JPanel rechargeSettingsPanel;
    private javax.swing.JTextField refNameInProductWanrranty;
    private javax.swing.JLabel remainDaysInProfile;
    private javax.swing.JPanel resellerPanel;
    private javax.swing.JButton resetnUsingCustomerId;
    private javax.swing.JLabel returnInProductSell;
    private javax.swing.JButton saveInProductPurchase1;
    private javax.swing.JButton saveInProductPurchase2;
    private javax.swing.JButton saveInProductPurchase3;
    private javax.swing.JButton saveNewOfferInSettrings;
    private javax.swing.JRadioButton searchByGroupInRatio;
    private javax.swing.JTextField searchInInbox;
    private javax.swing.JTextField searchingByName;
    private javax.swing.JLabel selectedSimOperatorIcon;
    private javax.swing.JTextField sellRateInProductDetails;
    private javax.swing.JTextField sellRateInProductPurchases;
    private javax.swing.JButton sendAllRechargeBut;
    private javax.swing.JLabel sendingLogLabel;
    private javax.swing.JTextArea setResponseShowFromUssd;
    private javax.swing.JPanel settingBasePanel;
    private javax.swing.JPanel settingTab;
    private javax.swing.JPanel settingsPanel1;
    private javax.swing.JComboBox<String> statusInProductWanrrantyComboBox;
    private javax.swing.JList<String> suggList;
    private javax.swing.JPanel suggestPanel;
    private javax.swing.JTextField supplierInProductPurchases;
    private javax.swing.JLabel systemBackup;
    private javax.swing.JPanel systemBackupPanel;
    private javax.swing.JLabel tAmountInPPurchaseInSummary;
    private javax.swing.JLabel tCommissionInPPurchaseInSummary;
    private javax.swing.JLabel tItemsInPPurchaseInSummary;
    private javax.swing.JLabel tPaidInPPurchase3;
    private javax.swing.JLabel tReturnAmountInPPurchase4;
    private javax.swing.JTable tableBillPaymentDetails;
    private javax.swing.JTable tableContractLIst;
    private javax.swing.JTable tableGroupRecharge;
    private javax.swing.JTable tableMobileBankingDetails;
    private javax.swing.JTable tableMobileBankingSetting;
    private javax.swing.JTable tableRechargeDetailsShow;
    private javax.swing.JTable tableTrustedEmployees;
    private javax.swing.JPanel tele;
    private javax.swing.JLabel teleSimAmount;
    private javax.swing.JLabel teleSimName;
    private javax.swing.JButton teleStartBut;
    private javax.swing.JButton teleStopBut;
    private javax.swing.JComboBox<String> timeTypeProductDetails;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel totalAmountInProductSell1;
    private javax.swing.JPanel totalAmt;
    private javax.swing.JPanel totalAmt1;
    private javax.swing.JPanel totalItems;
    private javax.swing.JLabel totalItemsInProductSell;
    private javax.swing.JPanel trustedEmployeePanel;
    private javax.swing.JComboBox<String> typeInProductPurchasesComboBox;
    private javax.swing.JButton updateClickProductWanrranty;
    private javax.swing.JLabel userIdInProfile;
    private javax.swing.JPanel usingBillNoPanel;
    private javax.swing.JPanel ussdDialPanel;
    private javax.swing.JTable ussdSettedTable;
    private javax.swing.JLabel vatInProductSell;
    private javax.swing.JTextField warrantyInProductBill;
    private javax.swing.JTextField warrantyInProductWanrranty;
    private javax.swing.JPanel warrantyTab;
    private javax.swing.JTextField warrentyInProductDetails;
    // End of variables declaration//GEN-END:variables

    //Redirect Panel use Role
    private void stratApplicationByRoleWise() {

        if (UserInfo.role.equals("demo")) {

        } else {
            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    setCuurentActiveNetworksFromModem();
                    loadActiveOperatorNameInComboBox();
                    processRequestFromMobileRechargeQueue();
                    collectInitialSIMBalance();
                    showMobileRechargeBalance();
                    loadValueInTableRechargeDetails();
                    setFocusInMobileRechargePanel();
                    loadMobileNoFromRecharge();

                    return null;
                }

                @Override
                protected void done() {

                }

            };
            worker.execute();

        }
    }

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
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `recharge_offers` WHERE `recharge_amt`=\"" + ammountRequested + "\"";
                ResultSet rs = st.executeQuery(sql);
                if (!rs.next()) {
                    showRechargeConfirmationDialog(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM);
                    System.err.println("Offer Not Found");

                } else {
                    do {
                        if (rs.getString("sim_name").toUpperCase().contains(selectedPayableSIM.replaceAll(StringUtils.right(selectedPayableSIM, 5), "").replaceAll("\\(\\)", "").toUpperCase())) {

                            int res = Popup.customWarning("You will be getting " + rs.getString("description") + "/" + rs.getString("validity"));
                            if (res == -1) {
                                System.err.println("Recharge Offer dialog closed.");
                            }
                            if (res == 0) {
                                showRechargeConfirmationDialog(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM);
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

    }

    public void showRechargeConfirmationDialog(String phoneNumberRequested,
            String ammountRequested, String preOrPostRequested, String selectedPayableSIM) {
        RechargeConfirmationDialogUI ui
                = new RechargeConfirmationDialogUI("Recharge Confirmation",
                        getMobileNumber.getText(),
                        getAmmountInTk.getText() + " tk",
                        getPrepaidOrPostpaid.getSelectedItem().toString(),
                        getSeletedOperatorName.getSelectedItem().toString());

        JDialog rechargeConfirmationDailog = new JDialog();
        rechargeConfirmationDailog.add(ui);
        rechargeConfirmationDailog.setSize(872, 566);
        rechargeConfirmationDailog.setLocationRelativeTo(null);
        rechargeConfirmationDailog.setUndecorated(true);
        rechargeConfirmationDailog.setVisible(true);

        ui.getClickClose().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Icon icon = new ImageIcon(getClass().getResource("/resources/images/default_operator_icon_1.png"));

                selectedSimOperatorIcon.setIcon(icon);
                getMobileNumber.setText("");
                getAmmountInTk.setText("");
                getMobileNumber.requestFocusInWindow();
                rechargeConfirmationDailog.setVisible(false);
            }

        });
        ui.getClickClose().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    Icon icon = new ImageIcon(getClass().getResource("/resources/images/default_operator_icon_1.png"));
                    selectedSimOperatorIcon.setIcon(icon);
                    getMobileNumber.setText("");
                    getAmmountInTk.setText("");
                    getMobileNumber.requestFocusInWindow();
                    rechargeConfirmationDailog.setVisible(false);

                }
                if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                    ui.getClickEdit().requestFocusInWindow();
                } else {

                }
            }
        });

        ui.getClickConfirm().addActionListener((ActionEvent ae) -> {
            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {

                    Log.mgs("Requested SIM Card: ", selectedPayableSIM);
                    if (UserInfo.role.equals("demo")) {
                        System.err.println("Access dny in DEMO Panel");
                    } else {
                        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                            if (selectedPayableSIM.equals(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")".toUpperCase())) {
                                MobileRechargeDetailsDto mobileRechargeDetailsDto
                                        = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), phoneNumberRequested, ammountRequested, preOrPostRequested, simOperatorIdentifierDto.getPortName(), selectedPayableSIM, UssdRequestType.MOBILE_RECHARGE);
                                addQueue(mobileRechargeDetailsDto);
                            }
                        }

                    }

                    return null;
                }

                @Override
                protected void done() {
                    rechargeConfirmationDailog.setVisible(false);
                    getMobileNumber.requestFocusInWindow();
                    refrashForWholeSoftware();
                }

            };
            worker.execute();

        });

        ui.getClickConfirm().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    refrashForWholeSoftware();
                    SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            Log.mgs(TAG, "Clickeed");

                            if (UserInfo.role.equals("demo")) {
                                System.err.println("Access dny in DEMO Panel");

                            } else {
                                for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                                    if (selectedPayableSIM.equals(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")".toUpperCase())) {
                                        MobileRechargeDetailsDto mobileRechargeDetailsDto
                                                = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), phoneNumberRequested, ammountRequested, preOrPostRequested, simOperatorIdentifierDto.getPortName(), selectedPayableSIM, UssdRequestType.MOBILE_RECHARGE);
                                        addQueue(mobileRechargeDetailsDto);
                                    }
                                }
                                rechargeConfirmationDailog.setVisible(false);
                                getMobileNumber.requestFocusInWindow();
                                refrashForWholeSoftware();
                            }

                            return null;
                        }

                        @Override
                        protected void done() {
                            rechargeConfirmationDailog.setVisible(false);
                            getMobileNumber.requestFocusInWindow();
                            refrashForWholeSoftware();
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
                rechargeConfirmationDailog.setVisible(false);
            }

        });
        ui.getClickEdit().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    rechargeConfirmationDailog.setVisible(false);
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

    private void addQueue(Object object) {
        try {
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                    Queue<Object> objectQueue = CREATE_HASH_MAP_BY_CONNECTED_PORTS.get(simOperatorIdentifierDto.getPortName());
                    if (objectQueue == null) {
                        Queue<Object> emptyObjectQueue = new PriorityQueue<Object>(5, new MobileRechargeDetailsComparator());
                        CREATE_HASH_MAP_BY_CONNECTED_PORTS.put(simOperatorIdentifierDto.getPortName(), emptyObjectQueue);
                    }
                }
            }

            Method mathod = (Method) object.getClass().getMethod("getSelectableSimPort", null);
            String portName = (String) mathod.invoke(object, null);
            Queue<Object> objectQueue = CREATE_HASH_MAP_BY_CONNECTED_PORTS.get(portName);
            objectQueue.add(object);
            ussdDailREquestCounter();
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void processRequestFromMobileRechargeQueue() {
        // Runs outside of the Swing UI thread
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        for (Entry<String, Queue<Object>> hashValue : CREATE_HASH_MAP_BY_CONNECTED_PORTS.entrySet()) {

                            while (!hashValue.getValue().isEmpty()) {

                                Object object = hashValue.getValue().element();
                                Method methodGetStatus = (Method) object.getClass().getMethod("getStatus", null);
                                UssdRequestType getStatus = (UssdRequestType) methodGetStatus.invoke(object, null);

                                switch (getStatus) {
                                    case MOBILE_RECHARGE:
                                        MobileRechargeDetailsDto headRechargeDetailsDto = (MobileRechargeDetailsDto) object;
                                        rechargeDoneProcess(headRechargeDetailsDto.getTrxId(), headRechargeDetailsDto.getPhoneNumber(), headRechargeDetailsDto.getAmmount(), headRechargeDetailsDto.getPostPaidOrPostPaid(), headRechargeDetailsDto.getSelectableSimPort(), headRechargeDetailsDto.getSelectableSim(), headRechargeDetailsDto.getStatus());
                                        hashValue.getValue().remove();
                                        ussdDailREquestCounter();
                                        break;

                                    case MOBILE_BANKING:
                                        System.err.println(getStatus);
                                        MobileBankingDetailsDto headMobileBankingDetailsDto = (MobileBankingDetailsDto) object;
                                        sendMobileBankingRequest(headMobileBankingDetailsDto.getService(), headMobileBankingDetailsDto.getAction(), headMobileBankingDetailsDto.getAcNo(), headMobileBankingDetailsDto.getAmount(), headMobileBankingDetailsDto.getSelectableSimPort(), headMobileBankingDetailsDto.getSelectableSim());
                                        hashValue.getValue().remove();
                                        ussdDailREquestCounter();
                                        break;
                                    case BILL_PAYMENT:
                                        System.err.println(getStatus);
                                        hashValue.getValue().remove();
                                        ussdDailREquestCounter();
                                        break;
                                    default:
                                        System.err.println("none");
                                        break;
                                }

                            }

                        }

                        java.lang.Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvocationTargetException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NoSuchMethodException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SecurityException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
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
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");
            } else {
                Connection conn = DbConnection.connect();
                try {
                    Icon icon;

                    String selectedOperatorName = setPayableSIMByPhoneNumber(getMobileNumber.getText()).toUpperCase();
                    Log.mgs("Selected SIM By Phone Number", selectedOperatorName);
                    Statement st = conn.createStatement();
                    String sql = "SELECT * FROM `command` WHERE `operator_name`=\"" + selectedOperatorName + "\"";
                    ResultSet rs = st.executeQuery(sql);

                    if (!rs.next()) {
                        //Popup.customError("Recharge Setting not found.");
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
                } finally {
                    DbConnection.disconnect(conn);
                }
            }
        }

    }

    private String setPayableSIMByPhoneNumber(String phoneNumberUserInput) {
        String phoneNumberUserInputSubString = StringUtils.left(phoneNumberUserInput, 3);
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");

        } else {
            for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                if (simOperatorIdentifierDto.getOwnPhoneNumber().contains(phoneNumberUserInputSubString)) {
                    String selectedSimCardWithNumber = simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")";
                    getSeletedOperatorName.setSelectedItem(selectedSimCardWithNumber);
                    return selectedSimCardWithNumber;
                }
            }
        }

        return "Expected SIM not found";
    }

    void rechargeDoneProcess(String trxId, String phoneNumberRequested,
            String ammountRequested, String preOrPostRequested,
            String selectedPayableSIMPort, String selectedPayableSIM,
            UssdRequestType rechargeType) {

        saveToDbCommandInRechargeAdmin(trxId, phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM, "Processing", "Processing");

        String[] responseArray;
        String cBalance = null;
        String statusMgs = null;
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {

            Connection conn = DbConnection.connect();
            Statement st = null;
            ResultSet rs = null;
            try {
                st = conn.createStatement();
                String sql = "SELECT * FROM `command` WHERE `operator_name`=\"" + selectedPayableSIM + "\"";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    auto.recharge.system.config.Modem.connect(selectedPayableSIMPort);
                    if (preOrPostRequested.toLowerCase().equals("pre-paid")) {
                        String rechargeCode = rs.getString("r_ussd_code_pre").replaceAll("number", phoneNumberRequested)
                                .replaceAll("amount", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), "itvillage428854"));
                        Log.mgs("5347", "USSD Code:" + rechargeCode);
                        String response = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15");
                        Configaration.closeUssdSession();
                        if (response.contains(",")) {
                            responseArray = response.split(",");
                            System.err.println();
                            statusMgs = Configaration.haxToStringConvert(responseArray[1].replaceAll("\"", ""));

                            List<MobileRechargeBalance> balanceUpdatePaseList = new ArrayList<>();
                            for (MobileRechargeBalance mobileRechargeBalance : ModemInfoList.mobileRechargeBalance) {
                                if (mobileRechargeBalance.getSimName().equals(selectedPayableSIM)) {
                                    cBalance = String.valueOf(Double.valueOf(mobileRechargeBalance.getSimBalance()) - Double.valueOf(ammountRequested));
                                    mobileRechargeBalance.setSimBalance(cBalance);
                                }
                                balanceUpdatePaseList.add(mobileRechargeBalance);
                            }
                            ModemInfoList.mobileRechargeBalance = balanceUpdatePaseList;

                        } else {
                            cBalance = "Failed";
                            statusMgs = "Failed";
                            System.err.println("4672--->Ussd Request Faild");
                        }

                        Configaration.setErrorLog(this.getClass().getName() + "-->1856--->" + response);
                    } else if (preOrPostRequested.toLowerCase().equals("skitto")) {
                        String rechargeCode = rs.getString("action_for").replaceAll("number", phoneNumberRequested)
                                .replaceAll("amount", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), "itvillage428854"));
                        Log.mgs("5347", "USSD Code:" + rechargeCode);
                        String response = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15");
                        Configaration.closeUssdSession();
                        if (response.contains(",")) {
                            responseArray = response.split(",");
                            System.err.println();
                            statusMgs = Configaration.haxToStringConvert(responseArray[1].replaceAll("\"", ""));
                            List<MobileRechargeBalance> balanceUpdatePaseList = new ArrayList<>();
                            for (MobileRechargeBalance mobileRechargeBalance : ModemInfoList.mobileRechargeBalance) {
                                if (mobileRechargeBalance.getSimName().equals(selectedPayableSIM)) {
                                    cBalance = String.valueOf(Double.valueOf(mobileRechargeBalance.getSimBalance()) - Double.valueOf(ammountRequested));
                                    mobileRechargeBalance.setSimBalance(cBalance);
                                }
                                balanceUpdatePaseList.add(mobileRechargeBalance);
                            }
                            ModemInfoList.mobileRechargeBalance = balanceUpdatePaseList;

                        } else {
                            cBalance = "Failed";
                            statusMgs = "Failed";
                            System.err.println("4686--->Ussd Request Faild");
                        }

                        Configaration.setErrorLog(this.getClass().getName() + "-->1856--->" + response);
                    } else if (preOrPostRequested.toLowerCase().equals("post-paid")) {
                        String rechargeCode = rs.getString("r_ussd_code_post").replaceAll("number", phoneNumberRequested)
                                .replaceAll("amount", ammountRequested).replaceAll("pin", AES.decrypt(rs.getString("password"), "itvillage428854"));
                        Log.mgs("5347", "USSD Code:" + rechargeCode);
                        String response = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + rechargeCode + "\",15");
                        Configaration.closeUssdSession();
                        if (response.contains(",")) {
                            responseArray = response.split(",");
                            System.err.println();
                            statusMgs = Configaration.haxToStringConvert(responseArray[1].replaceAll("\"", ""));
                            List<MobileRechargeBalance> balanceUpdatePaseList = new ArrayList<>();
                            for (MobileRechargeBalance mobileRechargeBalance : ModemInfoList.mobileRechargeBalance) {
                                if (mobileRechargeBalance.getSimName().equals(selectedPayableSIM)) {
                                    cBalance = String.valueOf(Double.valueOf(mobileRechargeBalance.getSimBalance()) - Double.valueOf(ammountRequested));
                                    mobileRechargeBalance.setSimBalance(cBalance);
                                }
                                balanceUpdatePaseList.add(mobileRechargeBalance);
                            }
                            ModemInfoList.mobileRechargeBalance = balanceUpdatePaseList;

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

            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.closeStatemanet(st);
                DbConnection.closeResult(rs);
                DbConnection.disconnect(conn);
            }

        }
        auto.recharge.system.config.Modem.disconnect();
        // UPdate Balance after recharge
        addBalenceInBalenceShowTable();
        updateMobileRechargeStatusByTrxId(trxId, statusMgs, cBalance);

        getMobileNumber.requestFocusInWindow();
    }

    private void saveToDbCommandInRechargeAdmin(String trxId, String getMobileNumberText,
            String getAmmountInTkText, String getPrepaidOrPostpaidText, String requestedSimOperator,
            String ckeckRechargeSuccessStatus, String currentBalance) {
        String dateTime = Configaration.getCurrentDateAndTime();
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {

            try {

                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:MobileRecharge.sqlite");
                PreparedStatement preparedStatement = null;
                String sql = "INSERT INTO recharge_details(mobile_no,amount,date_time,status,trx_id,type,from_sp,current_balance) VALUES(?,?,?,?,?,?,?,?)";

                try {
                    preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.setString(1, getMobileNumberText);
                    preparedStatement.setString(2, getAmmountInTkText);
                    preparedStatement.setString(3, dateTime);
                    preparedStatement.setString(4, ckeckRechargeSuccessStatus);
                    preparedStatement.setString(5, trxId);
                    preparedStatement.setString(6, getPrepaidOrPostpaidText);
                    preparedStatement.setString(7, requestedSimOperator);
                    preparedStatement.setString(8, currentBalance);
                    preparedStatement.execute();

                } catch (SQLException ex) {
                    Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbConnection.closeStatemanet(preparedStatement);
                    DbConnection.disconnect(conn);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadValueInTableRechargeDetails();
        }
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                selectedSimOperatorName = simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")";
                if (selectedSimOperatorName.toUpperCase().contains(getOperator.toUpperCase())) {
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

    }

    public void ussdDailREquestCounter() {
        int total = 0;
        for (Queue<Object> queue : CREATE_HASH_MAP_BY_CONNECTED_PORTS.values()) {
            total += queue.size();
        }
        pandingRequestCounter.setText(String.valueOf(total));
    }

    public void loadValueInTableRechargeDetails() {

        DefaultTableModel mobileRechargeDetailsInMobileRechargePanel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status"}, 0);
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                try {
                    Class.forName("org.sqlite.JDBC");
                    Connection conn = DriverManager.getConnection("jdbc:sqlite:MobileRecharge.sqlite");
                    try {
                        Statement st = conn.createStatement();
                        String sql = "SELECT * FROM `recharge_details`";
                        ResultSet rs = st.executeQuery(sql);

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
                            MobileRechargeDetailsForSearchingDto mobileRechargeDetailsForSearchingDto = new MobileRechargeDetailsForSearchingDto();
                            mobileRechargeDetailsForSearchingDto.setTrxId(rs.getString("trx_id"));
                            mobileRechargeDetailsForSearchingDto.setDateAndTime(rs.getString("date_time"));
                            mobileRechargeDetailsForSearchingDto.setPhoneNumber(rs.getString("mobile_no"));
                            mobileRechargeDetailsForSearchingDto.setcBalance(rs.getString("current_balance"));
                            mobileRechargeDetailsForSearchingDto.setPostPaidOrPostPaid(rs.getString("type"));
                            mobileRechargeDetailsForSearchingDto.setAmmount(rs.getString("amount"));
                            mobileRechargeDetailsForSearchingDto.setSelectableSim(rs.getString("from_sp"));
                            mobileRechargeDetailsForSearchingDto.setStatus(rs.getString("status"));

                            MOBILE_RECHARGE_DETAILS_FOR_SEARCHING_DTOS.add(mobileRechargeDetailsForSearchingDto);

                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        DbConnection.disconnect(conn);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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

        DbConnection.deleteRow("recharge_admin", "trx_id", userId);

        loadValueInTableRechargeDetails();

    }

    public void setFocusInMobileRechargePanel() {
        //Mobile Recharge
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
                    if (UserInfo.role.equals("demo")) {
                        JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
                    } else {
                        String phoneNumberRequested = getMobileNumber.getText();
                        String ammountRequested = getAmmountInTk.getText();

                        if (!phoneNumberRequested.equals("")
                                && !ammountRequested.equals("")
                                && phoneNumberRequested.matches("[0-9]+")
                                && ammountRequested.matches("[0-9]+")) {
                            if (isRechargeModemSetUpDone()) {
                                String preOrPostRequested = getPrepaidOrPostpaid.getSelectedItem().toString();
                                String selectedPayableSIM = getSeletedOperatorName.getSelectedItem().toString();

                                recharge(phoneNumberRequested, ammountRequested, preOrPostRequested, selectedPayableSIM);
                            } else {
                                Popup.customError("Recharge Setting not found.");
                            }
                        } else {
                            getMobileNumber.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));
                            getAmmountInTk.setBorder(BorderFactory.createLineBorder(Color.decode("#FF2D00")));

                        }
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

    public Set<String> searchItemsByPhoneNumberInRechargePanel(String sreach1) {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {

                Set<String> filteredPhoneNumber = new HashSet<>();
                ALL_PHONE_NUMBER_LIST_FROM_MOBILE_RECHARGE_TABLE.stream().forEach(number -> {
                    if (number.toLowerCase().contains(sreach1.toLowerCase())) {
                        filteredPhoneNumber.add(number);
                    }

                });

                return filteredPhoneNumber;
            }
        }
        return null;
    }

    private void loadMobileNoFromRecharge() {
        Connection conn = DbConnection.connect();
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM `recharge_admin`";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ALL_PHONE_NUMBER_LIST_FROM_MOBILE_RECHARGE_TABLE.add(rs.getString("mobile_no"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect(conn);
        }
    }

    private void setCuurentActiveNetworksFromModem() {
        String operatorNames = "";
        currentNetworkName.setText("Please wait");
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                String phoneNumber = simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13);
                String networkInfo = simOperatorIdentifierDto.getOperatorName() + "(" + phoneNumber + ") |";
                operatorNames = operatorNames + networkInfo;
                System.out.println(simOperatorIdentifierDto.getOperatorName() + "  " + simOperatorIdentifierDto.getPortName() + "  " + networkInfo + "--->" + simOperatorIdentifierDto.getOwnPhoneNumber());
            }
            currentNetworkName.setText(operatorNames);
        }
    }

    //SIM Balance Update
    private void addBalenceInBalenceShowTable() {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"SIM", "TK"}, 0);

        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            for (MobileRechargeBalance mobileRechargeBalance : ModemInfoList.mobileRechargeBalance) {
                defaultTableModel.addRow(new String[]{mobileRechargeBalance.getSimName().substring(mobileRechargeBalance.getSimName().length() - 4, mobileRechargeBalance.getSimName().length() - 1), mobileRechargeBalance.getSimBalance() + " Tk"});
            }

          
        }


    }

    private void closeUssdSession() {
        setResponseShowFromUssd.setText("");
        setResponseShowFromUssd.setFocusable(false);
        String response = null;
        String[] responses = null;
        String getOperator = getSelectedSim.getSelectedItem().toString();
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
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

    }

    public void loadActiveOperatorNameInComboBox() {
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getSeletedOperatorName.addItem(simOperatorIdentifierDto.getOperatorName().toUpperCase() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")");
        });

    }

    private void loadDefaultPlaceHolderInWholeSoftware() {
        
        setPlaceHolder(getAmmountInTk, "Ammount");
        getMobileNumberForSearch.setUI(new HintTextFieldUI("Search By Date or Phone Number Or Amount"));
        searchingByName.setUI(new HintTextFieldUI("Search By Date or Phone Number Or Amount"));
        searchInInbox.setUI(new HintTextFieldUI("Search By name"));
    }

    private void simSimOfferDialog() {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
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

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `recharge_offers`";
                ResultSet rs = st.executeQuery(sql);
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
            } finally {
                DbConnection.disconnect(conn);
            }
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            String sql = "INSERT INTO group_recharge(phone_number,amount,send_by,date_time,type) VALUES(?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, number);
                preparedStatement.setString(2, amountInTk);
                preparedStatement.setString(3, requestSIMName);
                preparedStatement.setString(4, Configaration.getCurrentDateAndTime());
                preparedStatement.setString(5, simType);
                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);
            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {
                DefaultTableModel groupRechargeTableModel = new DefaultTableModel(new String[]{
                    "Phone no.", "Type", "Ammount", "Send By", "Date And Time"}, 0);

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `group_recharge`";
                ResultSet rs = st.executeQuery(sql);
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
            } finally {

                DbConnection.disconnect(conn);
            }
        }
    }

    private void sendGroupRecharge() {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            List<GroupRechargeResponse> groupRechargeResponsesList = new ArrayList<>();
            try {

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `group_recharge`";
                ResultSet rs = st.executeQuery(sql);

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

                DbConnection.disconnect(conn);
            }
            groupRechargeResponsesList.stream().forEach(values -> {
                //TODO: For group rechage

                for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                    if (values.getPayBy().equals(simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")".toUpperCase())) {
                        MobileRechargeDetailsDto mobileRechargeDetailsDto
                                = new MobileRechargeDetailsDto(UUID.randomUUID().toString(), Configaration.getCurrentDateAndTime(), values.getPhoneNumber(), values.getAmount(), values.getSimType(), simOperatorIdentifierDto.getPortName(), values.getPayBy(), UssdRequestType.MOBILE_RECHARGE);
                        addQueue(mobileRechargeDetailsDto);
                    }
                }

            });
            DbConnection.delete("group_recharge");
        }

    }

    private void sendMobileBankingRequest(String service, String actionType, String acPhoneNo, String amount, String simPort, String sim) {
        String trxId = Configaration.getUUID();

        saveInMobileBankingTable(trxId, "Processing", "Processing");
        loadMobileBankingDetailsTable();
        System.out.println("Mobile banking Process start...");

        List<String> ussdCodeSerialList = new ArrayList<>();
        List<String> balanceUssdCodeList = new ArrayList<>();
        List<String> balancePaseList = new ArrayList<>();
        boolean isSIMFound = false;
        String res = "Could not get response from server";
        String balanceUssdCode = null;
        String ussdReplace = null;
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `mobile_banking` WHERE `services_name`=\"" + service + "\"";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    if (actionType.equals(rs.getString("task_name"))) {

                        ussdReplace = rs.getString("ussd_code").replaceAll("number", acPhoneNo).replaceAll("amount", amount).replaceAll("pin", rs.getString("pin"));
                        balanceUssdCode = rs.getString("balance_show_ussd").replaceAll("pin", rs.getString("pin"));
                        isSIMFound = true;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);

            }

            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(ussdReplace);
            ussdCodeSerialList.clear();
            while (m.find()) {

                ussdCodeSerialList.add(m.group());
            }
            Matcher m1 = p.matcher(balanceUssdCode);
            balanceUssdCodeList.clear();
            while (m1.find()) {

                balanceUssdCodeList.add(m1.group());
            }
            if (!isSIMFound) {
                Popup.customError("SIM not found !!");
            }

            System.err.println("Request USSD CODE=" + ussdCodeSerialList);
            // Sand Ussd Serial for Request
            String feedBackMgs = sendSerialUSSDCode(ussdCodeSerialList, simPort);
            Configaration.wait(2000);
            // Sand Ussd Serial for Balance
            if (!feedBackMgs.equals("USSD Dial Failed") || !feedBackMgs.equals("Possible duplicate request, call 16247 for details")) {
                Double currentBalance = Double.valueOf(MOBILE_BANKING_BALENCE_HASH_MAP.get(service + "(" + sim + ")"));
                Double acBalance = currentBalance - Double.valueOf(amount);
                MOBILE_BANKING_BALENCE_HASH_MAP.put(service + "(" + sim + ")", String.valueOf(acBalance));
                loadMobileBankingBalance();
                updateInMobileBankingDbById(trxId, Configaration.haxToStringConvert(feedBackMgs), String.valueOf(acBalance));
                System.out.println(currentBalance + "==============================" + service + " " + acBalance + " " + amount);
            } else {
                updateInMobileBankingDbById(trxId, Configaration.haxToStringConvert(feedBackMgs), String.valueOf(MOBILE_BANKING_BALENCE_HASH_MAP.get(service + "(" + sim + ")")));
            }

            loadMobileBankingDetailsTable();
            getPhoneNumberInBillPayment.setText("");
            getAmmountInBillPayment.setText("");
        }

    }

    private void updateInMobileBankingDbById(String trxId, String status, String currentBalance) {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            String sql = "UPDATE m_b_details SET c_balance = '" + currentBalance + "', result = '" + status + "',info = 'NID' WHERE TnxId ='" + trxId + "'";
            try {
                Statement st = conn.createStatement();
                st.execute(sql);

            } catch (SQLException ex) {
                Log.error("updateMobileRechargeStatusByTrxId: ", ex.getMessage());
            }
            DbConnection.disconnect(conn);
        }
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

        JDialog confirmDialog = new JDialog();
        confirmDialog.add(ui);
        confirmDialog.setSize(872, 566);
        confirmDialog.setLocationRelativeTo(null);
        confirmDialog.setUndecorated(true);
        confirmDialog.setVisible(true);

        ui.getClickClose().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                confirmDialog.setVisible(false);
                getPhoneNumberInBillPayment.setText("");
                getAmmountInBillPayment.setText("");
                getMobileNumber.requestFocusInWindow();

            }

        });
        ui.getClickClose().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    confirmDialog.setVisible(false);
                    getPhoneNumberInBillPayment.setText("");
                    getAmmountInBillPayment.setText("");
                    getMobileNumber.requestFocusInWindow();

                }
                if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                    ui.getClickEdit().requestFocusInWindow();
                } else {

                }
            }
        });

        ui.getClickConfirm().addActionListener((ActionEvent ae) -> {

            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    System.err.println("Confirm click");
                    confirmDialog.setVisible(false);
                    mobileBankingBalanceShowPanelList.setEnabled(false);
                    //sendMobileBankingRequest();
                    for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                        String selectedSimCardWithNumber = simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")";
                        if (selectedSimCardWithNumber.toUpperCase().equals(getSimOperatorName.getSelectedItem().toString().toUpperCase())) {
                            MobileBankingDetailsDto mobileBankingDetailsDto = new MobileBankingDetailsDto();
                            mobileBankingDetailsDto.setAcNo(getPhoneNumberInBillPayment.getText());
                            mobileBankingDetailsDto.setService(getServiceName.getSelectedItem().toString());
                            mobileBankingDetailsDto.setAction(getOperationType.getSelectedItem().toString());
                            mobileBankingDetailsDto.setAmount(getAmmountInBillPayment.getText());
                            mobileBankingDetailsDto.setSelectableSimPort(simOperatorIdentifierDto.getPortName());
                            mobileBankingDetailsDto.setSelectableSim(getSimOperatorName.getSelectedItem().toString());
                            mobileBankingDetailsDto.setStatus(UssdRequestType.MOBILE_BANKING);
                            addQueue(mobileBankingDetailsDto);
                        }
                    }
                    getServiceName.requestFocusInWindow();
                    refrashForWholeSoftware();
                    return null;
                }

                @Override
                protected void done() {
                    mobileBankingBalanceShowPanelList.setEnabled(true);
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
                            confirmDialog.setVisible(false);
                            mobileBankingBalanceShowPanelList.setEnabled(false);
                            //sendMobileBankingRequest();
                            for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
                                String selectedSimCardWithNumber = simOperatorIdentifierDto.getOperatorName() + "(" + simOperatorIdentifierDto.getOwnPhoneNumber().substring(10, 13) + ")";
                                if (selectedSimCardWithNumber.toUpperCase().equals(getSimOperatorName.getSelectedItem().toString().toUpperCase())) {
                                    MobileBankingDetailsDto mobileBankingDetailsDto = new MobileBankingDetailsDto();
                                    mobileBankingDetailsDto.setAcNo(getPhoneNumberInBillPayment.getText());
                                    mobileBankingDetailsDto.setService(getServiceName.getSelectedItem().toString());
                                    mobileBankingDetailsDto.setAction(getOperationType.getSelectedItem().toString());
                                    mobileBankingDetailsDto.setAmount(getAmmountInBillPayment.getText());
                                    mobileBankingDetailsDto.setSelectableSimPort(simOperatorIdentifierDto.getPortName());
                                    mobileBankingDetailsDto.setSelectableSim(getSimOperatorName.getSelectedItem().toString());
                                    mobileBankingDetailsDto.setStatus(UssdRequestType.MOBILE_BANKING);
                                    addQueue(mobileBankingDetailsDto);
                                }
                            }
                            getServiceName.requestFocusInWindow();
                            refrashForWholeSoftware();
                            return null;
                        }

                        @Override
                        protected void done() {
                            mobileBankingBalanceShowPanelList.setEnabled(true);
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
                confirmDialog.setVisible(false);
            }

        });
        ui.getClickEdit().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    confirmDialog.setVisible(false);
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

    private void saveInMobileBankingTable(String trxId, String finalResult, String c_amount) {
        String result = finalResult;
        String service = getServiceName.getSelectedItem().toString();
        String actionType = getOperationType.getSelectedItem().toString();
        String acPhoneNo = getPhoneNumberInBillPayment.getText();
        String acAmount = getAmmountInBillPayment.getText();
        String sim = getSimOperatorName.getSelectedItem().toString();
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            String sql = "INSERT INTO m_b_details(service_name,action_type,phone_no,amount,sim,result,date_time,request_by,TnxId,c_balance) VALUES(?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, service);
                preparedStatement.setString(2, actionType);
                preparedStatement.setString(3, acPhoneNo);
                preparedStatement.setString(4, acAmount);
                preparedStatement.setString(5, sim);
                preparedStatement.setString(6, result);
                preparedStatement.setString(7, Configaration.getCurrentDateAndTime());
                preparedStatement.setString(8, "ADMIN");
                preparedStatement.setString(9, trxId);
                preparedStatement.setString(10, c_amount);
                preparedStatement.execute();

            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }

            System.out.println("Mobile Banking request details saved.");
        }

    }

    private void loadMobileBankingDetailsTable() {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {
                DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Service", "Action", "Ac no", "Amount", "Sim Card", "Current Balance", "Status", "Date and Time", "info"}, 0);

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `m_b_details`";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    if (Configaration.getCurrentDateAndTime().substring(0, 8).equals(rs.getString("date_time").substring(0, 8))) {
                        defaultTableModel.addRow(new String[]{
                            rs.getString("TnxId"),
                            rs.getString("service_name"),
                            rs.getString("action_type"),
                            rs.getString("phone_no"),
                            rs.getString("amount"),
                            rs.getString("sim"),
                            rs.getString("c_balance"),
                            rs.getString("result"),
                            rs.getString("date_time"),
                            rs.getString("info")});
                    }
                    MobileBankingDetailsForSearchingDto bankingDetailsForSearchingDto = new MobileBankingDetailsForSearchingDto();
                    bankingDetailsForSearchingDto.setTrxId(rs.getString("TnxId"));
                    bankingDetailsForSearchingDto.setServiceName(rs.getString("service_name"));
                    bankingDetailsForSearchingDto.setActionType(rs.getString("action_type"));
                    bankingDetailsForSearchingDto.setPhoneNo(rs.getString("phone_no"));
                    bankingDetailsForSearchingDto.setAmount(rs.getString("amount"));
                    bankingDetailsForSearchingDto.setSim(rs.getString("sim"));
                    bankingDetailsForSearchingDto.setcBalance(rs.getString("c_balance"));
                    bankingDetailsForSearchingDto.setResult(rs.getString("result"));
                    bankingDetailsForSearchingDto.setDateAndType(rs.getString("date_time"));
                    bankingDetailsForSearchingDto.setInfo(rs.getString("info"));

                    MOBILE_BANKING_DETAILS_FOR_SEARCHING_DTO.add(bankingDetailsForSearchingDto);

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
            } finally {
                DbConnection.disconnect(conn);
            }
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
        String operatorName = getOparetorNameInUssdCommand.getSelectedItem().toString();
        String operatorCode = "no updated";
        String othersCode = getRechargeUssdParternSkitto.getText();
        String balenceUssdPartern = getBalenceUssdPartern3.getText();
        String acPassword = accountPassword1.getText();
        String profit = getprofitIn1k.getText();

        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");
            return true;
        } else {
            Connection conn = DbConnection.connect();
            String sql = "INSERT INTO command(operator_name,operator_code,action_for,r_ussd_code_pre,r_ussd_code_post,b_s_ussd_code,password,icon,profit) VALUES(?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, operatorName.toUpperCase());
                preparedStatement.setString(2, operatorCode);
                preparedStatement.setString(3, othersCode);
                preparedStatement.setString(4, rechargeUssdParternPre);
                preparedStatement.setString(5, rechargeUssdParternPost);
                preparedStatement.setString(6, balenceUssdPartern);
                preparedStatement.setString(7, AES.encrypt(acPassword, "itvillage428854"));
                preparedStatement.setString(8, imagePath);
                preparedStatement.setString(9, profit);
                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);
                switchPanelViaSettings(myProfilePanel, myProfile);
                return true;

            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
        return false;

    }

    private void loadValuesForUssdManagementTable() {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                Connection conn = DbConnection.connect();
                try {
                    DefaultTableModel model = new DefaultTableModel(new String[]{
                        "Operator Name", "Profit in 1k", "Others Ussd Code", "Recharge USSD Code(Prepaind)", "Recharge USSD Code(Postpaind)", "Show Balence Ussd Code", "icon"
                    }, 0);
                    switchPanelViaSettings(rechargeSettingsPanel, rechargeSettings);
                    Statement st = conn.createStatement();
                    String sql = "SELECT * FROM `command`";
                    ResultSet rs = st.executeQuery(sql);

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

                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbConnection.disconnect(conn);
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            String sql = "INSERT INTO recharge_offers(offer_name,recharge_amt,validity,description,sim_name) VALUES(?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, offerName);
                preparedStatement.setString(2, rechargeAmount);
                preparedStatement.setString(3, validity);
                preparedStatement.setString(4, description);
                preparedStatement.setString(5, simOperator);
                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);
                Popup.customSuccess();

            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
    }

    private void saveInMobileBanking() {
        String service = getSelectedServiceCombo.getText().toString();
        String defultSIM = getSelectedSIMNameCombo.getSelectedItem().toString();
        String taskName = getTaskNameInMBS.getText();
        String ussdCode = getUssdCodePattren.getText().toLowerCase();
        String balanceShowUssdCode = getUssdCodeForBalanceShowPattren.getText().toLowerCase();
        String pin = getPIN.getText();
        if (taskName.equals("") || ussdCode.equals("") || balanceShowUssdCode.equals("") || pin.equals("")) {
            Popup.customError("Empty Filed Found");

        } else {
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                Connection conn = DbConnection.connect();
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
                    DbConnection.closeStatemanet(preparedStatement);
                    Popup.customSuccess();

                } catch (SQLException ex) {
                    Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
                    Popup.customError("Saving failed");
                } finally {
                    DbConnection.disconnect(conn);
                }
            }
        }
    }

    private void loadTableMobileBankingSettingFromDb() {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {
                DefaultTableModel model = new DefaultTableModel(new String[]{"Service Id",
                    "Service Name", "Default action SIM card", "Task Name", "Ussd Pattern", "Ussd Pattern For Balance"}, 0);

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `mobile_banking`";
                ResultSet rs = st.executeQuery(sql);
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
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
    }

    /*
        ------------------------------------------  CONTRACT LIST PANEL-----------------------------------------
     */
    private void setContractListInJTable(String type) {
        //  alartMessageText.setVisible(false);
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");

        } else {
            Connection conn = DbConnection.connect();
            try {
                int count = 1;

                contractList = new HashSet<>();
                DefaultTableModel contractListTableMOdel = new DefaultTableModel(new String[]{"Name", "Phone no", "From"}, 0);

                Statement stSQLite = conn.createStatement();
                String sqlSQLite = "SELECT * FROM `contract`";
                ResultSet rs = stSQLite.executeQuery(sqlSQLite);
                while (rs.next()) {
                    ContractResponse contractResponse = new ContractResponse();
                    contractResponse.setId(count++);
                    contractResponse.setName(rs.getString("name"));
                    contractResponse.setPhoneNo(rs.getString("phone_no"));
                    contractResponse.setStorage(rs.getString("memory"));
                    contractList.add(contractResponse);
                    contractListTableMOdel.addRow(new Object[]{rs.getString("name"), rs.getString("phone_no"), rs.getString("memory")});
                }

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
                        if (type.equals("mobile_recharge")) {
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
                        } else if (type.equals("mobile_banking")) {
                            if (selectedNumber.length() == 14) {
                                switchPanelViaMenu(addMobileBankingPanelInBillPay);
                                getPhoneNumberInBillPayment.requestFocusInWindow();
                                getPhoneNumberInBillPayment.setForeground(Color.BLACK);
                                getPhoneNumberInBillPayment.setText(selectedNumber.substring(3, 14));

                                System.err.println(selectedNumber.substring(3, 14));
                                System.out.println(selectedNumber);
                            } else {
                                switchPanelViaMenu(addMobileBankingPanelInBillPay);
                                getPhoneNumberInBillPayment.requestFocusInWindow();
                                getPhoneNumberInBillPayment.setForeground(Color.BLACK);
                                getPhoneNumberInBillPayment.setText(selectedNumber);
                            }
                        }

                    }
                });

                tableContractLIst.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
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
            } finally {
                DbConnection.disconnect(conn);

            }
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

    private void searchByPhoneNumberInRechargeDetails(Set<MobileRechargeDetailsForSearchingDto> contractList, String serchValue) {
        System.err.println(serchValue);
        Set<MobileRechargeDetailsForSearchingDto> contractResponsesSet = new HashSet<>();

        DefaultTableModel contractListTableMOdel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Mobile No", "Ammount", "From", "Current Balance", "Status"}, 0);
        contractList.stream().forEach(contractResponseValue -> {
            System.err.println(serchValue.toLowerCase().contains(contractResponseValue.getDateAndTime().toLowerCase().toLowerCase().replaceAll("\r", "").replaceAll(" ", "")));
            if (contractResponseValue.getDateAndTime().toLowerCase().toLowerCase().contains(serchValue.toLowerCase())) {
                MobileRechargeDetailsForSearchingDto contractResponse = new MobileRechargeDetailsForSearchingDto();
                contractResponse.setTrxId(contractResponseValue.getTrxId());
                contractResponse.setAmmount(contractResponseValue.getAmmount());
                contractResponse.setcBalance(contractResponseValue.getcBalance());
                contractResponse.setDateAndTime(contractResponseValue.getDateAndTime());
                contractResponse.setPhoneNumber(contractResponseValue.getPhoneNumber());
                contractResponse.setPostPaidOrPostPaid(contractResponseValue.getPostPaidOrPostPaid());
                contractResponse.setSelectableSim(contractResponseValue.getSelectableSim());
                contractResponse.setStatus(contractResponseValue.getStatus());
                contractResponsesSet.add(contractResponse);

            }
            if (contractResponseValue.getPhoneNumber().toLowerCase().toLowerCase().contains(serchValue.toLowerCase())) {
                MobileRechargeDetailsForSearchingDto contractResponse = new MobileRechargeDetailsForSearchingDto();
                contractResponse.setTrxId(contractResponseValue.getTrxId());
                contractResponse.setAmmount(contractResponseValue.getAmmount());
                contractResponse.setcBalance(contractResponseValue.getcBalance());
                contractResponse.setDateAndTime(contractResponseValue.getDateAndTime());
                contractResponse.setPhoneNumber(contractResponseValue.getPhoneNumber());
                contractResponse.setPostPaidOrPostPaid(contractResponseValue.getPostPaidOrPostPaid());
                contractResponse.setSelectableSim(contractResponseValue.getSelectableSim());
                contractResponse.setStatus(contractResponseValue.getStatus());
                contractResponsesSet.add(contractResponse);

            }
            if (contractResponseValue.getAmmount().toLowerCase().toLowerCase().contains(serchValue.toLowerCase())) {
                MobileRechargeDetailsForSearchingDto contractResponse = new MobileRechargeDetailsForSearchingDto();
                contractResponse.setTrxId(contractResponseValue.getTrxId());
                contractResponse.setAmmount(contractResponseValue.getAmmount());
                contractResponse.setcBalance(contractResponseValue.getcBalance());
                contractResponse.setDateAndTime(contractResponseValue.getDateAndTime());
                contractResponse.setPhoneNumber(contractResponseValue.getPhoneNumber());
                contractResponse.setPostPaidOrPostPaid(contractResponseValue.getPostPaidOrPostPaid());
                contractResponse.setSelectableSim(contractResponseValue.getSelectableSim());
                contractResponse.setStatus(contractResponseValue.getStatus());
                contractResponsesSet.add(contractResponse);

            }

        });

        contractResponsesSet.stream().forEach(value -> {
            contractListTableMOdel.addRow(new Object[]{value.getTrxId(), value.getDateAndTime(), value.getPostPaidOrPostPaid(), value.getPhoneNumber(), value.getAmmount(), value.getSelectableSim(), value.getcBalance(), value.getStatus()});
        });

        tableRechargeDetailsShow.setRowHeight(25);
        tableRechargeDetailsShow.setModel(contractListTableMOdel);
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn1 = DbConnection.connect();
            String sql = "INSERT INTO contract(name,phone_no,memory) VALUES(?,?,?)";
            try {
                PreparedStatement preparedStatement = conn1.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, phoneNo);
                preparedStatement.setString(3, storage);
                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);
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
        }
        System.out.println("New Contract Add Successful in Desktop memory");
    }

    private void saveContractInSQL() {
        String name = getNameForContract.getText();
        String phoneNo = getPhoneNOForContract.getText();
        String storage = getSeletedStorage.getSelectedItem().toString();

        java.sql.Connection conn1 = MYSQL_CONNECTION.connect();
        String sql = "INSERT INTO user_contracts_list(userId,name,phone_number,storage) VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn1.prepareStatement(sql);
            preparedStatement.setString(1, UserInfo.userId);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, phoneNo);
            preparedStatement.setString(4, storage);
            preparedStatement.execute();
            DbConnection.closeStatemanet(preparedStatement);
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
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

    private void refrashForWholeSoftware() {
        //Mobile Recharge Panel
        getMobileNumber.setText("");
        getAmmountInTk.setText("");
        getMobileNumberForSearch.setText("");
        
        //Bill Panel
         //* Product Information Tab
        brandInProductDetails.setText("");
        groupInProductDetails.setText("");
        pNameInProductDetails.setText("");
        brandInProductDetails.setText("");
        buyRateInProductDetails.setText("");
        qtyInProductDetails.setText("");
        oderLimitInProductDetails.setText("");
        warrentyInProductDetails.setText("");
        sellRateInProductDetails.setText("");
         //* Product Purchase Tab
        invoiceInProductPurchases.setText("");
        supplierInProductPurchases.setText("");
        pNameInProductPurchases.setText("");
        barCodeInProductPurchases.setText("");
        groupInProductPurchases.setText("");
        sellRateInProductPurchases.setText("");
        qtyInProductPurchases.setText("");
        buyRateInProductPurchases.setText("");
        tAmountInPPurchaseInSummary.setText("");    
        tItemsInPPurchaseInSummary.setText("");
        tCommissionInPPurchaseInSummary.setText("");
        tPaidInPPurchase3.setText("");
        tReturnAmountInPPurchase4.setText("");
        
        //* Product Warrenty
        invoiceInProductWarranty.setText("");
        customerIdINProductWanrranty.setText("");
        fullNameInProductWanrranty.setText("");
        addressInProductWanrranty.setText("");
        phoneNOInProductWanrranty.setText("");        
        refNameInProductWanrranty.setText("");
        problemInProductWanrranty.setText("");
        brandInProductWanrranty.setText("");
        billInProductWanrranty.setText("");
        warrantyInProductWanrranty.setText("");
        paidPaymentInProductWanrranty.setText("");
        discpuntInProductWanrranty.setText("");
        payableInProductWanrranty.setText("");
        paidInProductWanrranty.setText("");
        dueInProductWanrranty.setText("");
        
        //* Product Sell
        invoiceInProductSell.setText("");        
        customerIdINProductSell.setText("");
        fullNameInProductSell.setText("");
        addressInProductSell.setText("");
        noteInProductSell.setText("");
        phoneNOInProductSell.setText("");
        discpuntInProductBill.setText("0.0");
        paymentInProductBill.setText("0.0");
        warrantyInProductBill.setText("0.0");
        duePaymentInProductBill.setText("0.0");
        totalItemsInProductSell.setText("0.0");
        returnInProductSell.setText("0.0");
        totalAmountInProductSell1.setText("0.0");
        discountInProductSell.setText("0.0");
        vatInProductSell.setText("0.0");
        payableInProductSell.setText("0.0");
        paidInProductSell.setText("0.0");     
        duePaymentInProductSell.setText("0.0");
        dueInProductSell.setText("0.0");
        
        //USSD Dial Panle
        getUssdCode.setText("");
        setResponseShowFromUssd.setText("");
        
        //Contact List Sell
        getNameForSearch.setText("");   
        
        //Ass new USSD Commad Panel
        getOperatorName.setText("");
        getRechargeUssdParternPrePaid.setText("");
        getRechargeUssdParternPostPaid.setText("");
        getBalenceUssdPartern1.setText("");
        accountPassword.setText("");
        clickChooseIcon.setText("");
    
        //Add New Contact
        getNameForContract.setText("");
        getPhoneNOForContract.setText("");
        
        //Group Load
        getPhoneNumberInGroupRecharge.setText("");
        getAmountGroupRecharge.setText("");
 
        
        //Make Bar Code for mobile
        getNameForRechargeBarCode1.setText("");
        forBarCodePhoneNumber2.setText("");
        forBarCodePhoneNumber3.setText("");
        forBarCodePhoneNumber4.setText("");
        forBarCodePhoneNumber5.setText("");
        forBarCodePhoneNumber6.setText("");
        forBarCodePhoneNumber7.setText("");
        forBarCodePhoneNumber8.setText("");
        forBarCodePhoneNumber9.setText("");
        forBarCodePhoneNumber10.setText("");
    
        //Mobile Banking
        getPhoneNumberInBillPayment.setText("");
        getAmmountInBillPayment.setText("");        
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
        processtingLoderDialog.setSize(404, 381);
        processtingLoderDialog.setLocationRelativeTo(null);
        processtingLoderDialog.setUndecorated(true);

    }

    private String sendSerialUSSDCode(List<String> ussdCodeSerialList, String simPort) {
        System.err.println("Request List: " + ussdCodeSerialList);

        List<String> responseList = new ArrayList<>();
        String res = "USSD Dial Failed";
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");
            return "200";

        } else {
            auto.recharge.system.config.Modem.connect(simPort);
            for (int i = 0; i <= ussdCodeSerialList.size(); i++) {
                if (i == 0) {
                    String ussd = "*" + ussdCodeSerialList.get(i) + "#";
                    System.out.println("Sending by " + ussd + ":if");
                    res = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + ussd + "\",15");
                    Configaration.wait(400);
                    responseList.add(res);
                    System.out.println("Response " + res);

                } else {
                    String ussd = ussdCodeSerialList.get(i);
                    System.out.println("Sending by " + ussd + ":else");
                    res = auto.recharge.system.config.Modem.dialUSSDCode("AT+CUSD=1,\"" + ussd + "\",15");
                    Configaration.wait(400);
                    if (res.split(",").length == 1) {
                        System.err.println("Tast=" + res);

                        Configaration.closeUssdSession();
                        auto.recharge.system.config.Modem.disconnect();
                        return "53656e64696e67204661696c6564";

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
                    System.err.println("Final Result    " + Configaration.haxToStringConvert(finalResultInHax));
                    return finalResultInHax;
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
        String monthName = dateInProductBillPay.getDate().toString();
        //  String year = getyear.getSelectedItem().toString();
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
            String ussdCode = "*727*2*" + customerId + "*" + monthNo + "*2010 *" + password + "#";
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
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
        }
        return res;

    }

    private void saveIntobill_pay_bill_no(String status) {

        String getServiceType = getServiceTypeInBillPay.getSelectedItem().toString();
        String billNo = getBillNO.getText();
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
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
                DbConnection.closeStatemanet(preparedStatement);

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
    }

    private void saveIntobill_payment_customer_id(String status) {
        String getServiceType = getServiceTypeInBillPay.getSelectedItem().toString();
        String customerId = getCustomerId.getText();
        String monthName = dateInProductBillPay.getDate().toString();
        //String year = getyear.getSelectedItem().toString();
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn1 = DbConnection.connect();
            String sql = "INSERT INTO bill_payment_customer_id(TrxId,customer_id,bill_month,bill_year,time_date,c_balance,bill_type,status) VALUES(?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn1.prepareStatement(sql);
                preparedStatement.setString(1, Configaration.getUUID());
                preparedStatement.setString(2, customerId);
                preparedStatement.setString(3, monthName);
                preparedStatement.setString(4, "2010");
                preparedStatement.setString(5, Configaration.getCurrentDateAndTime());
                preparedStatement.setString(6, "4");
                preparedStatement.setString(7, getServiceType);
                preparedStatement.setString(8, status);
                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);

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
    }

    private void loadInBillPaymentDetailsByBillNo() {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Bill No", "Current balance", "Status"}, 0);
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `bill_pay_bill_no`";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    defaultTableModel.addRow(new String[]{rs.getString("TrxId"), rs.getString("time_date"),
                        rs.getString("bill_type"), rs.getString("bill_no"), rs.getString("c_balance"),
                        rs.getString("status")});
                }

            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableBillPaymentDetails.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tableBillPaymentDetails.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableBillPaymentDetails.getTableHeader().setOpaque(false);
        tableBillPaymentDetails.getTableHeader().setBackground(new Color(133, 47, 209));
        tableBillPaymentDetails.getTableHeader().setForeground(new Color(255, 255, 255));
        tableBillPaymentDetails.setEnabled(false);
        tableBillPaymentDetails.setRowHeight(30);
        tableBillPaymentDetails.setModel(defaultTableModel);
    }

    private void loadInBillPaymentDetailsByCustomerId() {
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Date & Time", "Type", "Customer ID", "Month", "Year", "Current balance", "Status"}, 0);
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `bill_payment_customer_id`";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    defaultTableModel.addRow(new String[]{rs.getString("TrxId"), rs.getString("time_date"),
                        rs.getString("bill_type"), rs.getString("customer_id"), rs.getString("bill_month"), rs.getString("bill_year"), rs.getString("c_balance"),
                        rs.getString("status")});
                }

            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
        //For jTable contant in center
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) tableBillPaymentDetails.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tableBillPaymentDetails.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
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
        ui.getClickRetry().setVisible(false);
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
                            setContractListInJTable("mobile_recharge");
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
        getUssdCodePattren.setUI(new HintTextFieldUI("*247*2*1*number*amount*pin#"));
        getUssdCodeForBalanceShowPattren.setUI(new HintTextFieldUI("*247*5*pin#"));
        getPIN.setUI(new HintTextFieldUI("password"));

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

        DbConnection.deleteRow("mobile_banking", "serviceId", serviceId);

    }

    private void addKeyListenerAndHoverInMobileBankingPanel() {
        setPlaceHolder(getPhoneNumberInBillPayment, "Mobile Number");
        setPlaceHolder(getAmmountInBillPayment, "Amount");
        getPhoneNumberInBillPayment.requestFocusInWindow();
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
                    getSimOperatorName.requestFocusInWindow();
                }
            }
        });
        getSimOperatorName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getServiceName.requestFocusInWindow();
                }
            }
        });
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
                    clickSandInMB.requestFocusInWindow();

                }
            }
        });
        clickSandInMB.addKeyListener(new KeyAdapter() {
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            DefaultListModel Clistmodel = new DefaultListModel();
            for (Map.Entry<String, String> entry : MOBILE_BANKING_BALENCE_HASH_MAP.entrySet()) {
                System.out.println("----------------------" + entry.getKey() + " : " + entry.getValue());
                if (entry.getValue().equals("16247")) {
                    Popup.customError("Duplicate Request");
                } else {
                    MobileBankingBalanceShowCard mobileBankingBalanceShowCard = new MobileBankingBalanceShowCard();
                    mobileBankingBalanceShowCard.getServiceNameText().setText(entry.getKey());
                    mobileBankingBalanceShowCard.getAmountBalanceText().setText(entry.getValue() + " TK");
                    mobileBankingBalanceShowCard.getLastUpdateTimeText().setText("Last update: " + Configaration.getCurrentDateAndTime());

                    Clistmodel.addElement(mobileBankingBalanceShowCard);//Contact is an JPanel object
                }
            }
            mobileBankingBalanceShowPanelList.setModel(Clistmodel);//GroupList is the List object

            mobileBankingBalanceShowPanelList.setCellRenderer(new JListPanelRenderer());

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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {

                if (SIM_NAME.toUpperCase().contains(simOperatorIdentifierDto.getOperatorName().toUpperCase())) {

                    auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
                    getBalanceInBillPayment.setText(getCurrentBalance(SIM_NAME));
                    Configaration.closeUssdSession();
                    auto.recharge.system.config.Modem.disconnect();
                }
            }
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
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
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
            } finally {
                DbConnection.disconnect(conn);
            }
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
                            changeAdminPassword(AES.encrypt(password, "itvillage428854"));

                        } else {
                            Popup.customError("Re-type password not match");
                        }
                    }
                }
            }
        });
    }

    private void updateMobileRechargeStatusByTrxId(String trxId, String status, String currentBalance) {

        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            try {
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:MobileRecharge.sqlite");
                String sql = "UPDATE recharge_details SET current_balance = '" + currentBalance + "', status = '" + status + "' WHERE trx_id ='" + trxId + "'";
                try {
                    Statement st = conn.createStatement();
                    st.execute(sql);

                } catch (SQLException ex) {
                    Log.error("updateMobileRechargeStatusByTrxId: ", ex.getMessage());
                } finally {
                    DbConnection.disconnect(conn);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        loadValueInTableRechargeDetails();
    }

    public void showMobileRechargeBalance() {
      
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
    }

    private void setupTabsInShopManagment() {
        dateInProductPurchases.setDate(new Date(Configaration.getCurrentDate()));
        dateInProductWanrranty.setDate(new Date(Configaration.getCurrentDate()));
        delevaryDateDateInProductWanrranty.setDate(new Date(Configaration.getCurrentDate()));
        dateInProductSell.setDate(new Date(Configaration.getCurrentDate()));
        dueDateInProductSell.setDate(new Date(Configaration.getCurrentDate()));

        showDataInProductPurchaseFromDB("0000");

        //Product Purchases
        invoiceInProductPurchases.requestFocusInWindow();
        invoiceInProductPurchases.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        setDetailsByInvoiceInProductPurchase();
                        supplierInProductPurchases.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }

            private void setDetailsByInvoiceInProductPurchase() {
                Connection conn = DbConnection.connect();
                try {
                    Statement st = conn.createStatement();
                    String sql = "SELECT * FROM `product_purchase` where invoice = " + invoiceInProductPurchases.getText();
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        supplierInProductPurchases.setText(rs.getString("supplier").toString());

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbConnection.disconnect(conn);
                }
            }
        });

        supplierInProductPurchases.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    pNameInProductPurchases.requestFocusInWindow();
                }
            }
        });

        pNameInProductPurchases.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    barCodeInProductPurchases.requestFocusInWindow();
                }
            }
        });
        barCodeInProductPurchases.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    groupInProductPurchases.requestFocusInWindow();
                }
            }
        });
        groupInProductPurchases.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    sellRateInProductPurchases.requestFocusInWindow();
                }
            }
        });

        sellRateInProductPurchases.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    qtyInProductPurchases.requestFocusInWindow();
                }
            }
        });
        qtyInProductPurchases.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    buyRateInProductPurchases.requestFocusInWindow();
                }
            }
        });

        buyRateInProductPurchases.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    typeInProductPurchasesComboBox.requestFocusInWindow();
                }
            }
        });

        typeInProductPurchasesComboBox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    saveInProductPurchase3.requestFocusInWindow();
                }
            }
        });
        saveInProductPurchase3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (UserInfo.role.equals("demo")) {
                        JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
                    } else {
                        saveInProductPurchaseDB();
                        showDataInProductPurchaseFromDB(invoiceInProductPurchases.getText());
                        refrashProductPurchaseTable();

                    }
                }
            }

        });

        //Product Info
        barCodeInProductDetails.removeAllItems();
        Connection conn = DbConnection.connect();
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM `product_purchase`";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                barCodeInProductDetails.addItem(rs.getString("bar_code").toString());

            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect(conn);
        }
        AutoCompleteDecorator.decorate(barCodeInProductDetails);
        barCodeInProductDetails.requestFocusInWindow();
        barCodeInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        groupInProductDetails.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }
        });

        groupInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    pNameInProductDetails.requestFocusInWindow();
                }
            }
        });

        pNameInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    brandInProductDetails.requestFocusInWindow();
                }
            }
        });
        brandInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    buyRateInProductDetails.requestFocusInWindow();
                }
            }
        });
        buyRateInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    qtyInProductDetails.requestFocusInWindow();
                }
            }
        });
        qtyInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    oderLimitInProductDetails.requestFocusInWindow();
                }
            }
        });
        oderLimitInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    warrentyInProductDetails.requestFocusInWindow();
                }
            }
        });
        warrentyInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    timeTypeProductDetails.requestFocusInWindow();
                }
            }
        });

        timeTypeProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    sellRateInProductDetails.requestFocusInWindow();
                }
            }
        });

        sellRateInProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    productMasurementProductDetails.requestFocusInWindow();
                }
            }
        });
        productMasurementProductDetails.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    saveInProductPurchase1.requestFocusInWindow();
                }
            }
        });
        saveInProductPurchase1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (UserInfo.role.equals("demo")) {
                        JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
                    } else {
                        updateStoredItemByBarCode(invoiceINProductDetails.getText(), barCodeInProductDetails.getSelectedItem().toString(), String.valueOf(Double.valueOf(sellRateInProductDetails.getText())));
                        addPerchangeSelection.addItemListener(new ItemListener() {
                            @Override
                            public void itemStateChanged(ItemEvent e) {
                                Double sellRate = Double.valueOf(sellRateInProductDetails.getText());
                                if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                                    sellRate = Double.valueOf(buyRateInProductDetails.getText()) + ((Double.valueOf(sellRateInProductDetails.getText()) * Double.valueOf(buyRateInProductDetails.getText())) / 100);
                                    updateStoredItemByBarCode(invoiceINProductDetails.getText(), barCodeInProductDetails.getSelectedItem().toString(), String.valueOf(sellRate));
                                } else {//checkbox has been deselected
                                    updateStoredItemByBarCode(invoiceINProductDetails.getText(), barCodeInProductDetails.getSelectedItem().toString(), String.valueOf(sellRate));
                                }
                                ;
                            }
                        });
                        barCodeInProductDetails.setSelectedItem("");
                        groupInProductDetails.setText("");
                        pNameInProductDetails.setText("");
                        buyRateInProductDetails.setText("");
                        sellRateInProductDetails.setText("");
                        brandInProductDetails.setText("");
                        qtyInProductDetails.setText("");
                        warrentyInProductDetails.setText("");
                    }
                }
            }
        });

        //Product warrenty Tab
        loadDataInWarrentyTable();
        invoiceInProductWarranty.requestFocusInWindow();
        invoiceInProductWarranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        setWarrentyDetailsByInvoice(invoiceInProductWarranty.getText());
                        customerIdINProductWanrranty.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }

        });

        customerIdINProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    fullNameInProductWanrranty.requestFocusInWindow();
                }
            }
        });

        fullNameInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    addressInProductWanrranty.requestFocusInWindow();

                }
            }
        });

        addressInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    refNameInProductWanrranty.requestFocusInWindow();
                }
            }
        });
        refNameInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    phoneNOInProductWanrranty.requestFocusInWindow();
                }
            }
        });
        phoneNOInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    problemInProductWanrranty.requestFocusInWindow();
                }
            }
        });

        problemInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    brandInProductWanrranty.requestFocusInWindow();
                }
            }
        });

        brandInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    statusInProductWanrrantyComboBox.requestFocusInWindow();
                }
            }
        });
        statusInProductWanrrantyComboBox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    billInProductWanrranty.requestFocusInWindow();
                }
            }
        });
        billInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    warrantyInProductWanrranty.requestFocusInWindow();
                }
            }
        });

        warrantyInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    paidPaymentInProductWanrranty.requestFocusInWindow();
                }
            }
        });

        paidPaymentInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    discpuntInProductWanrranty.requestFocusInWindow();
                }
            }
        });
        discpuntInProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    printClickProductWanrranty.requestFocusInWindow();
                }
            }
        });
        printClickProductWanrranty.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    printAndSaveInWarrenty();
                }
            }
        });

        //Product SELL Tab
        invoiceInProductSell.requestFocusInWindow();
        invoiceInProductSell.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        customerIdINProductSell.requestFocusInWindow();
                        break;
                    default:
                        break;
                }
            }
        });

        customerIdINProductSell.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    fullNameInProductSell.requestFocusInWindow();
                }
            }
        });

        fullNameInProductSell.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    addressInProductSell.requestFocusInWindow();
                }
            }
        });
        addressInProductSell.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    noteInProductSell.requestFocusInWindow();
                }
            }
        });
        noteInProductSell.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    phoneNOInProductSell.requestFocusInWindow();
                }
            }
        });
        phoneNOInProductSell.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    actionTypeInProductSellCOmboBox.requestFocusInWindow();
                }
            }
        });

        actionTypeInProductSellCOmboBox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                    barCodeInProductSell.requestFocusInWindow();
                }
            }
        });
        barCodeInProductSell.removeAllItems();
        Connection conn3 = DbConnection.connect();
        try {
            Statement st = conn3.createStatement();
            String sql = "SELECT * FROM `product_purchase`";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                barCodeInProductSell.addItem(rs.getString("bar_code").toString());

            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbConnection.disconnect(conn3);
        }
        AutoCompleteDecorator.decorate(barCodeInProductSell);
        barCodeInProductSell.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    summaryShowInBillDisplay();
                    discpuntInProductBill.requestFocusInWindow();
                }
            }
        });
        discpuntInProductBill.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    addProductFromDBInSellPanel(barCodeInProductSell.getSelectedItem().toString());
                    barCodeInProductSell.requestFocusInWindow();
                }
            }
        });

        paymentInProductBill.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    summaryShowInBillDisplay();
                    warrantyInProductBill.requestFocusInWindow();
                }
            }
        });
        warrantyInProductBill.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    summaryShowInBillDisplay();
                    duePaymentInProductBill.requestFocusInWindow();
                }
            }
        });
        duePaymentInProductBill.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    summaryShowInBillDisplay();
                    paymentTypeInProductSell.requestFocusInWindow();
                }
            }
        });
        paymentTypeInProductSell.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                    jButton6.requestFocusInWindow();
                }
            }
        });
        jButton6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (UserInfo.role.equals("demo")) {
                        JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
                    } else {

                        printMemo();
                        clearBillforProduct();
                        invoiceInProductSell.setText(String.valueOf(Configaration.getRandInt(1345, 100000)));
                    }
                }
            }
        });
    }

    private void saveInProductPurchaseDB() {
        String invoice = invoiceInProductPurchases.getText();
        String supplier = supplierInProductPurchases.getText();

        java.util.Date jud = dateInProductPurchases.getDate();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMMM dd, yyyy");
        String date = sdf.format(jud);

        String barCode = barCodeInProductPurchases.getText();
        String sellRate = sellRateInProductPurchases.getText();
        String group = groupInProductPurchases.getText();
        String pName = pNameInProductPurchases.getText();
        String qtyString = qtyInProductPurchases.getText();
        String buyRate = buyRateInProductPurchases.getText();
        String typeOfProduct = typeInProductPurchasesComboBox.getSelectedItem().toString();
        Double subtotal = (Double.valueOf(buyRate) * Double.valueOf(qtyString));
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn1 = DbConnection.connect();
            String sql = "INSERT INTO product_purchase(invoice,supplier,date,bar_code,group_products,pName,qty,buy_rate,sell_rate,type,subTotal,warranty) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn1.prepareStatement(sql);
                preparedStatement.setString(1, invoice);
                preparedStatement.setString(2, supplier);
                preparedStatement.setString(3, date);
                preparedStatement.setString(4, barCode);
                preparedStatement.setString(5, group);
                preparedStatement.setString(6, pName);
                preparedStatement.setString(7, qtyString);
                preparedStatement.setString(8, buyRate);
                preparedStatement.setString(9, sellRate);
                preparedStatement.setString(10, typeOfProduct);
                preparedStatement.setString(11, String.valueOf(subtotal));
                preparedStatement.setString(12, String.valueOf(0.0));
                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);
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
    }

    private void showDataInProductPurchaseFromDB(String invoice) {

        DefaultTableModel productPurchaseTableModel = new DefaultTableModel(new String[]{"Barcode", "Group", "Purchases Name", "QTY.", "BUY RATE", "SELL RATE", "SUBTOTAL", "TYPE"}, 0);
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) productPurchaseTable.getDefaultRenderer(String.class);

        Double returnAC = 0.0;
        Double comission = 0.0;
        Double total = 0.0;
        int count = 0;
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `product_purchase` WHERE `invoice`=" + invoice;
                //TODO: HANDLE NULL
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    count++;
                    String typeOfProduct = rs.getString("type");
                    String subTotal = rs.getString("subTotal");
                    supplierInProductPurchases.setText(rs.getString("supplier"));
                    dateInProductPurchases.setDate(new Date(rs.getString("date")));
                    productPurchaseTableModel.addRow(new Object[]{
                        rs.getString("bar_code"),
                        rs.getString("group_products"),
                        rs.getString("pName"),
                        rs.getString("qty"),
                        rs.getString("buy_rate"),
                        rs.getString("sell_rate"),
                        subTotal,
                        rs.getString("type")
                    });
                    switch (typeOfProduct) {
                        case "PURCHASE":
                            total = total + Double.valueOf(subTotal);
                            break;
                        case "RETURN":
                            returnAC = returnAC + Double.valueOf(subTotal);
                            System.err.println("returnAC");
                            break;
                        case "OFFER":
                            comission = comission + Double.valueOf(subTotal);
                            System.err.println("comission");
                            break;
                        default:
                            System.err.println("Type Not Selected");
                            break;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        productPurchaseTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        productPurchaseTable.getTableHeader().setOpaque(false);
        productPurchaseTable.getTableHeader().setBackground(new Color(133, 47, 209));
        productPurchaseTable.getTableHeader().setForeground(new Color(255, 255, 255));
        productPurchaseTable.setEnabled(false);
        productPurchaseTable.setRowHeight(30);
        productPurchaseTable.setModel(productPurchaseTableModel);

        barCodeInProductPurchases.setText(String.valueOf(Configaration.getRandInt(1000, 10000)));

        summaryShowInDisplay(total, count, comission, total, returnAC);
    }

    private void showDataInProductDetailsPurchaseFromDB(String invoice) {
        System.err.println(invoice);
        DefaultTableModel productPurchaseTableModel = new DefaultTableModel(new String[]{"Product ID", "Product Group", "Product Name", "QTY", "Buy Rate", "Sell Price", "Brand", "Warranty", "Last Modify"}, 0);
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) productDetailsTable.getDefaultRenderer(String.class);
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `product_purchase` WHERE `invoice`=" + invoice;
                //TODO: HANDLE NULL
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    invoiceINProductDetails.setText(rs.getString("invoice"));
                    System.err.println(rs.getString("bar_code"));
                    productPurchaseTableModel.addRow(new Object[]{
                        rs.getString("bar_code"),
                        rs.getString("group_products"),
                        rs.getString("pName"),
                        rs.getString("qty"),
                        rs.getString("buy_rate"),
                        rs.getString("sell_rate"),
                        rs.getString("supplier"),
                        rs.getString("warranty"),
                        rs.getString("date")
                    });

                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        productDetailsTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        productDetailsTable.getTableHeader().setOpaque(false);
        productDetailsTable.getTableHeader().setBackground(new Color(133, 47, 209));
        productDetailsTable.getTableHeader().setForeground(new Color(255, 255, 255));
        productDetailsTable.setEnabled(false);
        productDetailsTable.setRowHeight(30);
        productDetailsTable.setModel(productPurchaseTableModel);

    }

    private void summaryShowInDisplay(Double tAmountInPPurchaseInSummaryP, int tItemsInPPurchaseInSummaryStringP, Double tCommissionInPPurchaseInSummaryP, Double tPaidInPPurchaseInSummaryP, Double tReturnAmountInPPurchaseInSummaryP) {

        tAmountInPPurchaseInSummary.setText(String.valueOf(tAmountInPPurchaseInSummaryP));
        tItemsInPPurchaseInSummary.setText(String.valueOf(tItemsInPPurchaseInSummaryStringP));
        tCommissionInPPurchaseInSummary.setText(String.valueOf(tCommissionInPPurchaseInSummaryP));
        tPaidInPPurchase3.setText(String.valueOf(tPaidInPPurchaseInSummaryP));
        tReturnAmountInPPurchase4.setText(String.valueOf(tReturnAmountInPPurchaseInSummaryP));

    }

    private void updateStoredItemByBarCode(String invoice, String barCode, String sellPrice) {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            String sql = "UPDATE product_purchase SET date = '" + Configaration.getCurrentDateAndTime()
                    + "', pName = '" + pNameInProductDetails.getText() + "',qty = '"
                    + qtyInProductDetails.getText() + "',buy_rate = '" + buyRateInProductDetails.getText()
                    + "',sell_rate = '" + sellPrice + "',order_limit = '"
                    + oderLimitInProductDetails.getText() + "',warranty = '"
                    + warrentyInProductDetails.getText() + "' WHERE invoice ='" + invoice + "' AND bar_code ='"
                    + barCode + "'";
            try {
                Statement st = conn.createStatement();
                st.execute(sql);

            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            DbConnection.disconnect(conn);

        }
        showDataInProductDetailsPurchaseFromDB(invoice);
    }

    public void genarateBarCode(String pdfName) {

        String fileNameJrxml1 = "/resources/reports/bar_code_list.jrxml";
        InputStream res = Home.class.getClass().getResourceAsStream(fileNameJrxml1);

        try {
            System.out.println("Loading the .JRMXML file ....");
            JasperDesign jasperDesign = JRXmlLoader.load(res);
            System.out.println("Compiling the .JRMXML file to .JASPER file....");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            HashMap hm = new HashMap();
            hm.put("bar_code_text", pdfName);
            System.out.println("filling parameters to .JASPER file....");
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperReport, hm, new JREmptyDataSource());
            preview(jprint);
            System.out.println("exporting the JASPER file to PDF file....");
            // JasperExportManager.exportReportToPdfFile(jprint,"D:\\Project\\Java GUI\\Auto Recharge System\\Core\\Auto-Recharge-System\\src\\resources\\pdf\\"+pdfName+".pdf");
            System.out.println("Successfully completed the export");

        } catch (Exception e) {
            System.out.print("Exception:" + e);
        }

    }

    public void genarateBarCodeForContractNumber(String number, String name, String number1, String number2, String number3, String number4, String number5, String number6, String number7, String number8, String number9) {

        String fileNameJrxml1 = "/resources/reports/contract_number.jrxml";

        InputStream res = Home.class.getClass().getResourceAsStream(fileNameJrxml1);

        try {
            System.out.println("Loading the .JRMXML file ....");
            JasperDesign jasperDesign = JRXmlLoader.load(res);
            System.out.println("Compiling the .JRMXML file to .JASPER file....");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            HashMap hm = new HashMap();
            hm.put("phone_no", number);
            hm.put("phone_no_1", number1);
            hm.put("phone_no_2", number2);
            hm.put("phone_no_3", number3);
            hm.put("phone_no_4", number4);
            hm.put("phone_no_5", number5);
            hm.put("phone_no_6", number6);
            hm.put("phone_no_7", number7);
            hm.put("phone_no_8", number8);
            hm.put("phone_no_9", number9);

            hm.put("simNameAndNumber", number);
            hm.put("simNameAndNumber1", number1);
            hm.put("simNameAndNumbe2", number2);
            hm.put("simNameAndNumber3", number3);
            hm.put("simNameAndNumber4", number4);
            hm.put("simNameAndNumbe5", number5);
            hm.put("simNameAndNumber6", number6);
            hm.put("simNameAndNumber7", number7);
            hm.put("simNameAndNumber8", number8);
            hm.put("simNameAndNumber9", number9);
            hm.put("name", name);
            System.out.println("filling parameters to .JASPER file....");
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperReport, hm, new JREmptyDataSource());
            preview(jprint);
            System.out.println("exporting the JASPER file to PDF file....");
            // JasperExportManager.exportReportToPdfFile(jprint,"D:\\Project\\Java GUI\\Auto Recharge System\\Core\\Auto-Recharge-System\\src\\resources\\pdf\\"+pdfName+".pdf");
            System.out.println("Successfully completed the export");

        } catch (Exception e) {
            System.out.print("Exception:" + e.getMessage());
        }

    }

    private void preview(JasperPrint jprint) {

        JasperViewer viewer = new JasperViewer(jprint, false);
        viewer.setLocationRelativeTo(null); //You can set location
        viewer.setSize(new Dimension(1000, 600)); //You can set size or you set preferredSize and the pack it.
        viewer.setVisible(true);
    }

    private void addProductFromDBInSellPanel(String barCode) {

        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) productSellTable.getDefaultRenderer(String.class);
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            try {
                String currentQty = "";
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `product_purchase` WHERE bar_code= " + barCode;
                //TODO: HANDLE NULL
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    currentQty = rs.getString("qty");
                    warrantyInProductBill.setText(rs.getString("warranty"));
                    countForSellTable++;
                    Double subTotal = Double.valueOf(rs.getString("sell_rate")) * 1.0 - (Double.valueOf(rs.getString("sell_rate")) * Double.valueOf(discpuntInProductBill.getText().toString()) / 100);
                    String typeOfAction = actionTypeInProductSellCOmboBox.getSelectedItem().toString();
                    supplierInProductPurchases.setText(rs.getString("supplier"));
                    dateInProductPurchases.setDate(new Date(rs.getString("date")));
                    product_sell_table_model.addRow(new Object[]{
                        String.valueOf(countForSellTable),
                        typeOfAction,
                        rs.getString("bar_code"),
                        rs.getString("group_products"),
                        rs.getString("pName"),
                        "1",
                        rs.getString("sell_rate"),
                        subTotal
                    });
                    switch (typeOfAction) {
                        case "Sell":
                            totalPayableAmt = totalPayableAmt + Double.valueOf(subTotal);
                            break;
                        case "Return":
                            returnForSellTable = returnForSellTable + Double.valueOf(subTotal);
                            System.err.println("returnAC");
                            break;
                        default:
                            System.err.println("Type Not Selected");
                            break;
                    }
                }
                String updatesql = "UPDATE `product_purchase` SET qty = '" + String.valueOf(Integer.valueOf(currentQty) - 1) + "' WHERE bar_code= " + barCode;
                PreparedStatement preparedStatement = conn.prepareStatement(updatesql);
                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        productSellTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        productSellTable.getTableHeader().setOpaque(false);
        productSellTable.getTableHeader().setBackground(new Color(133, 47, 209));
        productSellTable.getTableHeader().setForeground(new Color(255, 255, 255));
        productSellTable.setRowHeight(30);
        productSellTable.setModel(product_sell_table_model);

        saveSellProductInSellTabel(countForSellTable);
        summaryShowInBillDisplay();
    }

    private void summaryShowInBillDisplay() {

        discountInSellProduct = (totalPayableAmt * Double.valueOf(discpuntInProductBill.getText())) / 100;
        totalPayableAmtAfterDiscountInProductSellInDouble = totalPayableAmt - discountInSellProduct;

        totalItemsInProductSellInDouble = Double.valueOf(productSellTable.getRowCount());
        returnAmtInProductSellInDouble = returnForSellTable;
        discountAmtInProductSellInDouble = discountInSellProduct;
        vatInProductSellInDouble = 0.0;
        payableAmtInProductSellInDouble = totalPayableAmtAfterDiscountInProductSellInDouble;
        dueInProductSellInDouble = Double.valueOf(payableAmtInProductSellInDouble) - Double.valueOf(paymentInProductBill.getText());
        String payway = paymentTypeInProductSell.getSelectedItem().toString();

        totalAmountInProductSell1.setText(String.valueOf(totalPayableAmt));
        totalItemsInProductSell.setText(String.valueOf(totalItems));
        returnInProductSell.setText(String.valueOf(returnAmtInProductSellInDouble));

        vatInProductSell.setText(String.valueOf(vatInProductSellInDouble));
        payableInProductSell.setText(String.valueOf(payableAmtInProductSellInDouble));
        paidInProductSell.setText(paymentInProductBill.getText());
        duePaymentInProductSell.setText(duePaymentInProductBill.getText());
        dueInProductSell.setText(String.valueOf(dueInProductSellInDouble));
        paymentWayInProductSell.setText(payway);

    }

    private void clearBillforProduct() {
        countForSellTable = 0;

        totalItemsInProductSell.setText("");
        returnInProductSell.setText("");

        vatInProductSell.setText("");
        payableInProductSell.setText("");
        paidInProductSell.setText("");
        duePaymentInProductSell.setText("");
        dueInProductSell.setText("");
        paymentWayInProductSell.setText("");

        invoiceInProductSell.setText("");
        customerIdINProductSell.setText("");
        fullNameInProductSell.setText("");
        addressInProductSell.setText("");
        phoneNOInProductSell.setText("");
        paymentInProductBill.setText("0.0");
        warrantyInProductBill.setText("0.0");
        duePaymentInProductBill.setText("0.0");
        discpuntInProductBill.setText("0.0");

        product_sell_table_model = new DefaultTableModel(new String[]{"SL", "Sell Type", "Bar Code", "Group", "Product Name", "QTY", "Price", "SUBTOTAL WITH DISCOUNT"}, 0);
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) productSellTable.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        productSellTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        productSellTable.getTableHeader().setOpaque(false);
        productSellTable.getTableHeader().setBackground(new Color(133, 47, 209));
        productSellTable.getTableHeader().setForeground(new Color(255, 255, 255));
        productSellTable.setRowHeight(30);
        productSellTable.setModel(product_sell_table_model);

        totalItemsInProductSellInDouble = 0.0;
        returnAmtInProductSellInDouble = 0.0;
        discountAmtInProductSellInDouble = 0.0;
        vatInProductSellInDouble = 0.0;
        payableAmtInProductSellInDouble = 0.0;
        dueInProductSellInDouble = 0.0;
        totalPayableAmtAfterDiscountInProductSellInDouble = 0.0;
        totalPayableAmt = 0.0;
        returnForSellTable = 0.0;

    }

    private void printMemo() {
        List<Products> productses = new ArrayList<>();
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");

        } else {
            Connection conn = DbConnection.connect();
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `sell_table` where invoice=" + invoiceInProductSell.getText();
                //TODO: HANDLE NULL
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    Products p = new Products();
                    p.setBar_code(rs.getString("bar_code"));
                    p.setPrice(rs.getString("price"));
                    p.setQty(rs.getString("qty"));
                    p.setSub_total(rs.getString("sub_total"));
                    p.setWarranty(warrantyInProductBill.getText());
                    p.setP_name(rs.getString("p_name"));
                    productses.add(p);

                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }

        String fileNameJrxml1 = "/resources/reports/memo_shop.jrxml";
        InputStream res = Home.class.getClass().getResourceAsStream(fileNameJrxml1);

        try {
            System.out.println("Loading the .JRMXML file ....");
            JasperDesign jasperDesign = JRXmlLoader.load(res);
            System.out.println("Compiling the .JRMXML file to .JASPER file....");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            String shopName = UserInfo.shopName;
            String address = UserInfo.address;
            String phoneNumber = UserInfo.phoneNo;
            System.err.println(productses.get(0).getPrice());
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(productses);

            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("shop_name", shopName);
            hm.put("shop_address", address);
            hm.put("shop_phone_number", phoneNumber);
            hm.put("customar_name", fullNameInProductSell.getText());
            hm.put("phone_no", phoneNOInProductSell.getText());
            hm.put("customar_address", addressInProductSell.getText());
            hm.put("invoice", invoiceInProductSell.getText());
            hm.put("sold_by", "Logged User Name");
            hm.put("bar_code", invoiceInProductSell.getText());
            hm.put("collectionOfBean", ds);
            hm.put("total_amouny", totalAmountInProductSell1.getText());
            hm.put("tPayble", payableInProductSell.getText());
            hm.put("paid", paidInProductSell.getText());
            hm.put("due_payment", duePaymentInProductSell.getText());
            hm.put("due", dueInProductSell.getText());

            hm.put("vatTAxInBitll", "0.0");
            System.out.println("filling parameters to .JASPER file....");
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperReport, hm, new JREmptyDataSource());
            preview(jprint);
            System.out.println("exporting the JASPER file to PDF file....");
            // JasperExportManager.exportReportToPdfFile(jprint,"D:\\Project\\Java GUI\\Auto Recharge System\\Core\\Auto-Recharge-System\\src\\resources\\pdf\\"+pdfName+".pdf");
            System.out.println("Successfully completed the export");

        } catch (Exception e) {
            System.out.print("Exception:" + e);
        }

    }

    private void saveSellProductInSellTabel(int rowNo) {

        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            System.err.println("---------------------" + rowNo);
            Connection conn1 = DbConnection.connect();
            String sql = "INSERT INTO sell_table(invoice,customerId,date,due_date,`fName`,address,note,mobileNo,totalItems,`return`,total_amount,discount,payable,paid,due_payment,due,payment_way,sellType,bar_code,`group_products`,p_name,qty,price,sub_total,warranty,sl) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn1.prepareStatement(sql);
                preparedStatement.setString(1, invoiceInProductSell.getText().toString());
                preparedStatement.setString(2, customerIdINProductSell.getText().toString());
                preparedStatement.setString(3, dateInProductSell.getDate().toString());
                preparedStatement.setString(4, dueDateInProductSell.getDate().toString());
                preparedStatement.setString(5, fullNameInProductSell.getText().toString());
                preparedStatement.setString(6, addressInProductSell.getText().toString());
                preparedStatement.setString(7, noteInProductSell.getText().toString());
                preparedStatement.setString(8, phoneNOInProductSell.getText().toString());
                preparedStatement.setString(9, totalItemsInProductSell.getText().toString());
                preparedStatement.setString(10, returnInProductSell.getText().toString());
                preparedStatement.setString(11, totalAmountInProductSell1.getText().toString());
                preparedStatement.setString(12, discpuntInProductBill.getText().toString());
                preparedStatement.setString(13, payableInProductSell.getText().toString());
                preparedStatement.setString(14, paidInProductSell.getText().toString());
                preparedStatement.setString(15, duePaymentInProductSell.getText().toString());
                preparedStatement.setString(16, dueInProductSell.getText().toString());
                preparedStatement.setString(17, paymentWayInProductSell.getText().toString());
                preparedStatement.setString(25, warrantyInProductBill.getText().toString());
                preparedStatement.setString(26, String.valueOf(rowNo));
                for (int j = 1; j < productSellTable.getColumnCount(); j++) {

                    switch (j) {
                        case 1:
                            preparedStatement.setString(18, String.valueOf(productSellTable.getModel().getValueAt(rowNo - 1, j)));
                            System.err.println();
                            break;
                        case 2:
                            preparedStatement.setString(19, String.valueOf(productSellTable.getModel().getValueAt(rowNo - 1, j)));
                            break;
                        case 3:
                            preparedStatement.setString(20, String.valueOf(productSellTable.getModel().getValueAt(rowNo - 1, j)));
                            break;
                        case 4:
                            preparedStatement.setString(21, String.valueOf(productSellTable.getModel().getValueAt(rowNo - 1, j)));
                            break;
                        case 5:
                            preparedStatement.setString(22, String.valueOf(productSellTable.getModel().getValueAt(rowNo - 1, j)));
                            break;
                        case 6:
                            preparedStatement.setString(23, String.valueOf(productSellTable.getModel().getValueAt(rowNo - 1, j)));
                            break;
                        case 7:
                            preparedStatement.setString(24, String.valueOf(productSellTable.getModel().getValueAt(rowNo - 1, j)));
                            break;

                    }

                }
                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);

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

//        productSellTable.getRowCount();
//        System.err.println(productSellTable.getModel().getValueAt(0,0));
    }

    private void saveWarrantyDetailsInDb() {
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");

        } else {
            Connection conn1 = DbConnection.connect();
            String sql = "INSERT INTO warranty_table(invoice,customar_id,`date`,d_date,`problem`,f_name,address,mobole_no,ref_name,`brand`,status,bill,warranty,paid,discount,due) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn1.prepareStatement(sql);
                preparedStatement.setString(1, invoiceInProductWarranty.getText().toString());
                preparedStatement.setString(2, customerIdINProductWanrranty.getText().toString());
                preparedStatement.setString(3, dateInProductWanrranty.getDate().toString());
                preparedStatement.setString(4, delevaryDateDateInProductWanrranty.getDate().toString());
                preparedStatement.setString(5, problemInProductWanrranty.getText().toString());
                preparedStatement.setString(6, fullNameInProductWanrranty.getText().toString());
                preparedStatement.setString(7, addressInProductWanrranty.getText().toString());
                preparedStatement.setString(8, phoneNOInProductWanrranty.getText().toString());
                preparedStatement.setString(9, refNameInProductWanrranty.getText().toString());

                preparedStatement.setString(10, brandInProductWanrranty.getText().toString());
                preparedStatement.setString(11, statusInProductWanrrantyComboBox.getSelectedItem().toString());
                preparedStatement.setString(12, billInProductWanrranty.getText().toString());
                preparedStatement.setString(13, warrantyInProductWanrranty.getText().toString());
                preparedStatement.setString(14, paidPaymentInProductWanrranty.getText().toString());
                preparedStatement.setString(15, discpuntInProductWanrranty.getText().toString());
                preparedStatement.setString(16, dueInProductWanrranty.getText().toString());

                preparedStatement.execute();
                DbConnection.closeStatemanet(preparedStatement);
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
    }

    private void printPosMemo(String invoice) {
        List<Warranty> warrantys = new ArrayList<>();
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");

        } else {
            Connection conn = DbConnection.connect();
            try {

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `warranty_table`";
                //TODO: HANDLE NULL
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    if (invoice.equals(rs.getString("invoice"))) {
                        Warranty p = new Warranty();
                        p.setId("1");
                        p.setService_name(rs.getString("brand"));
                        p.setPrice(rs.getString("paid"));
                        p.setQty("1");
                        p.setTotal(rs.getString("bill"));

                        warrantys.add(p);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbConnection.disconnect(conn);
            }
        }
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new BillPrintable(warrantys), getPageFormat(pj));
        try {
            pj.print();

        } catch (PrinterException ex) {
            ex.printStackTrace();
        }

    }

    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double middleHeight = 8.0;
        double headerHeight = 2.0;
        double footerHeight = 2.0;
        double width = convert_CM_To_PPI(8);      //printer know only point per inch.default value is 72ppi
        double height = convert_CM_To_PPI(headerHeight + middleHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(
                0,
                10,
                width,
                height - convert_CM_To_PPI(1)
        );   //define boarder size    after that print area width is about 180 points

        pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
        pf.setPaper(paper);

        return pf;
    }

    protected static double convert_CM_To_PPI(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }

    private void collectInitialSIMBalance() {
       
        List<String> balancePaseList = new ArrayList<>();
        List<MobileRechargeBalance> mobileRechargeBalanceList = new ArrayList<MobileRechargeBalance>();
        ModemInfoList.simOperatorIdentifiers.forEach((SimOperatorIdentifierDto simOperatorIdentifierDto) -> {
            Connection conn = DbConnection.connect();
            try {
                auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `command`";
                ResultSet rs = st.executeQuery(sql);
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
         
                        } else {
                            String balance = (String) Configaration.haxToStringConvert(value[1].replaceAll("\"", ""));
                            Pattern p = Pattern.compile("\\d+");
                            Matcher m = p.matcher(balance);
                            while (m.find()) {
                                balancePaseList.add(m.group());
                                System.out.println(m.group());
                            }

                        }
                        MobileRechargeBalance mobileRechargeBalance = new MobileRechargeBalance();
                        mobileRechargeBalance.setPhoneNumber(simOperatorIdentifierDto.getOwnPhoneNumber());
                        mobileRechargeBalance.setSimName(rs.getString("operator_name"));
                        mobileRechargeBalance.setSimBalance(balancePaseList.get(0));
                        mobileRechargeBalanceList.add(mobileRechargeBalance);
                    }
                }
                ModemInfoList.mobileRechargeBalance = mobileRechargeBalanceList;

            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

                DbConnection.disconnect(conn);
            }
        });
    }

    private void displaySizeConfigaration() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setSize(1366, 768);
        this.setLocationRelativeTo(null);

    }

    private void detectUnreadSms() {

        String strCommand1 = "AT+CMGF=1";
        String strCommand2 = "AT+CPMS=\"SM\"";
        String strCommand3 = "AT+CMGL=\"REC UNREAD\"";

        for (SimOperatorIdentifierDto simOperatorIdentifierDto : ModemInfoList.simOperatorIdentifiers) {
            auto.recharge.system.config.Modem.connect(simOperatorIdentifierDto.getPortName());
            System.out.println(auto.recharge.system.config.Modem.sendATCommand(strCommand1));
            auto.recharge.system.config.Modem.sendATCommand(strCommand2);
            String result = auto.recharge.system.config.Modem.sendATCommand(strCommand3).replaceAll("\r", "").replaceAll("\"", "").replaceAll("\n", "");
            for (String value : result.split("\\+CMGL:")) {

                perseByCommaInInbox = value.replaceAll("OK", "").split(",");
                for (int i = 1; i < perseByCommaInInbox.length; i++) {
                    //2--phn number
                    //4-5 date time
                    //6 mgs
                    if (perseByCommaInInbox.length == 7) {
                        String from, dateTime, mgs;
                        from = perseByCommaInInbox[2];

                        dateTime = perseByCommaInInbox[4] + " " + perseByCommaInInbox[5];
                        if (Configaration.isHexadecimal(perseByCommaInInbox[6])) {
                            mgs = Configaration.haxToStringConvert(perseByCommaInInbox[6]);
                        } else {
                            mgs = perseByCommaInInbox[6];
                        }
                        System.out.println(from + " " + dateTime + " " + mgs);
                        insertSIMInTable(from, dateTime, mgs, simOperatorIdentifierDto.getOperatorName());
                        System.out.println();
                    }
                }

            }
            System.out.println();
            auto.recharge.system.config.Modem.disconnect();

        }
    }

    private void loadDataInInboxTable() {
        DefaultTableModel inboxTableModel = new DefaultTableModel(new String[]{"Time & Date", "From", "Sim Card", "Message"}, 0);
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                Connection conn = DbConnection.connect();
                try {
                    Statement st = conn.createStatement();
                    String sql = "SELECT * FROM `sms`";
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {

                        inboxTableModel.addRow(new Object[]{
                            rs.getString("time_date"),
                            rs.getString("phoneNo"),
                            rs.getString("sim_name"),
                            rs.getString("mgs")});

//                        MobileRechargeDetailsForSearchingDto mobileRechargeDetailsForSearchingDto= new MobileRechargeDetailsForSearchingDto();
//                        mobileRechargeDetailsForSearchingDto.setTrxId(rs.getString("trx_id"));
//                        mobileRechargeDetailsForSearchingDto.setDateAndTime(rs.getString("date_time"));
//                        mobileRechargeDetailsForSearchingDto.setPhoneNumber(rs.getString("type"));
//                        mobileRechargeDetailsForSearchingDto.setcBalance(rs.getString("mobile_no"));
//                        mobileRechargeDetailsForSearchingDto.setPostPaidOrPostPaid(rs.getString("amount"));
//                        mobileRechargeDetailsForSearchingDto.setAmmount(rs.getString("from_sp"));
//                        mobileRechargeDetailsForSearchingDto.setSelectableSim(rs.getString("current_balance"));
//                        mobileRechargeDetailsForSearchingDto.setStatus(rs.getString("status"));
                        //                       mobileRechargeDetailsForSearchingDtos.add(mobileRechargeDetailsForSearchingDto);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbConnection.disconnect(conn);
                }
            }
        }
        inboxTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        inboxTable.getTableHeader().setOpaque(false);
        inboxTable.getTableHeader().setBackground(new Color(133, 47, 209));
        inboxTable.getTableHeader().setForeground(new Color(255, 255, 255));

        //For jTable contant in center
        DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) inboxTable.getDefaultRenderer(String.class);
        stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        inboxTable.setEnabled(false);
        inboxTable.setRowHeight(35);
        inboxTable.setModel(inboxTableModel);
    }

    private void insertSIMInTable(String from, String dateTime, String mgs, String operatorName) {
        Connection conn = DbConnection.connect();

        String sql = "INSERT INTO sms(phoneNo,time_date,sim_name,mgs) VALUES(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, from);
            preparedStatement.setString(2, dateTime);
            preparedStatement.setString(3, operatorName);
            preparedStatement.setString(4, mgs);

            preparedStatement.execute();
            DbConnection.closeStatemanet(preparedStatement);

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            DbConnection.disconnect(conn);
        }
    }

    private void setWarrentyDetailsByInvoice(String invoice) {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Invoice", "Customar Id", "C Name", "Phone No", "Ref no", "Delivary Date", "Problem", "Bill", "Paid", "Due", "Status", "Brand"}, 0);
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                Connection conn = DbConnection.connect();
                try {
                    Statement st = conn.createStatement();
                    String sql = "SELECT * FROM `warranty_table` where invoice = " + invoice;
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        defaultTableModel.addRow(new String[]{rs.getString("invoice"), rs.getString("customar_id"),
                            rs.getString("f_name"), rs.getString("mobole_no"), rs.getString("ref_name"), rs.getString("d_date"), rs.getString("problem"),
                            rs.getString("bill"), rs.getString("paid"), rs.getString("due"), rs.getString("status"), rs.getString("brand")});
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbConnection.disconnect(conn);
                }
            }
            //For jTable contant in center
            DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) productWarrantyTable.getDefaultRenderer(String.class);
            stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            productWarrantyTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            productWarrantyTable.getTableHeader().setOpaque(false);
            productWarrantyTable.getTableHeader().setBackground(new Color(133, 47, 209));
            productWarrantyTable.getTableHeader().setForeground(new Color(255, 255, 255));
            productWarrantyTable.setEnabled(false);
            productWarrantyTable.setRowHeight(30);
            productWarrantyTable.setModel(defaultTableModel);
        }
    }

    private void loadDataInWarrentyTable() {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Invoice", "Customar Id", "C Name", "Phone No", "Ref no", "Delivary Date", "Problem", "Bill", "Paid", "Due", "Status", "Brand"}, 0);
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                Connection conn = DbConnection.connect();
                try {
                    Statement st = conn.createStatement();
                    String sql = "SELECT * FROM `warranty_table`";
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        defaultTableModel.addRow(new String[]{rs.getString("invoice"), rs.getString("customar_id"),
                            rs.getString("f_name"), rs.getString("mobole_no"), rs.getString("ref_name"), rs.getString("d_date"), rs.getString("problem"),
                            rs.getString("bill"), rs.getString("paid"), rs.getString("due"), rs.getString("status"), rs.getString("brand")});
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbConnection.disconnect(conn);
                }
            }
            //For jTable contant in center
            DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) productWarrantyTable.getDefaultRenderer(String.class);
            stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            productWarrantyTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            productWarrantyTable.getTableHeader().setOpaque(false);
            productWarrantyTable.getTableHeader().setBackground(new Color(133, 47, 209));
            productWarrantyTable.getTableHeader().setForeground(new Color(255, 255, 255));
            productWarrantyTable.setEnabled(false);
            productWarrantyTable.setRowHeight(30);
            productWarrantyTable.setModel(defaultTableModel);
        }
    }

    private void showDataInProductWarentyByInvoiceFromDB(String invoice) {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"Invoice", "Customar Id", "C Name", "Phone No", "Ref no", "Delivary Date", "Problem", "Bill", "Paid", "Due", "Status", "Brand"}, 0);
            if (UserInfo.role.equals("demo")) {
                System.err.println("Access dny in DEMO Panel");

            } else {
                Connection conn = DbConnection.connect();
                try {
                    Statement st = conn.createStatement();
                    String sql = "SELECT * FROM `warranty_table` where invoice =" + invoice;
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        defaultTableModel.addRow(new String[]{rs.getString("invoice"), rs.getString("customar_id"),
                            rs.getString("f_name"), rs.getString("mobole_no"), rs.getString("ref_name"), rs.getString("d_date"), rs.getString("problem"),
                            rs.getString("bill"), rs.getString("paid"), rs.getString("due"), rs.getString("status"), rs.getString("brand")});
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbConnection.disconnect(conn);
                }
            }
            //For jTable contant in center
            DefaultTableCellRenderer stringRenderer = (DefaultTableCellRenderer) productWarrantyTable.getDefaultRenderer(String.class);
            stringRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            productWarrantyTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
            productWarrantyTable.getTableHeader().setOpaque(false);
            productWarrantyTable.getTableHeader().setBackground(new Color(133, 47, 209));
            productWarrantyTable.getTableHeader().setForeground(new Color(255, 255, 255));
            productWarrantyTable.setEnabled(false);
            productWarrantyTable.setRowHeight(30);
            productWarrantyTable.setModel(defaultTableModel);
        }
    }

    private void updateWarrantyInfoByInvoice() {
        String afterPayment = String.valueOf(Double.valueOf(billInProductWanrranty.getText()) - Double.valueOf(paidPaymentInProductWanrranty.getText()));
        Connection conn = DbConnection.connect();
        String sql = "UPDATE warranty_table SET problem = '" + problemInProductWanrranty.getText() + "', mobole_no = '" + phoneNOInProductWanrranty.getText() + "', status = '" + statusInProductWanrrantyComboBox.getSelectedItem().toString() + "', paid = '" + paidPaymentInProductWanrranty.getText() + "', due = '" + afterPayment + "', bill = '" + billInProductWanrranty.getText() + "' WHERE invoice ='" + invoiceInProductWarranty.getText() + "'";
        try {
            Statement st = conn.createStatement();
            st.execute(sql);

        } catch (SQLException ex) {
            Log.error("updateMobileRechargeStatusByTrxId: ", ex.getMessage());
        }
        DbConnection.disconnect(conn);
        showDataInProductWarentyByInvoiceFromDB(invoiceInProductWarranty.getText());
    }

    private void deteteFromProductListTable(String barcode, String rowNo) {
        System.err.println(barcode + " " + rowNo);
        if (UserInfo.role.equals("demo")) {
            Popup.customError("Access Deny..");
        } else {

            Connection conn = DbConnection.connect();
            String sql = "DELETE FROM sell_table WHERE bar_code=" + barcode + "AND sl=" + rowNo;
            try {
                Statement st = conn.createStatement();
                st.execute(sql);
                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setLoggedUserDataInProfile() {
        nameInProfilePanel1.setText(UserInfo.name);
        companyNameInProfilePanel.setText(UserInfo.shopName);
        userIdInProfile.setText(UserInfo.userId);
        activePackageNameInProfile.setText(UserInfo.activePackage);
        activeDateInProfile.setText(UserInfo.activeDate);
        expiryDateInProfile.setText(UserInfo.expireDate);
        remainDaysInProfile.setText(trxId);
    }

    private void initHintInEditText() {
        getRechargeUssdParternPrePaid1.setUI(new HintTextFieldUI("*333*number*amount*pin#"));
        getRechargeUssdParternPostPaid1.setUI(new HintTextFieldUI("*333*number*amount*pin#"));
        getBalenceUssdPartern3.setUI(new HintTextFieldUI("*333*number*amount*pin#"));
    }

    private void printAndSaveInWarrenty() {
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    boolean isExist = false;
                    Connection conn = DbConnection.connect();
                    try {

                        Statement st = conn.createStatement();
                        String sql = "SELECT * FROM `warranty_table` WHERE invoice='" + invoiceInProductWarranty.getText() + "';";
                        //TODO: HANDLE NULL
                        ResultSet rs = st.executeQuery(sql);
                        if (!rs.next()) {
                            isExist = true;
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        DbConnection.disconnect(conn);
                    }
                    System.err.println(isExist);
                    if (isExist) {
                        System.err.println(isExist);
                        saveWarrantyDetailsInDb();
                        printPosMemo(invoiceInProductWarranty.getText());
                    } else {
                        System.err.println("just print");
                        printPosMemo(invoiceInProductWarranty.getText());
                    }
                    return null;
                }

                @Override
                protected void done() {
                    processtingLoderDialog.setVisible(false);
                }

            };
            worker.execute();

        }
    }

    private void SaveInWarrenty() {
        if (UserInfo.role.equals("demo")) {
            JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
        } else {
            SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    processtingLoderDialog.setVisible(true);
                    saveWarrantyDetailsInDb();

                    return null;
                }

                @Override
                protected void done() {
                    processtingLoderDialog.setVisible(false);
                }

            };
            worker.execute();

        }
    }

    private void searchByPhoneNumberInMobileBankingDetails(Set<MobileBankingDetailsForSearchingDto> mobileBankingDetailsForSearchingDto, String serchValue) {
        System.err.println(serchValue);
        Set<MobileBankingDetailsForSearchingDto> contractResponsesSet = new HashSet<>();

        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"TrxId", "Service", "Action", "Ac no", "Amount", "Sim Card", "Current Balance", "Status", "Date and Time", "info"}, 0);
        mobileBankingDetailsForSearchingDto.stream().forEach(contractResponseValue -> {
            System.err.println(serchValue.toLowerCase().contains(contractResponseValue.getDateAndType().toLowerCase().toLowerCase().replaceAll("\r", "").replaceAll(" ", "")));
            if (contractResponseValue.getDateAndType().toLowerCase().toLowerCase().contains(serchValue.toLowerCase())) {
                MobileBankingDetailsForSearchingDto contractResponse = new MobileBankingDetailsForSearchingDto();
                contractResponse.setTrxId(contractResponseValue.getTrxId());
                contractResponse.setAmount(contractResponseValue.getAmount());
                contractResponse.setcBalance(contractResponseValue.getcBalance());
                contractResponse.setDateAndType(contractResponseValue.getDateAndType());
                contractResponse.setPhoneNo(contractResponseValue.getPhoneNo());
                contractResponse.setSim(contractResponseValue.getSim());
                contractResponse.setServiceName(contractResponseValue.getServiceName());
                contractResponse.setResult(contractResponseValue.getResult());
                contractResponsesSet.add(contractResponse);

            }
            if (contractResponseValue.getPhoneNo().toLowerCase().toLowerCase().contains(serchValue.toLowerCase())) {
                MobileBankingDetailsForSearchingDto contractResponse = new MobileBankingDetailsForSearchingDto();
                contractResponse.setTrxId(contractResponseValue.getTrxId());
                contractResponse.setAmount(contractResponseValue.getAmount());
                contractResponse.setcBalance(contractResponseValue.getcBalance());
                contractResponse.setDateAndType(contractResponseValue.getDateAndType());
                contractResponse.setPhoneNo(contractResponseValue.getPhoneNo());
                contractResponse.setSim(contractResponseValue.getSim());
                contractResponse.setServiceName(contractResponseValue.getServiceName());
                contractResponse.setResult(contractResponseValue.getResult());
                contractResponsesSet.add(contractResponse);

            }
            if (contractResponseValue.getAmount().toLowerCase().toLowerCase().contains(serchValue.toLowerCase())) {
                MobileBankingDetailsForSearchingDto contractResponse = new MobileBankingDetailsForSearchingDto();
                contractResponse.setTrxId(contractResponseValue.getTrxId());
                contractResponse.setAmount(contractResponseValue.getAmount());
                contractResponse.setcBalance(contractResponseValue.getcBalance());
                contractResponse.setDateAndType(contractResponseValue.getDateAndType());
                contractResponse.setPhoneNo(contractResponseValue.getPhoneNo());
                contractResponse.setSim(contractResponseValue.getSim());
                contractResponse.setServiceName(contractResponseValue.getServiceName());
                contractResponse.setResult(contractResponseValue.getResult());
                contractResponsesSet.add(contractResponse);

            }

        });
        System.err.println(contractResponsesSet);
        contractResponsesSet.stream().forEach(value -> {
            defaultTableModel.addRow(new Object[]{value.getTrxId(), value.getServiceName(), value.getActionType(), value.getPhoneNo(), value.getAmount(), value.getSim(), value.getcBalance(), value.getResult(), value.getDateAndType(), value.getInfo()});
        });

        tableMobileBankingDetails.setRowHeight(25);
        tableMobileBankingDetails.setModel(defaultTableModel);
    }

    public class BillPrintable implements Printable {

        private final List<Warranty> warrantys;

        public BillPrintable(List<Warranty> warrantys) {
            this.warrantys = warrantys;
        }

        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
                throws PrinterException {

            int result = NO_SUCH_PAGE;
            if (pageIndex == 0) {

                Graphics2D g2d = (Graphics2D) graphics;

                double width = pageFormat.getImageableWidth();

                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

                FontMetrics metrics = g2d.getFontMetrics(new Font("Arial", Font.BOLD, 7));

                int idLength = metrics.stringWidth("000");
                int amtLength = metrics.stringWidth("000000");
                int qtyLength = metrics.stringWidth("00000");
                int priceLength = metrics.stringWidth("000000");
                int prodLength = (int) width - idLength - amtLength - qtyLength - priceLength - 17;

                int productPosition = 0;
                int discountPosition = prodLength + 5;
                int pricePosition = discountPosition + idLength + 10;
                int qtyPosition = pricePosition + priceLength + 4;
                int amtPosition = qtyPosition + qtyLength;

                try {
                    /*Draw Header*/
                    int y = 20;
                    int yShift = 10;
                    int headerRectHeight = 15;
                    int headerRectHeighta = 40;
                    String total = "";

                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                    g2d.drawString("-------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString("            " + UserInfo.shopName + "        ", 16, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 12, y);
                    y += headerRectHeight;

                    g2d.drawString("Invoice #: " + invoiceInProductWarranty.getText() + "", 10, y);
                    y += yShift;
                    g2d.drawString("Customer Name: " + fullNameInProductWanrranty.getText() + "", 10, y);
                    y += yShift;
                    g2d.drawString("Phone N0: " + phoneNOInProductWanrranty.getText() + "", 10, y);
                    y += yShift;
                    g2d.drawString("Date & Time: " + Configaration.getCurrentDateAndTime() + "", 10, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Id           Service Name       Paid", 10, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 10, y);
                    y += headerRectHeight;
                    for (Warranty warranty : warrantys) {
                        g2d.drawString(" " + warranty.getId() + "               " + warranty.getService_name() + "            " + warranty.getPrice() + "", 10, y);
                        y += yShift;
                        total = warranty.getTotal();
                    }

                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Total amount: " + total + "         ", 10, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString("               HelpLine                ", 10, y);
                    y += yShift;
                    g2d.drawString("             " + UserInfo.phoneNo + "         ", 10, y);
                    y += yShift;
                    g2d.drawString("*************************************", 10, y);
                    y += yShift;
                    g2d.drawString("    THANKS TO VISIT OUR SHOP   ", 10, y);
                    y += yShift;
                    g2d.drawString("*************************************", 10, y);
                    y += yShift;

//            g2d.setFont(new Font("Monospaced",Font.BOLD,10));
//            g2d.drawString("Customer Shopping Invoice", 30,y);y+=yShift; 
                } catch (Exception r) {
                    r.printStackTrace();
                }

                result = PAGE_EXISTS;
            }
            return result;
        }
    }

    private void updateInfoInMObileBankingByuserId(String userId, String mgs) {
        if (UserInfo.role.equals("demo")) {
            System.err.println("Access dny in DEMO Panel");

        } else {
            Connection conn = DbConnection.connect();
            String sql = "UPDATE m_b_details SET info = '" + mgs + "' WHERE TnxId ='" + userId + "'";
            try {
                Statement st = conn.createStatement();
                st.execute(sql);

            } catch (SQLException ex) {
                Log.error("updateMobileRechargeStatusByTrxId: ", ex.getMessage());
            }
            DbConnection.disconnect(conn);

            loadMobileBankingDetailsTable();
        }
    }

    private boolean isRechargeModemSetUpDone() {
        try {
            Connection conn = DbConnection.connect();
            String selectedOperatorName = setPayableSIMByPhoneNumber(getMobileNumber.getText()).toUpperCase();
            Log.mgs("Selected SIM By Phone Number", selectedOperatorName);
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM `command` WHERE `operator_name`=\"" + selectedOperatorName + "\"";
            ResultSet rs = st.executeQuery(sql);

            if (!rs.next()) {
                return false;
            } else {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void refrashProductPurchaseTable() {
        barCodeInProductPurchases.requestFocusInWindow();
        barCodeInProductPurchases.setText(String.valueOf(Configaration.getRandInt(5, 10)));
        pNameInProductPurchases.setText("");
        qtyInProductPurchases.setText("");
        buyRateInProductPurchases.setText("");
        sellRateInProductPurchases.setText("");
        typeInProductPurchasesComboBox.setSelectedIndex(0);

    }

    private void settingPanelEnterPressWork() {
        //Password Update
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
                    if (UserInfo.role.equals("demo")) {
                        JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
                    } else {
                        String password = passwordForUpdate.getText();
                        String rePassword = rePasswordForUpdate.getText();
                        if (password.equals("") || rePassword.equals("")) {
                            Popup.customError("Empty field found.");

                        } else {
                            if (password.equals(rePassword)) {
                                changeAdminPassword(AES.encrypt(password, "itvillage428854"));

                            } else {
                                Popup.customError("Re-type password not match");
                            }
                        }

                    }
                }
            }
        });

        //ADD Mobile Recharge Setting
        getOperatorName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getRechargeUssdParternPrePaid.requestFocusInWindow();
                }
            }
        });

        getRechargeUssdParternPrePaid.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.err.println("0-------------------------------");
                    getRechargeUssdParternPostPaid.requestFocusInWindow();
                }
            }
        });

        getRechargeUssdParternPostPaid.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getBalenceUssdPartern1.requestFocusInWindow();
                }
            }
        });
        getBalenceUssdPartern1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    accountPassword.requestFocusInWindow();
                }
            }
        });
        accountPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickChooseIcon.requestFocusInWindow();
                }
            }
        });
        clickChooseIcon.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickAddContract1.requestFocusInWindow();
                }
            }
        });
        clickAddContract1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (UserInfo.role.equals("demo")) {
                        JOptionPane.showMessageDialog(null, "Demo User Can't Make Oparetion.Please Subscribe A Package");
                    } else {
                        String rechargeUssdPartern = getRechargeUssdParternPrePaid.getText();
                        String operatorName = getOparetorNameInUssdCommand.getSelectedItem().toString();

                        String actionFor = "mobile";
                        String balenceUssdPartern = getBalenceUssdPartern1.getText();
                        if (!rechargeUssdPartern.equals("")
                                && !operatorName.equals("")) {

                            if (saveToDbCommandInCommand()) {
                                System.out.println("Adding Successfull");
                            }
                        } else {
                            Popup.error("Empty Field");
                        }
                    }
                }
            }
        });

        //Get Phone Number For QR Code Ganarate
        getNameForRechargeBarCode1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber2.selectAll();
                    forBarCodePhoneNumber2.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber3.selectAll();
                    forBarCodePhoneNumber3.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber4.selectAll();
                    forBarCodePhoneNumber4.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber5.selectAll();
                    forBarCodePhoneNumber5.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber6.selectAll();
                    forBarCodePhoneNumber6.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber7.selectAll();
                    forBarCodePhoneNumber7.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber8.selectAll();
                    forBarCodePhoneNumber8.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber9.selectAll();
                    forBarCodePhoneNumber9.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber9.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    forBarCodePhoneNumber10.selectAll();
                    forBarCodePhoneNumber10.requestFocusInWindow();
                }
            }
        });
        forBarCodePhoneNumber10.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                    clickAddForRechargeBarCode.requestFocusInWindow();
                }
            }
        });
        clickAddForRechargeBarCode.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (UserInfo.role.equals("demo")) {

                    } else {
                        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
                            @Override
                            protected Void doInBackground() throws Exception {
                                processtingLoderDialog.setVisible(true);
                                genarateBarCodeForContractNumber(getMobileNumber.getText(), getNameForRechargeBarCode1.getText(), forBarCodePhoneNumber2.getText(), forBarCodePhoneNumber3.getText(), forBarCodePhoneNumber4.getText(), forBarCodePhoneNumber5.getText(), forBarCodePhoneNumber6.getText(), forBarCodePhoneNumber7.getText(), forBarCodePhoneNumber8.getText(), forBarCodePhoneNumber9.getText(), forBarCodePhoneNumber10.getText());
                                return null;
                            }

                            @Override
                            protected void done() {
                                processtingLoderDialog.setVisible(false);
                            }

                        };
                        worker.execute();

                    }
                }
            }
        });
    }
}
