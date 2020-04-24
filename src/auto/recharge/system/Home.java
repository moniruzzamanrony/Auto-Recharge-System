/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author monirozzamanroni
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form AddOfferAndReseller
     */
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addOfferMenuBerClick = new javax.swing.JLabel();
        billPaymentBut = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        networkBar = new javax.swing.JLabel();
        body_bg = new javax.swing.JLabel();
        body_jpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addOfferMenuBerClick.setText("jLabel1");
        addOfferMenuBerClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOfferMenuBerClickMouseClicked(evt);
            }
        });
        getContentPane().add(addOfferMenuBerClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 230, 40));

        billPaymentBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billPaymentButMouseClicked(evt);
            }
        });
        getContentPane().add(billPaymentBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 40));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Manu.png"))); // NOI18N
        menu.setText("jLabel1");
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 720));

        networkBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/network_bar.png"))); // NOI18N
        getContentPane().add(networkBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 461, 95));

        body_bg.setBackground(new java.awt.Color(255, 255, 255));
        body_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/body_mobile_recharge.png"))); // NOI18N
        body_bg.setText("frgdfgh");
        body_bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(body_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1025, 720));

        body_jpanel.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(body_jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 2, 1025, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void billPaymentButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentButMouseClicked
        
    }//GEN-LAST:event_billPaymentButMouseClicked

    private void addOfferMenuBerClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOfferMenuBerClickMouseClicked
        updateLabel("add_offer_body");
        System.out.println("auto.recharge.system.Home.addOfferMenuBerClickMouseClicked()");
    }//GEN-LAST:event_addOfferMenuBerClickMouseClicked

    /**
     * @param args the command line arguments
     */
    public void showDeshBoardPage() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
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
            //Add this : 
            body_bg.revalidate();
            body_bg.repaint();
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addOfferMenuBerClick;
    private javax.swing.JLabel billPaymentBut;
    private javax.swing.JLabel body_bg;
    private javax.swing.JPanel body_jpanel;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel networkBar;
    // End of variables declaration//GEN-END:variables
}
