package com.sms.service;

import java.util.List;

import com.sms.Entity.Teacher;

public interface TeacherService {

	List<Teacher> getAllTeacher();
	Teacher saveTeacher(Teacher teacher);
	Teacher getTeacherById(Long id);
	Teacher updateTeacher(Teacher teacher);
	void deleteTeacher(Long id);
}
