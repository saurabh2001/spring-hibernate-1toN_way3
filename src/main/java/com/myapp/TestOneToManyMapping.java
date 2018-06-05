package com.myapp;

import java.util.HashSet;
import java.util.Set;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.dao.AbstractDao;
import com.myapp.model.Phone;
import com.myapp.model.Student;
import com.myapp.service.StudentService;

public class TestOneToManyMapping extends AbstractDao {
	public static void main(String[] args) {
		// This code shows how we can do bi-directional mapping in hibernate,
		// here we need to used mappedBy keyword and tell hibernate that the
		// configuration is present on the other side of entity
		// here we have added @OneToMany annotation in Student class and @ManyToOne in Phone class

		System.out.println("Code execution started!");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		StudentService service = (StudentService) context.getBean("studentService");

		Set<Phone> phoneNumbers = new HashSet<Phone>();
		Phone p1 = new Phone("house", "32354353");
		Phone p2 = new Phone("mobile", "9889343423");
		phoneNumbers.add(p1);
		phoneNumbers.add(p2);

		Student student = new Student("Sau", phoneNumbers);
		p1.setStudent(student);
		p2.setStudent(student);

		service.saveStudent(student);

		System.out.println("Code executed successfully!");
	}
}
