package com.anudip.training.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.training.entity.Teacher;
import com.anudip.training.exception.TeacherIdNotFoundException;
import com.anudip.training.model.TeacherDTO;
import com.anudip.training.repository.TeacherRepository;
import com.anudip.training.service.TeacherService;
import com.anudip.training.util.TeacherConverter;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository trepo;
	@Autowired	
	TeacherConverter tcoverter;
	
	@Override
	public TeacherDTO addTeacher(Teacher teacher) {
		 trepo.save(teacher);
		return tcoverter.convertToTeacherDTO(teacher);
	}

	@Override
	public Teacher getTeacherDetails(int tid) {
		
		return trepo.findById(tid).
				orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id Is not correct"));
	}

	@Override
	public Teacher updateTeacherDetails(Teacher teacher, int tid) {
		Teacher upadteTeacher=trepo.findById(tid).
				orElseThrow(()-> new TeacherIdNotFoundException("Tecaher Id Is not correct"));
		//set new values;
		upadteTeacher.setTphone(teacher.getTphone());
		upadteTeacher.setDesignation(teacher.getDesignation());
		
		trepo.save(upadteTeacher);
		
		return upadteTeacher;
	}

	@Override
	public void deleteTeacherDetails(int tid) {
		trepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));

	}

}
