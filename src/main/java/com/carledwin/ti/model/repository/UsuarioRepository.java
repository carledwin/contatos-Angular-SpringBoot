package com.carledwin.ti.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carledwin.ti.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
