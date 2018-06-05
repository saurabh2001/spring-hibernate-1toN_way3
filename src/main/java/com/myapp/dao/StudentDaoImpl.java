package com.myapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.myapp.model.Student;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao implements StudentDao {

	public void saveStudent(Student student) {
		persist(student);
	}

	@SuppressWarnings("unchecked")
	public List<Student> findAllStudents() {
		Criteria criteria = getSession().createCriteria(Student.class);
		return (List<Student>) criteria.list();
	}

	public void updateStudent(Student student) {
		getSession().update(student);
	}

}