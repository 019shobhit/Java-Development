package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con =new ClassPathXmlApplicationContext("com/springcore/auto/wire/Config.xml");
		Emp e = con.getBean("emp1",Emp.class);
		System.out.println(e);

	}

}
