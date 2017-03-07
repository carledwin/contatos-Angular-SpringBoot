package com.carledwin.ti.model.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carledwin.ti.model.Contato;
import com.carledwin.ti.model.repository.ContatoRepository;

@RestController
public class ContatoController {

	@Autowired
	private ContatoRepository repository;
	
	@RequestMapping(method=RequestMethod.GET , value="/", produces=MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Collection<Contato>> buscarTodos(){
		return new ResponseEntity<Collection<Contato>>(repository.findAll(), HttpStatus.OK);
	}
}
