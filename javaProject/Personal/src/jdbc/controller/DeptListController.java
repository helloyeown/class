package jdbc.controller;

import java.util.List;

import jdbc.dao.DeptDao;
import jdbc.domain.Dept;
import jdbc.service.DeptListService;

public class DeptListController {

	DeptListService listService;

	public DeptListController() {
		this.listService = new DeptListService(new DeptDao());
	}
	
	
	public void getDeptList() {
		
		List<Dept> result = listService.getDeptList();
		printData(result);
		
	}
	
	void printData(List<Dept> list){
		
		System.out.println("부서리스트 =====================");
		System.out.println("부서번호\t부서이름\t위치");
		System.out.println("=============================");
		
		for(Dept d : list) {
			System.out.println(d.getDeptno() + "\t" + d.getDname() + "\t" + d.getLoc());
		}
		
	}
}
