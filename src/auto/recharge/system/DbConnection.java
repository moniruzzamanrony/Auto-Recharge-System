/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;
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
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static ResultSet retrieveAll(String tableName) {
        conn = DbConnection.connect();
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM " + tableName;
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static boolean deleteRow(String tableName, String columeName, String value) {
        conn = DbConnection.connect();
        String sql = "DELETE FROM " + tableName + " WHERE " + columeName + "=\"" + value + "\"";
        System.err.println(sql);
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
            String sql = "SELECT * FROM " + tableName+ " WHERE "+columeName+"=\""+value+"\"";
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Configaration.setErrorLog("Value Not Found");
            return null;
        }
    }
}
