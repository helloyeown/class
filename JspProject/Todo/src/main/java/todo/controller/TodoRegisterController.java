package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// todo 입력 폼 화면 출력
		System.out.println("TodoRegisterController... doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/registerForm.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoRegisterController... doPost()...");
		
		// post 방식의 데이터 전달 -> 파라미터 한글 처리
		request.setCharacterEncoding("UTF-8");
		
		// 입력 폼에서 전달한 데이터를 받아서 처리(redirect)
		String todo = request.getParameter("todo");
		String dueDate = request.getParameter("duedate");
		System.out.println(todo + " : " + dueDate);
		
		// redirect : "list"
		response.sendRedirect("list");	// 외부에서 접속하는 URI
		
	}

}
