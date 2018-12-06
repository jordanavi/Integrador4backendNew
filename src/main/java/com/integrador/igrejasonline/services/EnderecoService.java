package com.integrador.igrejasonline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Endereco;
import com.integrador.igrejasonline.repositories.EnderecoRepository;
import com.integrador.igrejasonline.services.exceptions.DataIntegrityException;
import com.integrador.igrejasonline.services.exceptions.ObjectNotFoundException;

//Esta classe serve para regras de negocio que não foram contempladas na camada de dominio.
@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repo;

	/**
	 * @param id
	 * @return
	 */
	public Endereco find(Integer id) {
		Optional<Endereco> objEndereco = repo.findById(id);
		return objEndereco.orElseThrow(() -> new ObjectNotFoundException(
				"Recurso não encontrado! Id: " + id + ", Tipo: " + Endereco.class.getName()));
	}

	/**
	 * @param obj
	 * @return
	 */
	public Endereco insert(Endereco objEndereco) {
		objEndereco.setId(null);
		return repo.save(objEndereco);
	}

	/**
	 * @return
	 */
	public List<Endereco> findAll() {
		return repo.findAll();
	}

	/**
	 * @param id
	 */
	public void delete(Integer id) {
		Optional<Endereco> objEndereco = repo.findById(id);
		if (objEndereco == null) {
			throw new DataIntegrityException("Não é possível excluir a Endereco!");
		} else {
			repo.deleteById(id);
		}
	}

	/**
	 * @param obj
	 * @return
	 */
	public Endereco update(Endereco obj) {
		Endereco newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	/**
	 * @param newObj
	 * @param obj
	 */
	private void updateData(Endereco newObj, Endereco obj) {
		newObj.setBairro(obj.getBairro());
		newObj.setCep(obj.getCep());
		newObj.setCidade(obj.getCidade());
		newObj.setComplemento(obj.getComplemento());
		newObj.setLogradouro(obj.getLogradouro());
		newObj.setNumero(obj.getNumero());
	}

}
