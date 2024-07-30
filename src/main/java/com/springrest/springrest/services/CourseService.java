package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.utilities.Course;

@Service
public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public List<Course> deleteCourse(long courseId);
	
	public List<Course> updateCourse(long courseId, Course courseValue);
}
