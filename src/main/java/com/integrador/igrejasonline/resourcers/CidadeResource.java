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

import com.integrador.igrejasonline.domain.Cidade;
import com.integrador.igrejasonline.services.CidadeService;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {

	@Autowired
	private CidadeService entidadeService;

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cidade> find(@PathVariable Integer id) {
		Cidade objCidade = entidadeService.find(id);
		return ResponseEntity.ok().body(objCidade);
	}

	/**
	 * @param objCidade
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Cidade objCidade) {
		objCidade = entidadeService.insert(objCidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objCidade.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	/**
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cidade>> findAll() {
		List<Cidade> list = entidadeService.findAll();
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
	public ResponseEntity<Void> update(@Valid @RequestBody Cidade obj, @PathVariable Integer id) {
		obj.setId(id);
		obj = entidadeService.update(obj);
		return ResponseEntity.noContent().build();
	}



}
