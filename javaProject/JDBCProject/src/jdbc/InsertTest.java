package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

   public static void main(String[] args) {
      
		try {
			// DB 연결
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dburl, "hr", "tiger");

			// insert sql
			String sql = "insert into dept values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// parameter 설정
			pstmt.setInt(1, 50);
			pstmt.setString(2, "개발팀");
			pstmt.setString(3, "서울");
			
			// int형 result에 업데이트한 데이터를 담음
			int result = pstmt.executeUpdate();

			if(result>0) {		// 업데이트가 됐다면 true
				System.out.println("데이터가 입력되었습니다.");
			}

			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		} 
	}
}