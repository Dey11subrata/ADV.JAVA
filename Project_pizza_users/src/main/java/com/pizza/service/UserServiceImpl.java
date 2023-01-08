package com.pizza.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.dao.UserDao;
import com.pizza.model.User;




@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void saveUser(User user) {
		userDao.save(user);

	}

	


	@Override
	public List<User> fetchAll() {
		
		return userDao.findAll();
	}




}