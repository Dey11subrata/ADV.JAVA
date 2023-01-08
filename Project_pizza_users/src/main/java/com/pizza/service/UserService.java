package com.pizza.service;

import java.util.List;

import com.pizza.model.User;



public interface UserService {

	public void saveUser(User user);
//	public User showDetails();
//	public boolean login(User user);
	public List<User> fetchAll();
	
}