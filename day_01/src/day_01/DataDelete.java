package day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataDelete {

	public static void main(String[] args) {
//		install driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			create connection
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","1234");
			
//			create query statement
			
			Statement s = con.createStatement();
			
//			execute delete query
			int i = s.executeUpdate("delete from student where rollNo=124");
			System.out.println(i+" number of enteries delete");
			
//			close statement
			s.close();
			
//			close connection
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("delete query attempted.......");
	}

}
