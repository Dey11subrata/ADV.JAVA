package com.sarje.service;

import java.util.List;

import com.sarje.model.Expense.Expense;

public interface ExpenseService {
	void add(Expense expense);
	List<Expense> getAll(int uid);
	void delete(int id);
	Expense getById(int id);
	void modify(Expense expense);
}
