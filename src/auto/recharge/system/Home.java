
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
        clickClose = new javax.swing.JLabel();
        clickMinimize = new javax.swing.JLabel();
        networkBar = new javax.swing.JLabel();
        menuBody = new javax.swing.JLabel();
        body_bg = new javax.swing.JLabel();

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

        clickClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickCloseMouseClicked(evt);
            }
        });
        getContentPane().add(clickClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 20));

        clickMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(clickMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 30, 20));

        networkBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        getContentPane().add(networkBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        menuBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Manu.png"))); // NOI18N
        menuBody.setText("jLabel1");
        getContentPane().add(menuBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 720));

        body_bg.setBackground(new java.awt.Color(255, 255, 255));
        body_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_my_balence.png"))); // NOI18N
        body_bg.setText("frgdfgh");
        body_bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(body_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1025, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clickMobileRechargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMobileRechargeMouseClicked
        System.out.println("auto.recharge.system.Home.clickMobileRechargeMouseClicked()");
    }//GEN-LAST:event_clickMobileRechargeMouseClicked

    private void clickAddOfferAndResellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAddOfferAndResellerMouseClicked
        updateLabel("add_offer_body");
        System.out.println("auto.recharge.system.Home.addOfferMenuBerClickMouseClicked()");
    }//GEN-LAST:event_clickAddOfferAndResellerMouseClicked

    private void clickBillPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickBillPaymentMouseClicked
        System.out.println("auto.recharge.system.Home.clickBillPaymentMouseClicked()");
    }//GEN-LAST:event_clickBillPaymentMouseClicked

    private void clickMyBalenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMyBalenceMouseClicked
        System.out.println("auto.recharge.system.Home.clickMyBalenceMouseClicked()");
    }//GEN-LAST:event_clickMyBalenceMouseClicked

    private void clickPaymentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickPaymentDetailsMouseClicked
        System.out.println("auto.recharge.system.Home.clickPaymentDetailsMouseClicked()");
    }//GEN-LAST:event_clickPaymentDetailsMouseClicked

    private void clickSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickSettingMouseClicked
        System.out.println("auto.recharge.system.Home.clickSettingMouseClicked()");
    }//GEN-LAST:event_clickSettingMouseClicked

    private void clickCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickCloseMouseClicked
        this.dispose();
        System.out.println("auto.recharge.system.Home.clickCloseMouseClicked()");
    }//GEN-LAST:event_clickCloseMouseClicked

    private void clickMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMinimizeMouseClicked
        System.out.println("auto.recharge.system.Home.clickMinimizeMouseClicked()");
    }//GEN-LAST:event_clickMinimizeMouseClicked

 
    public void showDeshBoardPage() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    protected void updateLabel(String name) {
            ImageIcon imageIcon = new ImageIcon("images/"+name+".png");  
            
            body_bg.setSize(1280, 720);
            body_bg.setIcon(imageIcon);
            body_bg.setText(null);
            body_bg.revalidate();
            body_bg.repaint();     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoggedUserName;
    private javax.swing.JLabel body_bg;
    private javax.swing.JLabel clickAddOfferAndReseller;
    private javax.swing.JLabel clickBillPayment;
    private javax.swing.JLabel clickClose;
    private javax.swing.JLabel clickMinimize;
    private javax.swing.JLabel clickMobileRecharge;
    private javax.swing.JLabel clickMyBalence;
    private javax.swing.JLabel clickPaymentDetails;
    private javax.swing.JLabel clickSetting;
    private javax.swing.JLabel menuBody;
    private javax.swing.JLabel networkBar;
    private javax.swing.JLabel subTitleOfUserName;
    // End of variables declaration//GEN-END:variables
}
