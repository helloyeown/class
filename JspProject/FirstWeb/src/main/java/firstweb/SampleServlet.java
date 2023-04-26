package firstweb;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sample")
public class SampleServlet extends HttpServlet {

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config)" + this);
	}

	public void destroy() {
		System.out.println("destroy().....");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet().....");
	}

}
