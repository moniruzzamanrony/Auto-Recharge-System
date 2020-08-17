/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monirozzamanroni
 */
public class DbConnection {

    private static Connection conn = null;

    public static Connection connect() {
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Users.sqlite");
            System.out.println("Database Connect Succesful");
            return conn;
        } catch (Exception ex) {
            Log.error("DbConnection:33", ex.getMessage());
        }
        return conn;
    }

    public static boolean delete(String tableName) {
        conn = DbConnection.connect();
        String sql = "DELETE FROM " + tableName;

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            return preparedStatement.execute();

        } catch (SQLException ex) {
            return false;
        }
    }

    public static ResultSet retrieveAll(String tableName) {
        conn = DbConnection.connect();
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM " + tableName;
            ResultSet rs = st.executeQuery(sql);
           
             return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
       

    }

    public static boolean deleteRow(String tableName, String columeName, String value) {
        conn = DbConnection.connect();
        String sql = "DELETE FROM " + tableName + " WHERE " + columeName + "=\"" + value + "\"";       
        try {
            Statement st = conn.createStatement();
            return st.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static ResultSet findByColume(String tableName, String columeName, String value) {
        conn = DbConnection.connect();
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM " + tableName + " WHERE " + columeName + "=\"" + value + "\"";
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Configaration.setErrorLog("Value Not Found" + ex);
            return null;
        }
    }

    public static void disconnect() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {

            }
        }

    }

}
