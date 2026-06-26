package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Employee;

public class updateData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// update employee set city ='nsk', name = 'Rahul' where id = 34

		String hqlQuery = "update Employee set name=: name , email=:email where id =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("id", 1);
		query.setParameter("name", "Om");
		query.setParameter("email", "om@gmail.com");
		query.executeUpdate();

		System.out.println("updated ...!");
		tr.commit();
		ss.close();

	}
}
