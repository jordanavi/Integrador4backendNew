package com.integrador.igrejasonline.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.igrejasonline.domain.Igreja;

@RestController
@RequestMapping(value="/igrejas")
public class IgrejaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Igreja> listar() {
		
		Igreja ent1 = new Igreja(1,"06164253000187","3432565858","Igreja Presbiteriana Central de Uberlândia",null);
		Igreja ent2 = new Igreja(2,"18233742000122","3432565050","Igreja Batista da Lagoinha",null);
		Igreja ent3 = new Igreja(3,"17790270000146","9990853205","Assembleia de Deus Uberlandia",null);
		Igreja ent4 = new Igreja(4,"29744778099622","3432606050","Igreja Universal Uberlandia",null);
		
		List<Igreja> lista = new ArrayList<>();
		
		lista.add(ent1);
		lista.add(ent2);
		lista.add(ent3);
		lista.add(ent4);
		
		return lista;
	}

}
