package com.integrador.igrejasonline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Igreja;
import com.integrador.igrejasonline.repositories.IgrejaRepository;
import com.integrador.igrejasonline.services.exceptions.DataIntegrityException;
import com.integrador.igrejasonline.services.exceptions.ObjectNotFoundException;

//Esta classe serve para regras de negocio que não foram contempladas na camada de dominio.
@Service
public class IgrejaService {

	@Autowired
	private IgrejaRepository repo;

	/**
	 * @param id
	 * @return
	 */
	public Igreja find(Integer id) {
		Optional<Igreja> objIgreja = repo.findById(id);
		return objIgreja.orElseThrow(() -> new ObjectNotFoundException(
				"Recurso não encontrado! Id: " + id + ", Tipo: " + Igreja.class.getName()));
	}

	/**
	 * @param obj
	 * @return
	 */
	public Igreja insert(Igreja objIgreja) {
		objIgreja.setId(null);
		return repo.save(objIgreja);
	}

	/**
	 * @return
	 */
	public List<Igreja> findAll() {
		return repo.findAll();
	}

	/**
	 * @param id
	 */
	public void delete(Integer id) {
		Optional<Igreja> objIgreja = repo.findById(id);
		if (objIgreja == null) {
			throw new DataIntegrityException("Não é possível excluir a Igreja!");
		} else {
			repo.deleteById(id);
		}
	}

	/**
	 * @param obj
	 * @return
	 */
	public Igreja update(Igreja obj) {
		Igreja newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	/**
	 * @param newObj
	 * @param obj
	 */
	private void updateData(Igreja newObj, Igreja obj) {
		newObj.setCnpj(obj.getCnpj());
		newObj.setNome(obj.getNome());
		newObj.setTelefone(obj.getTelefone());
		newObj.setEndereco(obj.getEndereco());
	}

}
