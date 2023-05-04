package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.TodoDeleteService;


@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {

	TodoDeleteService service;
	
	public TodoDeleteController() {
		this.service = TodoDeleteService.getInstance();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TodoDeleteController... doPost()...");
		
		String tnoStr = request.getParameter("no");
		int no = Integer.parseInt(tnoStr);
		
		int result = service.delete(no);
		
		if(result>0) {
			System.out.println(no + "번이 삭제되었습니다.");
		} else {
			System.out.println("삭제 실패...");
		}
		
		response.sendRedirect("list");
		
	}
}