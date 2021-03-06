package com.brunofelipe.sistemaescolar.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.brunofelipe.sistemaescolar.domain.Student;
import com.brunofelipe.sistemaescolar.services.StudentService;

@RestController
@RequestMapping(value="/student") //boas praticas de programação
public class StudentResoucer {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)  //procurando no point pelo id
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Student obj = service.search(id);
		return ResponseEntity.ok().body(obj);
			
		
	}

	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Student obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
}
