package day_03_Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/ServletLifeCycleApplicationDemo")
public class ServletLifeCycleApplicationDemo extends HttpServlet {
	static int i=0;
	static int s=0;
	static int d=0;
	@Override
	public void init() throws ServletException {
		System.out.println("int method called.............");
		System.out.println(++i);
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method of HttpServlet called........");
		System.out.println(++s);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method called........");
		System.out.println(++d);
	}
	
}
