package com.integrador.igrejasonline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Estado;
import com.integrador.igrejasonline.repositories.EstadoRepository;
import com.integrador.igrejasonline.services.exceptions.DataIntegrityException;
import com.integrador.igrejasonline.services.exceptions.ObjectNotFoundException;

//Esta classe serve para regras de negocio que não foram contempladas na camada de dominio.
@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;

	/**
	 * @param id
	 * @return
	 */
	public Estado find(Integer id) {
		Optional<Estado> objEstado = repo.findById(id);
		return objEstado.orElseThrow(() -> new ObjectNotFoundException(
				"Recurso não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}

	/**
	 * @param obj
	 * @return
	 */
	public Estado insert(Estado objEstado) {
		objEstado.setId(null);
		return repo.save(objEstado);
	}

	/**
	 * @return
	 */
	public List<Estado> findAll() {
		return repo.findAll();
	}

	/**
	 * @param id
	 */
	public void delete(Integer id) {
		Optional<Estado> objEstado = repo.findById(id);
		if (objEstado == null) {
			throw new DataIntegrityException("Não é possível excluir o Estado!");
		} else {
			repo.deleteById(id);
		}
	}

	/**
	 * @param obj
	 * @return
	 */
	public Estado update(Estado obj) {
		Estado newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	/**
	 * @param newObj
	 * @param obj
	 */
	private void updateData(Estado newObj, Estado obj) {
		newObj.setNome(obj.getNome());
	}

}
