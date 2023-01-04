package com.subrata.service;

import com.subrata.bean.MyDao;

public class Service {
	MyDao myDao;
	
	
 public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}

public Service() {
	System.out.println("no arg of service called");
	}

public Service(MyDao myDao) {
	System.out.println("arg of service called");
	
		this.myDao = myDao;
	}

public void add() {
	 myDao.save();
 }
 
}
