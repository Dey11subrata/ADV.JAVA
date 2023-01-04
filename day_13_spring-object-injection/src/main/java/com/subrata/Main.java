package com.subrata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrata.dao.MyDao;



public class Main {

	public static void main(String[] args) {
		ApplicationContext appcntx= new ClassPathXmlApplicationContext("config.xml");
		// get service class obj. form ioc. container
	MyDao mydao=	(MyDao) appcntx.getBean("myColl");
	
	for(String s : mydao.getArr()) {
		System.out.println(s);
	}
	System.out.println("====================================");
	System.out.println(mydao.getList());
	System.out.println("====================================");
	System.out.println(mydao.getSet());
	System.out.println("====================================");
	System.out.println(mydao.getMap());
	System.out.println("====================================");
	System.out.println(mydao.getProps());
	
	}

}
