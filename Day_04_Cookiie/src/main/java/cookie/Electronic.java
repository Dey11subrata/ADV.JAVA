package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Electrical
 */
@WebServlet("/ElectronicServlet")
public class Electronic extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String item1 = request.getParameter("item1");
	String item2 = request.getParameter("item2");
	
	if(item1!=null) {
		Cookie c = new Cookie("fan",item1);
		response.addCookie(c);
	}
	if(item2!=null) {
		Cookie c = new Cookie("cooler",item2);
	}
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<title>Electronic</title>");
		out.print("<head>");
		out.print("<body>");
		out.print("<form action='HomeAppliancesServlet'>");
		out.print("<h2>Laptop:<input type=\"checkbox\" name=\"item1\" value=\"laptop\" /></h2>");
		out.print("<h2>Kyboard:<input type=\"checkbox\" name=\"item1\" value=\"keyboard\" /></h2>");
		out.print("<h2>Webcam:<input type=\"checkbox\" name=\"item1\" value=\"webcam\" /></h2>");
		out.print("<h2> <button type=\"submit\">Submit</button></h2>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
