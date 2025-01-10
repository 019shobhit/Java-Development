package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.entities.Course;
import com.springboot.web.services.CourseService;

@RestController
public class MainController {
	@Autowired
	private CourseService service;

	
	@GetMapping("/home")
	public String home() {
		System.out.println("this is my home page");
		return " home page ";
	}
	
	// create Get mapping of courses
	@GetMapping("/course")
	public List<Course> GetCourses() {
		return this.service.getCourses();
	}
	@GetMapping("/course/{courseId}")
	public Course GetCourse(@PathVariable String courseId) {
		return this.service.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("course")
	public Course addCourse(@RequestBody Course c) {
		return this.service.addCourse(c);
		
	}
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course c) {
		return this.service.updateCourse(c);
	}
	
	@DeleteMapping("course/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.service.removeCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
