package getpostrequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/postServer")
public class PostRequest extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doGet method handles requests of type get
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.print("response form doPost method");
		out.flush();
		out.close();
	}
}
