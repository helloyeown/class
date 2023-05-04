package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.domain.Member;
import member.service.LoginService;


@WebServlet("/todo/login")
public class LoginController extends HttpServlet {

	LoginService service;
	
	public LoginController() {
		this.service = new LoginService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginController... doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/loginForm.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginController... doPost()...");
		
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		String reid = request.getParameter("reid");
		System.out.println("reid: " + reid);
		
		HttpSession session = request.getSession();
		
		Member member = service.login(uid, pw);
		
		if(member!=null) {
			session.setAttribute("loginInfo", member);
			
			if(reid!=null && reid.equals("on")) {
				Cookie cookie = new Cookie("reid", uid);
				cookie.setMaxAge(60*60*24*180);
				cookie.setPath("/");
				response.addCookie(cookie);
				
			} else {
				Cookie cookie = new Cookie("reid", "aa");
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			response.sendRedirect("list");
			return;
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/loginForm.jsp");
		dispatcher.forward(request, response);
		
	}

}