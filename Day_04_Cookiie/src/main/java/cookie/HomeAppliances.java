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
@WebServlet("/HomeAppliancesServlet")
public class HomeAppliances extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item1=request.getParameter("item1");
		String item2=request.getParameter("item2");
		String item3=request.getParameter("item3");
		
		if(item1!=null) {
			Cookie c = new Cookie("laptop",item1);
			response.addCookie(c);
		}
		if(item2!=null) {
			Cookie c = new Cookie("laptop",item2);
			response.addCookie(c);
		}
		if(item3!=null) {
			Cookie c = new Cookie("laptop",item3);
			response.addCookie(c);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<title>Home Appliances</title>");
		out.print("<head>");
		out.print("<body>");
		out.print("<form action='BillServlet'>");
		out.print("<h2>Induction:<input type=\"checkbox\" name=\"item1\" value=\"induction\" /></h2>");
		out.print("<h2>Juicer:<input type=\"checkbox\" name=\"item1\" value=\"juicer\" /></h2>");
		out.print("<h2>Toasetr:<input type=\"checkbox\" name=\"item1\" value=\"toaster\" /></h2>");
		out.print("<h2> <button type=\"submit\">Submit</button></h2>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
