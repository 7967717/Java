package $_just_test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class App01 {

    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn = null;
        Statement stmt = null;

        Class.forName("com.mysql.jdbc.Driver");

//        conn = DriverManager.getConnection();

    }





}
