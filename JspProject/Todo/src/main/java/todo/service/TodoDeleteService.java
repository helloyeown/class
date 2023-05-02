package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.util.ConnectionProvider;

public class TodoDeleteService {

	TodoDAO dao;

	private TodoDeleteService() {
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoDeleteService service = new TodoDeleteService();
	
	public static TodoDeleteService getInstance() {
		return service;
	}
	
	// tno 전달받고 dao delete 메소드에 요청
	public int delete(int tno) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			result = dao.deleteByTno(conn, tno);
			
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
		
		return result;
		
	}
}
