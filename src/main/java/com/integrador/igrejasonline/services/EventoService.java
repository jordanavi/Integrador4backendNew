package com.integrador.igrejasonline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Evento;
import com.integrador.igrejasonline.repositories.EventoRepository;
import com.integrador.igrejasonline.services.exceptions.DataIntegrityException;
import com.integrador.igrejasonline.services.exceptions.ObjectNotFoundException;

//Esta classe serve para regras de negocio que não foram contempladas na camada de dominio.
@Service
public class EventoService {

	@Autowired
	private EventoRepository repo;

	/**
	 * @param id
	 * @return
	 */
	public Evento find(Integer id) {
		Optional<Evento> objEvento = repo.findById(id);
		return objEvento.orElseThrow(() -> new ObjectNotFoundException(
				"Recurso não encontrado! Id: " + id + ", Tipo: " + Evento.class.getName()));
	}

	/**
	 * @param obj
	 * @return
	 */
	public Evento insert(Evento objEvento) {
		objEvento.setId(null);
		return repo.save(objEvento);
	}

	/**
	 * @return
	 */
	public List<Evento> findAll() {
		return repo.findAll();
	}

	/**
	 * @param id
	 */
	public void delete(Integer id) {
		Optional<Evento> objEvento = repo.findById(id);
		if (objEvento == null) {
			throw new DataIntegrityException("Não é possível excluir o Evento!");
		} else {
			repo.deleteById(id);
		}
	}

	/**
	 * @param obj
	 * @return
	 */
	public Evento update(Evento obj) {
		Evento newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	/**
	 * @param newObj
	 * @param obj
	 */
	private void updateData(Evento newObj, Evento obj) {
		newObj.setTitulo(obj.getTitulo());
		newObj.setDataInicio(obj.getDataInicio());
		newObj.setDataTermino(obj.getDataTermino());
		newObj.setHoraInicio(obj.getHoraInicio());
		newObj.setHoraTermino(obj.getHoraTermino());
		newObj.setDescricao(obj.getDescricao());
		newObj.setPublico(obj.getPublico());
		newObj.setRepete(obj.isRepete());
	}

}
