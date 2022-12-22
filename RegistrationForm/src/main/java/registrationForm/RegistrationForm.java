package registrationForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/registrationServlet")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request object contains data in it
//		data from it can be retrieved using request.getParameter("valueOfNameAttributeOftags)
		String username=request.getParameter("uname");
		String password=request.getParameter("upswd");
		String gen=request.getParameter("gender");
		String[] lang=request.getParameterValues("language");
		String add=request.getParameter("address");
		String cty=request.getParameter("city");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h3>"+username+"<h3>");
		out.print("<h3>"+password+"<h3>");
		out.print("<h3>"+gen+"<h3>");
		for(String s:lang)
		out.print("<h3>"+s+"<h3>");
		out.print("<h3>"+add+"<h3>");
		out.print("<h3>"+cty+"<h3>");
		out.flush();
		out.close();
	}

}
