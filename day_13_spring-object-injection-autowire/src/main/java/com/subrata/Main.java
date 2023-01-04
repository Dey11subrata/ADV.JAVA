package com.subrata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrata.bean.MyDao;
import com.subrata.service.Service;


public class Main {

	public static void main(String[] args) {
		ApplicationContext appcntx= new ClassPathXmlApplicationContext("config.xml");
	Service service=(Service) appcntx.getBean("serv");
	service.add();
	
	

	}

}
