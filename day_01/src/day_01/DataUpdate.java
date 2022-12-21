package day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataUpdate {

	public static void main(String[] args) {
//	load driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			create connection 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","1234");
			
//			create query statement
			Statement s = con.createStatement();
			
//			execute query to update data
			int i = s.executeUpdate("update student set marks=85 where name='Subrata Dey'");
			System.out.println(i+" number of rows updated");
			
//			close statement
			s.close();
			
//			close connection
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("update query test......");

	}

}
