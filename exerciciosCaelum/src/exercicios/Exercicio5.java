package exercicios;

public class Exercicio5 {

	public static void main(String[] args) {

		long fatorial = 1;

		for (int i = 1; i <= 20; i++) {

			if (i == 1) {
				System.out.println("O fatorial de " + i + " = " + fatorial);
			} else {
				fatorial = fatorial * i;
				System.out.println("O fatorial de " + i + " = " + fatorial);
			}
		}
		
		System.out.println();
		fatorial = 1;
		
		for (int i = 1; i <= 30; i++) {

			if (i == 1) {
				System.out.println("O fatorial de " + i + " = " + fatorial);
			} else {
				fatorial = fatorial * i;
				System.out.println("O fatorial de " + i + " = " + fatorial);
			}
		}
		
		System.out.println();
		fatorial = 1;
		
		for (int i = 1; i <= 40; i++) {

			if (i == 1) {
				System.out.println("O fatorial de " + i + " = " + fatorial);
			} else {
				fatorial = fatorial * i;
				System.out.println("O fatorial de " + i + " = " + fatorial);
			}
		}

	}
}
