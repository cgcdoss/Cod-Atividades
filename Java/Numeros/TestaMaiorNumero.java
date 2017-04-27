package br.com.teste.numeros;

import javax.swing.JOptionPane;

public class TestaMaiorNumero {

	public static void main(String[] args) {
		String numeros;
		numeros = JOptionPane.showInputDialog("Informe os números, separando-os com espaço: ");
		MaiorNumero maiorNumero = new MaiorNumero();
		int maior = maiorNumero.checaMaiorNumero(numeros);
		JOptionPane.showMessageDialog(null, "Maior número é: " + maior);
		
		/////////////////////////////////////////////////Outra maneira de fazer//////////////////////////////////////////////////////////////
		
//		JOptionPane.showMessageDialog(null, "Maior número é " + new MaiorNumero().checaMaiorNumero(JOptionPane.showInputDialog("Informe os números, separando-os com espaço: ")));

	}
}
