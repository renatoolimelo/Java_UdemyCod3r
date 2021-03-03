package exercicios;

public class Exercicio4 {

	public static void main(String[] args) {

		int fatorial = 1;

		for (int i = 0; i <= 10; i++) {

			if (i == 0) {
				System.out.println("O fatorial de " + i + " é " + fatorial);
			} else {
				fatorial = fatorial * i;
				System.out.println("O fatorial de " + i + " é (!" + (i - 1) + ") * " + i + " = " + fatorial);
			}
		}

	}

}
