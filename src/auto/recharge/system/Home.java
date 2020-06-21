/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        rechargePanel = new javax.swing.JPanel();
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
        jTable1 = new javax.swing.JTable();
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
        jLabel20 = new javax.swing.JLabel();
        MobileBankingSettingsPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        rechargeOfferPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        rechargePanel.setBackground(new java.awt.Color(255, 255, 255));
        rechargePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getSeletedOperatorName.setBackground(new java.awt.Color(255, 255, 255));
        getSeletedOperatorName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getSeletedOperatorName.setForeground(new java.awt.Color(204, 0, 0));
        getSeletedOperatorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rechargePanel.add(getSeletedOperatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 180, 116, -1));
        rechargePanel.add(clickSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 200, 50));

        getPrepaidOrPostpaid.setBackground(new java.awt.Color(255, 255, 255));
        getPrepaidOrPostpaid.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getPrepaidOrPostpaid.setForeground(new java.awt.Color(255, 153, 153));
        getPrepaidOrPostpaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Paid", "Post-Paid" }));
        rechargePanel.add(getPrepaidOrPostpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 200, 40));

        getAmmountInTk.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        rechargePanel.add(getAmmountInTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 530, 100));

        getMobileNumber.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        getMobileNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getMobileNumber.setBorder(null);
        rechargePanel.add(getMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 670, 100));
        rechargePanel.add(selectedSimOperatorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 50, 50));

        clickContactList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickContactListMouseClicked(evt);
            }
        });
        rechargePanel.add(clickContactList, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/mobile_recharge_bar.png"))); // NOI18N
        rechargePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 12, 1025, 347));

        rechargeBalencePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Amount panel");

        clickRefrash.setBackground(new java.awt.Color(133, 47, 209));
        clickRefrash.setForeground(new java.awt.Color(255, 255, 255));
        clickRefrash.setText("Refrash");

        jSeparator1.setForeground(new java.awt.Color(133, 47, 209));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
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

        rechargePanel.add(rechargeBalencePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1203, 12, 323, -1));

        clickUssdDail.setBackground(new java.awt.Color(204, 153, 255));
        clickUssdDail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickUssdDail.setForeground(new java.awt.Color(255, 255, 255));
        clickUssdDail.setText("Ussd Dial");
        clickUssdDail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUssdDailActionPerformed(evt);
            }
        });
        rechargePanel.add(clickUssdDail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 59, 116, -1));

        clickGroupLoad.setBackground(new java.awt.Color(153, 153, 255));
        clickGroupLoad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickGroupLoad.setForeground(new java.awt.Color(255, 255, 255));
        clickGroupLoad.setText("Group Load");
        clickGroupLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickGroupLoadActionPerformed(evt);
            }
        });
        rechargePanel.add(clickGroupLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 100, -1, -1));

        clickSIMOffer.setBackground(new java.awt.Color(153, 0, 255));
        clickSIMOffer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clickSIMOffer.setForeground(new java.awt.Color(255, 255, 255));
        clickSIMOffer.setText("SIM Offer");
        clickSIMOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSIMOfferActionPerformed(evt);
            }
        });
        rechargePanel.add(clickSIMOffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 141, 116, -1));

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

        rechargePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 407, 1153, 450));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Today's Recharge");
        rechargePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 365, -1, -1));

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

        rechargePanel.add(reportGeneratePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1203, 602, 323, -1));

        basePanel.add(rechargePanel, "card2");

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

        jLabel20.setText("Recharge Settings panel");

        javax.swing.GroupLayout rechargeSettingsPanelLayout = new javax.swing.GroupLayout(rechargeSettingsPanel);
        rechargeSettingsPanel.setLayout(rechargeSettingsPanelLayout);
        rechargeSettingsPanelLayout.setHorizontalGroup(
            rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel20)
                .addContainerGap(708, Short.MAX_VALUE))
        );
        rechargeSettingsPanelLayout.setVerticalGroup(
            rechargeSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechargeSettingsPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel20)
                .addContainerGap(619, Short.MAX_VALUE))
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
        // TODO add your handling code here:
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
        switchPanelViaMenu(rechargePanel, title, icon, "payment_color", "Mobile Recharge");

        colorSwitcherWithRegular(title1, icon1, "money");
        colorSwitcherWithRegular(title2, icon2, "reseller");
        colorSwitcherWithRegular(title3, icon3, "details");
        colorSwitcherWithRegular(title4, icon4, "settings_1");
        colorSwitcherWithRegular(title5, icon5, "helpline");
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
        // TODO add your handling code here:
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MobileBankingSettingsPanel;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel billPayPanel;
    private javax.swing.JPanel billPaymentTab;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel clickContactList;
    private javax.swing.JButton clickGroupLoad;
    private javax.swing.JButton clickRefrash;
    private javax.swing.JButton clickSIMOffer;
    private javax.swing.JLabel clickSend;
    private javax.swing.JButton clickUssdDail;
    private javax.swing.JLabel currentNetworkName;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel detailsTab;
    private javax.swing.JTextField getAmmountInTk;
    private javax.swing.JTextField getMobileNumber;
    private javax.swing.JComboBox<String> getPrepaidOrPostpaid;
    private javax.swing.JComboBox<String> getSeletedOperatorName;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel mobileBankingSettings;
    private javax.swing.JPanel mobileRechargeTab;
    private javax.swing.JLabel myProfile;
    private javax.swing.JPanel myProfilePanel;
    private javax.swing.JPanel netBarPanel;
    private javax.swing.JLabel passwordChange;
    private javax.swing.JPanel passwordChangePanel;
    private javax.swing.JPanel rechargeBalencePanel;
    private javax.swing.JPanel rechargeOfferPanel;
    private javax.swing.JLabel rechargeOffers;
    private javax.swing.JPanel rechargePanel;
    private javax.swing.JLabel rechargeSettings;
    private javax.swing.JPanel rechargeSettingsPanel;
    private javax.swing.JPanel reportGeneratePanel;
    private javax.swing.JPanel resellerPanel;
    private javax.swing.JPanel resellerTab;
    private javax.swing.JLabel selectedSimOperatorIcon;
    private javax.swing.JPanel settingBasePanel;
    private javax.swing.JPanel settingTab;
    private javax.swing.JPanel settingsPanel1;
    private javax.swing.JLabel systemBackup;
    private javax.swing.JPanel systemBackupPanel;
    private javax.swing.JTable tableRechargeDetailsShow;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel trustedEmployee;
    private javax.swing.JPanel trustedEmployeePanel;
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

}
