package classe;

import javax.swing.JOptionPane;

public class DataTeste {

	public static void main(String[] args) {

		String anoDigitado;
		String mesDigitado;
		String diaDigitado;
		int ano = -1;
		int mes = -1;
		int dia = -1;
		boolean anoValido = false;
		boolean mesValido = false;
		boolean diaValido = false;

		anoDigitado = JOptionPane.showInputDialog("Informe o ano:").trim();
		ano = DataValida.validaData(anoDigitado, "Ano");

		if (ano != -1) {
			anoValido = DataValida.validaAno(ano);
		}

		if (anoValido) {
			mesDigitado = JOptionPane.showInputDialog("Informe o mês:");
			mes = DataValida.validaData(mesDigitado, "Mês");
		}

		if (anoValido && mes != -1) {
			mesValido = DataValida.validaMes(mes);
		}
		
		if (mesValido) {
			diaDigitado = JOptionPane.showInputDialog("Informe o dia:");
			dia = DataValida.validaData(diaDigitado, "Dia");
		}
		
		if (mesValido && dia != -1) {
			diaValido = DataValida.validaDia(dia, mes, ano);
		}
		
		if(anoValido && mesValido && diaValido) {
			Data data = new Data(dia, mes, ano);
			JOptionPane.showMessageDialog(null, data);
		}
		
		JOptionPane.showMessageDialog(null, "Fim!!!");

	}

}
