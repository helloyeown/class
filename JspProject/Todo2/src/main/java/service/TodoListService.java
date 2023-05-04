package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import todo.dao.TodoDAO;
import todo.domain.Todo;
import util.ConnectionProvider;

public class TodoListService {

	TodoDAO dao;

	private TodoListService() {
		this.dao = TodoDAO.getInstance();
	}

	private static TodoListService service = new TodoListService();

	public static TodoListService getInstance() {
		return service;
	}

	public List<Todo> getList(){

		Connection conn = null;
		List<Todo> list = null;

		try {
			conn = ConnectionProvider.getConnection();
			list = dao.selectByAll(conn);

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
		return list;
	}
	
	public static void main(String[] args) {
		
		TodoListService service = TodoListService.getInstance();
		List<Todo> list = service.getList();
		
		for(Todo todo : list) {
			System.out.println(todo);
		}
		
	}
}
