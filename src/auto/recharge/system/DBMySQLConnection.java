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
 *
 * @author monirozzamanroni
 */
public class DBMySQLConnection {

    private Connection conn = null;
    private String query = null;
    private String server = "localhost";
    private ResultSet rs;
    private final String url = "jdbc:mysql://" + server + ":3306/auto_recharge_system?useCursorFetch=true";
    //private final String url=("jdbc:mysql://localhost:3306;databaseName=auto_recharge_system");
    private final String usrName = "root";
    private final String pwd = "";

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
