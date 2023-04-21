package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DeptDao;
import domain.Dept;

public class DeptListService {

	// DAO의 기능이 필요해서 객체 생성
	DeptDao dao;
	
	private DeptListService() {
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptListService service = new DeptListService();
	public static DeptListService getInstance() {
		return service;
	}

	public List<Dept> getDeptList(){

		Connection conn = null;
		List<Dept> list = null;
		
        try {
        	// Connection 객체 구하기
        	String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "hr", "tiger");
			
			// 트랜잭션 시작
			conn.setAutoCommit(false);
			
			// DML 작업 (DAO 메소드)
			// insert(conn)
			// update(conn)
			// select(conn)
			// update(conn)
			// insert(conn)
			
			list = dao.selectByAll(conn);
			
			// commit
			conn.commit();
			
		} catch (SQLException e) {
			// 예외 발생 -> rollback
			if(conn!=null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					if(conn!=null)
						try {
							conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
				}
			}
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	public static void main(String[] args) {
		
		DeptListService listService = new DeptListService();
		
		List<Dept> list = listService.getDeptList();
		
		for(Dept d : list) {
			System.out.println(d);
		}
	}
}