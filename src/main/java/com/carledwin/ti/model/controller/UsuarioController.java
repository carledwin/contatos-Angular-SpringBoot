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

import com.carledwin.ti.model.Usuario;
import com.carledwin.ti.model.repository.UsuarioRepository;

@CrossOrigin
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@RequestMapping(method=RequestMethod.GET , value="/usuarios", produces=MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Collection<Usuario>> buscarTodos(){
		Collection<Usuario> usuarios = repository.findAll();
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}
}
