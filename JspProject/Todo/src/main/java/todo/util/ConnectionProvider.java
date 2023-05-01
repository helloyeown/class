package todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	// service : Dao 메소드에 매개변수로 전달
	public static Connection getConnection() throws SQLException {
		
		String dburl="jdbc:mysql://localhost:3306/project";
		return DriverManager.getConnection(dburl, "himedia", "tiger");
				
	}
	
	public static void main(String[] args) throws SQLException {
		
		// test
		System.out.println(getConnection());
		
	}
	
}