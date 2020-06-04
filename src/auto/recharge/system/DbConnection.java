/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import static auto.recharge.system.Mail.getMacAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
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
public class DbConnection {
    private static Connection conn= null;
    
    public static Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:Users.sqlite");
            System.out.println("Database Connect Succesful");
            return conn;
        } catch (Exception ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static boolean delete(String tableName) {
            conn = DbConnection.connect();
            String sql= "DELETE FROM "+tableName;
            
            try {
               PreparedStatement  preparedStatement = conn.prepareStatement(sql);
               return preparedStatement.execute();
               
            } catch (SQLException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            }
            
      
        return false;
    }
}
