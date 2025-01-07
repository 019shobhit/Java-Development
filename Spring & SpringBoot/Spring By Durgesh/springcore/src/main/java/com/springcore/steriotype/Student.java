package com.springcore.steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu")
//@Scope("prototype")
public class Student {
	@Value("44")
	private int id;
	@Value("Shobhit Chauhan")
	private String name;
	@Value("#{l1}")
	private List<String> list;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
}
