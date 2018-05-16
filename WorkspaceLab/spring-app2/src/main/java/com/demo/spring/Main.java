package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		//EmpService service = ctx.getBean(EmpService.class);

		EmpService service1 = (EmpService) ctx.getBean("app");

		System.out.println(service1.registerEmployee(100, "Vamsi", "Hyd", 10000));
	}

}
