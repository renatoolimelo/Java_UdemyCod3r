package exercicios2;

public class Conta {

	private String nomeDoTitular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;

	public Conta(String nomeDoTitular, int numero, String agencia, double saldo, Data dataDeAbertura) {
		this.nomeDoTitular = nomeDoTitular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}

	public Conta(String nomeDoTitular, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}

	public boolean Saca(double valorDoSaque) {
		if (this.saldo >= valorDoSaque) {
			this.saldo -= valorDoSaque;
			return true;
		}
		return false;
	}

	public void deposita(double valorDoDeposito) {
		this.saldo += valorDoDeposito;
	}

	public double calculaRendimento() {
		return this.saldo * 0.01;
	}

	public String mostraSaldo() {
		return "Saldo Atual: R$" + saldo;
	}

	public String mostraRendimento() {
		return "Rendimento mensal: " + calculaRendimento();
	}

	public String recuperaDadosParaImpressao() {
		return "Cliente: " + nomeDoTitular + " conta: " + numero + " agência: " + agencia + " data de abertura "
				+ dataDeAbertura + " saldo: " + saldo;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

}
