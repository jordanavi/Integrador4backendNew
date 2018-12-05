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

import com.integrador.igrejasonline.domain.Igreja;
import com.integrador.igrejasonline.services.IgrejaService;

@RestController
@RequestMapping(value = "/igrejas")
public class IgrejaResource {

	@Autowired
	private IgrejaService igrejaService;

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Igreja> find(@PathVariable Integer id) {
		Igreja objIgreja = igrejaService.find(id);
		return ResponseEntity.ok().body(objIgreja);
	}

	/**
	 * @param objIgreja
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Igreja objIgreja) {
		objIgreja = igrejaService.insert(objIgreja);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objIgreja.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	/**
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Igreja>> findAll() {
		List<Igreja> list = igrejaService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		igrejaService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
