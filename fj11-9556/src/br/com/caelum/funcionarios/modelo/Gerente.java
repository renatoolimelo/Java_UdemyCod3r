package br.com.caelum.funcionarios.modelo;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

}
