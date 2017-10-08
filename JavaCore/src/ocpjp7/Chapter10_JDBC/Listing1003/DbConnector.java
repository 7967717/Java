package ocpjp7.Chapter10_JDBC.Listing1003;
/*ocpjp7*/



import java.sql.*;

// Utility class with method connectToDb() that will be used by other programs in this chapter 
public class DbConnector { 
	public static Connection connectToDb() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String database = "addressBook";
		String userName = "root"; 
		String password = "root";
		return DriverManager.getConnection(url + database, userName, password);  
	}
}