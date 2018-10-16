package com.integrador.igrejasonline.domain;

public class Entidade{
	//tratar endereco
	public String nome;
	public String telefone;
		
	public Entidade() {
		
	}
	
	public Entidade(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
