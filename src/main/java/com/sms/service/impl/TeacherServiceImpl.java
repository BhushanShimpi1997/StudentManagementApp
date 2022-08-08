package com.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.Entity.Teacher;
import com.sms.repository.TeacherRepository;
import com.sms.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	 private TeacherRepository teacherRepository;

	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeacher() {
		
		return teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		
		return teacherRepository.findById(id).get();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacher(Long id) {
		
		teacherRepository.deleteById(id);
		
	}
	 
}
