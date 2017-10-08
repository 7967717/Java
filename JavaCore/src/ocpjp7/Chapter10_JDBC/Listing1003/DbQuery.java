
/*ocpjp7*/



package ocpjp7.Chapter10_JDBC.Listing1003;

import java.sql.*;

// Program to illustrate how to query a database 
class DbQuery {
    public static void main(String[] args) {
        // Get connection, execute query, get the result set
        // and print the entries from the result rest
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM contact"))
        {
            System.out.println("ID \tfName \tlName \temail \t\tphoneNo");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t"
                        + resultSet.getString("firstName") + "\t"
                        + resultSet.getString("lastName") + "\t"
                        + resultSet.getString("email") + "\t"
                        + resultSet.getString("phoneNo"));
            }

            // from resultSet metadata, find out how many columns are there and then read the column entries
            int numOfColumns = resultSet.getMetaData().getColumnCount();
            System.out.println(numOfColumns);
//            while (resultSet.next()) {
//                // remember that the column index starts from 1 not 0
//                for (int i = 1; i <= numOfColumns; i++) {
//                    // since we do not know the data type of the column, we use getObject()
//                    System.out.print(resultSet.getObject(i) + "\t");
//                }
//                System.out.println("");
//            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}