package com.integrador.igrejasonline.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //definicao de chave primaria
	private Integer id;
	
	private String titulo;
	private String dataInicio;
	private String dataTermino;
	private String horaInicio;
	private String horaTermino;
	private String descricao;
	private String publico;
	private boolean repete;
	
	@ManyToOne
	@JoinColumn(name="endereco_id")
	private Endereco endereco;
	
	public Evento(Integer id, String titulo, String dataInicio, String dataTermino, String horaInicio, String horaTermino, String descricao, String publico, boolean repete, Endereco endereco) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.horaInicio = dataInicio;
		this.horaTermino = dataTermino;
		this.descricao = descricao;
		this.publico = publico;
		this.repete = repete;
		this.setEndereco(endereco);
	}

	public Evento() { }

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public String getDataInicio() {return dataInicio;}
	public void setDataInicio(String dataInicio) {this.dataInicio = dataInicio;}
	public String getDataTermino() {return dataTermino;}
	public void setDataTermino(String dataTermino) {this.dataTermino = dataTermino;}
	public String getHoraInicio() {return horaInicio;}
	public void setHoraInicio(String horaInicio) {this.horaInicio = horaInicio;}
	public String getHoraTermino() {return horaTermino;}
	public void setHoraTermino(String horaTermino) {this.horaTermino = horaTermino;}
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) {this.descricao = descricao;}
	public String getPublico() {return publico;}
	public void setPublico(String publico) {this.publico = publico;}
	public boolean isRepete() {return repete;}
	public void setRepete(boolean repete) {this.repete = repete;}
	public Endereco getEndereco() {return endereco;}
	public void setEndereco(Endereco endereco) {this.endereco = endereco;}


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
