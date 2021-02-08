package controle.exercicios;

public class Exercicio6 {

	public static void main(String[] args) {

		int numeroAleatorio;
		int creditos = 10;
		
		numeroAleatorio = Exercicio6Metodos.geraNumeroAleatorio();
		Exercicio6Metodos.jogar(numeroAleatorio, creditos);

	}

}
