package com.Student_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student_Management.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {


}
