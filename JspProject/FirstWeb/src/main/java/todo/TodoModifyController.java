package todo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String count = request.getParameter("count");
		String title = request.getParameter("title");
		String date = request.getParameter("date");

		request.setAttribute("count", count);
		request.setAttribute("title", title);
		request.setAttribute("date", date);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/read.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
