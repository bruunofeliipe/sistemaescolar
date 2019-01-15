package com.brunofelipe.sistemaescolar;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunofelipe.sistemaescolar.domain.Student;
import com.brunofelipe.sistemaescolar.domain.Teacher;
import com.brunofelipe.sistemaescolar.repositories.StudentRepository;
import com.brunofelipe.sistemaescolar.repositories.TeacherRepository;

@SpringBootApplication
public class SistemaescolarApplication implements CommandLineRunner{

	@Autowired
	private TeacherRepository teacherRepository;
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaescolarApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Teacher tp = new Teacher(null,"Roberto","Professor de Português", null, 50,null, null);
		Teacher tm = new Teacher(null,"Tania","Professor de Matematica", null,36, null, null);
		Teacher th = new Teacher(null, "Marcelo","Professor de História",null,26,null,null);

		Student st1 = new Student(null, "Bruno",null, 34, null, null, null);
		Student st2 = new Student(null,"Tereza", null,26,null,null,null);
		Student st3 = new Student(null,"Maria", null,26,null,null,null);
		
		tp.getStudents().addAll(Arrays.asList(st1,st3));
		tm.getStudents().addAll(Arrays.asList(st2));
		th.getStudents().addAll(Arrays.asList(st2,st3));
		
		st1.getTeachers().addAll(Arrays.asList(tp,th));
		st2.getTeachers().addAll(Arrays.asList(tm));
		st3.getTeachers().addAll(Arrays.asList(tp,tm));
		
		
		studentRepository.save(Arrays.asList(st1,st2,st3));
		teacherRepository.save(Arrays.asList(tp,tm,th));
	}

}
