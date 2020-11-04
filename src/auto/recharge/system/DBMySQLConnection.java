/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author monirozzamanroni
 */
public class DBMySQLConnection {

    //private final String url=("jdbc:mysql://localhost:3306;databaseName=auto_recharge_system");
    private final String usrName = "arm";
    private final String pwd = "L2#j6^%hcyb_?ABAB";
    private Connection conn = null;
    private String query = null;
    private String server = "http://167.99.76.96";
    private final String url = "jdbc:mysql://167.99.76.96:3306/auto_recharge_system?characterEncoding=utf8&useConfigs=maxPerformance";
    private ResultSet rs;

    public Connection connect() {
        System.err.println("Connecting...");
        try {
            return conn = DriverManager.getConnection(url, usrName, pwd);


        } catch (SQLException e) {

            System.out.println(e.getMessage());
            return conn;

        }

    }

    public void disconnect() {
        try {

            conn.close();
            Log.error("59", "SQL COnnection Close");

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }
}
