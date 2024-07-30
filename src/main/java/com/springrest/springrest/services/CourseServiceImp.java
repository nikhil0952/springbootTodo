package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.utilities.Course;

@Service
public class CourseServiceImp implements CourseService {
	
	public List<Course> l;
	
	

	public CourseServiceImp() {
		l = new ArrayList<>();
		l.add(new Course(1,"Heading 1","Description 1"));
		l.add(new Course(2,"Heading 2","Description 2"));
	}



	@Override
	public List<Course> getCourses() {
		
		return l;
	}
	
	@Override
	public Course getCourse(long courseId) {
		
		for(Course i : l) {
			if(i.getId() == courseId)return i;
		}
		
		return null;
	}



	@Override
	public Course addCourse(Course course) {
		l.add(course);
		return course;
	}



	@Override
	public List<Course> deleteCourse(long courseId) {
		
		for(int i=0; i<l.size(); i++) {
			if(l.get(i).getId() == courseId) {
				l.remove(i);
				break;
			}
		}
		return l;
	}



	@Override
	public List<Course> updateCourse(long courseId, Course courseValue) {
		
		for(int i=0; i<l.size(); i++) {
			if(l.get(i).getId() == courseId) {
				l.set(i, courseValue);
				break;
			}
		}
		
		return l;
	}
	
	
	
	
	

}
