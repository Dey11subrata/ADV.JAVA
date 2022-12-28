package com.sarje.dao;

import java.util.List;

import com.sarje.model.Expense.Expense;

//DAO - data access object 
public interface ExpenseDao {
// all the methods that are required create them here
//	to add entry in database
	void save(Expense expense);
	
//	to select all the records from database
	List<Expense> selectAll(int uid);
	
//	to delete record form database using id
	
	void deleteById(int id);
	
//	step 1: for update select record first
	
	Expense selectById(int id);
	
//	step 2:
	void update(Expense expense);
}
