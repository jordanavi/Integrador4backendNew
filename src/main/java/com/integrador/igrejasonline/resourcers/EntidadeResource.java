package com.integrador.igrejasonline.resourcers;

import java.net.URI;
import java.util.ArrayList;
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

import com.integrador.igrejasonline.domain.Entidade;
import com.integrador.igrejasonline.services.EntidadeService;

@RestController
@RequestMapping(value = "/entidades")
public class EntidadeResource {

	@Autowired
	private EntidadeService entidadeService;

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Entidade> find(@PathVariable Integer id) {
		Entidade objEntidade = entidadeService.find(id);
		return ResponseEntity.ok().body(objEntidade);
	}

	/**
	 * @param objEntidade
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Entidade objEntidade) {
		objEntidade = entidadeService.insert(objEntidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objEntidade.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	/**
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Entidade>> findAll() {
		List<Entidade> list = entidadeService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		entidadeService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	/**
	 * @param objDto
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody Entidade obj, @PathVariable Integer id) {
		obj.setId(id);
		obj = entidadeService.update(obj);
		return ResponseEntity.noContent().build();
	}



}
