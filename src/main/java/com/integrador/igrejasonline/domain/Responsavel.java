package com.integrador.igrejasonline.domain;

import java.io.Serializable;

public class Responsavel  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String cpf;
	private String email;
	private Endereco endereco;
	private String telefone;
	
	public Responsavel(Integer id,String cpf, String email, String telefone, Endereco endereco) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.setEndereco(endereco);
	}
	
	public Responsavel() { }
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
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
		Responsavel other = (Responsavel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
