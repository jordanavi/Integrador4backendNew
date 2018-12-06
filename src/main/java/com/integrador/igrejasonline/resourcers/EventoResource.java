package com.integrador.igrejasonline.resourcers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.integrador.igrejasonline.domain.Evento;
import com.integrador.igrejasonline.services.EventoService;



@RestController
@RequestMapping(value = "/eventos")
public class EventoResource {

	@Autowired
	private EventoService eventoService;

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Evento> find(@PathVariable Integer id) {
		Evento objEvento = eventoService.find(id);
		return ResponseEntity.ok().body(objEvento);
	}

	/**
	 * @param objEvento
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Evento objEvento) {
		objEvento = eventoService.insert(objEvento);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objEvento.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	/**
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> findAll() {
		List<Evento> list = eventoService.findAll();
		return ResponseEntity.ok().body(list);
	}

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		eventoService.delete(id);
		return ResponseEntity.noContent().build();
	}

	/**
	 * @param objDto
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody Evento obj, @PathVariable Integer id) {
		obj.setId(id);
		obj = eventoService.update(obj);
		return ResponseEntity.noContent().build();
	}

}
