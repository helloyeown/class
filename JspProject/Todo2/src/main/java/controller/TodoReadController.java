package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.TodoReadService;
import todo.domain.Todo;


@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {

	TodoReadService service;
	
	
	public TodoReadController() {
		this.service = TodoReadService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoReadController... doGet()...");
		
		String tnoStr = request.getParameter("no");
		int no = Integer.parseInt(tnoStr);
		
		Todo todo = service.getTodo(no);
		request.setAttribute("todo", todo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/read.jsp");
		dispatcher.forward(request, response);
		
	}


}
