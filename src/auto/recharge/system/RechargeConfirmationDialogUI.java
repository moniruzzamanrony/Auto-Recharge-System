
package auto.recharge.system;

public class RechargeConfirmationDialogUI extends javax.swing.JPanel {
    String mgs;
    public RechargeConfirmationDialogUI(String heading, String phnNumber, String ammount, String prepaidOrPostPaid, String payBy) {
        initComponents();
        setAmmount.setText(ammount);
        setPhnNumber.setText(phnNumber);
        setSimType.setText(prepaidOrPostPaid);
        setPayOpetratorName.setText(payBy);
        
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        setPhnNumber = new javax.swing.JLabel();
        setAmmount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        setSimType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setPayOpetratorName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/alert.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, 120));

        setPhnNumber.setFont(new java.awt.Font("Cambria", 1, 55)); // NOI18N
        setPhnNumber.setForeground(new java.awt.Color(102, 102, 0));
        setPhnNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setPhnNumber.setText("01988851890");
        add(setPhnNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 460, 50));

        setAmmount.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        setAmmount.setForeground(new java.awt.Color(204, 51, 0));
        setAmmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setAmmount.setText("500 TK");
        add(setAmmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 460, 100));

        jPanel1.setBackground(new java.awt.Color(133, 47, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        setSimType.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        setSimType.setForeground(new java.awt.Color(255, 255, 255));
        setSimType.setText("Pre-Paid");
        jPanel1.add(setSimType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pay From:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        setPayOpetratorName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        setPayOpetratorName.setForeground(new java.awt.Color(255, 255, 255));
        setPayOpetratorName.setText("Banglalink");
        jPanel1.add(setPayOpetratorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 190, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 460, 120));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel setAmmount;
    private javax.swing.JLabel setPayOpetratorName;
    private javax.swing.JLabel setPhnNumber;
    private javax.swing.JLabel setSimType;
    // End of variables declaration//GEN-END:variables
}
