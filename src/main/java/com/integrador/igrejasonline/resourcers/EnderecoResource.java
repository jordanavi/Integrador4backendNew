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

import com.integrador.igrejasonline.domain.Endereco;
import com.integrador.igrejasonline.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {

	@Autowired
	private EnderecoService enderecoService;

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Endereco> find(@PathVariable Integer id) {
		Endereco objEndereco = enderecoService.find(id);
		return ResponseEntity.ok().body(objEndereco);
	}

	/**
	 * @param objEndereco
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Endereco objEndereco) {
		objEndereco = enderecoService.insert(objEndereco);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objEndereco.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	/**
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Endereco>> findAll() {
		List<Endereco> list = enderecoService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		enderecoService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	/**
	 * @param objDto
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody Endereco obj, @PathVariable Integer id) {
		obj.setId(id);
		obj = enderecoService.update(obj);
		return ResponseEntity.noContent().build();
	}

}
