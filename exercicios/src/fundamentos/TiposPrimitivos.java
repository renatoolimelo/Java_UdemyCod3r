package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		System.out.println(pontosAcumulados);
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias= true;
		char status = 'a';
		
		System.out.println(anosDeEmpresa * 365);
		
		System.out.println(numeroDeVoos / 2);
		
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + " ganha: " + salario);
		
	}

}
