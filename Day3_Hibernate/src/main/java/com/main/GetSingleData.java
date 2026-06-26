package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class GetSingleData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

//	Sql ->  select * from employee where id = 34

		String hqlQuery = "from Employee where id=:id";
		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		query.setParameter("id", 126);
		Employee e1 = query.getSingleResult();
		System.out.println(e1);

		tr.commit();
		ss.close();

	}
}
