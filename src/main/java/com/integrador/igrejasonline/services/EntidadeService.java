package com.integrador.igrejasonline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Entidade;
import com.integrador.igrejasonline.repositories.EntidadeRepository;
import com.integrador.igrejasonline.services.exceptions.DataIntegrityException;
import com.integrador.igrejasonline.services.exceptions.ObjectNotFoundException;

//Esta classe serve para regras de negocio que não foram contempladas na camada de dominio.
@Service
public class EntidadeService {

	@Autowired
	private EntidadeRepository repo;

	/**
	 * @param id
	 * @return
	 */
	public Entidade find(Integer id) {
		Optional<Entidade> objEntidade = repo.findById(id);
		return objEntidade.orElseThrow(() -> new ObjectNotFoundException(
				"Recurso não encontrado! Id: " + id + ", Tipo: " + Entidade.class.getName()));
	}

	/**
	 * @param obj
	 * @return
	 */
	public Entidade insert(Entidade objEntidade) {
		objEntidade.setId(null);
		return repo.save(objEntidade);
	}

	/**
	 * @return
	 */
	public List<Entidade> findAll() {
		return repo.findAll();
	}

	/**
	 * @param id
	 */
	public void delete(Integer id) {
		Optional<Entidade> objEntidade = repo.findById(id);
		if (objEntidade == null) {
			throw new DataIntegrityException("Não é possível excluir a Entidade!");
		} else {
			repo.deleteById(id);
		}
	}

	/**
	 * @param obj
	 * @return
	 */
	public Entidade update(Entidade obj) {
		Entidade newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	/**
	 * @param newObj
	 * @param obj
	 */
	private void updateData(Entidade newObj, Entidade obj) {
		newObj.setNome(obj.getNome());
		newObj.setTelefone(obj.getTelefone());
		newObj.setEndereco(obj.getEndereco());
	}

}
