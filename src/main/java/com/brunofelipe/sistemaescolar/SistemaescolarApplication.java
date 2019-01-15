
package com.brunofelipe.sistemaescolar;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunofelipe.sistemaescolar.domain.Discipline;
import com.brunofelipe.sistemaescolar.domain.Student;
import com.brunofelipe.sistemaescolar.domain.Teacher;
import com.brunofelipe.sistemaescolar.domain.enums.TypeStudent;
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
		Teacher tp = new Teacher(null,"Roberto","81 998855178",36,5000.00,"011211121");
		Teacher tm = new Teacher(null,"Tania", "(11) 3521-8452",36, 10000.00, "0213351");
		Teacher th = new Teacher(null, "Marcelo","(55) 3211-8451",26,11000.00,"355215421");

		Student st1 = new Student(null, "Bruno","(25) 1241212",20,10.00,4.0,null, TypeStudent.NORMALSTUDENT);
		Student st2 = new Student(null, "Maria","(35) 1241212",20,10.00,5.5,null,TypeStudent.STUDENTWITHDISABILITIES);
		Student st3 = new Student(null, "Severino","(45) 1241212",20,10.00,4.0,null,TypeStudent.STUDENTWITHDISABILITIES);
		
		tp.getStudents().addAll(Arrays.asList(st1,st2,st3));
		tm.getStudents().addAll(Arrays.asList(st2));
		th.getStudents().addAll(Arrays.asList(st2,st3));
		
		st1.getTeachers().addAll(Arrays.asList(tp,th));
		st2.getTeachers().addAll(Arrays.asList(tm));
		st3.getTeachers().addAll(Arrays.asList(tp,tm));
		
		Discipline port = new Discipline(null,"Sala 1B", "Português");
		Discipline mate = new Discipline(null,"Sala 2A", "Matematica ");
		Discipline filo = new Discipline(null, "Sala 3C", "Filosofia");
		
		
		
		
		studentRepository.save(Arrays.asList(st1,st2,st3));
		teacherRepository.save(Arrays.asList(tp,tm,th));
	}

}
