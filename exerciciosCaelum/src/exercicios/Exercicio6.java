package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		int numero;
		int fibonacci = 1;
		int anterior = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o n�mero da sequ�ncia fibonacci: ");
		numero = entrada.nextInt();
		
		while (fibonacci <= numero) {
			System.out.print(fibonacci + " ");
			fibonacci = fibonacci + anterior;
			anterior = fibonacci - anterior;	
		}
		System.out.println();
		
		if (numero == anterior) {
			System.out.println("O numero " + numero + " faz parte da sequencia fibonacci");
		} else {
			System.out.println("O numero " + numero + " n�o faz parte da sequencia fibonacci");
		}
		
		entrada.close();
	}

}
