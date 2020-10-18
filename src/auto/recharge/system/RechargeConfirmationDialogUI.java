
package auto.recharge.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;

public class RechargeConfirmationDialogUI extends javax.swing.JPanel {
    String mgs;
    private int result;
    public RechargeConfirmationDialogUI(String heading, String phnNumber, String ammount, String prepaidOrPostPaid, String payBy) {
        initComponents();
        setAmmount.setText(ammount);
        setPhnNumber.setText(phnNumber);
        setSimType.setText(prepaidOrPostPaid);
        setPayOpetratorName.setText(payBy);   
        displayConfig();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPhnNumber = new javax.swing.JLabel();
        setAmmount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        setSimType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setPayOpetratorName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        clickClose = new javax.swing.JButton();
        clickConfirm = new javax.swing.JButton();
        clickEdit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 7));
        setForeground(new java.awt.Color(255, 0, 0));

        setPhnNumber.setFont(new java.awt.Font("Cambria", 1, 150)); // NOI18N
        setPhnNumber.setForeground(new java.awt.Color(102, 102, 0));
        setPhnNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setPhnNumber.setText("01988851890");

        setAmmount.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        setAmmount.setForeground(new java.awt.Color(204, 51, 0));
        setAmmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setAmmount.setText("500 TK");

        jPanel1.setBackground(new java.awt.Color(133, 47, 209));

        setSimType.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        setSimType.setForeground(new java.awt.Color(255, 255, 255));
        setSimType.setText("Pre-Paid");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pay From:");

        setPayOpetratorName.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        setPayOpetratorName.setForeground(new java.awt.Color(255, 255, 255));
        setPayOpetratorName.setText("Banglalink");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(setSimType, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(427, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(setPayOpetratorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setPayOpetratorName, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(setSimType, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Kalpurush", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(133, 47, 209));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("অটো রিচার্জ সিস্টেম");

        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));

        clickClose.setBackground(new java.awt.Color(255, 51, 51));
        clickClose.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        clickClose.setForeground(new java.awt.Color(255, 255, 255));
        clickClose.setText("Close");

        clickConfirm.setBackground(new java.awt.Color(0, 153, 51));
        clickConfirm.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        clickConfirm.setForeground(new java.awt.Color(255, 255, 255));
        clickConfirm.setText("Confirm");
        clickConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickConfirmActionPerformed(evt);
            }
        });

        clickEdit.setBackground(new java.awt.Color(102, 102, 102));
        clickEdit.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        clickEdit.setForeground(new java.awt.Color(255, 255, 255));
        clickEdit.setText("Edit");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Confirmation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(clickConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clickEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clickClose, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setPhnNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setAmmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setAmmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setPhnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clickEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clickClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clickConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clickConfirmActionPerformed

    public JButton getClickClose() {
        return clickClose;
    }

    public void setClickClose(JButton clickClose) {
        this.clickClose = clickClose;
    }

    public JButton getClickConfirm() {
        return clickConfirm;
    }

    public void setClickConfirm(JButton clickConfirm) {
        this.clickConfirm = clickConfirm;
    }

    public JButton getClickEdit() {
        return clickEdit;
    }

    public void setClickEdit(JButton clickEdit) {
        this.clickEdit = clickEdit;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clickClose;
    private javax.swing.JButton clickConfirm;
    private javax.swing.JButton clickEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel setAmmount;
    private javax.swing.JLabel setPayOpetratorName;
    private javax.swing.JLabel setPhnNumber;
    private javax.swing.JLabel setSimType;
    // End of variables declaration//GEN-END:variables

public int getResult()
{
return result;
}
    private void displayConfig() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setSize(1366, 768);
       

    }
}
