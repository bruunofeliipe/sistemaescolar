package com.brunofelipe.sistemaescolar.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunofelipe.sistemaescolar.domain.Diretor;

@RestController
@RequestMapping(value="/diretores") //boas praticas de programação
public class DiretorResoucer {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Diretor> listar() {
		
		Diretor drt = new Diretor(1,"Diretor de Monitoria", null, null, null);
		Diretor drtGeral = new Diretor(2, "Diretor Geral", null, null, null);
	
		List<Diretor> listadeDiretores = new ArrayList<>();
		listadeDiretores.add(drt);
		listadeDiretores.add(drtGeral);
		return listadeDiretores;
	}

}
