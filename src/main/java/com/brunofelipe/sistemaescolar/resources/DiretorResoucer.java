package com.brunofelipe.sistemaescolar.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/diretores") //boas praticas de programação
public class DiretorResoucer {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest está funcionando bem!";
	}

}
