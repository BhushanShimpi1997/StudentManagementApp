package com.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.Entity.Teacher;
import com.sms.service.TeacherService;

@Controller
public class TeacherController {

	private TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	@GetMapping("/teachers")
	public String getAllStudent(Model model) {
		
		model.addAttribute("teachers", teacherService.getAllTeacher());
		
		return "teachers";
	}
	
	//handler method to add new teacher
	@GetMapping("/teachers/new")
	public String createTeacherForm(Model model) {
		Teacher teacher=new Teacher();
		model.addAttribute("teacher", teacher);
		return "create_Teacher";
	}
	
	//handler method to add new Teacher
	@PostMapping("/teachers")
	public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.saveTeacher(teacher);
		return "redirect:/teachers";
	}
	
	//handler method to update student
	@GetMapping("/teachers/edit/{id}")
	public String getTeacherById(@PathVariable Long id,Model model) {
		model.addAttribute("teacher", teacherService.getTeacherById(id));
		return "edit_teacher";
	}
	
	//get old teacher and update it
	@PostMapping("/teachers/{id}")
	public String updateTeacher(@PathVariable Long id,
			@ModelAttribute("teacher") Teacher teacher,
			Model model) 
	{
		//get Existing teacher object
		
		Teacher existingTeacher= teacherService.getTeacherById(id);
		existingTeacher.setId(id);
		existingTeacher.setName(teacher.getName());
		existingTeacher.setSubject(teacher.getSubject());
		existingTeacher.setCity(teacher.getCity());
		
		//Save teacher with new Data
		
		teacherService.saveTeacher(existingTeacher);
		return "redirect:/teachers";
		
	}
	
	//handler method for delete student
	
	@GetMapping("/teachers/{id}")
	public String deleteTeacherById(@PathVariable Long id) {
		teacherService.deleteTeacher(id);
		return "redirect:/teachers";
	}
	
}
