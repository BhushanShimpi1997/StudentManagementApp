package com.sms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    @Column(name="First_Name",nullable=false)
	private String name;
    @Column(name="email")
	private String email;
    @Column(name="Salary")
	private String salary;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Student(String name, String email, String salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
