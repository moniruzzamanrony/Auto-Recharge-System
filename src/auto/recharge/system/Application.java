package auto.recharge.system;

public class Application {
    public static void main(String args[]) {

        DbConnection.tableCreate();
        Login login = new Login();
        login.setVisible(true);
        //new Login().setVisible(true);


    }
}
