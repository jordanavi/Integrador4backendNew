package com.integrador.igrejasonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.integrador.igrejasonline.domain.Endereco;

//Camada de acesso a dados

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	
}