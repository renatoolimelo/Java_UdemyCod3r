package br.com.caelum.contas.modelo;

public abstract class Conta {

	private String agencia;
	private int numero;
	private double saldo;
	private String titular;
	private int identificador;
	private static int contador = 0;

	public Conta(String agencia, int numero, double saldo, String titular) {
		contador++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		this.identificador = contador;
	}

	public Conta() {

	}

	@Override
	public String toString() {
		return "A conta : " + numero + " que pertence ao cliente: " + titular + " tem saldo = R$" + mostraSaldo();
	}

	public void deposita(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public void saca(double valorDoSaque) {
		this.saldo -= valorDoSaque;
	}

	public void trasnferePara(Conta contaDestino, double valorTransferencia) {
		this.saca(valorTransferencia);
		contaDestino.deposita(valorTransferencia);
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public double mostraSaldo() {
		return this.saldo;
	}

	public abstract String getTipo();

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		return dados;
	}

	public String getNumeroAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numero;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Conta.contador = contador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

}
