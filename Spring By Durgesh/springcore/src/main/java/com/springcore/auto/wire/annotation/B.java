package com.springcore.auto.wire.annotation;

public class B {
	private String name;
	private String course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "B [name=" + name + ", course=" + course + "]";
	}
	

}
