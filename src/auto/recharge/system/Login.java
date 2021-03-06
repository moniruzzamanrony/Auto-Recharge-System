package auto.recharge.system;

import auto.recharge.system.dto.ModemInfoList;
import auto.recharge.system.dto.UserInfo;
import com.itvillage.AES;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.SwingWorker;

public final class Login extends javax.swing.JFrame {

    private LoadingScreen loadingScreen;
    private JDialog processtingLoderDialog;

    public Login() {
        initComponents();
        buyNowText.setText("<html>Are you Buy this Software! <u color='yellow'>Buy NOW ?</u></html>");
        URL url = getClass().getResource("/resources/images/logo64.png");
        ImageIcon imgicon = new ImageIcon(url);
        this.setIconImage(imgicon.getImage());
        this.setTitle("Auto Recharge with Managment");
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
        buyNowText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        getPhoneNumber.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N

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
                loginButMouseClicked(evt);
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
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandingPanelLayout.createSequentialGroup()
                .addComponent(buyNowText, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );
        brandingPanelLayout.setVerticalGroup(
            brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyNowText))
        );

        jPanel3.setBackground(new java.awt.Color(133, 47, 209));

        jLabel5.setBackground(new java.awt.Color(133, 47, 209));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo256.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("For Buy This Software: 01816385858,01913350462");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brandingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brandingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void exitLoginPanel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLoginPanel
        System.exit(0);
    }//GEN-LAST:event_exitLoginPanel

    private void loginButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButMouseClicked

        // Invisible Login Panel
        this.setVisible(false);

        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                System.out.println("Start Login Process");
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

    }//GEN-LAST:event_loginButMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Popup.info("Please,\nCall us to password reset\n" + "01816385858" + "," + "01913350462");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void buyingRequest(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyingRequest
        this.setVisible(false);
        SwingWorker<Void, String> swingWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                System.out.println("Login Processing..");
                processtingLoderDialog.setVisible(true);
                BuyNow buyNow = new BuyNow();
                buyNow.setVisible(true);
                return null;
            }

            @Override
            protected void done() {
                System.out.println("Login Done..");
                processtingLoderDialog.setVisible(false);
            }

        };

        swingWorker.execute();
    }//GEN-LAST:event_buyingRequest


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loginBut;
    // End of variables declaration//GEN-END:variables
//    ---------------------------------- Custom Methods ----------------------------------------------------

    private void login() {
        String userId = null;
        String phoneNo = null;
        String password = null;
        String macAddress = null;

        /*
        If Username and Password is demo then goto demo panel
         */
        if (getPhoneNumber.getText().trim().equals("demo") && getPasswordBypt.getText().trim().equals("demo")) {
            /*
            Push User Information After Login 
             */
            saveLoggedUserInfo("No Package", "demo@autorecharge.com",
                    "AR Technology", "12/A Beshil,Mirpur-1,Dhaka,Bangladesh", "demo",
                    "demo", "demo", "demo", "demo", Configaration.getMacAddress().replace(":", ""), "", "", "", true);

            System.out.println("User Login as DEMO User");
            gotoHomePage();

        } else {
            Connection conn = DbConnection.connect();
            try {

                Statement st = conn.createStatement();
                String sql = "SELECT * FROM `user_info`";

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    userId = rs.getString("user_id");
                    phoneNo = rs.getString("phone_no");
                    password = rs.getString("password");
                    macAddress = rs.getString("mac_address");
                    /*
                        Push User Information After Login 
                     */
                    saveLoggedUserInfo(rs.getString("active_package"),
                            rs.getString("email"), rs.getString("shop_name"),
                            rs.getString("address"), rs.getString("name"),
                            rs.getString("role"), userId, phoneNo, password,
                            macAddress, rs.getString("active_date"),
                            rs.getString("expire_date"), "false", false);

                }

            } catch (SQLException ex) {
                Log.error("414", ex.getMessage());
            } finally {
                DbConnection.disconnect(conn);
            }

            if (phoneNo == null) {
                int res = Popup.customError("Licence not found.");
                if (res == 0) {
                    gotoLoginPage();
                }
            } else {
                if (getPhoneNumber.getText().trim().equals("")) {
                    Popup.error("Phone Number is Empty");

                }
                if (getPasswordBypt.getText().trim().equals("")) {
                    Popup.error("Password is Empty");

                } else {
                    if (phoneNo.equals(getPhoneNumber.getText().trim())
                            && AES.decrypt(password, "itvillage428854")
                                    .equals(getPasswordBypt.getText().trim())) {

                        if (isAuthrizeMacAddress(macAddress)) {
                            System.err.println("Device is valid !!");
                            System.out.println("License  verifing ...");
                            if (Configaration.stringToDateType(UserInfo.expireDate)
                                    .after(Configaration
                                            .stringToDateType(Configaration
                                                    .getCurrentDate()))) {
                                System.out.println("License  verifed ");
                                /*
                                If Login Successful
                                 */
                                gotoHomePage();

                            } else {
                                System.out.println("License  invalid");
                                int res = Popup.customError("Licence Expaired");
                                if (res == 0) {
                                    gotoLoginPage();

                                }
                            }
                        } else {
                            System.err.println("Device is invalid !!");
                            int res = Popup.customError("Unverified Device");
                            if (res == 0) {
                                gotoLoginPage();
                            }
                        }
                        System.err.println("Login Successful");

                    } else {
                        System.err.println("Invalid username and password!!");
                        int res = Popup.customError("Invalid Phone Number Or Password!!");
                        if (res == 0) {
                            gotoLoginPage();
                        }
                    }

                }
            }
        }

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
                            hideLoginPanel();
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
                }
            }
        });

    }

    private void setHint() {
        getPhoneNumber.setUI(new HintTextFieldUI("Mobile No."));
        getPasswordBypt.setUI(new HintTextFieldUI("Password"));

    }

//    private void getModemPorts() {
//        System.out.println("step 4/12: Start Finding Modem port");
//        List<String> ports = Modem.getActivePortsList();
//
//        if (ports.isEmpty()) {
//            int res = Popup.customError("Modem Not Found..");
//            if (res == 0) {
//                Login login = new Login();
//                login.setVisible(true);
//            }
//        } else {
//
//            ModemInfoList.portsList = ports;
//            System.out.println("step 13/13: Successfully found ports " + ModemInfoList.portsList);
//            //ModemInfoList.simOperatorIdentifiers = Modem.getSimInfo(ports);
//
//        }
//
//    }
    private void processingLoderDialog() {

        ProcesseingLoderUI processeingLoderUI = new ProcesseingLoderUI();

        processtingLoderDialog = new JDialog();
        processtingLoderDialog.add(processeingLoderUI);
        processtingLoderDialog.setSize(404, 381);
        processtingLoderDialog.setLocationRelativeTo(null);
        processtingLoderDialog.setUndecorated(true);

    }

    private boolean isAuthrizeMacAddress(String macAddreassFromSQL) {
        System.err.println("Verifing device.....");
        boolean isAuthrizeMacAddress = false;
        String computerMacAddress = Configaration.getMacAddress().replace(":", "");
        if (computerMacAddress.equals(macAddreassFromSQL)) {
            isAuthrizeMacAddress = true;
        }

        return isAuthrizeMacAddress;
    }

    private void hideLoginPanel() {
        this.setVisible(false);
    }

    private void saveLoggedUserInfo(String no_Package, String email,
            String shop_name, String shop_address, String name, String role,
            String userId, String phone_no, String password, String macAddress,
            String activeDate, String expireDate, String activeStatus,
            Boolean isDeviceReady) {

        UserInfo.activePackage = no_Package;
        UserInfo.email = email;
        UserInfo.shopName = shop_name;
        UserInfo.address = shop_address;
        UserInfo.name = name;
        UserInfo.role = role;
        UserInfo.userId = userId;
        UserInfo.phoneNo = phone_no;
        UserInfo.password = password;
        UserInfo.macAddress = macAddress;
        UserInfo.activeDate = activeDate;
        UserInfo.expireDate = expireDate;
        UserInfo.activeStatus = activeStatus;

        UserInfo.isDeviceReady = isDeviceReady;
    }

    private void gotoLoginPage() {
        Login login = new Login();
        login.setVisible(true);
    }

    private void gotoHomePage() {
        Home home = new Home();
        home.setVisible(true);
    }

}
