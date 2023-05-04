package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.TodoModifyService;
import service.TodoReadService;
import todo.domain.Todo;


@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {

	TodoModifyService modifyService;
	TodoReadService readService;
	
	public TodoModifyController() {
		this.modifyService = TodoModifyService.getInstance();
		this.readService = TodoReadService.getInstance();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoModifyController... doGet()...");
		
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		Todo todo = readService.getTodo(no);
		
		request.setAttribute("todo", todo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/modify.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoModifyController... doPost()...");
		
		String tno = request.getParameter("no");
		String todo = request.getParameter("todo");
		String duedate = request.getParameter("duedate");
		String finished = request.getParameter("finished");
		
		Todo todolist = new Todo(Integer.parseInt(tno), todo, duedate, 
				finished!=null ? finished.equals("on") ? true : false : false);
		
		int result = modifyService.modify(todolist);
		
		if(result>0) {
			System.out.println("수정 완료...");
		} else {
			System.out.println("수정 실패...");
		}
		
		response.sendRedirect("list");
		
	}

}
