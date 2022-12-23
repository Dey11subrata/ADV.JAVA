package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Electrical
 */
@WebServlet("/ElectricalServlet")
public class Electrical extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<title>Electrical</title>");
		out.print("<head>");
		out.print("<body>");
		out.print("<form action='ElectronicServlet'>");
		out.print("<h2>Fan:<input type=\"checkbox\" name=\"item1\" value=\"fan\" /></h2>");
		out.print("<h2>Cooler:<input type=\"checkbox\" name=\"item1\" value=\"cooler\" /></h2>");
		out.print("<h2> <button type=\"submit\">Submit</button></h2>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
