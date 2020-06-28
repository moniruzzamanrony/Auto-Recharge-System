
package auto.recharge.system;

public class ErrorDialogUI extends javax.swing.JPanel {
    String mgs;
    public ErrorDialogUI(String mgs) {
        initComponents();
        this.mgs = mgs;
        setSubTitle.setText(mgs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        setSubTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/error_dialog.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 130, 120));

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Try Again !!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, 50));

        setSubTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        setSubTitle.setForeground(new java.awt.Color(0, 0, 0));
        setSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setSubTitle.setText("Something is worr");
        add(setSubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, 50));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel setSubTitle;
    // End of variables declaration//GEN-END:variables
}
