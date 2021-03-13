package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String agencia, int numero, double saldo, String titular) {
		super(agencia, numero, saldo, titular);

	}

	public ContaPoupanca() {

	}

	@Override
	public String getTipo() {
		return "Conta Poupança";
	}

}
