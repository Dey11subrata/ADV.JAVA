package com.subrata.service;

import com.subrata.bean.BeanClass_A;

public class Service {
	// save () of BeanClass_A is to be called here - need object of BeanClass_A
	private BeanClass_A beanClass_A;
	
	public BeanClass_A getBeanClass_A() {
		return beanClass_A;
	}

	public void setBeanClass_A(BeanClass_A beanClass_A) {
		this.beanClass_A = beanClass_A;
	}

	public void add() {
		System.out.println("add method of Service class called.....");
		beanClass_A.save();
	}
}
