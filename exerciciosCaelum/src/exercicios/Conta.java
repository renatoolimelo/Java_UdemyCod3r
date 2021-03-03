package exercicios;

public class Conta {

	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	private Cliente cliente;

	public Conta(int numeroAgencia, int numeroConta, double saldo, Cliente cliente) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "A conta : " + numeroConta + " que pertence ao cliente: " + cliente.getNome() + " tem saldo = R$" + mostraSaldo();
	}

	public void deposita(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public boolean saca(double valorDoSaque) {
		if (this.saldo >= valorDoSaque) {
			this.saldo -= valorDoSaque;
			return true;
		}
		return false;
	}

	public boolean trasnferePara(Conta contaDestino, double valorTransferencia) {
		if (this.saca(valorTransferencia)) {
			contaDestino.deposita(valorTransferencia);
			return true;
		}
		return false;
	}

	public double mostraSaldo() {
		return this.saldo;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

}
