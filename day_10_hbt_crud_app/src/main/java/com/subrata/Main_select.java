package com.subrata;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;
import com.subrata.model.Employee;

public class Main_select {

	public static void main(String[] args) {
		Configuration cfg = new Configuration(); 
		cfg.configure();// all the info in cfg file is collected by hibernate.
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder(); //builder classes-  
		ssrb.applySettings(cfg.getProperties());// giving info coll from cfg to builder
		StandardServiceRegistry ssr=ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
	org.hibernate.Session s = sf.openSession();
	Transaction t = s.beginTransaction();

	Employee emp = (Employee) s.get(Employee.class,10);
	System.out.println(emp);
	

t.commit(); // hibernate is not auto commit- have to commit
s.clear();
sf.close(); 
System.out.println("done");
		

	}

}
