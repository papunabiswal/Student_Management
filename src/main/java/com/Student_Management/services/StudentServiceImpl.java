package com.Student_Management.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Student_Management.entity.Student;
import com.Student_Management.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {
	
    private StudentRepository studentRepo;
	
	public StudentServiceImpl(StudentRepository studentRepo) {
		this.studentRepo=studentRepo;
	}

	@Override
	public List<Student> findAllStudent() {
		List<Student> students = studentRepo.findAll();
		return students;
	}

	@Override
	public void saveStudent( Student student) {
		studentRepo.save(student);
	}

	@Override
	public Student findStudentByID(long id) {
		Student student = studentRepo.findById(id).get();
		return student;
	}

	@Override
	public void deleteStudent(long id) {
		studentRepo.deleteById(id);
	}
	
	

}
