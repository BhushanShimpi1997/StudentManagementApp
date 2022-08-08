package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
