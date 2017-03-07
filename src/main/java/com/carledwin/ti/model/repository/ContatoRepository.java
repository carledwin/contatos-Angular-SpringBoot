package com.carledwin.ti.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carledwin.ti.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
