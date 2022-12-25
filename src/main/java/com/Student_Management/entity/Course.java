package com.Student_Management.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String course;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return  course;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course(Long id) {
		super();
		this.id = id;
	}

	public Course(String course) {
		super();
		this.course = course;
	}

	public Course(Student student) {
		this.student = student;
	}

	public Course() {
		
	}

	public Course(String course, Student student) {
		super();
		this.course = course;
		this.student = student;
	}

	
	
	
	
	
}
