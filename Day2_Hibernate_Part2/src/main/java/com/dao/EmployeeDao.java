package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class EmployeeDao {

	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 125;

		Employee e = ss.get(Employee.class, id);

//		ss.delete(e);
		ss.remove(e);

		System.out.println("Deleted ...!");
		tr.commit();
		ss.close();

	}

	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpId(126);
		e.setName("mukesh");
		e.setCity("nsk");
		e.setEmail("mukesh@gmail.com");
		e.setMobNo(55456789863l);

//		ss.save(e);
		ss.persist(e);

		System.out.println("Inserted ...!");
		tr.commit();
		ss.close();

	}

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 126;

		Employee e = ss.get(Employee.class, id);
		e.setCity("Goa");
		e.setEmail("om@gmail.com");
		e.setMobNo(234567876543l);
		e.setName("om");

//		ss.update(e);
		ss.merge(e);
		System.out.println("updated ...!");
		tr.commit();
		ss.close();

	}

	public void getSingleData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 126;

		Employee e = ss.get(Employee.class, id);

		System.out.println(e);
		tr.commit();
		ss.close();

	}
}
