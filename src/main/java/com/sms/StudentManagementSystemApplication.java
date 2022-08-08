package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.Entity.Student;
import com.sms.Entity.Teacher;
import com.sms.repository.StudentRepository;
import com.sms.repository.TeacherRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public void run(String... args) throws Exception {
	/*	Student student1=new Student("Bhushan","bhushan@gmail.com","45465");
		studentRepository.save(student1);
		
		Student student2=new Student("Pratik","Pratik@gmail.com","654");
		studentRepository.save(student2);
		
		Student student3=new Student("Saloni","Salu@gmail.com","94896");
		studentRepository.save(student3);
		*/
	/*	
		Teacher teacher1=new Teacher("Pravin Shirsath", "Math", "Shirpur");
		teacherRepository.save(teacher1);
		
		Teacher teacher2=new Teacher("Saindane Sir","Hindi","Thalner");
		teacherRepository.save(teacher2);
		
		Teacher teacher3 =new Teacher("DJ Patil Sir", "Science", "Shirpur");
		teacherRepository.save(teacher3);*/
	}
	

	
}
