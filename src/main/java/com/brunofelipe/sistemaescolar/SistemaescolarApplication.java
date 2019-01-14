package com.brunofelipe.sistemaescolar;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunofelipe.sistemaescolar.domain.Teacher;
import com.brunofelipe.sistemaescolar.repositories.TeacherRepository;

@SpringBootApplication
public class SistemaescolarApplication implements CommandLineRunner{

	@Autowired
	private TeacherRepository teacherRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaescolarApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Teacher drt = new Teacher(null,"Diretor de Monitoria", null, null, null);
		Teacher drtGeral = new Teacher(null,"Diretor de Geral", null, null, null);

		teacherRepository.save(Arrays.asList(drt,drtGeral));
	}

}
