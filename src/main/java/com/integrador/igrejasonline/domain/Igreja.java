package com.integrador.igrejasonline.domain;

import java.util.ArrayList;
import java.util.List;

public class Igreja {
	private Integer id;
	private String cnpj;
	private String telefone;
	private String nome;
	private Endereco endereco;
	
	public Igreja(Integer id, String cnpj, String telefone, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.nome = nome;
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

	
}
