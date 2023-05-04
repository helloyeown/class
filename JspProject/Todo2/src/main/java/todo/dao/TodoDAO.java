package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.RequestTodo;
import todo.domain.Todo;
import util.ConnectionProvider;

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


	// 3. read
	public Todo selectByTno(Connection conn, int tno) {

		Todo todo = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from tbl_todo where tno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				todo = new Todo(rs.getInt("tno"), rs.getString("todo"), 
						rs.getString("duedate"), rs.getBoolean("finished"));
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
		return todo;
	}


	// 4. delete
	public int deleteByTno(Connection conn, int tno) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "delete from tbl_todo where tno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return result;
	}	
	
	
	// 5. modify
	public int updateByTno(Connection conn, Todo todo) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "update tbl_todo set todo=?, duedate=?, finished=? where tno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, todo.getTodo());
			pstmt.setString(2, todo.getDuedate());
			pstmt.setBoolean(3, todo.isFinished());
			pstmt.setInt(4, todo.getTno());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public static void main(String[] args) throws SQLException {

		Connection conn = ConnectionProvider.getConnection();

		TodoDAO dao = TodoDAO.getInstance();
		
//		List<Todo> list = dao.selectByAll(conn);

//		int todo = dao.insertTodo(conn, new RequestTodo("청소", "2023-05-05"));
//		System.out.println(todo);

		Todo todo1 = dao.selectByTno(conn, 2);
		System.out.println(todo1);

//		for(Todo todo : list) {
//			System.out.println(todo);
		}
	}

