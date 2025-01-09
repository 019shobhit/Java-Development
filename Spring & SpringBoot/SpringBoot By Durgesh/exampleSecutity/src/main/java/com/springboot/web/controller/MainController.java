package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.entities.Course;
import com.springboot.web.services.CourseService;
import com.springboot.web.services.CourseServiceImpl;

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
	public List<Course> GetCourses() {
		return this.service.getCourses();
	}
}
