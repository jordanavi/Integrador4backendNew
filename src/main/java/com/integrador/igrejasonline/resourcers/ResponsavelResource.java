package com.integrador.igrejasonline.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.igrejasonline.domain.Responsavel;

@RestController
@RequestMapping(value="/responsaveis")
public class ResponsavelResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Responsavel> listar() {
		
		Responsavel resp1 = new Responsavel(1,"09987698790","Jose da Silva","999899898");
		Responsavel resp2 = new Responsavel(2,"09987779790","Maria Antonieta","997769807");
		
		List<Responsavel> lista = new ArrayList<>();
		lista.add(resp1);
		lista.add(resp2);
		
		return lista;
	}
}
