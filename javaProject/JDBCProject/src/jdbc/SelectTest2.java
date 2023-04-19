package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) {


		try {
			// DB 연결
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dburl, "hr", "tiger");

			// PreparedStatement 객체 생성
			String sql = "select * from dept where deptno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// parameter 설정
			pstmt.setInt(1, 10);		//1번 물음표에 10 대입

			// sql 작업을 ResultSet에 담음
			ResultSet rs = pstmt.executeQuery();	// 매개변수 X


			if(rs.next()) {
				// 결과값이 1개일 것이 예상되기 때문에 while 대신 if 사용
				System.out.println(
						rs.getInt(1) +"\t"
								+ rs.getString(2) +"\t"
								+ rs.getString(3)
						);
			}

			rs.close();
			conn.close();
			pstmt.close();


		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		} 

	}
}
