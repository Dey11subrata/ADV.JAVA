package day_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

public class PreparedStatementInsert {

	public static void main(String[] args) {
	// install driver
	// install driver class
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	//						create connection object
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false","root","1234");
	
	//						create query statement
	
	PreparedStatement s = con.prepareStatement("insert into student values (126, 'devika',02.36,'1996-12-09')");
	
//			execute query
			int i = s.executeUpdate();
	//						close statement
	s.close();
	
	//						close connection
	con.close();
	
	//						close scanner
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("PreparedStatement insert......");
	

	}

}
