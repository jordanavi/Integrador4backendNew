package com.integrador.igrejasonline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.repositories.EnderecoRepository;
import com.integrador.igrejasonline.repositories.IgrejaRepository;

//Esta classe serve para regras de negocio que não foram contempladas na camada de dominio.
@Service
public class IgrejaService<S>{
	
	@Autowired
	private IgrejaRepository repo;

	@Autowired
	private EnderecoRepository enderecoRepository;
}
