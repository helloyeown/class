package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException {
		
    	String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(dbUrl, "hr", "tiger");
		
	}
}
