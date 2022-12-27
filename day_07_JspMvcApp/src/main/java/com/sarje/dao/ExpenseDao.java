package com.sarje.dao;

import com.sarje.model.Expense.Expense;

//DAO - data access object 
public interface ExpenseDao {
// all the methods that are required create them here
	
	void save(Expense expense);
}
