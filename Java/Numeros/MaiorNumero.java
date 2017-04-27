package br.com.teste.numeros;

public class MaiorNumero {

	public int checaMaiorNumero(String numeros) {
		String[] split = numeros.split(" "); //Criar um vetor com n�meros, aonde o separador � o espa�o
		int[] listaNumeros = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			listaNumeros[i] = Integer.parseInt(split[i]);
		}
		int max = listaNumeros[0];
		for (int i = 1; i < listaNumeros.length; i++) {
			if (listaNumeros[i] > max)
				max = listaNumeros[i];
		}
		return max;
	}
}
