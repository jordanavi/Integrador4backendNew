package com.integrador.igrejasonline.repositories;

import org.springframework.stereotype.Repository;

import com.integrador.igrejasonline.domain.Responsavel;

@Repository
public class ResponsavelRepository extends JpaRepository <Responsavel, Integer>{
 
	
	Responsavel findByCpf(String cpf);
}
