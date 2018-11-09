package com.integrador.igrejasonline.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Responsavel  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String cpf;
	private String email;

	private List<Endereco> enderecos = new ArrayList<>();
	
	private String telefone;
	
	public Responsavel() { }
	
	public Responsavel(Integer id,String cpf, String email, String telefone) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	
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
