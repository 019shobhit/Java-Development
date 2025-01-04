package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	@Autowired
	private B obj;

	public B getObj() {
		return obj;
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

	public A(B obj) {
		super();
		this.obj = obj;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [obj=" + obj + "]";
	}

	
	

}
