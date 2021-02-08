package controle.exercicios;

import javax.swing.JOptionPane;

//import java.util.Calendar;
//import java.util.Date;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String anoInformado = JOptionPane.showInputDialog("Informe o ano:").trim();
		int ano;
		
		try {
			ano = Integer.parseInt(anoInformado);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Ano inválido: " + ex.getMessage() );
			ano = -1;
		}
		
		if (ano >= 0 && ano % 4 == 0) {
			JOptionPane.showMessageDialog(null, "Ano bissexto");
		} else if (ano >= 0) {
			JOptionPane.showMessageDialog(null, "O ano não é bissexto");
		}

//		Date data1 = new Date();
//		Date data2 = new Date();
//
//		Calendar c1 = Calendar.getInstance();
//
//		c1.set(2016, 1, 1);
//		data1.setTime(c1.getTimeInMillis());
//		
//		c1.set(2017, 1, 1);
//		data2.setTime(c1.getTimeInMillis());
//		
//		System.out.println((data2.getTime() - data1.getTime())/1000/60/60/24);

	}

}
