package com.sms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.Entity.Student;
import com.sms.service.StudentService;
import com.sms.service.impl.StudentServiceImpl;

@Controller
public class StudentController {
	
      private StudentService studentService;
      
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	//Handler method to handle list of students and return model and view
	
	@GetMapping("/students")
	public String listAllStudents(Model model){
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
	}
	
	//handler method for add new Student
	@GetMapping("/student/new")
	public String createStudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		
		return "create_student";
	}
	
	//handler method to save New Student
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	//handler Method for Updatestudent form
	
	@GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	//handler method to save updated data of student
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) 
	{
		//get existing student object by id
		
		Student existingStudent=studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setName(student.getName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setSalary(student.getSalary());
		
		//save existing student updated with new data
		studentService.updateStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	//handler method for delete studnet by id
	
	@GetMapping("/student/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
