package com.subrata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrata.comp.MyBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		
	MyBean mb =	(MyBean) appCntx.getBean("my");
	
	System.out.println(mb.getMsg());

	}

}
