package day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSelect {

	public static void main(String[] args) {
//		install driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","1234");
		
//		create query statement
			Statement s= con.createStatement();
			
//			execute select statement
			
			ResultSet rs = s.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("select query attempted........");
	}

}
