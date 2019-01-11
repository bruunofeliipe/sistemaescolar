package com.brunofelipe.sistemaescolar;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunofelipe.sistemaescolar.domain.Diretor;
import com.brunofelipe.sistemaescolar.repositories.DiretorRepository;

@SpringBootApplication
public class SistemaescolarApplication implements CommandLineRunner{

	@Autowired
	private DiretorRepository diretorRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaescolarApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Diretor drt = new Diretor(null,"Diretor de Monitoria", null, null, null);
		Diretor drtGeral = new Diretor(null,"Diretor de Geral", null, null, null);

		diretorRepository.save(Arrays.asList(drt,drtGeral));
	}

}
