package jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import jdbc.dao.DeptDao;
import jdbc.domain.Dept;

public class DeptListService {

	DeptDao dao;

	public DeptListService(DeptDao dao) {
		this.dao = dao;
	}
	
	public List<Dept> getDeptList(){
		
		Connection conn = null;
		List<Dept> list = null;
		
		try {
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "hr", "tiger");
			
			conn.setAutoCommit(false);
			
			list = dao.selectByAll(conn);
			
			conn.commit();
			
		} catch (SQLException e) {
			if(conn!=null)
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		DeptListService listService = new DeptListService(new DeptDao());
		
		List<Dept> list = listService.getDeptList();
		
		for(Dept d : list) {
			System.out.println(d);
		}
		
	}
	
}
