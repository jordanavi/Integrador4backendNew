package com.integrador.igrejasonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.integrador.igrejasonline.domain.Cidade;
import com.integrador.igrejasonline.domain.Estado;

//Camada de acesso a dados

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	@Transactional(readOnly = true)
	Estado findById(int id);
}

