package com.caelum.fj11.contas;

public class TestaData {

	public static void main(String[] args) {

		int dia = 31;
		int mes = 4;
		int ano = 2001;
		boolean diaValido = false;

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia >= 1 && dia <= 31) {
				diaValido = true;
			} else {
				diaValido = false;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia >= 1 && dia <= 30) {
				diaValido = true;
			} else {
				diaValido = false;
			}
			break;
		case 2:
			if (ano % 4 == 0) {
				if (dia >= 1 && dia <= 29) {
					diaValido = true;
				} else {
					diaValido = false;
				}
			} else {
				if (dia >= 1 && dia <= 28) {
					diaValido = true;
				} else {
					diaValido = false;
				}
			}
			break;
		default:
			System.out.println("Informar mês entre 1 a 12");
		}

		if (diaValido) {
			System.out.println("Data é valida!");
		} else {
			System.out.println("Data não é valida!");
		}

	}

}
