package com.caelum.fj11.contas;

public class TesteRecursao {

	public static void main(String[] args) {

		int tamanhoSequencia = 21;

		System.out.println("Resultado:");

		for (int i = 0; i <= tamanhoSequencia; i++) {
			System.out.println(fibro(i));
		}

	}

	public static int fibro(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return fibro(n - 1) + fibro(n - 2);
		}
	}

}
