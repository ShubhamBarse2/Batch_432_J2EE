package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee e = context.getBean("e", Employee.class);
		System.out.println(e);

//		Department d = context.getBean("dept", Department.class);
//		System.out.println(d);

	}
}
