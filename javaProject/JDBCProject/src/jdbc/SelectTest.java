package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

public static void main(String[] args) {
		
		
		try {
			// DB 연결
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dburl, "hr", "tiger");
			
			// Statement 객체 생성
			Statement stmt = conn.createStatement();
			
			// sql문 작성
			String sql = "select * from dept";
			
			// sql 작업을 ResultSet에 담음
			ResultSet rs = stmt.executeQuery(sql);
			
			
			// ResultSet 객체에서 데이터 추출
			// rs가 다음 데이터가 존재할 때까지 반복
			while(rs.next()) {
				int deptno = rs.getInt(1);	// index 1부터 (zero index 아님)
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
			rs.close();
			conn.close();
			stmt.close();
			
		
		} catch (SQLException e) {
			System.out.println("연결 실패"); 
			e.printStackTrace();
		} 
		
	}
}