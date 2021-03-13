package br.com.caelum.contas.modelo;

import br.com.caelum.javafx.api.util.Evento;

public class ContaCorrente extends Conta {

	public ContaCorrente(String agencia, int numero, double saldo, String titular) {
		super(agencia, numero, saldo, titular);
	}

	public ContaCorrente() {

	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public void saca(double valor) {
		double saldo = this.getSaldo();
		this.setSaldo(saldo -= (valor + 0.1));
	}

}
