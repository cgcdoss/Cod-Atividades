package br.com.teste.numeros;

import javax.swing.JOptionPane;

public class TestaMaiorNumero {

	public static void main(String[] args) {
		String numeros;
		numeros = JOptionPane.showInputDialog("Informe os n�meros, separando-os com espa�o: ");
		MaiorNumero maiorNumero = new MaiorNumero();
		int maior = maiorNumero.checaMaiorNumero(numeros);
		JOptionPane.showMessageDialog(null, "Maior n�mero �: " + maior);
		
		/////////////////////////////////////////////////Outra maneira de fazer//////////////////////////////////////////////////////////////
		
//		JOptionPane.showMessageDialog(null, "Maior n�mero � " + new MaiorNumero().checaMaiorNumero(JOptionPane.showInputDialog("Informe os n�meros, separando-os com espa�o: ")));

	}
}
