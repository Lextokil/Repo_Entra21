package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio12 {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		int maior = 0;
		int menor = 999999999;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Teclado.ReadInt("Digite um número: ");
			
			if (numeros[i]> maior) {
				maior = numeros[i];
				
			} else if (numeros[i] < menor) {
				menor = numeros[i];
			}

			
		}
		
		System.out.println(maior);
		System.out.println(menor);

	}

}
