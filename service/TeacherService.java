package com.anudip.training.service;

import com.anudip.training.entity.Teacher;
import com.anudip.training.model.TeacherDTO;

public interface TeacherService {

	
	TeacherDTO addTeacher(Teacher teacher);
	
	Teacher getTeacherDetails(int id);
	
	Teacher updateTeacherDetails(Teacher teacher,int tid);
	
	void deleteTeacherDetails(int tid);
	
	/*getAllTeacher();
	
	getTeacherByPhone();
	
	getTeacherByName();
	
	getTeacherByDesignation();*/
	
	
}
