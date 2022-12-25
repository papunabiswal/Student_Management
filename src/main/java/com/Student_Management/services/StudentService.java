package com.Student_Management.services;

import java.util.List;

import com.Student_Management.entity.Student;


public interface StudentService {

	List<Student> findAllStudent();

	void saveStudent(Student student);

	Student findStudentByID(long id);

	void deleteStudent(long id);

}
