package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private temp t;
	private List<String> list;
	
	public Person(String name,int id,temp t,List<String> list) {
		this.name = name;
		this.id=id;
		this.t=t;
		this.list=list;
	}

	@Override
	public String toString() {
		return this.name+" : "+this.id+" : "+this.t.name+" .....-> "+list;
	}
	

}
