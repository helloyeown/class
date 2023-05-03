package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class W2AppListener implements ServletContextListener {

   
    public void contextDestroyed(ServletContextEvent sce)  { 
    	
    	System.out.println("contextDestroyed()...");
    	
    }

    
    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	System.out.println("contextInitialized()...");
    	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql 드라이버 로드");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
    	
    }
	
}
