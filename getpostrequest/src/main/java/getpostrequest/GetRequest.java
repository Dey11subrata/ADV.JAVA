package getpostrequest;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getServer")// same as action attribute value in form of HTML file
//@WebServlet("post")
public class GetRequest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doGet method handles requests of type get
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.print("response form doGet method");
		out.flush();
		out.close();
	}
}
