package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recupera��o.";
		System.out.println("O aluno est� " + resultadoFinal);

		double nota = 9.9;
		boolean bomComportamneto = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamneto && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.println("Tem desconto? " + resultado);

	}

}
