package com.springboot.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.CourseDao;
import com.springboot.web.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao cd;

    @Override
    public List<Course> getCourses() {
        return cd.findAll();
    }
    
    @Override
	public Course addCourse(Course c) {
		cd.save(c);
		return c;
	}
    
    @Override
    public Course getCourse(long courseId) {
        Optional<Course> course = cd.findById(courseId);
        return course.orElse(null); // Handle the case where the course is not found
    }
    
    @Override
	public Course updateCourse(Course c) {
    	cd.save(c);
        return c;
	}
    
    @Override
    public void removeCourse(long courseId) {
        Optional<Course> course = cd.findById(courseId);
        course.ifPresent(cd::delete); // Handle the case where the course is not found
    }

	

	

	
}
