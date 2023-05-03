package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.TodoDTO;
import todo.service.TodoViewService;


@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {

	TodoViewService viewService;

	public TodoReadController() {
		this.viewService = TodoViewService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("TodoReadController... doGet()...");

		// 로그인 여부 확인 후 비로그인 상태이면 로그인 페이지로 이동
		HttpSession session = request.getSession();

		// 1. 새로 만들어진 session이 아니고 세션에 로그인 정보가 있다면 로그인 상태
		// 2. 새로 만들어진 세션이거나 세션에 로그인 정보가 없다면 리디렉션 -> 로그인 페이지
		if(session.isNew() || session.getAttribute("loginInfo")==null) {

			System.out.println("로그인 상태가 아닙니다");
			response.sendRedirect("/app/login");

			return;
		}

		
		// 쿠키값 확인
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("uname")) {
				System.out.println(c.getName() + "=" + c.getValue());
			}
		}
		
		
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
