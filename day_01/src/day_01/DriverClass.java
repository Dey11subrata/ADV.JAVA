package day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverClass {

	public static void main(String[] args) {
//	loading driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			create connection 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","1234");
//	password error
	
//	create query statement
	Statement s = con.createStatement();
	
//	Execute query
	boolean flag = s.execute("create table Student(rollNo int primary key,name varchar(20),marks float(5,2), dob date)");
	System.out.println(flag);
	
//	close statement
	s.close();
	
//	close connection
	con.close();
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
System.out.println("done");
	}

}
