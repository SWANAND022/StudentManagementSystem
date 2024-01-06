package com.anudip.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.training.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
