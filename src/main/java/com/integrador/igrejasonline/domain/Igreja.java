package com.integrador.igrejasonline.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Igreja implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // geração da chave primária 
	private Integer id;
	
	@Column(unique=true)
	private String cnpj;
	private String telefone;
	private String nome;
	
	//relacionamento um para um entre igreja e endereco
	@OneToOne
	private Endereco endereco;
	
	//relacionamento um para muitos entre igreja e responsavel - deleção em cascata (se apagar igreja, apaga responsavel)
	@OneToMany (mappedBy="igreja", cascade=CascadeType.ALL)		 
	private List<Responsavel> responsavel = new ArrayList<>();
	
	public Igreja(Integer id, String cnpj, String telefone, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.nome = nome;
		
		//verificar se há a necessidade de atribuir valor a endereço
		this.setEndereco(endereco);
	}
	
	public Igreja() { }
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getCnpj() {return cnpj;}
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}	
	public Endereco getEndereco() {return endereco;}
	public void setEndereco(Endereco endereco) {this.endereco = endereco;}
	public List<Responsavel> getResponsavel() {return responsavel;}
	public void setResponsavel(List<Responsavel> responsavel) {this.responsavel = responsavel;}

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
		Igreja other = (Igreja) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
