package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Dept;

public class DeptDao {
	
	// DAO : sql 실행하는 메소드만 가지는 클래스
	// -> 여러개의 인스턴스가 생성될 필요가 없음
	// -> 싱글톤 처리를 통해 하나의 인스턴스만 사용
	
	// 1. 인스턴스 생성 금지 : private 생성자
	private DeptDao(){
	}
	
	// 2. 클래스 내부에서 인스턴스 생성 : private static
	private static DeptDao dao = new DeptDao();
	
	// 3. 다른 클래스에서 인스턴스를 얻을 수 있는 메소드 : public static
	public static DeptDao getInstance() {
		return dao;
	}
	
	
	// 1. dept list : List<Dept> 출력
	public List<Dept> selectByAll(Connection conn){

		// Connection
		// 1. 메소드 내부에서 Connection을 구하는 방법 (X)
		// -> 트랜잭션 사용 불가
		// 2. DAO 클래스 내부의 인스턴스 변수로 Connection 구하는 방법 (X)
		// -> DAO 싱글톤 처리 불가, Connection을 구하기 위해 인스턴스를 계속 생성해야 함
		// 3. 매개변수로 Connection 구하는 방법 (O)
		// -> Service 클래스의 메소드에서 Connection 생성해서 전달

		// Connection
		// PreparedStatement
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 반환하고자 하는 결과 데이터
		// Collection 클래스 중 List 
		// => 입력 순서와 index를 가짐, 반복문 통해 출력
		List<Dept> result = new ArrayList<>();

		// sql문 작성
		String sql = "select * from dept";

		try {
			pstmt = conn.prepareStatement(sql);

			// executeQuery
			// ResultSet
			rs = pstmt.executeQuery();

			// while
			// executeQuery 결과를 반복문을 통해 List에 추가
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				Dept dept = new Dept(deptno, dname, loc);
				// List<Dept>에 Dept 객체를 추가(한 행씩)
				result.add(dept);

			}

			// result : 4개의 객체를 가지고 있음

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {

			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}

		}

		return result;
	}


	// 2. 부서번호로 검색 기능 (Connection conn, int deptno)
	public Dept selectByDeptno(Connection conn, int deptno) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept result = null;

		// sql
		String sql = "select * from dept where deptno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				result = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
		
	}

	
	// 3. 부서 정보 입력 : deptno, dname, loc
	public int insertDept(Connection conn, Dept dept) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		// insert sql
		String sql = "insert into dept values(?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
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
	
	
	// 4. 부서 정보 수정 : deptno, dname, loc
	public int updateDeptByDeptno(Connection conn, Dept dept) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		// update sql
		String sql = "update dept set dname=?, loc=? where deptno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
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
	

	// 5. 부서 정보 삭제 : deptno -> 삭제할 부서번호
	public int deleteDeptByDeptno(Connection conn, int deptno) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "delete from dept where deptno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
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


	public static void main(String[] args) throws SQLException {

		DeptDao dao = new DeptDao();

		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");

		List<Dept> list = dao.selectByAll(conn);

		for(Dept dept : list) {
			System.out.println(dept);
		}
		
		
		Dept dept = dao.selectByDeptno(conn, 10);
		System.out.println("결과 : " + dept);
		
		
//		int insertResult = dao.insertDept(conn, new Dept(50, "Test", "Seoul"));
//		System.out.println("저장 결과: " + insertResult);
		
		Dept d = new Dept(50, "TTT", "QQQ");	// 수정하고자 하는 부서 정보
		int updateResult = dao.updateDeptByDeptno(conn, d);
		System.out.println(updateResult);
		
	}
}