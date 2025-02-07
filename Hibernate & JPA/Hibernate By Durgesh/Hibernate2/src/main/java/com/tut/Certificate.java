package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private int courseId;
	private String courseName;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Certificate(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
