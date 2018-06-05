package com.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.dao.StudentDao;
import com.myapp.model.Student;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao dao;
	
	public void saveStudent(Student student) {
		dao.saveStudent(student);
	}
	
	@Transactional
	public List<Student> findAllStudents() {
		return dao.findAllStudents();
	}

	public void updateStudent(Student student){
		dao.updateStudent(student);
	}
	
}
