package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean trabalhouNaTerca;
		boolean trabalhouNaQuinta;
	
		trabalhouNaTerca = MetodosDesafioLogico.pergunta(entrada, "terça");
		trabalhouNaQuinta = MetodosDesafioLogico.pergunta(entrada, "quinta");

		MetodosDesafioLogico.resultado(trabalhouNaTerca, trabalhouNaQuinta);

		entrada.close();

	}

}
