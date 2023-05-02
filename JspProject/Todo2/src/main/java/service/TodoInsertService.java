package service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.RequestTodo;
import util.ConnectionProvider;

public class TodoInsertService {

	TodoDAO dao;

	private TodoInsertService() {
		this.dao = TodoDAO.getInstance();
	}
	
	private static TodoInsertService service = new TodoInsertService();
	
	public static TodoInsertService getInstance() {
		return service;
	}
	
	
	public int register(RequestTodo todo) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.insertTodo(conn, todo);
			
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
