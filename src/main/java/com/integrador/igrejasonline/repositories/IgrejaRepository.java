package com.integrador.igrejasonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.integrador.igrejasonline.domain.Igreja;

//Camada de acesso a dados

@Repository
public interface IgrejaRepository extends JpaRepository<Igreja, Integer> {
										   
	@Transactional(readOnly=true)
	Igreja findByCnpj(String cnpj);
}