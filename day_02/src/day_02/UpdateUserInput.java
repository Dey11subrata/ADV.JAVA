package day_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class UpdateUserInput {

	public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			System.out.println("enter roll num:");
			int roll=sc.nextInt();
			System.out.println("enter  name:");
			String name = sc.next();
//			sc.nextLine();
//			System.out.println("enter roll marks:");
//			float marks=sc.nextFloat();
//			System.out.println("enter roll dob:");
//			String dob=sc.next();
			
			
			// install driver class
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
//				create connection object
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false","root","1234");
				
//				create query statement
				
				Statement s = con.createStatement();
				
//				execute query
				
				int i = s.executeUpdate("update student set name='"+name+"' where rollNo="+roll+"");
				
				System.out.println(i+" row entered in table student");
//				int i = s.executeUpdate("insert into student values(124,'Someone z',63.36,'1995-4-25')");
				
//				close statement
				s.close();
				
//				close connection
				con.close();
				
//				close scanner
				sc.close();
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("user input entered in table attempted......");
			
				}

}
