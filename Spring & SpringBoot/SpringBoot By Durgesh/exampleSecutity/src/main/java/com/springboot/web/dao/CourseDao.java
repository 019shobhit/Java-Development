package com.springboot.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
