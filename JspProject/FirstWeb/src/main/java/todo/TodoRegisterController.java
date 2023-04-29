package todo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//		request.setAttribute("todo", "투두리스트");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String title = request.getParameter("title");
		String date = request.getParameter("date");

//		if(title==null || date==null) {
//			request.setAttribute("errorMessage", "제목과 날짜를 모두 입력해주세요.");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
//			dispatcher.forward(request, response);
//			return;
//		}

		TodoList todo = new TodoList(title, date);

		List<TodoList> list = (List<TodoList>) request.getServletContext().getAttribute("todoList");
		if(list==null) {
			list = new ArrayList<TodoList>();
			request.setAttribute("todoList", list);
		}
		//		todoList라는 이름의 컬렉션을 검색해서 없으면 컬렉션을 생성하고
		//		"todoList"라는 이름으로 속성에 list 컬렉션을 담음

		list.add(todo);
		getServletContext().setAttribute("list", list);
		//		list에 TodoList 객체 추가하고 "list" 라는 이름으로 list 객체 담음


		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
		dispatcher.forward(request, response);


	}

}
