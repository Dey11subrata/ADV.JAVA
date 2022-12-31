package com.practice.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.practice.Faculty;

public class Main_crud2 {

	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
	ssrb.applySettings(cfg.getProperties());
	StandardServiceRegistry ssr=ssrb.build();
	SessionFactory sf = cfg.buildSessionFactory(ssr);
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	
	Faculty faculty = new Faculty(001);
	
	s.delete(faculty);
	
	t.commit();
	s.close();
	sf.close();
	}

}
