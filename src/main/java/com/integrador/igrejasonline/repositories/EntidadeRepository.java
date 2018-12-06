package com.integrador.igrejasonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.integrador.igrejasonline.domain.Entidade;
//Camada de acesso a dados

@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Integer> {

	@Transactional(readOnly = true)
	Entidade findById(int id);
}

