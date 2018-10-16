package com.integrador.igrejasonline.resourcers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/eventos")
public class EventoResource {

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest esta funcionando";
	}
}
