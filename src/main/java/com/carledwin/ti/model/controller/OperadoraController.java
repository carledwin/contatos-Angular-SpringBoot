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

import com.carledwin.ti.model.Operadora;
import com.carledwin.ti.model.repository.OperadoraRepository;

@CrossOrigin
@RestController
public class OperadoraController {

	@Autowired
	private OperadoraRepository repository;
	
	@RequestMapping(method=RequestMethod.GET , value="/operadoras", produces=MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Collection<Operadora>> buscarTodos(){
		Collection<Operadora> operadoras = repository.findAll();
		return new ResponseEntity<>(operadoras, HttpStatus.OK);
	}
}
