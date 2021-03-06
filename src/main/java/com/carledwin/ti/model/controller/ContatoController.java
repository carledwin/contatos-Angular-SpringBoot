package com.carledwin.ti.model.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carledwin.ti.model.Contato;
import com.carledwin.ti.model.repository.ContatoRepository;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@CrossOrigin
@RestController
public class ContatoController {

	@Autowired
	private ContatoRepository repository;
	
	@RequestMapping(method=RequestMethod.GET , value="/contatos", produces=MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Collection<Contato>> buscarTodos(){
		Collection<Contato> contatos = repository.findAll();
		return new ResponseEntity<>(contatos, HttpStatus.OK);
	}
}
