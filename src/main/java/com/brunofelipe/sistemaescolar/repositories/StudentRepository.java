package com.brunofelipe.sistemaescolar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunofelipe.sistemaescolar.domain.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
	
}
