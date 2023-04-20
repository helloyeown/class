package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {

			PreparedStatement pstmt = null;
			Connection conn = null;

			try {

				String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
				conn = DriverManager.getConnection(dbUrl, "hr", "tiger");

				// 트랜잭션 설정
				conn.setAutoCommit(false);

				// 삭제하는 sql문
				String sql = "delete from dept where deptno=?";
				pstmt = conn.prepareStatement(sql);
				// 첫 번째 물음표의 데이터(deptno)가 50인 값 삭제
				pstmt.setInt(1, 90);
				
				int result = pstmt.executeUpdate();

				if(result==1) {
					System.out.println("데이터가 삭제되었습니다.");
				}

				// 완료 commit
				conn.commit();


			} catch (SQLException e) {
				
				if(conn!=null) {
					try {
						conn.rollback();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				e.printStackTrace();

				
			} finally {

				try {
					if(pstmt != null) {
						pstmt.close();
					}
					if(conn!=null) {
						conn.close();
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}
			} 
		}
	}