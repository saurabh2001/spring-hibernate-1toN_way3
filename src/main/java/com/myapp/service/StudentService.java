package com.myapp.service;

import java.util.List;

import com.myapp.model.Student;


public interface StudentService {

	void saveStudent(Student student);
	
	List<Student> findAllStudents();

	void updateStudent(Student student);
	
}
