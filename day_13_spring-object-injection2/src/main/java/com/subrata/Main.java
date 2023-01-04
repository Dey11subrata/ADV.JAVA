package com.subrata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrata.service.Service;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appcntx= new ClassPathXmlApplicationContext("config.xml");
		// get service class obj. form ioc. container
		
		Service serv = (Service) appcntx.getBean("service");
		
//		call add method of service class
		serv.add();

	}

}
