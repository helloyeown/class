package service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.Todo;
import util.ConnectionProvider;

public class TodoReadService {

	TodoDAO dao;
	
	private TodoReadService() {
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoReadService service = new TodoReadService();
	
	public static TodoReadService getInstance() {
		return service;
	}
	
	
	public Todo getTodo(int tno) {
		
		Connection conn = null;
		Todo todo = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			todo = dao.selectByTno(conn, tno);
			
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
		return todo;
	}
	
}
