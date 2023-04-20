package jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import jdbc.connection.ConnectionProvider;
import jdbc.dao.DeptDao;
import jdbc.domain.Dept;

public class DeptSearchService {

	DeptDao dao;

	public DeptSearchService() {
		this.dao = new DeptDao();
	}

	public Dept searchDept(int deptno) {

		Dept dept = null;

		try {
			Connection conn = ConnectionProvider.getConnection();
			dept = dao.SelctByDeptno(conn, deptno);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dept;

	}
}