package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con =new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		B b = (B) con.getBean("bref");
		A a = (A) con.getBean("aref");
		System.out.println(b.getY());
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());



	}

}
