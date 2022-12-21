package day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInsert {

	public static void main(String[] args) {

		try {
//			install driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Create connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC?useSSL=false","root","1234");
			
//			Create query statement
			Statement s = con.createStatement();
			
//			execute query to insert data into table
			int numOfRowsInserted = s.executeUpdate("insert into student values(122,'Someone x',92.7,'1998-2-23'),(123,'Someone y',94.3,'1995-10-03'),(124,'Someone z',55.55,'1980-2-23')");
			
			System.out.println("number of rows inserted"+numOfRowsInserted);
			
//			close statement 
			s.close();
//			close connection
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("faad k rakh dnegay");

	}

}
