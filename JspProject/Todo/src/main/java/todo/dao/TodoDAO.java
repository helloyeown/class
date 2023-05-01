package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.conf.ConnectionPropertiesTransform;
import com.mysql.cj.protocol.Resultset;

import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoDAO {

	// 싱글톤
	// 1. private 생성자
	private TodoDAO() {}

	// 2. 내부에서 TodoDAO인스턴스 생성
	private static TodoDAO dao = new TodoDAO();

	// 3. 외부에서 TodoDAO의 참조값을 얻어갈 수 있는 메소드
	public static TodoDAO getInstance() {
		return dao;
	}
	// 싱글톤 끝


	// TodoDTO 리스트를 반환하는 메소드
	public List<TodoDTO> selectByAll(Connection conn){

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<TodoDTO> list = null;

		String sql = "select * from tbl_todo";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			list = new ArrayList<TodoDTO>();

			while(rs.next()) {
				int tno = rs.getInt("tno");
				String todo = rs.getString("todo");
				String duedate = rs.getString("duedate");
				boolean finished = rs.getBoolean("finished");

				TodoDTO dto = new TodoDTO(tno, todo, duedate, finished);
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}
	
	public static void main(String[] args) throws SQLException {
		
		TodoDAO dao = TodoDAO.getInstance();
		Connection conn = ConnectionProvider.getConnection();
		
		List<TodoDTO> list = dao.selectByAll(conn);
		for(TodoDTO todo : list) {
			System.out.println(todo);
		}
		
	}
}
