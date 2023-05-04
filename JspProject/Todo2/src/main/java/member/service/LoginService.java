package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import member.dao.MemberDAO;
import member.domain.Member;
import util.ConnectionProvider;

public class LoginService {

	MemberDAO dao;
	
	public LoginService() {
		this.dao = new MemberDAO();
	}
	
	public Member login(String uid, String pw) {
		
		Member member = null;
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			member = dao.selectByUidPw(conn, uid, pw);
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return member;
	}
}
