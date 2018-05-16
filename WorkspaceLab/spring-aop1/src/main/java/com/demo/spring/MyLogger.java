package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogger {

	@Before("execution(* com..spring.Emp*.reg*(..))")
	public void logBefore() {
		System.out.println("Logging before method call..");
	}

	@AfterReturning(pointcut="execution(* com..spring.Emp*.reg*(..))")
	public void logAfter() {
		System.out.println("Logging after method call..");
	}
}
