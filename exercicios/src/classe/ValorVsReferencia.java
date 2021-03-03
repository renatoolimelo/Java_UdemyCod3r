package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;

		a++;
		b--;

		System.out.println(a + " " + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;

		d1.setDia(31);
		d2.setMes(12);
		d1.setAno(2025);

		System.out.println(d1);
		System.out.println(d2);

		voltarDataParaValorPadrao(d1);

		System.out.println(d1);
		System.out.println(d2);

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}

	private static void voltarDataParaValorPadrao(Data d) {
		d.setDia(1);
		d.setMes(1);
		d.setAno(1970);
	}

	private static void alterarPrimitivo(int a) {
		a++;
	}

}
