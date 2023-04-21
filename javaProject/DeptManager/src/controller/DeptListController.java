package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import service.DeptListService;

public class DeptListController implements Controller {
	
	// 컨트롤러 클래스 :
	// 사용자의 요청을 처리할 Service를 결정하고 요청
	// 요청의 결과를 받아서 사용자에게 보여주는 역할
	
	DeptListService listService;
	
	private DeptListController() {
		this.listService = DeptListService.getInstance();
	}
	
	private static DeptListController controller = new DeptListController();
	
	public static DeptListController getInstance() {
		return controller;
	}


	public void process() {
		// 사용자의 요청을 분석
		// 요청을 처리할 서비스를 이용해서 결과 데이터 받음
		List<Dept> result = listService.getDeptList();
		
		// 사용자에게 응답할 포맷(템플릿, 뷰) 결정, 결과 데이터 전달
		printData(result);
		
	}
	
	// 포맷 만들기
	void printData(List<Dept> list) {
		
		System.out.println("부서리스트 =====================");
		System.out.println("부서번호\t부서이름\t위치");
		System.out.println("=============================");
		for(Dept d : list) {
			System.out.println(d.getDeptno()+"\t"+ d.getDname() + "\t" + d.getLoc());
		}
	}
	
	public static void main(String[] args) {
		
		DeptListController listController = new DeptListController();
		listController.process();
		
	}
}
