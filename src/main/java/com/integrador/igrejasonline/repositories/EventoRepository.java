package com.integrador.igrejasonline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.integrador.igrejasonline.domain.Evento;

//Camada de acesso a dados

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
	
	@Transactional(readOnly = true)
	@Query("SELECT DISTINCT obj FROM Evento obj INNER JOIN obj.endereco eve WHERE eve.cidade.id = :id")
	List<Evento> pesquisaEventosPorCidade(@Param("id") Integer id);
	
}