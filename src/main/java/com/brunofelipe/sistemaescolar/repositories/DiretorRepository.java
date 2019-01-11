package com.brunofelipe.sistemaescolar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunofelipe.sistemaescolar.domain.Diretor;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, Integer>{

	
	
}
