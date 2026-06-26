package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Employee;

public class InsertData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

//		SQL Insert Query --> insert into employee(id,name,city)values(123,'ram','pune');

		String hqlQuery = "insert into Employee(empName,city,MobNo,email)values(:empName,:city,:mobNo,:email)";
		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);	
		query.setParameter("empName", "shyam");
		query.setParameter("city", "nsk");
		query.setParameter("mobNo", 2145678765432l);
		query.setParameter("email", "shyam@gmail.com");
		query.executeUpdate();

		System.out.println("Inserted ...!");
		tr.commit();
		ss.close();

	}
}
