package br.com.caelum.funcionarios.modelo;

public class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	@Override
	public String toString() {
		return "O funcionario " + nome + " tem a bonificação de " + getBonificacao();
	}

}
