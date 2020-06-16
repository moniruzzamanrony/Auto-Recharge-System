
package auto.recharge.system;

public class InfoDialogUI extends javax.swing.JPanel {
    String mgs;
    public InfoDialogUI(String mgs) {
        initComponents();
        setMgs.setText(mgs);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        setMgs = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/info.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 130, 120));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Info");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, 50));

        setMgs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        setMgs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setMgs.setText("jLabel3");
        add(setMgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, 80));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel setMgs;
    // End of variables declaration//GEN-END:variables
}
