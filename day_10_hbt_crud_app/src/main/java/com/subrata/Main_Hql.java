package com.subrata;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;
import com.subrata.model.Employee;

public class Main_Hql {
	private static SessionFactory sf ; // make sessionfactory static 

		public static void main(String[] args) {
			Configuration cfg = new Configuration(); 
			cfg.configure();
			StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
			ssrb.applySettings(cfg.getProperties());
			StandardServiceRegistry ssr=ssrb.build();
			sf = cfg.buildSessionFactory(ssr);
		
	//	hql queries call
//				selectAll();
//				selectOrder();
//			selectWhere();
//			selectWhereOr();
//			selectWhereBetween();
//			selectWhereLike();
//			selectOneProp();
//			selectMultProp();
//			selectDistinct();
//			selectGroupFun();
			selectGroupBy();
	//		end
	
	
	sf.close(); 
	System.out.println("done");
			
	
		}
	
	

	private static void selectAll() {
		org.hibernate.Session s = sf.openSession();
		Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
		Query q = s.createQuery("from Employee");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
	//		end
		t.commit();
		s.clear();
	}
		private static void selectOrder() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q = s.createQuery("from Employee order by salary ");
			List<Employee> lst = q.list();
			lst.forEach(ele->System.out.println(ele));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectWhere() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q = s.createQuery("from Employee where name= :name");
			q.setString("name", "baburao");
		List<Employee> lst = q.list();
		lst.forEach(emp->System.out.println(emp));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectWhereOr() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q = s.createQuery("from Employee where dept=:dept or name=:name");
			q.setString("dept", "cs");
			q.setString("name", "baburao");
			List<Employee> lst = q.list();
			lst.forEach(emp->System.out.println(emp));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectWhereBetween() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q = s.createQuery("from Employee where salary between :sal1 and :sal2");
			q.setFloat("sal1", 50000);
			q.setFloat("sal2", 5000000);
			List<Employee> lst = q.list();
			lst.forEach(res->System.out.println(res));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectWhereLike() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q = s.createQuery("from Employee where name like :ptrn");
			q.setString("ptrn", "r%");
			List<Employee> lst = q.list();
			lst.forEach(res->System.out.println(res));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectOneProp() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q = s.createQuery("select name from Employee");
			List<String> lst = q.list();
			lst.forEach(res->System.out.println(res));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectMultProp() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q = s.createQuery("select name, dept from Employee");
			List<Object[]> lst = q.list();
			lst.forEach(res->System.out.println(res[0]+"-"+res[1]));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectDistinct() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q = s.createQuery("select distinct(dept) from Employee");
			List<String> lst = q.list();
			lst.forEach(res->System.out.println(res));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectGroupFun() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q  = s.createQuery("select sum(salary) from Employee");
			List<Double> lst =q.list();
			lst.forEach(res->System.out.println(res));
			
	//		end
			t.commit();
			s.clear();
		}
		private static void selectGroupBy() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			Query q  = s.createQuery("select dept, sum(salary) from Employee group by dept");
			List<Object[]> lst = q.list();
			lst.forEach(res->System.out.println(res[0]+" "+res[1]));
	//		end
			t.commit();
			s.clear();
		}
		private static void selectGroupByHaving() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			
	//		end
			t.commit();
			s.clear();
		}
		private static void selectSubquery() {
			org.hibernate.Session s = sf.openSession();
			Transaction t = s.beginTransaction();
	//		codes to be written here
	//		begin
			
	//		end
			t.commit();
			s.clear();
		}
	
	
}
