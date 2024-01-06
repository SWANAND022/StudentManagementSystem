package com.anudip.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.training.entity.Student;
import com.anudip.training.entity.Teacher;
import com.anudip.training.model.StudentDTO;
import com.anudip.training.model.TeacherDTO;
import com.anudip.training.service.StudentService;
import com.anudip.training.util.StudentConverter;
import com.anudip.training.util.TeacherConverter;

@RestController
public class StudentController {
	@Autowired
	StudentService sService;
	
	@Autowired
StudentConverter sConverter;
	
	@PostMapping("Student/addStudnet")
	public StudentDTO saveStudnet(@RequestBody StudentDTO sdto)
	{
		Student student1= sConverter.convertToEntity(sdto);
		//return new ResponseEntity<Teacher>(ts.addTeacher(tdto),HttpStatus.CREATED);
		return sService.addStudent(student1);
	}
	
}
