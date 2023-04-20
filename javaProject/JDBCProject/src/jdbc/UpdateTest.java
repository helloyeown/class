package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

	public static void main(String[] args) {

		try {

			//oracle연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");

			//insert sql
			String sql = "update dept set dname = ?, loc = ? where deptno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "디자인팀");
			pstmt.setString(2, "제주");
			pstmt.setInt(3, 50);

			int result = pstmt.executeUpdate();

			if(result > 0) {
				System.out.println("데이터가 수정되었습니다.");
			}

			pstmt.close();
			conn.close();

		} 
		catch (SQLException e) {
			//System.out.println("연결 실패.....");
			e.printStackTrace();
		}
	}
}