package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.TodoListService;
import todo.domain.Todo;

@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {

	TodoListService listService;
	
	public TodoListController() {
		this.listService = TodoListService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoListController... doGet()...");
		
		List<Todo> list = listService.getList();
		
		request.setAttribute("todo", list);
		
		String viewPath = "/WEB-INF/views/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
		
	}
}