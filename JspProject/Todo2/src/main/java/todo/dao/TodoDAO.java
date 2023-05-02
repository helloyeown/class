package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.RequestTodo;
import todo.domain.Todo;

public class TodoDAO {

	private TodoDAO() {}

	private static TodoDAO dao = new TodoDAO();

	public static TodoDAO getInstance() {
		return dao;
	}


	// 1. select
	public List<Todo> selectByAll(Connection conn){

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Todo> list = new ArrayList<>();

		String sql = "select * from tbl_todo";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				int no = rs.getInt("tno");
				String title = rs.getString("todo");
				String duedate = rs.getString("duedate");
				boolean finished = rs.getBoolean("finished");

				Todo todo = new Todo(no, title, duedate, finished);
				list.add(todo);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	
	// 2. insert
	public int insertTodo(Connection conn, RequestTodo todo) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		
		String sql = "insert into tbl_todo (todo, duedate) values (?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, todo.getTodo());
			pstmt.setString(2, todo.getDuedate());
		
			result = pstmt.executeUpdate();
			
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
