package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService {

	DeptDao dao;

	private DeptInsertService() {
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptInsertService service = new DeptInsertService();
	public static DeptInsertService getInstance() {
		return service;
	}
	
	public int insertDept(Dept dept) {
		// RequestDept(domain class) -> dname, loc
		// 데이터 가공
		// 트랜잭션
		
		Connection conn = null;
		int result = 0;
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.insertDept(conn, dept);
			
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
