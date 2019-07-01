package br.com.exercicios02;

import br.com.util.Teclado;

public class Exercicio11 {

	public static void main(String[] args) {
		// Elaborar um programa que apresente o valor de uma potência de uma base
		// qualquer (Variável b) elevada a um expoente qualquer (Variável e), ou seja,
		// de be.(Sem usar Math.pow();)
		int b;
		int e = 0;
		int result = 0;
		b = Teclado.ReadInt("Digite a base: ");
		e = Teclado.ReadInt("Digite o expoente:");
		
		result = b;
		
		for (int i = 0; i < (e-1); i++) {
			result = result*b;
		}
		System.out.println(result);

	}

}
