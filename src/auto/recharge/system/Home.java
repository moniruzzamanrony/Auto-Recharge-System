/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import static auto.recharge.system.Mail.getMacAddress;
import auto.recharge.system.dto.ModemInfoList;
import auto.recharge.system.dto.SimOperatorIdentifierDto;
import com.itvillage.AES;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
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
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    private Connection conn;
    private String imagePath = "No Image";
    private LoadingScreen l;
    private String selectedSimOperatorName;
    private String[] rowOfContractlist;
    private String trxId;
    private ResultSet rs;
    public Home() {
        initComponents();
       // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      //  popupMenu.add(confirmPopUp);
        setFocusInMobileRechargePanel();
        setCuurentActiveNetworkAndBalenceFromModem();
        loadActiveOperatorNameInComboBox();
        initialValueInTableRechargeDetails();
        refrash();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();
        resellerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        detailsPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel21 = new javax.swing.JLabel();
        rechargeOfferPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        addNewManagementPanelSettings = new javax.swing.JPanel();
        backToUssdManengementPanel1 = new javax.swing.JLabel();
        getOparetorNameInDropDown = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        clickAddContract2 = new javax.swing.JButton();
        getOperatorName1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        getOperatorCode1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        getSeletedAction1 = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        getRechargeUssdParternPrePaid1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        clickChooseIcon1 = new javax.swing.JButton();
        getBalenceUssdPartern2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        accountPassword1 = new javax.swing.JPasswordField();
        jLabel49 = new javax.swing.JLabel();
        getRechargeUssdParternPostPaid1 = new javax.swing.JTextField();
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
        clickSerch = new javax.swing.JLabel();
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
        getName = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        getPhoneNO = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        getSeletedStorage = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mobileRechargeTab.setBackground(new java.awt.Color(255, 255, 255));
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
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        mobileRechargeTabLayout.setVerticalGroup(
            mobileRechargeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobileRechargeTabLayout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        billPaymentTab.setBackground(new java.awt.Color(255, 255, 255));
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

        resellerTab.setBackground(new java.awt.Color(255, 255, 255));
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

        detailsTab.setBackground(new java.awt.Color(255, 255, 255));
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

        settingTab.setBackground(new java.awt.Color(255, 255, 255));
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

        helplineTab.setBackground(new java.awt.Color(255, 255, 255));
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
            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(mobileRechargeTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(billPaymentTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resellerTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(detailsTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(helplineTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(mobileRechargeTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billPaymentTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resellerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helplineTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        currentNetworkName.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        currentNetworkName.setForeground(new java.awt.Color(102, 102, 255));
        currentNetworkName.setText("No SIIM Avaiable");
        netBarPanel.add(currentNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 380, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        netBarPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 12, -1, -1));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224)
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
        mobileRechargePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getSeletedOperatorName.setBackground(new java.awt.Color(255, 255, 255));
        getSeletedOperatorName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getSeletedOperatorName.setForeground(new java.awt.Color(204, 0, 0));
        mobileRechargePanel.add(getSeletedOperatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 180, 116, -1));

        clickSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSendMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(clickSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 200, 50));

        getPrepaidOrPostpaid.setBackground(new java.awt.Color(255, 255, 255));
        getPrepaidOrPostpaid.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getPrepaidOrPostpaid.setForeground(new java.awt.Color(255, 153, 153));
        getPrepaidOrPostpaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));
        mobileRechargePanel.add(getPrepaidOrPostpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 200, 40));

        getAmmountInTk.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        mobileRechargePanel.add(getAmmountInTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 530, 100));

        getMobileNumber.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        getMobileNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getMobileNumber.setBorder(null);
        mobileRechargePanel.add(getMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 670, 100));
        mobileRechargePanel.add(selectedSimOperatorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 50, 50));

        clickContactList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickContactListMouseClicked(evt);
            }
        });
        mobileRechargePanel.add(clickContactList, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/mobile_recharge_bar.png"))); // NOI18N
        mobileRechargePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 12, 1025, 347));

        rechargeBalencePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Amount panel");

        clickRefrash.setBackground(new java.awt.Color(133, 47, 209));
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Service", "Amount", "Profit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableShowSimBalence);
        if (tableShowSimBalence.getColumnModel().getColumnCount() > 0) {
            tableShowSimBalence.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout rechargeBalencePanelLayout = new javax.swing.GroupLayout(rechargeBalencePanel);
        rechargeBalencePanel.setLayout(rechargeBalencePanelLayout);
        rechargeBalencePanelLayout.setHorizontalGroup(
            rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rechargeBalencePanelLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addGap(18, 18, 18)
                .addGroup(rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rechargeBalencePanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clickRefrash))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );
        rechargeBalencePanelLayout.setVerticalGroup(
            rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeBalencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clickRefrash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rechargeBalencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rechargeBalencePanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                .addContainerGap())
        );

        mobileRechargePanel.add(rechargeBalencePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1203, 12, 323, -1));

        clickUssdDail.setBackground(new java.awt.Color(204, 153, 255));
        clickUssdDail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickUssdDail.setForeground(new java.awt.Color(255, 255, 255));
        clickUssdDail.setText("Ussd Dial");
        clickUssdDail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUssdDailActionPerformed(evt);
            }
        });
        mobileRechargePanel.add(clickUssdDail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 59, 116, -1));

        clickGroupLoad.setBackground(new java.awt.Color(153, 153, 255));
        clickGroupLoad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickGroupLoad.setForeground(new java.awt.Color(255, 255, 255));
        clickGroupLoad.setText("Group Load");
        clickGroupLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickGroupLoadActionPerformed(evt);
            }
        });
        mobileRechargePanel.add(clickGroupLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 100, -1, -1));

        clickSIMOffer.setBackground(new java.awt.Color(153, 0, 255));
        clickSIMOffer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickSIMOffer.setForeground(new java.awt.Color(255, 255, 255));
        clickSIMOffer.setText("SIM Offer");
        clickSIMOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSIMOfferActionPerformed(evt);
            }
        });
        mobileRechargePanel.add(clickSIMOffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 141, 116, -1));

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
        jScrollPane2.setViewportView(tableRechargeDetailsShow);

        mobileRechargePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 407, 1153, 450));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Today's Recharge");
        mobileRechargePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 365, -1, -1));

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
                .addContainerGap(38, Short.MAX_VALUE))
        );

        mobileRechargePanel.add(reportGeneratePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1203, 602, 323, -1));

        basePanel.add(mobileRechargePanel, "card2");

        billPayPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("bill pay");

        javax.swing.GroupLayout billPayPanelLayout = new javax.swing.GroupLayout(billPayPanel);
        billPayPanel.setLayout(billPayPanelLayout);
        billPayPanelLayout.setHorizontalGroup(
            billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPayPanelLayout.createSequentialGroup()
                .addGap(566, 566, 566)
                .addComponent(jLabel2)
                .addContainerGap(964, Short.MAX_VALUE))
        );
        billPayPanelLayout.setVerticalGroup(
            billPayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPayPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel2)
                .addContainerGap(663, Short.MAX_VALUE))
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
                .addContainerGap(956, Short.MAX_VALUE))
        );
        resellerPanelLayout.setVerticalGroup(
            resellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resellerPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel3)
                .addContainerGap(663, Short.MAX_VALUE))
        );

        basePanel.add(resellerPanel, "card2");

        detailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("details panel");

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(566, 566, 566)
                .addComponent(jLabel4)
                .addContainerGap(931, Short.MAX_VALUE))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel4)
                .addContainerGap(663, Short.MAX_VALUE))
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
                .addContainerGap(808, Short.MAX_VALUE))
        );
        myProfilePanelLayout.setVerticalGroup(
            myProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myProfilePanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel16)
                .addContainerGap(619, Short.MAX_VALUE))
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
                .addContainerGap(759, Short.MAX_VALUE))
        );
        systemBackupPanelLayout.setVerticalGroup(
            systemBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemBackupPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel17)
                .addContainerGap(619, Short.MAX_VALUE))
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
                .addContainerGap(759, Short.MAX_VALUE))
        );
        passwordChangePanelLayout.setVerticalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel18)
                .addContainerGap(619, Short.MAX_VALUE))
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
                .addContainerGap(745, Short.MAX_VALUE))
        );
        trustedEmployeePanelLayout.setVerticalGroup(
            trustedEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trustedEmployeePanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel19)
                .addContainerGap(619, Short.MAX_VALUE))
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
                        .addGap(0, 254, Short.MAX_VALUE))))
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

        jLabel21.setText("MobileBakn");

        javax.swing.GroupLayout MobileBankingSettingsPanelLayout = new javax.swing.GroupLayout(MobileBankingSettingsPanel);
        MobileBankingSettingsPanel.setLayout(MobileBankingSettingsPanelLayout);
        MobileBankingSettingsPanelLayout.setHorizontalGroup(
            MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel21)
                .addContainerGap(781, Short.MAX_VALUE))
        );
        MobileBankingSettingsPanelLayout.setVerticalGroup(
            MobileBankingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MobileBankingSettingsPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel21)
                .addContainerGap(619, Short.MAX_VALUE))
        );

        settingBasePanel.add(MobileBankingSettingsPanel, "card2");

        rechargeOfferPanel.setToolTipText("");

        jLabel22.setText("rechargeOfferPanel");

        javax.swing.GroupLayout rechargeOfferPanelLayout = new javax.swing.GroupLayout(rechargeOfferPanel);
        rechargeOfferPanel.setLayout(rechargeOfferPanelLayout);
        rechargeOfferPanelLayout.setHorizontalGroup(
            rechargeOfferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeOfferPanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel22)
                .addContainerGap(734, Short.MAX_VALUE))
        );
        rechargeOfferPanelLayout.setVerticalGroup(
            rechargeOfferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeOfferPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel22)
                .addContainerGap(619, Short.MAX_VALUE))
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
        addNewManagementPanelSettings.add(clickAddContract2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 150, 40));

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

        jLabel44.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel44.setText("Action For");
        addNewManagementPanelSettings.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 238, -1, -1));

        getSeletedAction1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getSeletedAction1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile Recharge" }));
        getSeletedAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSeletedAction1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getSeletedAction1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 470, 40));

        jLabel45.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel45.setText("Recharge USSD Code Pattern (Pre-paid)");
        addNewManagementPanelSettings.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        getRechargeUssdParternPrePaid1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPrePaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPrePaid1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getRechargeUssdParternPrePaid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 470, 40));

        jLabel46.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel46.setText("Icon");
        addNewManagementPanelSettings.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        clickChooseIcon1.setBackground(new java.awt.Color(255, 255, 255));
        clickChooseIcon1.setForeground(new java.awt.Color(102, 102, 255));
        clickChooseIcon1.setText("::::::Choose Icon(40px X 30px):::::::");
        clickChooseIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickChooseIcon1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(clickChooseIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 470, 30));

        getBalenceUssdPartern2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getBalenceUssdPartern2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalenceUssdPartern2ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getBalenceUssdPartern2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 470, 40));

        jLabel47.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel47.setText("Balence show USSD Code Pattern");
        addNewManagementPanelSettings.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel48.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel48.setText("Account Password");
        addNewManagementPanelSettings.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        accountPassword1.setText("jPasswordField1");
        addNewManagementPanelSettings.add(accountPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 470, 40));

        jLabel49.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel49.setText("Recharge USSD Code Pattern(post-paid)");
        addNewManagementPanelSettings.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        getRechargeUssdParternPostPaid1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getRechargeUssdParternPostPaid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRechargeUssdParternPostPaid1ActionPerformed(evt);
            }
        });
        addNewManagementPanelSettings.add(getRechargeUssdParternPostPaid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 470, 40));

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
                .addContainerGap(959, Short.MAX_VALUE))
        );
        helplinePanelLayout.setVerticalGroup(
            helplinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helplinePanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel8)
                .addContainerGap(663, Short.MAX_VALUE))
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

        clickSerch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickSerchMouseClicked(evt);
            }
        });
        serchBar.add(clickSerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 60, 50));

        getNameForSearch.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getNameForSearch.setBorder(null);
        serchBar.add(getNameForSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 3, 340, 45));

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
                        .addContainerGap(517, Short.MAX_VALUE)
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        addNewContractPanel.add(getName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 470, 40));

        jLabel38.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel38.setText("Name");
        addNewContractPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 175, -1, -1));
        addNewContractPanel.add(getPhoneNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 470, 40));

        jLabel39.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel39.setText("Phone No.");
        addNewContractPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 245, -1, -1));

        jLabel40.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel40.setText("Storage");
        addNewContractPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 315, -1, -1));

        getSeletedStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        addNewContractPanel.add(getSeletedStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 470, 40));

        basePanel.add(addNewContractPanel, "card2");

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
                .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void billPaymentTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentTabMouseClicked
        switchPanelViaMenu(billPayPanel, title1, icon1, "money_color", "Bill Payment");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");
    }//GEN-LAST:event_billPaymentTabMouseClicked

    private void resellerTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resellerTabMouseClicked
        switchPanelViaMenu(resellerPanel, title2, icon2, "reseller_color", "Reseller");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");
    }//GEN-LAST:event_resellerTabMouseClicked

    private void detailsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTabMouseClicked
        switchPanelViaMenu(detailsPanel, title3, icon3, "details_color", "Details");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");
    }//GEN-LAST:event_detailsTabMouseClicked

    private void settingTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingTabMouseClicked
        switchPanelViaMenu(settingsPanel1, title4, icon4, "settings_color", "Settings");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title5, icon5, "helpline");
    }//GEN-LAST:event_settingTabMouseClicked

    private void helplineTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helplineTabMouseClicked
        switchPanelViaMenu(helplinePanel, title5, icon5, "helpline_color", "Help Line");

        colorSwitcherWithRegular(title, icon, "payment");
        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_clickSIMOfferActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mobileRechargeTabMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeTabMouseMoved

    }//GEN-LAST:event_mobileRechargeTabMouseMoved

    private void mobileRechargeTabHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeTabHover
        hover(mobileRechargeTab);
    }//GEN-LAST:event_mobileRechargeTabHover

    private void mobileRechargeTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeTabMouseExited
        hoverRemove(mobileRechargeTab);
    }//GEN-LAST:event_mobileRechargeTabMouseExited

    private void mobileRechargeTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeTabMouseClicked
        switchPanelViaMenu(mobileRechargePanel, title, icon, "payment_color", "Mobile Recharge");

        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");
        
        setFocusInMobileRechargePanel();
    }//GEN-LAST:event_mobileRechargeTabMouseClicked

    private void billPaymentTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentTabMouseEntered
        hover(billPaymentTab);
    }//GEN-LAST:event_billPaymentTabMouseEntered

    private void billPaymentTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentTabMouseExited
        hoverRemove(billPaymentTab);
    }//GEN-LAST:event_billPaymentTabMouseExited

    private void resellerTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resellerTabMouseEntered
        hover(resellerTab);
    }//GEN-LAST:event_resellerTabMouseEntered

    private void resellerTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resellerTabMouseExited
        hoverRemove(resellerTab);
    }//GEN-LAST:event_resellerTabMouseExited

    private void detailsTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTabMouseEntered
        hover(detailsTab);
    }//GEN-LAST:event_detailsTabMouseEntered

    private void detailsTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTabMouseExited
        hoverRemove(detailsTab);
    }//GEN-LAST:event_detailsTabMouseExited

    private void settingTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingTabMouseEntered
        hover(settingTab);
    }//GEN-LAST:event_settingTabMouseEntered

    private void settingTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingTabMouseExited
        hoverRemove(settingTab);
    }//GEN-LAST:event_settingTabMouseExited

    private void helplineTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helplineTabMouseEntered
        hover(helplineTab);
    }//GEN-LAST:event_helplineTabMouseEntered

    private void helplineTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helplineTabMouseExited
        hoverRemove(helplineTab);
    }//GEN-LAST:event_helplineTabMouseExited

    private void clickContactListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContactListMouseClicked
        switchPanelViaMenu(contractListPanel);
        setContractListInJTable();
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
    }//GEN-LAST:event_rechargeOffersMouseClicked

    private void clickAddNewManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddNewManagementActionPerformed

        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getOparetorNameInDropDown.addItem(simOperatorIdentifierDto.getOperatorName());
        });
        switchPanelViaSettings(addNewManagementPanelSettings,rechargeSettings);
    }//GEN-LAST:event_clickAddNewManagementActionPerformed

    private void clickSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSendMouseClicked
        String phoneNumberRequested = getMobileNumber.getText();
        String ammountRequested = getAmmountInTk.getText();
        System.err.println(getSeletedOperatorName.getSelectedIndex());
        if (!phoneNumberRequested.equals("") && !ammountRequested.equals("") && getSeletedOperatorName.getSelectedIndex() != -1
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

    private void clickSerchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSerchMouseClicked
        searchByName(rowOfContractlist, getNameForSearch.getText());
    }//GEN-LAST:event_clickSerchMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        switchPanelViaMenu(mobileRechargePanel);
    }//GEN-LAST:event_backMouseClicked

    private void clickNewContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickNewContractActionPerformed
        switchPanelViaMenu(addNewContractPanel);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_clickAddContractActionPerformed

    private void backToUssdManengementPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToUssdManengementPanel1MouseClicked
       switchPanelViaSettings(rechargeSettingsPanel, rechargeSettings);
    }//GEN-LAST:event_backToUssdManengementPanel1MouseClicked

    private void clickAddContract2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddContract2ActionPerformed
        String rechargeUssdPartern = getRechargeUssdParternPrePaid1.getText();
        String operatorName = getOparetorNameInDropDown.getSelectedItem().toString();
        String operatorCode = getOperatorCode1.getText();
        String actionFor = getSeletedAction1.getSelectedItem().toString();
        String balenceUssdPartern = getBalenceUssdPartern2.getText();
        System.err.println(rechargeUssdPartern+ " "+ operatorName +"  "+operatorCode);
        if (!rechargeUssdPartern.equals("")
                && !operatorName.equals("")
                && !operatorCode.equals("")) {

            if (saveToDbCommandInCommand()) {
                System.out.println("Adding Successfull");
            }
        } else {
            Popup.error("Empty Field--");
        }
    }//GEN-LAST:event_clickAddContract2ActionPerformed

    private void getSeletedAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSeletedAction1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getSeletedAction1ActionPerformed

    private void getRechargeUssdParternPrePaid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPrePaid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPrePaid1ActionPerformed

    private void clickChooseIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickChooseIcon1ActionPerformed
         loadImageIcon(getOparetorNameInDropDown.getSelectedItem().toString().toLowerCase());
    }//GEN-LAST:event_clickChooseIcon1ActionPerformed

    private void getBalenceUssdPartern2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBalenceUssdPartern2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBalenceUssdPartern2ActionPerformed

    private void getRechargeUssdParternPostPaid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRechargeUssdParternPostPaid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRechargeUssdParternPostPaid1ActionPerformed

    private void backToUssdManengementPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_backToUssdManengementPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_backToUssdManengementPanel1AncestorAdded

    private void clickRefrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickRefrashActionPerformed

        addBalenceInBalenceShowTable();
    }//GEN-LAST:event_clickRefrashActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MobileBankingSettingsPanel;
    private javax.swing.JPasswordField accountPassword;
    private javax.swing.JPasswordField accountPassword1;
    private javax.swing.JPanel addNewContractPanel;
    private javax.swing.JPanel addNewManagementPanel;
    private javax.swing.JPanel addNewManagementPanelSettings;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back43;
    private javax.swing.JLabel backToMobileRecharge;
    private javax.swing.JLabel backToUssdManengementPanel;
    private javax.swing.JLabel backToUssdManengementPanel1;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel billPayPanel;
    private javax.swing.JPanel billPaymentTab;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton clickAddContract;
    private javax.swing.JButton clickAddContract1;
    private javax.swing.JButton clickAddContract2;
    private javax.swing.JButton clickAddNewManagement;
    private javax.swing.JButton clickChooseIcon;
    private javax.swing.JButton clickChooseIcon1;
    private javax.swing.JLabel clickContactList;
    private javax.swing.JButton clickGroupLoad;
    private javax.swing.JButton clickNewContract;
    private javax.swing.JButton clickRefrash;
    private javax.swing.JButton clickSIMOffer;
    private javax.swing.JLabel clickSend;
    private javax.swing.JLabel clickSerch;
    private javax.swing.JLabel clickSerch1;
    private javax.swing.JButton clickUssdDail;
    private javax.swing.JButton clickUssdDailDorSend1;
    private javax.swing.JButton clickUssdSessionClose;
    private javax.swing.JPanel contractListPanel;
    private javax.swing.JLabel currentNetworkName;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel detailsTab;
    private javax.swing.JComboBox<String> dropdownOperatorName;
    private javax.swing.JTextField getAmmountInTk;
    private javax.swing.JTextField getBalenceUssdPartern1;
    private javax.swing.JTextField getBalenceUssdPartern2;
    private javax.swing.JTextField getMobileNumber;
    private javax.swing.JTextField getName;
    private javax.swing.JTextField getNameForSearch;
    private javax.swing.JComboBox<String> getOparetorNameInDropDown;
    private javax.swing.JTextField getOperatorCode;
    private javax.swing.JTextField getOperatorCode1;
    private javax.swing.JTextField getOperatorName;
    private javax.swing.JTextField getOperatorName1;
    private javax.swing.JTextField getPhoneNO;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid;
    private javax.swing.JTextField getRechargeUssdParternPostPaid;
    private javax.swing.JTextField getRechargeUssdParternPostPaid1;
    private javax.swing.JTextField getRechargeUssdParternPrePaid;
    private javax.swing.JTextField getRechargeUssdParternPrePaid1;
    private javax.swing.JComboBox<String> getSelectedSim;
    private javax.swing.JComboBox<String> getSeletedAction;
    private javax.swing.JComboBox<String> getSeletedAction1;
    private javax.swing.JComboBox<String> getSeletedOperatorName;
    private javax.swing.JComboBox<String> getSeletedStorage;
    private javax.swing.JTextField getUssdCode;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel helplinePanel;
    private javax.swing.JPanel helplineTab;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel mobileBankingSettings;
    private javax.swing.JPanel mobileRechargePanel;
    private javax.swing.JPanel mobileRechargeTab;
    private javax.swing.JLabel myProfile;
    private javax.swing.JPanel myProfilePanel;
    private javax.swing.JPanel netBarPanel;
    private javax.swing.JLabel passwordChange;
    private javax.swing.JPanel passwordChangePanel;
    private javax.swing.JPanel rechargeBalencePanel;
    private javax.swing.JPanel rechargeOfferPanel;
    private javax.swing.JLabel rechargeOffers;
    private javax.swing.JLabel rechargeSettings;
    private javax.swing.JPanel rechargeSettingsPanel;
    private javax.swing.JPanel reportGeneratePanel;
    private javax.swing.JPanel resellerPanel;
    private javax.swing.JPanel resellerTab;
    private javax.swing.JLabel selectedSimOperatorIcon;
    private javax.swing.JPanel serchBar;
    private javax.swing.JTextArea setResponseShowFromUssd;
    private javax.swing.JPanel settingBasePanel;
    private javax.swing.JPanel settingTab;
    private javax.swing.JPanel settingsPanel1;
    private javax.swing.JLabel systemBackup;
    private javax.swing.JPanel systemBackupPanel;
    private javax.swing.JTable tableContractLIst;
    private javax.swing.JTable tableRechargeDetailsShow;
    private javax.swing.JTable tableShowSimBalence;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel trustedEmployee;
    private javax.swing.JPanel trustedEmployeePanel;
    private javax.swing.JPanel ussdDialPanel;
    private javax.swing.JTable ussdSettedTable;
    // End of variables declaration//GEN-END:variables

    protected void switchPanelViaMenu(javax.swing.JPanel requestedPanel, JLabel title, JLabel icon, String iconName, String header) {

        colorSwitcherWithHighlight(title, icon, iconName, header);

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

    public void colorSwitcherWithHighlight(JLabel title, JLabel icon, String iconName, String header) {
        ImageIcon image = new ImageIcon(getClass().getResource("/resources/images/" + iconName + ".png"));
        icon.setIcon(image);
        Color color = new Color(133, 47, 209);
        title.setForeground(color);
        headerLabel.setText(header);
    }

    public void colorSwitcherWithRegular(JLabel title, JLabel icon, String iconName) {
        ImageIcon image = new ImageIcon(getClass().getResource("/resources/images/" + iconName + ".png"));
        icon.setIcon(image);
        Color color = new Color(153, 153, 153);
        title.setForeground(color);
    }

    public static void showDeshBoardPage() {
        new Home().setVisible(true);

    }

    private void hover(JPanel panel) {
        Color color = new Color(204, 204, 204);
        panel.setBackground(color);
    }

    private void hoverRemove(JPanel panel) {
        Color color = new Color(255, 255, 255);
        panel.setBackground(color);
    }

//    ---------------------------------- Custom Methods ----------------------------------------------------
    private void recharge() {

        int result = Popup.display("Recharge Confirmation", getMobileNumber.getText(),
                getAmmountInTk.getText() + " tk", getPrepaidOrPostpaid.getSelectedItem().toString(), getSeletedOperatorName.getSelectedItem().toString());

        if (result == Popup.OK) {
            rechargeDoneProcess();
            refrash();
        } else if (result == Popup.EXIT) {
            Icon icon = new ImageIcon(getClass().getResource("/resources/images/default_operator_icon_1.png"));
            selectedSimOperatorIcon.setIcon(icon);
            getMobileNumber.setText("");
            getAmmountInTk.setText("");
            getMobileNumber.requestFocusInWindow();

        }

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

    private void rechargeDoneProcess() {
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

//        if (responseCount == 3) {
//            saveToDbCommandInRechargeAdmin();
//        } else {
//            Popup.error("Try Again\n Something is wrong");
//        }
        initialValueInTableRechargeDetails();
    }

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
        String actionFor = getSeletedAction1.getSelectedItem().toString();
        String balenceUssdPartern = getBalenceUssdPartern2.getText();
        String acPassword = accountPassword1.getText();
        conn = DbConnection.connect();
        String sql = "INSERT INTO command(operator_name,operator_code,action_for,r_ussd_code_pre,r_ussd_code_post,b_s_ussd_code,password,icon) VALUES(?,?,?,?,?,?,?,?)";
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
            switchPanelViaSettings(myProfilePanel,myProfile);
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

            String sql = "INSERT INTO recharge_admin(mobile_no,amount,date_time,status,trx_id,type) VALUES(?,?,?,?,?,?)";
            String computerMacAddress = getMacAddress().replace(":", "");
            try {
                PreparedStatement preparedStatement = conn1.prepareStatement(sql);
                preparedStatement.setString(1, getMobileNumberText);
                preparedStatement.setString(2, getAmmountInTkText);
                preparedStatement.setString(3, dateTime);
                preparedStatement.setString(4, "Success");
                preparedStatement.setString(5, trxId);
                preparedStatement.setString(6, getPrepaidOrPostpaidText);
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
                "Operator Name", "Operator Code", "Action for", "Recharge USSD Code(Prepaind)", "Recharge USSD Code(Postpaind)", "Show Balence Ussd Code", "icon"
            }, 0);
            switchPanelViaSettings(rechargeSettingsPanel,rechargeSettings);

            rs = DbConnection.retrieveAll("command");
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

 

    protected void switchPanelViaMenu(javax.swing.JPanel requestedPanel) {

        basePanel.removeAll();
        basePanel.repaint();
        basePanel.revalidate();

        basePanel.add(requestedPanel);
        basePanel.repaint();
        basePanel.revalidate();

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

    private void setContractListInJTable() {
        int count = 0;
        String contractName = null;
        String contractNumber = null;
        String from = null;

        DefaultTableModel contractListTableMOdel = new DefaultTableModel(new String[]{"No", "Name", "Phone no", "From"}, 0);
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
                contractName = contractPerseDetails[4];
                contractNumber = contractPerseDetails[2];
                from = "SIM";

            }
            contractListTableMOdel.addRow(new Object[]{count++, contractName, contractNumber, from});
        }
        tableContractLIst.setEnabled(false);
        tableContractLIst.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                String selectedNumber;
                Point point = me.getPoint();
                int column = tableContractLIst.columnAtPoint(point);
                int row = tableContractLIst.rowAtPoint(point);
                selectedNumber = tableContractLIst.getValueAt(row, 2).toString();
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
                rs = DbConnection.retrieveAll("command");
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
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                    }
                }
            }
        });

        tableShowSimBalence.setRowHeight(30);
        tableShowSimBalence.setModel(defaultTableModel);
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
        if (responses.length == 3) {
            for (int i = 0; i < responses.length; i++) {
                response = responses[1].replaceAll("\"", "");
            }
            setResponseShowFromUssd.setText(Configaration.haxToStringConvert(response));
        }
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
                String value = com.moniruzzaman.Modem.dialUSSDCode("AT+CUSD=1,\"#xxx#\",15");
                responses = value.split(",");
                // response = Configaration.haxToStringConvert(value[1]);
                System.err.println(value);
                com.moniruzzaman.Modem.disconnect();
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

    private void searchByName(String[] list, String serchValue) {
        DefaultTableModel contractListTableMOdel = new DefaultTableModel(new String[]{"No", "Name", "Phone no", "From"}, 0);
        int count = 0;
        String contractName = null;
        String contractNumber = null;
        String from = null;
        for (String contract : list) {

            String[] contractPerseDetails = contract.replaceAll("\r", "").replaceAll("\n", "").replaceAll("OK", "")
                    .replaceAll("\"", "").split(",");

            for (int i = 1; i < contractPerseDetails.length; i++) {

                if (contractPerseDetails[4].substring(0, 1).toLowerCase().equals(serchValue.toLowerCase())) {
                    contractName = contractPerseDetails[4];
                    contractNumber = contractPerseDetails[2];
                    from = "SIM";
                    contractListTableMOdel.addRow(new Object[]{count++, contractName, contractNumber, from});
                    System.out.println(contractPerseDetails[4]);
                    System.out.println(contractPerseDetails[2]);
                } else if (contractPerseDetails[2].substring(0, 1).toLowerCase().equals(serchValue.toLowerCase())) {
                    contractName = contractPerseDetails[4];
                    contractNumber = contractPerseDetails[2];
                    from = "SIM";
                    contractListTableMOdel.addRow(new Object[]{count++, contractName, contractNumber, from});
                    System.out.println(contractPerseDetails[4]);
                    System.out.println(contractPerseDetails[2]);
                } else if (contractPerseDetails[4].substring(0, 2).toLowerCase().equals(serchValue.toLowerCase())) {
                    contractName = contractPerseDetails[4];
                    contractNumber = contractPerseDetails[2];
                    from = "SIM";
                    contractListTableMOdel.addRow(new Object[]{count++, contractName, contractNumber, from});
                    System.out.println(contractPerseDetails[4]);
                    System.out.println(contractPerseDetails[2]);
                }

            }

        }
        tableContractLIst.setRowHeight(25);
        tableContractLIst.setModel(contractListTableMOdel);
    }

    public void initialValueInTableRechargeDetails() {
        int count = 1;
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"id", "Mobile No", "Type", "Amount(TK)", "Date & Time", "Trx Id", "Status",}, 0);
        try {

            rs = DbConnection.retrieveAll("recharge_admin");
            while (rs.next()) {
                System.err.println(Configaration.getCurrentDateAndTime().substring(0, 8));
                if (Configaration.getCurrentDateAndTime().substring(0, 8).equals(rs.getString("date_time").substring(0, 8))) {
                    defaultTableModel.addRow(new Object[]{count++, rs.getString("mobile_no"),
                        rs.getString("type"), rs.getString("amount"),
                        rs.getString("date_time"), rs.getString("trx_id"),
                        rs.getString("status"), rs.getString("status")});
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
        tableRechargeDetailsShow.setFocusable(false);
        tableRechargeDetailsShow.setRowHeight(30);
        tableRechargeDetailsShow.setModel(defaultTableModel);
    }

    public void setFocusInMobileRechargePanel() {
        getMobileNumber.requestFocusInWindow();
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
    }

    private void refrash() {
        selectedSimOperatorIcon.setIcon(null);
        //getAmmountEachNumber.setText("");
        getAmmountInTk.setText("");
        getBalenceUssdPartern1.setText("");
      //  getBalenceUssdPartern2.setText("");
        getMobileNumber.setText("");
        getName.setText("");
        getNameForSearch.setText("");
        getOperatorCode.setText("");
       // getOperatorCode1.setText("");
        getOperatorName.setText("");
       // getOperatorName1.setText("");
        getPhoneNO.setText("");
       //getRechargeUssdPartern1.setText("");
        getRechargeUssdParternPostPaid.setText("");
       // getSearchViaPhoneNoAndTrnId.setText("");
        getUssdCode.setText("");
        //switchPanelViaMenu(basePanel);

    }

    public void loadActiveOperatorNameInComboBox() {
        ModemInfoList.simOperatorIdentifiers.forEach((simOperatorIdentifierDto) -> {
            getSeletedOperatorName.addItem("robi");
            getSeletedOperatorName.addItem(simOperatorIdentifierDto.getOperatorName().toUpperCase());
        });

    }
}


