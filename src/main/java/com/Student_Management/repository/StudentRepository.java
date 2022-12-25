package com.Student_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student_Management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
