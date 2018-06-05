package com.myapp.dao;


import java.util.List;

import com.myapp.model.Student;


public interface StudentDao {

	void saveStudent(Student student);
	
	List<Student> findAllStudents();
	
	void updateStudent(Student student);
	
}
