package com.anudip.training.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.anudip.training.entity.Student;
import com.anudip.training.entity.Teacher;
import com.anudip.training.model.StudentDTO;
import com.anudip.training.model.TeacherDTO;
@Component
public class StudentConverter {

	// Converting to Student Entity to Studnet DTO
	
		public StudentDTO convertToStudentDTO(Student student)
		{
			StudentDTO sDto=new StudentDTO();
			if(student!=null)
			{
				BeanUtils.copyProperties(student, sDto);
			}
			
			return sDto;
			
		}
		//Converting Teacher DTO to Teacher Entity
		public	Student convertToEntity(StudentDTO sDto)
		{
			Student student=new Student();
			if(sDto!=null)
			{
				//copy data from teacher to teacherDTO
				BeanUtils.copyProperties(sDto, student);
		
			}
			return student;
		}
		
}
