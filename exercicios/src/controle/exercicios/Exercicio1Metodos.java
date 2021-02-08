package controle.exercicios;

public abstract class Exercicio1Metodos {

	public static boolean validaNumero(int numero) {

		if (numero >= 0 && numero <= 10) {
			return true;
			}
		return false;
	}
	
	public static boolean validaPar(int numero) {

		if (numero % 2 == 0) {
			return true;
			}
		return false;
	}

}
