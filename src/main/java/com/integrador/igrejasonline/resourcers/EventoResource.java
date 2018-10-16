package com.integrador.igrejasonline.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.igrejasonline.domain.Evento;

@RestController
@RequestMapping(value="/eventos")
public class EventoResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Evento> listar() {
		
		Evento ev1 = new Evento(1,"Encontro de Jovens", "09112018","09112018","Tema: juventude e sociedade", "jovens");
		Evento ev2 = new Evento(2,"Encontro das filhas de Jó", "10112018","10112018","Tema: mulheres de fé", "mães");
		
		List<Evento> lista = new ArrayList<>();
		lista.add(ev1);
		lista.add(ev2);
		
		return lista;
	}
}
