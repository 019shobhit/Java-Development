package com.springboot.web.services;

import java.util.List;

import com.springboot.web.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course c);
	public Course updateCourse(Course c);
	public void removeCourse(long courseId);
}
