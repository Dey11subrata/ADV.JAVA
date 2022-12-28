package com.subrata.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
//	declare constants
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc?useSSL=false";
	private static final String USER_NAME = "root";
	private static final String USER_PASSWORD = "1234";
	
//	create a method to get connection object;
	private Connection con;
	
	public Connection getConn() throws SQLException, ClassNotFoundException {
		
		if(con==null || con.isClosed()) {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
		}
		return con;
		
	}

}
