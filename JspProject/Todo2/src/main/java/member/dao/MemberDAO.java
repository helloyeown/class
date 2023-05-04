package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.domain.Member;
import util.ConnectionProvider;

public class MemberDAO {
	
	

	public Member selectByUidPw(Connection conn, String uid, String pw) {

		PreparedStatement pstmt = null;
		Member member = null;
		ResultSet rs = null;

		String sql = "select idx, uid, uname, uphoto from member where uid=? and pw=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				member = new Member(rs.getInt("idx"), rs.getString("uid"),
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
		return member;
	}

	public static void main(String[] args) throws SQLException {
		
		MemberDAO dao = new MemberDAO();
		Connection conn = ConnectionProvider.getConnection();
		
		Member member = dao.selectByUidPw(conn, "cool", "1111");
		System.out.println(member);
		
	}
	
}
