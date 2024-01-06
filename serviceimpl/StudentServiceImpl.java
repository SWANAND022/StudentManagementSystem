package com.anudip.training.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.training.entity.Student;
import com.anudip.training.model.StudentDTO;
import com.anudip.training.repository.StudentRepository;
import com.anudip.training.service.StudentService;
import com.anudip.training.util.StudentConverter;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository srepo;
	@Autowired
	StudentConverter sconverter;
	@Override
	public StudentDTO addStudent(Student student) {
		srepo.save(student);
			return sconverter.convertToStudentDTO(student);
	}

}
