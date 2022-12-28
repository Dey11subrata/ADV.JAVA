package com.sarje.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
//	this class is created to put mysql jdbc connection code.

	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:3306/jdbc?useSSL=false";
	private static final String USER_NAME ="root";
	private static final String PASSWORD ="1234";
	
	private Connection con;
	public Connection getConn() throws ClassNotFoundException, SQLException {
		if(con==null || con.isClosed()) {
			Class.forName(DRIVER_CLASS);
			
				con= DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			}
		return con;

	}

}


//static 
//final
//throws