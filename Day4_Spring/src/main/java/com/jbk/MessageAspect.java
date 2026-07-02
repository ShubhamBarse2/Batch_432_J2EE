package com.jbk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {

	// Contains Advices :

//	@Before("execution (* com.jbk.Recharge.*(..))")
//	public void beforeMain() {
//		System.out.println("U r pack expriring soon plz recharge ...!");
//	}

//	@After("execution (public void myRecharge())")
//	public void afterMain() {
//		System.out.println("Enjoy ur Data Pack Recharge Successfully ...!");
//	}

	@Around("execution (* com.jbk.Recharge.*(..))")
	public void bothMain(ProceedingJoinPoint p) {
		System.out.println("U r pack expriring soon plz recharge ...!");
		try {
			p.proceed();
		} catch (Throwable e) {
		}
		System.out.println("Enjoy ur Data Pack Recharge Successfully ...!");
	}

}
