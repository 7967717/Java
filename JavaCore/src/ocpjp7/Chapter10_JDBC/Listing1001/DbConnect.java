package ocpjp7.Chapter10_JDBC.Listing1001;

/*ocpjp7*/


import java.sql.Connection;
import java.sql.DriverManager;

// The class attempts to acquire a connection with the database
class DbConnect {
    public static void main(String[] args) {
        // url points to jdbc protocol : mysql subprotocol; localhost is the address
        // of the server where we installed our DBMS (i.e. on local machine) and
        // 3306 is the port on which we need to contact our DBMS
        String url = "jdbc:mysql://localhost:3306/";
        // we are connecting to the addressBook database we created earlier
        String database = "addressBook";
        // we login as "root" user with password "mysql123"
        String userName = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection
                (url + database, userName, password)) {
            System.out.println("Database connection: Successful");
        } catch (Exception e) {
            System.out.println("Database connection: Failed");
            e.printStackTrace();
        }

        //  a connection with the HSQLDB database
//        String url = "jdbc:hsqldb:file:";
//        String database = "addressBook";
//        String userName = "SA";
//        String password = "";
//        try (Connection connection = DriverManager.getConnection
//                (url + database, userName, password)) {
//            System.out.println("Database connection: Successful");
//            Statement statement = connection.createStatement();
//            statement.executeQuery("CREATE SCHEMA addressBook AUTHORIZATION sa");
//            statement.executeQuery("DROP TABLE PUBLIC.CONTACT;");
//            statement.executeQuery("DROP SCHEMA PUBLIC.addressBook");
//            statement.executeUpdate("CREATE TABLE PUBLIC.contact\n" +
//                    "(\n" +
//                    "    id INT PRIMARY KEY NOT NULL IDENTITY,\n" +
//                    "    firstName VARCHAR(30) NOT NULL,\n" +
//                    "    lastName VARCHAR(30),\n" +
//                    "    email VARCHAR(30),\n" +
//                    "    phoneNo VARCHAR(13)\n" +
//                    ");");
//        } catch (Exception e) {
//            System.out.println("Database connection: Failed");
//            e.printStackTrace();
//        }

//        //        a connection with the H2 database
//        String url = "jdbc:h2:~/";
//        String database = "addressBook";
//        String userName = "sa";
//        String password = "";
//        try (Connection connection = DriverManager.getConnection
//                (url + database, userName, password)) {
//            System.out.println("Database connection: Successful");
//            Statement statement = connection.createStatement();
//            statement.executeQuery("DROP TABLE addressBook.contact");
//
//        } catch (Exception e) {
//            System.out.println("Database connection: Failed");
//            e.printStackTrace();
//        }
    }
}
