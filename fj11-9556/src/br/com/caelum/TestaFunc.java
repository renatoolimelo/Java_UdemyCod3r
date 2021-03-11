package br.com.caelum;

import br.com.caelum.funcionarios.modelo.Funcionario;
import br.com.caelum.funcionarios.modelo.Gerente;

public class TestaFunc {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("renato", "123456", 1000);
		Gerente gerente = new Gerente("Gabi", "123456", 2000);

		System.out.println(funcionario);
		System.out.println(gerente);

	}

}
