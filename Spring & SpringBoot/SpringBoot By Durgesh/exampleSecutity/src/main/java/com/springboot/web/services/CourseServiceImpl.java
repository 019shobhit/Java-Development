package com.springboot.web.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.web.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

    private final List<Course> list;

    public CourseServiceImpl() {
        this.list = new ArrayList<>();
        list.add(new Course(1, "MCA", "2 years"));
        list.add(new Course(2, "BCA", "3 years"));
    }

    @Override
    public List<Course> getCourses() {
        return new ArrayList<>(list); // Return a copy to avoid external modification
    }
}
