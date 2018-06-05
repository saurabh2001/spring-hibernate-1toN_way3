package com.myapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	private long studentId;
	private String studentName;
	private Set<Phone> studentPhoneNumbers = new HashSet<Phone>(0);

	public Student() {
	}

	public Student(String studentName, Set<Phone> studentPhoneNumbers) {
		this.studentName = studentName;
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	//Here it will look for studentss object at other side of entity i.e. in Phone class
	@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="student")
	public Set<Phone> getStudentPhoneNumbers() {
		return studentPhoneNumbers;
	}

	public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

}
