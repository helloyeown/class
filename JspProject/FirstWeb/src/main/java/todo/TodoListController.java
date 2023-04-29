package todo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");

		String title = request.getParameter("title");
		String date = request.getParameter("date");
		TodoList todo = new TodoList(title, date);

		List<TodoList> list = (List<TodoList>) getServletContext().getAttribute("todoList");
		if(list==null) {
			list = new ArrayList<>();
			getServletContext().setAttribute("todoList", list);
		}

		list.add(todo);
		
		request.setAttribute("list", list);
		dispatcher.forward(request, response);

	}

}
