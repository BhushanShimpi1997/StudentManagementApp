package com.sms.service;

import java.util.List;

import com.sms.Entity.Student;
import com.sms.repository.StudentRepository;

public interface StudentService{

	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
