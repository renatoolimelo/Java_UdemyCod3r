package exercicios2;

public class TestaConta {

	public static void main(String[] args) {

		boolean verificaSaque;
		
		Data data = new Data(04, 06, 2015);

		Conta conta = new Conta("Hugo", 123, "45678-9", 50, data);

		conta.deposita(100);
		System.out.println(conta.mostraSaldo());
		System.out.println(conta.mostraRendimento());

		conta.Saca(20);
		System.out.println(conta.mostraSaldo());
		verificaSaque = conta.Saca(200);
		if (!verificaSaque) {
			System.out.println("Erro ao sacar, saldo insuficiente!");
		}

		System.out.println(conta.mostraSaldo());
		System.out.println(conta.recuperaDadosParaImpressao());

		Conta c1 = new Conta("Danilo", 100);
		Conta c2 = new Conta("Danilo", 100);

		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		c2 = c1;

		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

	}

}
