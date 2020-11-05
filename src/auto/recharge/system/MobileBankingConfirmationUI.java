/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author monirozzamanroni
 */
public class MobileBankingConfirmationUI extends javax.swing.JPanel {

    String mgs;
    private int result;

    public MobileBankingConfirmationUI(String heading, String phnNumber, String ammount, String prepaidOrPostPaid, String payBy) {
        initComponents();
      
        setAmmount.setText(ammount);
        setPhnNumber.setText(phnNumber);
        setSimType.setText(prepaidOrPostPaid);
        setPayOpetratorName.setText(payBy);
       
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
        jLabel6 = new javax.swing.JLabel();
        setTitleInRCUI = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        buttomPanel = new javax.swing.JPanel();
        clickClose = new javax.swing.JButton();
        clickEdit = new javax.swing.JButton();
        clickConfirm = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 51, 255)));
        setMaximumSize(new java.awt.Dimension(872, 566));
        setPreferredSize(new java.awt.Dimension(872, 566));

        setPhnNumber.setFont(new java.awt.Font("Cambria", 1, 80)); // NOI18N
        setPhnNumber.setForeground(new java.awt.Color(102, 102, 0));
        setPhnNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setPhnNumber.setText("01XXXXXXXX");

        setAmmount.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        setAmmount.setForeground(new java.awt.Color(204, 51, 0));
        setAmmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setAmmount.setText("00");

        jPanel1.setBackground(new java.awt.Color(133, 47, 209));

        setSimType.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        setSimType.setForeground(new java.awt.Color(255, 255, 255));
        setSimType.setText("Pre-Paid");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Operation Type: ");

        setPayOpetratorName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        setPayOpetratorName.setForeground(new java.awt.Color(255, 255, 255));
        setPayOpetratorName.setText("Banglalink");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pay From:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(setSimType, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPayOpetratorName, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setSimType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setPayOpetratorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setTitleInRCUI.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        setTitleInRCUI.setForeground(new java.awt.Color(133, 47, 209));
        setTitleInRCUI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setTitleInRCUI.setText("Mobile Banking");

        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Confirmation");

        buttomPanel.setBackground(new java.awt.Color(255, 255, 255));

        clickClose.setBackground(new java.awt.Color(255, 51, 51));
        clickClose.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        clickClose.setForeground(new java.awt.Color(255, 255, 255));
        clickClose.setText("Close");

        clickEdit.setBackground(new java.awt.Color(102, 102, 102));
        clickEdit.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        clickEdit.setForeground(new java.awt.Color(255, 255, 255));
        clickEdit.setText("Edit");

        clickConfirm.setBackground(new java.awt.Color(0, 153, 51));
        clickConfirm.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        clickConfirm.setForeground(new java.awt.Color(255, 255, 255));
        clickConfirm.setText("Confirm");
        clickConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttomPanelLayout = new javax.swing.GroupLayout(buttomPanel);
        buttomPanel.setLayout(buttomPanelLayout);
        buttomPanelLayout.setHorizontalGroup(
            buttomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clickConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clickEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(clickClose, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttomPanelLayout.setVerticalGroup(
            buttomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttomPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(buttomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickClose)
                    .addComponent(clickEdit)
                    .addComponent(clickConfirm)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setTitleInRCUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setAmmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setPhnNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setTitleInRCUI, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setPhnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(buttomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public JLabel getSetAmmount() {
        return setAmmount;
    }

    public void setSetAmmount(JLabel setAmmount) {
        this.setAmmount = setAmmount;
    }

    public JLabel getSetPayOpetratorName() {
        return setPayOpetratorName;
    }

    public void setSetPayOpetratorName(JLabel setPayOpetratorName) {
        this.setPayOpetratorName = setPayOpetratorName;
    }

    public JLabel getSetPhnNumber() {
        return setPhnNumber;
    }

    public void setSetPhnNumber(JLabel setPhnNumber) {
        this.setPhnNumber = setPhnNumber;
    }

    public JLabel getSetSimType() {
        return setSimType;
    }

    public void setSetSimType(JLabel setSimType) {
        this.setSimType = setSimType;
    }
    private void displayConfig() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setSize(1366, 768);
       

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttomPanel;
    private javax.swing.JButton clickClose;
    private javax.swing.JButton clickConfirm;
    private javax.swing.JButton clickEdit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel setAmmount;
    private javax.swing.JLabel setPayOpetratorName;
    private javax.swing.JLabel setPhnNumber;
    private javax.swing.JLabel setSimType;
    private javax.swing.JLabel setTitleInRCUI;
    // End of variables declaration//GEN-END:variables
}
