package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee e = context.getBean("e", Employee.class);
//		e.setEmpId(123);
//		e.setName("Ram");
//		e.setCity("nsk");
//		e.setEmail("ram@gmail.com");
		System.out.println(e);
		System.out.println("--------------------");
//		Employee e1 = context.getBean("e", Employee.class);
//		e1.setEmpId(124);
//		e1.setName("raj");
//		e1.setCity("pune");
//		e1.setEmail("raj@gmail.com");
//		System.err.println(e1);

//		System.out.println(e.hashCode());
//		System.out.println(e1.hashCode());
//		System.out.println(e == e1);

	}
}
