package com.integrador.igrejasonline.domain;

import java.io.Serializable;

public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;
	//tratar endereco
	//tratar data
	
	private Integer id;
	private String titulo;
	private String dataInicio;
	private String dataTermino;
	private String descricao;
	private String publico;
	
	public Evento() {
		
	}
	
	public Evento(Integer id, String titulo, String dataInicio, String dataTermino, String descricao, String publico) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.descricao = descricao;
		this.publico = publico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
