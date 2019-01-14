package com.brunofelipe.sistemaescolar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunofelipe.sistemaescolar.domain.Teacher;



@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

	
	
}
