package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//	for login it is required to check if details entered by user is correct or not 
//		first from request object fetch details entered by user
		
		String uname = request.getParameter("username");
		String upass = request.getParameter("password");
		
		boolean flag = false;
		
//		connect to database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root",
					"1234");

			PreparedStatement s = con.prepareStatement("select * from registration where email=? and password=?");
			s.setString(1,uname);
			s.setString(2,upass);
			
			ResultSet res=s.executeQuery();
			if(res.next()) {
				flag=true;
			}

			 s.close();
			 con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag) {
			response.sendRedirect("HomeServlet");
		}
		else {
			response.sendRedirect("login.html");
		}
	}
}
