package com.springrest.springrest.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.utilities.Course;


@RestController
public class Mycontroller {
	
	@Autowired
	public CourseService cs;
	
	@GetMapping("/home")
	public String home() {
		
		return "This is home page";
	}
	
	@GetMapping("/course")
	public List<Course> getCourses(){

		return this.cs.getCourses();
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId){

		return this.cs.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		
		return this.cs.addCourse(course);
	}
	
	@DeleteMapping("/course/{courseId}")
	public List<Course> deleteCourse(@PathVariable String courseId){
		
		return this.cs.deleteCourse(Long.parseLong(courseId));
	}
	
	@PutMapping("/course/{courseId}")
	public List<Course> updateCourse(@PathVariable String courseId, @RequestBody Course courseValue){
		
		return this.cs.updateCourse(Long.parseLong(courseId),courseValue);
	}
	
	
}
