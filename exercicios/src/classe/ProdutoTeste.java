package classe;

import javax.swing.JOptionPane;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89, 0.25);

		var p2 = new Produto("Caneta Preta", 12.56, 0.29);

		System.out.println(p1);
		System.out.println(p2);

		JOptionPane.showMessageDialog(null, p1);
		JOptionPane.showMessageDialog(null, p2);

		double precoFinal1 = p1.getPreco() * (1 - p1.getDesconto());
		double precoFinal2 = p2.getPreco() * (1 - p2.getDesconto());
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		JOptionPane.showMessageDialog(null, "Média do carrinho = R$" + mediaCarrinho);

	}

}
