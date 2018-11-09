package com.integrador.igrejasonline.domain;

import java.util.ArrayList;
import java.util.List;

public class Igreja {
	private String cnpj;
	private String telefone;
	private String nome;
	
	private List<Endereco> enderecos = new ArrayList<>();
	
	public Igreja() { }
	
	public Igreja(String cnpj, String telefone, String nome) {
		super();
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.nome = nome;
	}
	
	public String getCnpj() {return cnpj;}
	public void setCnpj(String cnpj) {this.cnpj = cnpj;}
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}	
	
	
}
