package com.caelum.fj11.contas;

public class TestaConta {

	public static void main(String[] args) {

		boolean saqueSucesso;
		boolean transferenciaSucesso;

		Cliente cliente1 = new Cliente("Zé", "123", "Rua Alpha, 2");
		Cliente cliente2 = new Cliente("João", "23B", "Rua Omega, 99");

		Conta conta1 = new Conta(1, 1001, 0, cliente1);
		Conta conta2 = new Conta(1, 2001, 0, cliente2);
		Conta conta3 = new Conta(1, 2001, 0, cliente2);

		conta1.deposita(100);
		saqueSucesso = conta1.saca(150);

		if (!saqueSucesso) {
			System.out.println("Não foi possível sacar por falta de saldo");
		}

		transferenciaSucesso = conta1.trasnferePara(conta2, 115);

		if (!transferenciaSucesso) {
			System.out.println("Não foi possível realizar a transferência saldo indisponivel!");
		}

//		conta2 = conta1;

		if (conta1 == conta2) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}

		if (conta1.getNumeroAgencia() == conta2.getNumeroAgencia()
				&& conta1.getNumeroConta() == conta2.getNumeroConta()) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}

		System.out.println(conta1);
		System.out.println(conta2);
		
		System.out.println(conta1.getIdentificador());
		System.out.println(conta2.getIdentificador());
		System.out.println(conta3.getIdentificador());
		
		

	}

}
