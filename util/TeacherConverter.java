package com.anudip.training.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.anudip.training.entity.Teacher;
import com.anudip.training.model.TeacherDTO;
@Component
public class TeacherConverter {

	
	//Converting Teacher Entity to Teacher DTO 
	
public	TeacherDTO convertToTeacherDTO(Teacher teacher)
	{
	TeacherDTO tDto=new TeacherDTO();
	if(teacher!=null)
	{
		//copy data from teacher to teacherDTO
		BeanUtils.copyProperties(teacher, tDto);
		
	}
	return tDto;
	}
//Converting Teacher DTO to Teacher Entity
	public	Teacher convertToEntity(TeacherDTO tDto)
	{
		Teacher teacher=new Teacher();
		if(tDto!=null)
		{
			//copy data from teacher to teacherDTO
			BeanUtils.copyProperties(tDto, teacher);
	
		}
		return teacher;
	}
}

//Converting Teacher DTO to Teacher Entity 




