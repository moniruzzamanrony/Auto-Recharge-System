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
    private final String USERNAME = "global";
    private final String PASSWORD = "globalGlobal/.,123";
    private Connection conn = null;

    //private final String URL = "jdbc:mysql://localhost:3306/auto_recharge_system?characterEncoding=utf8&useConfigs=maxPerformance";
    private final String URL = "jdbc:mysql://143.198.196.23:3306/auto_recharge_system?characterEncoding=utf8&useConfigs=maxPerformance";
    private ResultSet rs;

    public Connection connect() {
        System.err.println("Connecting...");
        try {
            return conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);


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
