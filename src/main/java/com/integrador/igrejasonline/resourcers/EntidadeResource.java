package com.integrador.igrejasonline.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.igrejasonline.domain.Entidade;

@RestController
@RequestMapping(value="/entidades")
public class EntidadeResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Entidade> listar() {
		
		Entidade ent1 = new Entidade(1,"Mocidade", "999085674");
		Entidade ent2 = new Entidade(2,"Demolays", "987109689");
		
		List<Entidade> lista = new ArrayList<>();
		lista.add(ent1);
		lista.add(ent2);
		
		return lista;
	}
}
