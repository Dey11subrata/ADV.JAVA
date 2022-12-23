package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Electrical
 */
@WebServlet("/BillServlet")
public class Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> list = new ArrayList<>();
		
		Cookie[] arr = request.getCookies();
		if(arr!=null) {
//			put cookie items into the array list
			for(Cookie c:arr) {
				list.add(c.getValue());
			}
		}
		
		String item1=request.getParameter("item1");
		String item2=request.getParameter("item2"); 
		
		if(item1!=null) {
			list.add(item1);
		}
		
		
		if(item2!=null) {
			list.add(item2);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<title>Home Appliances</title>");
		out.print("<head>");
		out.print("<body>");
		out.print("<form >");
		out.print("<h2>All Items added</h2>");
		for(String s:list) {
			out.print("<h3>"+s+"</h3>");
		}
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
