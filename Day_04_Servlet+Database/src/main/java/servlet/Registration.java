package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		first take data  available in request object
			String nameOfUser = request.getParameter("name");
			String emailOfUser = request.getParameter("email");
			String pswdOfUser = request.getParameter("password");
			
//			if all good data will be received at variables defined above
//			now connect with mysql db and store data there
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false","root","1234");
				
				PreparedStatement s = con.prepareStatement("INSERT INTO REGISTRATION VALUES(?,?,?)");
				s.setString(1, nameOfUser);
				s.setString(2, emailOfUser);
				s.setString(3, pswdOfUser);
				
				int i=s.executeUpdate();
				
				s.close();
				con.close();
						
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println("data sucessfully entered.......");
			response.sendRedirect("login.html");
	}

}

