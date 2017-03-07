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

import com.carledwin.ti.model.Estado;
import com.carledwin.ti.model.repository.EstadoRepository;

@CrossOrigin
@RestController
public class EstadoController {

	@Autowired
	private EstadoRepository repository;
	
	@RequestMapping(method=RequestMethod.GET , value="/estados", produces=MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Collection<Estado>> buscarTodos(){
		Collection<Estado> estados = repository.findAll();
		return new ResponseEntity<>(estados, HttpStatus.OK);
	}
}
