package service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.Todo;
import util.ConnectionProvider;

public class TodoModifyService {

	TodoDAO dao;
	
	private TodoModifyService() {
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoModifyService service = new TodoModifyService();
	
	public static TodoModifyService getInstance() {
		return service;
	}
	
	
	public int modify(Todo todo) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.updateByTno(conn, todo);
			
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
