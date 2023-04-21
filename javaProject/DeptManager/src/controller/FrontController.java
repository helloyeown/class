package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrontController {

	// 역할: 모든 요청을 받아서 실행 controller 실행 요청
	// -> 실행 contorller 모두 가지고 있어야 함
	
	// 저장 키: 사용자가 선택하는 번호
	// 저장 데이터: controller 구현체
	public Map<Integer, Controller> menu;
//	Controller[] menus;
//	ArrayList<Controller> menus1;
	
	public FrontController() {
		// HashMap 생성
		menu = new HashMap<>();
		
		menu.put(1, DeptListController.getInstance());	// menu.get(1).process()
		menu.put(2, DeptSearchController.getInstance());// menu.get(2).process()
		menu.put(3, DeptInsertController.getInstance());// menu.get(3).process()
		menu.put(4, DeptUpdateController.getInstance());// menu.get(4).process()
		menu.put(5, DeptDeleteController.getInstance());// menu.get(5).process()
	}
	
}