package com.integrador.igrejasonline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Cidade;
import com.integrador.igrejasonline.repositories.CidadeRepository;
import com.integrador.igrejasonline.services.exceptions.DataIntegrityException;
import com.integrador.igrejasonline.services.exceptions.ObjectNotFoundException;

//Esta classe serve para regras de negocio que não foram contempladas na camada de dominio.
@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	/**
	 * @param id
	 * @return
	 */
	public Cidade find(Integer id) {
		Optional<Cidade> objCidade = repo.findById(id);
		return objCidade.orElseThrow(() -> new ObjectNotFoundException(
				"Recurso não encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()));
	}

	/**
	 * @param obj
	 * @return
	 */
	public Cidade insert(Cidade objCidade) {
		objCidade.setId(null);
		return repo.save(objCidade);
	}

	/**
	 * @return
	 */
	public List<Cidade> findAll() {
		return repo.findAll();
	}

	/**
	 * @param id
	 */
	public void delete(Integer id) {
		Optional<Cidade> objCidade = repo.findById(id);
		if (objCidade == null) {
			throw new DataIntegrityException("Não é possível excluir a Cidade!");
		} else {
			repo.deleteById(id);
		}
	}

	/**
	 * @param obj
	 * @return
	 */
	public Cidade update(Cidade obj) {
		Cidade newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	/**
	 * @param newObj
	 * @param obj
	 */
	private void updateData(Cidade newObj, Cidade obj) {
		newObj.setNome(obj.getNome());
	}

}
