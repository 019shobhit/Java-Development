package com.springboot.web.entities;

public class Course {
	private long id;
	private String name;
	private String duration;
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(long id, String name, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}

}
