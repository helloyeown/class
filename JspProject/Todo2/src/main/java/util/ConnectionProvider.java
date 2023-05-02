package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException {

		String dburl = "jdbc:mysql://localhost:3306/project";
		Connection conn = DriverManager.getConnection(dburl, "himedia", "tiger");

		return conn;
	}

	public static void main(String[] args) throws SQLException {

		System.out.println(getConnection());	
	}
}
