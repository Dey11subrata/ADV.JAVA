package com.subrata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrata.bean.MyDao;


public class Main {

	public static void main(String[] args) {
		ApplicationContext appcntx= new ClassPathXmlApplicationContext("config.xml");
	MyDao dao=	(MyDao) appcntx.getBean("myDao");
	System.out.println(dao.getId());
	System.out.println(dao.getMsg());
	MyDao dao1=	(MyDao) appcntx.getBean("myDao1"); // after mentioning value of index attribute in constructor-arg tag.
	System.out.println(dao1.getId());
	System.out.println(dao1.getMsg());
	

	}

}
