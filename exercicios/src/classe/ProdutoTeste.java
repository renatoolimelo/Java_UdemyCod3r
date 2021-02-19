package classe;

import javax.swing.JOptionPane;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);

		var p2 = new Produto("Caneta Preta", 12.56);
		
		Produto.setDesconto(0.5);

		System.out.println(p1);
		System.out.println(p2);

		JOptionPane.showMessageDialog(null, p1);
		JOptionPane.showMessageDialog(null, p2);

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = Math.round((precoFinal1 + precoFinal2) * 100) / 2.0 / 100.0;
		
		JOptionPane.showMessageDialog(null, "Média do carrinho = R$" + mediaCarrinho);

	}

}
