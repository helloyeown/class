package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.TodoInsertService;
import todo.domain.RequestTodo;

@WebServlet("/todo/register")
public class TodoRegistController extends HttpServlet {

	TodoInsertService insertService;
	
	public TodoRegistController() {
		this.insertService = TodoInsertService.getInstance();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoRegistController... doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/registerForm.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoRegistController... doPost()...");
		
		request.setCharacterEncoding("utf-8");
		
		String todo = request.getParameter("todo");
		String duedate = request.getParameter("duedate");
		RequestTodo requestTodo = new RequestTodo(todo, duedate);
		// 폼에서 파라미터 가져와서 객체 생성
		
		int result = insertService.register(requestTodo);
		
		if(result>0) {
			System.out.println("입력 성공...");
		} else {
			System.out.println("입력 실패...");
		}
		
		response.sendRedirect("list");
		
	}

}
