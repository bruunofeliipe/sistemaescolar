package com.brunofelipe.sistemaescolar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunofelipe.sistemaescolar.domain.Student;
import com.brunofelipe.sistemaescolar.repositories.StudentRepository;


@Service
public class StudentService {

	@Autowired
	private StudentRepository teacherrepo; // Quando declarado uma dependencia  o AutoWired ele automaticamente estancia no spring
	
	//Aqui está fazendo 
	public Student search(Integer id)  {
		Student obj = teacherrepo.findOne(id);
		if(obj == null) {
			throw new com.brunofelipe.sistemaescolar.services.exceptions.ObjectNotFoundException("Id não encontrado do Id:"+ id + ", tipo: " + 
												Student.class.getName());
		}
		return obj;
	}
	
	
	}
