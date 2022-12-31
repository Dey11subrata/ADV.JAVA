package com.practice.crud;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.practice.Faculty;

public class Main_crud2 {
	static SessionFactory sf;
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
	ssrb.applySettings(cfg.getProperties());
	StandardServiceRegistry ssr=ssrb.build();
	sf = cfg.buildSessionFactory(ssr);
//	selectAll();
//	selectOrderBy();
//	selectWhere();
//	selectWhereOr();
//	selectWhereAnd();
//	selectCol();
	selectManyCol();
	sf.close();
	}
	
	private static void selectAll() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Faculty"); // name of table is same as class name case sensetive
		List<Faculty> list = q.list();
		list.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
		
	}
	
	private static void selectOrderBy() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Faculty order by name"); 
		List<Faculty> list = q.list();
		list.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
	}
	
	private static void selectWhere() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Faculty where subject= :sub");
		q.setString("sub", "pe");
		List<Faculty> list = q.list();
		list.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
	}
	private static void selectWhereOr() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Faculty where subject= :sub or name= :nm");
		q.setString("sub", "pe");
		q.setString("nm", "nisha");
		List<Faculty> list = q.list();
		list.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
	}
	private static void selectWhereAnd() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Faculty where subject= :sub and name= :nm");
		q.setString("sub", "pe");
		q.setString("nm", "nisha");
		List<Faculty> list = q.list();
		list.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
	}
	private static void selectCol() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select name from Faculty");
		
		List<String> list = q.list();
		list.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
	}
	private static void selectManyCol() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select name, id from Faculty");
		
		List<Object[]> list = q.list();
		list.forEach(res->System.out.println(res[0]+" - "+res[1]));
		
		t.commit();
		s.close();
	}

}
