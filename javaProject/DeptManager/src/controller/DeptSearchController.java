package controller;

import domain.Dept;
import main.DeptManagerMain;
import service.DeptSearchService;

public class DeptSearchController implements Controller {

	// Service
	DeptSearchService searchService;
	
	private DeptSearchController() {
		this.searchService = DeptSearchService.getInstance();
	}
	
	private static DeptSearchController controller = new DeptSearchController();
	
	public static DeptSearchController getInstance() {
		return controller;
	}

	public void process() {
		
		// 검색할 부서번호를 사용자로부터 받는 화면(view)
		int deptno = getDeptno();
		
		// 처리 결과
		Dept dept = searchService.searchDept(deptno);
		
		// 결과 view 지정
		printData(dept);
		
	}
	
	// 결과 출력 화면
	public void printData(Dept dept) {
		System.out.println("검색 결과");
		System.out.println("--------------------");
		System.out.println("부서번호 : " + dept.getDeptno());
		System.out.println("부서이름 : " + dept.getDname());
		System.out.println("부서위치 : " + dept.getLoc());
		System.out.println("--------------------");
	}
	
	// 사용자로부터 번호를 입력받는 화면
	public int getDeptno() {
		
		System.out.println("검색을 시작합니다.");
		System.out.println("검색할 부서 번호를 입력하세요. >>");
		
		String num =DeptManagerMain.sc.nextLine();
		return Integer.parseInt(num);
	}
	
}
