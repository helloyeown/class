package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import jdbc.domain.Dept;

public class DeptDao {

	public List<Dept> selectByAll(Connection conn){
		
		List<Dept> result = new ArrayList<>();
		
		String sql = "select * from dept";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				Dept dept = new Dept(deptno, dname, loc);
				result.add(dept);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		} finally {
			
		}
		
		return null;
		
	}

}
