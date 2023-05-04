package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.domain.MemberDTO;
import todo.util.ConnectionProvider;

public class MemberDAO {

	// 로그인 처리를 위한 select
	// uid, pw 비교해서 처리 -> MemberDTO
	public MemberDTO selectByUidPw(Connection conn, String uid, String pw) {

		MemberDTO memberDTO = null;
		PreparedStatement pstmt = null;
		// 셀렉 결과 테이블 저장
		ResultSet rs = null;

		String sql = "select idx, uid, uname, uphoto from member where uid=? and pw=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);

			rs = pstmt.executeQuery();	
			// 결과 행 갯수 = 0 or 1 (uid가 unique이기 때문에 아이디가 한 개 있거나 아예 없거나)

			if(rs.next()) {
				memberDTO = new MemberDTO(rs.getInt("idx"), rs.getString("uid"), 
						rs.getString("uname"), rs.getString("uphoto"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return memberDTO;
	}
	
	public static void main(String[] args) throws SQLException {
		
		MemberDAO dao = new MemberDAO();
		Connection conn = ConnectionProvider.getConnection();
		
		MemberDTO member = dao.selectByUidPw(conn, "cool", "1111");
		System.out.println(member);
		
	}
}