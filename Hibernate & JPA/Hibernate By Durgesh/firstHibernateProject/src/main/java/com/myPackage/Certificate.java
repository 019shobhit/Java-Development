package com.myPackage;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String course;
	private int durstion;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getDurstion() {
		return durstion;
	}
	public void setDurstion(int durstion) {
		this.durstion = durstion;
	}
	public Certificate(String course, int durstion) {
		super();
		this.course = course;
		this.durstion = durstion;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
