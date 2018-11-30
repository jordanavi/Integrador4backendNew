package com.integrador.igrejasonline.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Responsavel  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //chave primaria
	private Integer id;
	
	private String nome;
	private String usuario;
	private String senha;
	private String cpf;
	private String email;
	private Endereco endereco;
	private String telefone;
	
	//relacionamento muitos para um entre responsavel e igreja
	@ManyToOne
	@JoinColumn(name="igreja_id")
	private Igreja igreja;
	
	public Responsavel(Integer id,String nome, String usuario, String senha, String cpf, String email, String telefone, Endereco endereco, Igreja igreja) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.setEndereco(endereco);
		this.setIgreja(igreja);}
	
	public Responsavel() { }
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getUsuario() {return usuario;}
	public void setUsuario(String usuario) {this.usuario = usuario;}
	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public Endereco getEndereco() {return endereco;}
	public void setEndereco(Endereco endereco) {this.endereco = endereco;}
	public Igreja getIgreja() {return igreja;}
	public void setIgreja(Igreja igreja) {this.igreja = igreja;}

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
		Responsavel other = (Responsavel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
