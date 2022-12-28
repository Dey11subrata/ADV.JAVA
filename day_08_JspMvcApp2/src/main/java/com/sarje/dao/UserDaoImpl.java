package com.sarje.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sarje.conn.MyConn;
import com.sarje.model.Expense.User;

public class UserDaoImpl implements UserDao{

	private MyConn myConn;
	
	public UserDaoImpl() {
		myConn = new MyConn();
	}
	@Override
	public void save(User user) {


		try {
		Connection con = myConn.getConn();
				
		PreparedStatement s = con.prepareStatement("insert into user (uname, upassword) values(?,?)");
		
	
		
//		values which are entered in bean class variables are now required to insert in this query into db - use s.setXXX along with getter method.
		
		
	
		s.setString(1, user.getUname());
		s.setString(2, user.getUpassword());
		
		int i = s.executeUpdate();
		
		s.close();
		con.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public void upload(int uid, String image) {
//		// TODO Auto-generated method stub
//		
//	}

}
