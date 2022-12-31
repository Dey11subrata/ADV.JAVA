package com.practice.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.practice.Faculty;

public class Main_crud4 {

	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
	ssrb.applySettings(cfg.getProperties());
	StandardServiceRegistry ssr=ssrb.build();
	SessionFactory sf = cfg.buildSessionFactory(ssr);
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	
	Faculty faculty = new Faculty();
	
//	System.out.println(s.get(Faculty.class,3));
	System.out.println(s.load(Faculty.class, 5));// gives exception
	
	
	t.commit();
	s.close();
	sf.close();
	}

}
