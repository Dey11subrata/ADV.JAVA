package com.sarje.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sarje.conn.MyConn;
import com.sarje.model.Expense.Expense;

public class ExpenseDaoImpl implements ExpenseDao {

	private MyConn myConn;
	
	public ExpenseDaoImpl() {
		myConn=new MyConn();
	}



	@Override
	public void save(Expense expense) {
//		write insert query
//		jdbc connection  required
		try {
			Connection con=myConn.getConn();
			
			PreparedStatement s = con.prepareStatement("insert into expense (item,price,quantity,edate,uid) values (?,?,?,?,?)");
			s.setString(1, expense.getItem());
			s.setFloat(2, expense.getPrice());
			s.setInt(3, expense.getQuantity());
			s.setString(4, expense.getEdate());
			s.setInt(5, expense.getUid());
			
			int i =s.executeUpdate();
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		
		
	}



	@Override
	public List<Expense> selectAll(int uid) {
		// codes to select records
		List<Expense> list = new ArrayList<Expense>();
		try {
			Connection con=myConn.getConn();
			
			PreparedStatement s = con.prepareStatement("select * from expense where uid=?");
		s.setInt(1, uid);
			
			ResultSet rs =s.executeQuery();
			
			while(rs.next()) {
				Expense expense = new Expense();
				expense.setId(rs.getInt(1));
				expense.setItem(rs.getString(2));
				expense.setPrice(rs.getFloat(3));
				expense.setQuantity(rs.getInt(4));
				expense.setEdate(rs.getString(5));
				expense.setUid(rs.getInt(6));
				list.add(expense);
			}
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		return list;
	}



	@Override
	public void deleteById(int id) {
		
		try {
			Connection con=myConn.getConn();
			
			PreparedStatement s = con.prepareStatement("delete from expense where id=?");
		s.setInt(1, id);
			
		int i =s.executeUpdate();
			
			
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
	}



	@Override
	public Expense selectById(int id) {
		
		Expense expense = new Expense();
		try {
			Connection con=myConn.getConn();
			
			PreparedStatement s = con.prepareStatement("select * from expense where id=?");
		s.setInt(1, id);
			
			ResultSet rs =s.executeQuery();
			
			while(rs.next()) {
//				Expense expense = new Expense();
				expense.setId(rs.getInt(1));
				expense.setItem(rs.getString(2));
				expense.setPrice(rs.getFloat(3));
				expense.setQuantity(rs.getInt(4));
				expense.setEdate(rs.getString(5));
				expense.setUid(rs.getInt(6));
//			
			}
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		return expense;
	}



	@Override
	public void update(Expense expense) {
//		updated data is required to enter from here
		

//		write insert query
//		jdbc connection  required
		try {
			Connection con=myConn.getConn();
			
			PreparedStatement s = con.prepareStatement("update expense set item=?, price=?, quantity=?, edate=? where id=?");
			s.setString(1, expense.getItem());
			s.setFloat(2, expense.getPrice());
			s.setInt(3, expense.getQuantity());
			s.setString(4, expense.getEdate());
			s.setInt(5, expense.getId());
			
			int i =s.executeUpdate();
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		
		
	
	}

}
