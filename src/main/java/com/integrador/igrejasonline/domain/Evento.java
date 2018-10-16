package com.integrador.igrejasonline.domain;

public class Evento {
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
}
