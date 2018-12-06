package com.integrador.igrejasonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.integrador.igrejasonline.domain.Evento;

//Camada de acesso a dados

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {

}