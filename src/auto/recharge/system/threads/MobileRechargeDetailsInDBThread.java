/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.threads;

import auto.recharge.system.Configaration;
import auto.recharge.system.DbConnection;
import auto.recharge.system.Log;
import auto.recharge.system.Mail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monirozzamanroni
 */
public class MobileRechargeDetailsInDBThread extends Thread {

    private String trxId;
    private String getMobileNumberText;
    private String getAmmountInTkText;
    private String getPrepaidOrPostpaidText;
    private String requestedSimOperator;
    private String ckeckRechargeSuccessStatus;
    private String currentBalance;
    private String dateTime;

    public MobileRechargeDetailsInDBThread(String trxId, String getMobileNumberText, String getAmmountInTkText, String getPrepaidOrPostpaidText, String requestedSimOperator, String ckeckRechargeSuccessStatus, String currentBalance) {
        this.trxId = trxId;
        this.getMobileNumberText = getMobileNumberText;
        this.getAmmountInTkText = getAmmountInTkText;
        this.getPrepaidOrPostpaidText = getPrepaidOrPostpaidText;
        this.requestedSimOperator = requestedSimOperator;
        this.ckeckRechargeSuccessStatus = ckeckRechargeSuccessStatus;
        this.currentBalance = currentBalance;
        this.dateTime = Configaration.getCurrentDateAndTime();
    }

    @Override
    public void run() {
       
        Connection conn = DbConnection.connect();
        String sql = "INSERT INTO recharge_admin(mobile_no,amount,date_time,status,trx_id,type,from_sp,current_balance) VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, getMobileNumberText);
            preparedStatement.setString(2, getAmmountInTkText);
            preparedStatement.setString(3, dateTime);
            preparedStatement.setString(4, ckeckRechargeSuccessStatus);
            preparedStatement.setString(5, trxId);
            preparedStatement.setString(6, getPrepaidOrPostpaidText);
            preparedStatement.setString(7, requestedSimOperator);
            preparedStatement.setString(8, currentBalance);
            preparedStatement.execute();
            preparedStatement.close();
            
            

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MobileRechargeDetailsInDBThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
