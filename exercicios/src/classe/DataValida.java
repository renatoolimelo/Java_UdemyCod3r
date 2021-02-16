package classe;

import javax.swing.JOptionPane;

public abstract class DataValida {

	public static int validaData(String anoDigitado, String periodo) {

		int ano;

		try {
			ano = Integer.parseInt(anoDigitado);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, periodo + " inválido: " + anoDigitado);
			return -1;
		}

		return ano;
	}

	public static boolean validaAno(int ano) {

		if (ano < 0 || ano > 2100) {
			JOptionPane.showMessageDialog(null, "Erro escolha entre os anos de 0 e 2100");
			return false;
		}
		return true;
	}

	public static boolean validaMes(int mes) {

		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Existem apenas 12 meses no ano");
			return false;
		}
		return true;
	}

	public static boolean validaDia(int dia, int mes, int ano) {

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia < 0 || dia > 31) {
				JOptionPane.showMessageDialog(null, "O mês possui 31 dias");
				return false;
			}
			return true;

		case 4:
		case 6:
		case 9:
		case 11:
			if (dia < 0 || dia > 30) {
				JOptionPane.showMessageDialog(null, "O mês possui 30 dias");
				return false;
			}
			return true;

		case 2:
			if (ano % 4 == 0) {
				if (dia < 0 || dia > 29) {
					JOptionPane.showMessageDialog(null, "O mês possui 29 dias");
					return false;
				}
				return true;
			} else {
				if (dia < 0 || dia > 28) {
					JOptionPane.showMessageDialog(null, "O mês possui 28 dias");
					return false;
				}
				return true;
			}

		default:
			JOptionPane.showMessageDialog(null, "Dados inválidos");
			return false;
		}
	}

}
