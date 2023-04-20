package jdbc.controller;

import java.sql.PreparedStatement;

import jdbc.domain.Dept;
import jdbc.main.DeptManagerMain;
import jdbc.service.DeptSearchService;

public class DeptSearchController {

	DeptSearchService searchService;

	public DeptSearchController() {
		this.searchService = new DeptSearchService();
	}
	
	public void searchDept() {
		
		int deptno = getDeptno();
		Dept dept = searchService.searchDept(deptno);
		printData(dept);
		
	}
	
	public void printData(Dept dept) {
		System.out.println("검색 결과");
		System.out.println("--------------------");
		System.out.println("부서번호 : " + dept.getDeptno());
		System.out.println("부서이름 : " + dept.getDname());
		System.out.println("부서위치 : " + dept.getLoc());
		System.out.println("--------------------");
	}
	
	
	public int getDeptno() {
		
		System.out.println("검색을 시작합니다.");
		System.out.println("검색할 부서 번호를 입력하세요. >>");
		
		String num = DeptManagerMain.sc.nextLine();
		return Integer.parseInt(num);
		
	}
	
}
