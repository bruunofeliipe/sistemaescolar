package com.brunofelipe.sistemaescolar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunofelipe.sistemaescolar.domain.Diretor;
import com.brunofelipe.sistemaescolar.repositories.DiretorRepository;

@Service
public class DiretorService {

	@Autowired
	private DiretorRepository direpo; // Quando declarado uma dependencia  o AutoWired ele automaticamente estancia no spring
	
	//Aqui está fazendo 
	public Diretor search(Integer id) {
		Diretor obj = direpo.findOne(id);
		return obj;
	}
	
	
	}
