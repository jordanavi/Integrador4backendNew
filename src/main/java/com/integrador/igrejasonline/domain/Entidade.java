package com.integrador.igrejasonline.domain;

public class Entidade{
	
	//tratar endereco
	private Integer id;
	private String nome;
	private String telefone;
	private Endereco endereco;
		
	public Entidade() {	}

	public Entidade(Integer id, String nome, String telefone, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.setEndereco(endereco);
	}
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
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
		Entidade other = (Entidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
