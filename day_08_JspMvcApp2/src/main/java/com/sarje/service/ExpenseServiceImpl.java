package com.sarje.service;

import java.util.List;

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


	
	@Override
	public List<Expense> getAll(int uid) {


		return expenseDao.selectAll(uid);
	}


	@Override
	public void delete(int id) {
		expenseDao.deleteById(id);
		
	}


	@Override
	public Expense getById(int id) {
		
		return expenseDao.selectById(id);
	}


	@Override
	public void modify(Expense expense) {
		expenseDao.update(expense);
		
	}

}
