package com.Student_Management.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Student_Management.entity.Course;
import com.Student_Management.entity.Student;
import com.Student_Management.repository.CourseRepository;
import com.Student_Management.services.StudentService;


@Controller
@RequestMapping("/")
public class StudentController {
	
	private StudentService studentService;
	private CourseRepository courseRepo; 
	
	public StudentController(StudentService studentService,
			                 CourseRepository courseRepo) {
		this.studentService=studentService;
		this.courseRepo=courseRepo;
	}
	
	@GetMapping("/create")
	public String home(Model model) {
		List<Course> courses = courseRepo.findAll();
		model.addAttribute("student", new Student());
		model.addAttribute("courses", courses);
		return "create_student";
	}
	
	@GetMapping("/allstudents")
	public String listAll(Model model) {
		List<Student> students = studentService.findAllStudent();
		model.addAttribute("students", students);
		return "list_all";
	}
	
	@PostMapping("/student/save")
	public String saveStudent(@ModelAttribute Student student, Model model) {
		studentService.saveStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/students/edit/{id}")
	public String updateformStudent(@PathVariable("id") long id, Model model) {
		List<Course> courses = courseRepo.findAll();
		Student student = studentService.findStudentByID(id);
		System.out.println(student.getCourse());
		
		model.addAttribute("courses", courses);
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable("id") long id, Model model) {
		studentService.deleteStudent(id);
		List<Student> students = studentService.findAllStudent();
		model.addAttribute("students", students);
		return "list_all";
	}
	

}
