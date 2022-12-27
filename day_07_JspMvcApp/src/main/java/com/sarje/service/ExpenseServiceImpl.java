package com.sarje.service;

import com.sarje.dao.ExpenseDao;
import com.sarje.dao.ExpenseDaoImpl;
import com.sarje.model.Expense.Expense;

public class ExpenseServiceImpl implements ExpenseService{

	private ExpenseDao expenseDao;
	
	
	public ExpenseServiceImpl() {
		expenseDao = new ExpenseDaoImpl();
	}


	@Override
	public void add(Expense expense) {
	expenseDao.save(expense);
		
	}

}
