package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.TodoDTO;
import todo.service.TodoViewService;


@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
	
	TodoViewService viewService;
	
	public TodoReadController() {
		this.viewService = TodoViewService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 상세보기 페이지는 get 요청에 화면을 보여주는 처리
		// 어떤 todo의 데이터인지 식별할 수 있는 키 데이터 받아서 처리
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// no 값으로 서비스를 통해 todo 정보 받아옴
		TodoDTO todo = viewService.getTodo(no);
		
		request.setAttribute("todo", todo);
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/read.jsp");
		dispatcher.forward(request, response);
		
	}

}
