/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import auto.recharge.system.dto.UserInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author monirozzamanroni
 */
public class DbConnection {

    // private static Connection conn = null;
    public static Connection connect() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Users.sqlite");
            System.out.println("Database Connect Succesful");
            return conn;
        } catch (Exception ex) {
            Log.error("DbConnection:33", ex.getMessage());
        }

        return null;
    }

    public static boolean delete(String tableName) {
        Connection conn = DbConnection.connect();
        String sql = "DELETE FROM " + tableName;

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            boolean isDeleteSuccess = preparedStatement.execute();
            conn.close();
            return isDeleteSuccess;

        } catch (SQLException ex) {
            return false;
        }
    }

//    public static ResultSet retrieveAll1(String tableName) {
//        Connection conn = DbConnection.connect();
//        try {
//            Statement st = conn.createStatement();
//            String sql = "SELECT * FROM " + tableName;
//            ResultSet rs = st.executeQuery(sql);
//            conn.close();
//            return rs;
//        } catch (SQLException ex) {
//            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//
//    }
    public static boolean deleteRow(String tableName, String columeName, String value) {
        Connection conn = DbConnection.connect();
        String sql = "DELETE FROM " + tableName + " WHERE " + columeName + "=\"" + value + "\"";
        try {
            Statement st = conn.createStatement();
            boolean isDelete = st.execute(sql);
            conn.close();
            return isDelete;

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//    public static ResultSet findByColume1(String tableName, String columeName, String value) {
//     
//        try {
//           Connection conn = DbConnection.connect();
//            Statement st = conn.createStatement();
//            String sql = "SELECT * FROM " + tableName + " WHERE " + columeName + "=\"" + value + "\"";
//            ResultSet rs= st.executeQuery(sql);
//            conn.close();
//            return rs;
//        } catch (SQLException ex) {
//            Configaration.setErrorLog("Value Not Found" + ex);
//            return null;
//        }
//    }
    public static void disconnect(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {

            }
        }

    }

}
