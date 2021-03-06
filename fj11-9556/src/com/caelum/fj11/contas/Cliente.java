package com.caelum.fj11.contas;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;

	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

}
