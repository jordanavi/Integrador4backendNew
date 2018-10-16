package com.integrador.igrejasonline.domain;

public class Responsavel {
	//tratar endereco
	private String cpf;
	private String email;
	private String telefone;
	
	public Responsavel() {
		
	}
	public Responsavel(String cpf, String email, String telefone) {
		super();
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
