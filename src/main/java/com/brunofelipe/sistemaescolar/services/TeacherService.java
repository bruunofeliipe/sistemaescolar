package com.brunofelipe.sistemaescolar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunofelipe.sistemaescolar.domain.Teacher;
import com.brunofelipe.sistemaescolar.repositories.TeacherRepository;


@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherrepo; // Quando declarado uma dependencia  o AutoWired ele automaticamente estancia no spring
	
	//Aqui está fazendo 
	public Teacher search(Integer id)  {
		Teacher obj = teacherrepo.findOne(id);
		if(obj == null) {
			throw new com.brunofelipe.sistemaescolar.services.exceptions.ObjectNotFoundException("Id não encontrado do Id:"+ id + ", tipo: " + 
												Teacher.class.getName());
		}
		return obj;
	}

	public Teacher insert (Teacher obj) {
		obj.setId(null);
		return teacherrepo.save(obj);
	
	}
}
