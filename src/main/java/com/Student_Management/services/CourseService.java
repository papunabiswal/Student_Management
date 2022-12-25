package com.Student_Management.services;

import java.util.List;

import com.Student_Management.entity.Course;

public interface CourseService {

	Course save(Course course);

	List<Course> listAllStudent();

}
