package auto.recharge.system;

import auto.recharge.system.dto.ModemInfoList;
import auto.recharge.system.dto.UserInfo;
import com.itvillage.AES;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.SwingWorker;

public final class Login extends javax.swing.JFrame {

    private LoadingScreen loadingScreen;
    private JDialog processtingLoderDialog;
    public Login() {
        initComponents();
        URL url = getClass().getResource("/resources/images/icon.png");
        ImageIcon imgicon = new ImageIcon(url);
        this.setIconImage(imgicon.getImage());
        this.setTitle("Auto Recharge System");
        keyListener();
        setHint();
        processingLoderDialog();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        getPasswordBypt = new javax.swing.JPasswordField();
        getPhoneNumber = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginBut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exitBut = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        brandingPanel = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        buyNowText = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(133, 47, 209));
        bg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bg.setForeground(new java.awt.Color(133, 47, 209));

        inputPanel.setBackground(new java.awt.Color(133, 47, 209));
        inputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        getPasswordBypt.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        getPasswordBypt.setText("demo");

        getPhoneNumber.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        getPhoneNumber.setText("demo");
        getPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPhoneNumberActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentX(1.0F);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/user.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/password.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(65, 172, 117));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        loginBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBut.setForeground(new java.awt.Color(255, 255, 255));
        loginBut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBut.setText("Login");
        loginBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButCllick(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(loginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(169, 93, 93));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        exitBut.setBackground(new java.awt.Color(255, 255, 255));
        exitBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitBut.setForeground(new java.awt.Color(255, 255, 255));
        exitBut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBut.setText("Exit");
        exitBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLoginPanel(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBut, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Forgot Password ?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(getPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(getPasswordBypt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel4))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(getPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(getPasswordBypt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel4))
        );

        brandingPanel.setBackground(new java.awt.Color(133, 47, 209));

        appName.setFont(new java.awt.Font("Cambria Math", 3, 30)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setText("Auto Recharge");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("System");

        jSeparator2.setForeground(new java.awt.Color(252, 136, 136));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icon.png"))); // NOI18N

        buyNowText.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        buyNowText.setForeground(new java.awt.Color(204, 204, 204));
        buyNowText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buyNowText.setText("Are you Buy this Software! Buy Now?");
        buyNowText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyingRequest(evt);
            }
        });

        javax.swing.GroupLayout brandingPanelLayout = new javax.swing.GroupLayout(brandingPanel);
        brandingPanel.setLayout(brandingPanelLayout);
        brandingPanelLayout.setHorizontalGroup(
            brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(brandingPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appName)
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandingPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(86, 86, 86))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandingPanelLayout.createSequentialGroup()
                .addComponent(buyNowText, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandingPanelLayout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(129, 129, 129)))
        );
        brandingPanelLayout.setVerticalGroup(
            brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandingPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(brandingPanelLayout.createSequentialGroup()
                        .addComponent(appName)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(buyNowText))
            .addGroup(brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(brandingPanelLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(126, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(brandingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPhoneNumberActionPerformed

    }//GEN-LAST:event_getPhoneNumberActionPerformed

    private void buyingRequest(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyingRequest
        this.setVisible(false);
        BuyNow buyNow = new BuyNow();
        buyNow.setVisible(true);
    }//GEN-LAST:event_buyingRequest

    private void exitLoginPanel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLoginPanel
        System.exit(0);
    }//GEN-LAST:event_exitLoginPanel

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Popup.info("Please,\nCall us to password reset\n" + Configaration.getPropertiesValueByKey("number1") + "," + Configaration.getPropertiesValueByKey("number2"));
    }//GEN-LAST:event_jLabel4MouseClicked

    private void loginButCllick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButCllick

        new Login().setVisible(false);
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                System.out.println("Login Processing..");
                processtingLoderDialog.setVisible(true);
                 login();
                return null;
            }

            @Override
            protected void done() {
                System.out.println("Login Done..");
                processtingLoderDialog.setVisible(false);
            }

        };

        swingWorker.execute();

    }//GEN-LAST:event_loginButCllick


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel appName;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel brandingPanel;
    private static javax.swing.JLabel buyNowText;
    private javax.swing.JLabel exitBut;
    private javax.swing.JPasswordField getPasswordBypt;
    private javax.swing.JTextField getPhoneNumber;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel loginBut;
    // End of variables declaration//GEN-END:variables
//    ---------------------------------- Custom Methods ----------------------------------------------------

    private boolean login() {
        String userId = null;
        String phoneNo = null;
        String password = null;
        String macAddress = null;
        boolean isAuthUser = false;
        Log.mgs("Login", "358");
        if (getPhoneNumber.getText().trim().equals("demo") && getPasswordBypt.getText().trim().equals("demo")) {
            Log.mgs("Login Success for Demo", "");
            isAuthUser = true;
            UserInfo.activePackage = "No Package";
            UserInfo.email = "demo@autorecharge.com";

            UserInfo.shopName = "AR Technology";
            UserInfo.address = "12/A Beshil,Mirpur-1,Dhaka,Bangladesh";
            UserInfo.name = "demo";
            UserInfo.role = "demo";
            UserInfo.userId = "demo";
            UserInfo.phoneNo = "demo";
            UserInfo.password = "demo";
            UserInfo.macAddress = Configaration.getMacAddress().replace(":", "");
            Home home = new Home();
             home.setVisible(true);

        } else {
            try {
                Log.mgs("Login", "360");
                Connection conn = DbConnection.connect();
                String sql = "SELECT * FROM user_info WHERE active_status = 'true'";
                Log.mgs("Login", "362");
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    userId = rs.getString("user_id");
                    phoneNo = rs.getString("phone_no");
                    password = rs.getString("password");
                    macAddress = rs.getString("mac_address");
                    UserInfo.activePackage = rs.getString("active_package");
                    UserInfo.email = rs.getString("email");
                    UserInfo.activeDate = rs.getString("active_date");
                    UserInfo.expireDate = rs.getString("expire_date");
                    UserInfo.activeStatus = rs.getString("active_status");
                    UserInfo.shopName = rs.getString("shop_name");
                    UserInfo.address = rs.getString("address");
                    UserInfo.name = rs.getString("name");
                    UserInfo.role = rs.getString("role");
                    UserInfo.isDeviceReady = false;

                }
                UserInfo.userId = userId;
                UserInfo.phoneNo = phoneNo;
                UserInfo.password = password;
                UserInfo.macAddress = macAddress;
                if (phoneNo == null) {
                    Popup.customError("Licence not found.");
                } else {
                    System.out.println("step 1/12: Login processing start with " + phoneNo);
                    if (getPhoneNumber.getText().trim().equals("")) {
                        getPhoneNumber.setBorder(BorderFactory.createLineBorder(Color.red, 4));
                    }
                    if (getPasswordBypt.getText().trim().equals("")) {
                        getPasswordBypt.setBorder(BorderFactory.createLineBorder(Color.red, 4));
                    } else {
                        if (phoneNo.equals(getPhoneNumber.getText().trim())
                                && AES.decrypt(password, Configaration.getPropertiesValueByKey("secretKey"))
                                        .equals(getPasswordBypt.getText().trim())) {

                            if (isAuthrizeMacAddress(macAddress)) {
                                this.setVisible(false);
                                isAuthUser = true;
                            } else {
                                Popup.error("Unverified Device");
                            }
                            Log.mgs("Login Info", "Success");

                        } else {
                            Log.mgs("Login Info", "Auth Faild");
                            Popup.error("Invalid Phone Number Or Password!!");
                        }

                    }
                }
                new ConfigrarationModemStartUp().setVisible(true);
            } catch (SQLException ex) {
                Log.error("414", ex.getMessage());
            }
        }
        return isAuthUser;
    }

    /**
     * TODO: Verify Serial key validation
     *
     * @param userId
     * @param phoneNO
     * @param macAddress
     * @return
     */
    public boolean isChackSerialValidity(String userId, String phoneNO, String macAddress) {

        return false;
    }

    public static void main(String args[]) {

        Login login = new Login();
        login.setVisible(true);
        //new Login().setVisible(true);
        appName.setText("<html><font color='red'>A</font>uto <font color='red'>R</font>echarge</html>");
        buyNowText.setText("<html>Are you Buy this Software! <u color='yellow'>Buy NOW ?</u></html>");

    }

    public void keyListener() {

        getPhoneNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    getPasswordBypt.requestFocusInWindow();

                }
            }
        });

        getPasswordBypt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            System.out.println("step 2/10: Login processing");
                            processtingLoderDialog.setVisible(true);
                            if (login()) {
                                //    getSIMOperatorInfo();
                                Home home = new Home();
                                home.setVisible(true);
                            } else {
                                new Login().setVisible(false);
                                new ConfigrarationModemStartUp().show();
                            }

                            return null;
                        }

                        @Override
                        protected void done() {
                            System.out.println("step 3/12: Login process successful");

                            processtingLoderDialog.setVisible(false);
                        }

                    };

                    swingWorker.execute();
                }
            }
        });

    }

    private void setHint() {
        getPhoneNumber.setUI(new HintTextFieldUI("Mobile No."));
        getPasswordBypt.setUI(new HintTextFieldUI("Password"));

    }


    private void processingLoderDialog() {

        ProcesseingLoderUI processeingLoderUI = new ProcesseingLoderUI();

        processtingLoderDialog = new JDialog();
        processtingLoderDialog.add(processeingLoderUI);
        processtingLoderDialog.setSize(404, 381);
        processtingLoderDialog.setLocationRelativeTo(null);
        processtingLoderDialog.setUndecorated(true);

    }

    private boolean isAuthrizeMacAddress(String macAddreassFromSQL) {
        boolean isAuthrizeMacAddress = false;

        String computerMacAddress = Configaration.getMacAddress().replace(":", "");
        System.out.println("step 13/13: Login Reguest by " + computerMacAddress);
        if (computerMacAddress.equals(macAddreassFromSQL)) {
            isAuthrizeMacAddress = true;
        }

        return isAuthrizeMacAddress;
    }
    private void getModemPorts() {
        System.out.println("step 4/12: Start Finding Modem port");
        List<String> ports = Modem.getActivePortsList();

        if (ports.isEmpty()) {
            int res = Popup.customError("Modem Not Found..");
            if (res == 0) {
                System.exit(0);
            }
        } else {
            ModemInfoList.portsList = ports;
            System.out.println("step 13/13: Successfully found ports " + ModemInfoList.portsList);
            ModemInfoList.simOperatorIdentifiers = Modem.getSimInfo(ports);
        }

    }
}
