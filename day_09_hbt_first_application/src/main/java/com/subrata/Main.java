package com.subrata;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;
import com.subrata.model.Employee;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration(); 
		cfg.configure();// all the info in cfg file is collected by hibernate.
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder(); //builder classes-  
		ssrb.applySettings(cfg.getProperties());// giving info coll from cfg to builder
		StandardServiceRegistry ssr=ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
	org.hibernate.Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	Employee emp = new Employee(101,"ram",90909.90f, "cs", new Date() );
s.save(emp);
t.commit(); // hibernate is not auto commit- have to commit
s.clear();
sf.close(); 
System.out.println("done");
		

	}

}
