package com.subrata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.subrata.model.Employee;

public class Main_Criteria {

	private static SessionFactory sf;
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	
	StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
	
	ssrb.applySettings(cfg.getProperties());
	StandardServiceRegistry ssr = ssrb.build();
	sf=cfg.buildSessionFactory(ssr);
//	method calls for criteria api
	
//	selectAll();
//	selectOrder();
//	selectWhere();
//	selectWhereOr();
//	selectWhereBetween();
//	selectWhereLike();
//	selectOneProp();
//	selectMultiProp();
	selectGroupByFun();
	
	sf.close();
	System.out.println("executed");

	}
	
	private static void selectAll() {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		start Query
		Criteria q = s.createCriteria(Employee.class);
		List<Employee> lst = q.list();
		lst.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
		
		
	}
	private static void selectOrder() {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		start Query
		Criteria q = s.createCriteria(Employee.class);
		q.addOrder(Order.asc("name"));
	
		List<Employee> lst = q.list();
		lst.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
		
		
	}
	private static void selectWhere() {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		start Query
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.eq("dept", "hr"));
		List<Employee> lst = q.list();
		lst.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
		
		
	}
	
	private static void selectWhereOr() {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		start Query
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.or(Restrictions.eq("dept", "hr"),Restrictions.eq("dept", "cs")));
		List<Employee> lst = q.list();
		lst.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
		
		
	}
	private static void selectWhereBetween() {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		start Query
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.between("salary", 100f, 25000f));
		List<Employee> lst = q.list();
		lst.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
		
		
	}
	private static void selectWhereLike() {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		start Query
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.like("name", "s%"));
		List<Employee> lst = q.list();
		lst.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
		
		
	}
	private static void selectOneProp() {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		start Query
		Criteria q = s.createCriteria(Employee.class);
		q.setProjection(Projections.property("name"));
		List<String> lst = q.list();
		lst.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
		
		
	}
	private static void selectMultiProp() {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		start Query
		Criteria q = s.createCriteria(Employee.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("name"));
		plist.add(Projections.property("salary"));
		q.setProjection(plist);
		List<Object[]> lst = q.list();
		lst.forEach(res->System.out.println(res[0]+"-"+res[1]));
		
		t.commit();
		s.close();
		
		
	}
	
	private static void selectGroupByFun() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Criteria q = s.createCriteria(Employee.class);
		q.setProjection(Projections.sum("salary"));
		List<Double> lst = q.list();
		lst.forEach(res->System.out.println(res));
		
		t.commit();
		s.close();
	}
	
	
	

}
