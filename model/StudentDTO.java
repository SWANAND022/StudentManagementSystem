package com.anudip.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentDTO {

	//@Id
	private int sid;
//	@Column(length = 25)
	@Size(max=25)
	@NotBlank(message="student name can not be blank")
	private String name;
//	@Column(length = 25)
	@NotBlank(message="student course can not be blank")
	@Size(max=25)
	private String course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
