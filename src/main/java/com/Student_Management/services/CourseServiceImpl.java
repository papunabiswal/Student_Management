package com.Student_Management.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Student_Management.entity.Course;
import com.Student_Management.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	private CourseRepository courseRepo;
	public CourseServiceImpl(CourseRepository courseRepo) {
		this.courseRepo=courseRepo;
	}
	
	
	@Override
	public Course save(Course course) {
		Course save = courseRepo.save(course);
		return save;
	}
	@Override
	public List<Course> listAllStudent() {
		List<Course> courses = courseRepo.findAll();
		return courses;
	}

}
