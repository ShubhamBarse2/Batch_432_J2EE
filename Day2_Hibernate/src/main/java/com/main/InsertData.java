package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class InsertData {

	public static void main(String[] args) {

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
}
