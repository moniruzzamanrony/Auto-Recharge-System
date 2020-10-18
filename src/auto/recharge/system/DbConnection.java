/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author monirozzamanroni
 */
public class DbConnection {

    // private static Connection conn = null;
    public static Connection connect() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Users.sqlite");
            tableCreate();
            System.out.println("Database Connect Succesful");
            return conn;
        } catch (Exception ex) {
            Log.error("DbConnection:33", ex.getMessage());
        }

        return null;
    }

    private static void tableCreate() {
        List<String> tableCreateSqlQueryList = new ArrayList<>();
        // For user_info table
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS user_info (RecNo integer PRIMARY KEY,	user_id varchar(255),name varchar(255),phone_no varchar(255),shop_name varchar(255),address varchar(255),password varchar(255),active_package varchar(255),mac_address varchar(255),email varchar(255),active_date varchar(255),expire_date varchar(255),active_status varchar(255),role varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS bill_pay_bill_no (RecNo integer PRIMARY KEY,TrxId varchar(255),bill_no varchar(255),time_date varchar(255),c_balance varchar(255),bill_type varchar(255),status varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS bill_payment_customer_id (RecNo integer PRIMARY KEY,	TrxId varchar(255),customer_id varchar(255),bill_month varchar(255),bill_year varchar(255),time_date varchar(255),c_balance varchar(255),bill_type varchar(255),status varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS command (RecNo integer PRIMARY KEY,	operator_name varchar(255),operator_code varchar(255),action_for varchar(255),r_ussd_code_pre varchar(255),b_s_ussd_code varchar(255),icon varchar(255),password varchar(255),r_ussd_code_post varchar(255),profit varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS contract (RecNo integer PRIMARY KEY,	name varchar(255),phone_no varchar(255),memory varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS group_recharge (RecNo integer PRIMARY KEY,	phone_number varchar(255),amount varchar(255),send_by varchar(255),date_time varchar(255),type varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS licenceInfo (RecNo integer PRIMARY KEY,	package_name varchar(255),serial_key varchar(255),activation_date varchar(255),expaired_date varchar(255),mac_address varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS m_b_details (RecNo integer PRIMARY KEY,	service_name varchar(255),action_type varchar(255),phone_no varchar(255),amount varchar(255),sim varchar(255),result varchar(255),date_time varchar(255),request_by varchar(255),TnxId varchar(255),c_balance varchar(255),info varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS contract (RecNo integer PRIMARY KEY,	name varchar(255),phone_no varchar(255),memory varchar(255),shop_name varchar(255),address varchar(255),password varchar(255),active_package varchar(255),mac_address varchar(255),email varchar(255),active_date varchar(255),expire_date varchar(255),active_status varchar(255),role varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS mobile_banking (RecNo integer PRIMARY KEY,	services_name varchar(255),default_sim varchar(255),task_name varchar(255),ussd_code varchar(255),pin varchar(255),serviceId varchar(255),balance_show_ussd varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS product_purchase (RecNo integer PRIMARY KEY,invoice varchar(255),supplier varchar(255),date varchar(255),bar_code varchar(255),group_products varchar(255),pName varchar(255),qty varchar(255),buy_rate varchar(255),sell_rate varchar(255),type varchar(255),subTotal varchar(255),stock_open varchar(255),order_limit varchar(255),warranty varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS product_sell_table (RecNo integer PRIMARY KEY,	id int(255),sell_type varchar(255),bar_code varchar(255),group_products varchar(255),p_name varchar(255),qty varchar(255),price varchar(255),sub_total varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS recharge_admin (RecNo integer PRIMARY KEY,	mobile_no varchar(255),amount varchar(255),date_time varchar(255),status varchar(255),trx_id varchar(255),type varchar(255),from_sp varchar(255),current_balance varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS recharge_offers (RecNo integer PRIMARY KEY,	offer_name varchar(255),recharge_amt varchar(255),validity varchar(255),description varchar(255),sim_name varchar(255));");

        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS sell_table (RecNo integer PRIMARY KEY,	invoice varchar(255),customerId varchar(255),date varchar(255),due_date varchar(255),fName varchar(255),address varchar(255),note varchar(255),mobileNo varchar(255),totalItems varchar(255),return varchar(255),total_amount varchar(255),discount varchar(255),payable varchar(255),paid varchar(255),due_payment varchar(255),due varchar(255),payment_way varchar(255),sellType varchar(255),bar_code varchar(255),group_products varchar(255),p_name varchar(255),qty varchar(255),price varchar(255),sub_total varchar(255),warranty varchar(255),sl varchar(255));");

        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS sms (RecNo integer PRIMARY KEY,	phoneNo varchar(255),time_date varchar(255),sim_name varchar(255),mgs varchar(255));");
        tableCreateSqlQueryList.add("CREATE TABLE IF NOT EXISTS warranty_table (RecNo integer PRIMARY KEY,	invoice varchar(255),customar_id varchar(255),date varchar(255),d_date varchar(255),problem varchar(255),f_name varchar(255),address varchar(255),mobole_no varchar(255),ref_name varchar(255),brand varchar(255),status varchar(255),bill varchar(255),warranty varchar(255),paid varchar(255),discount varchar(255),due varchar(255));");
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Users.sqlite");

            for(String sql: tableCreateSqlQueryList){
                Statement stmt = conn.createStatement();
                stmt.execute(sql);
                stmt.close();
            }
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

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
