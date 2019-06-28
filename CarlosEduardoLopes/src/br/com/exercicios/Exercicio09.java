package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio09 {

	public static void main(String[] args) {
		// Desenvolver um programa que pergunte um número inteiro e exiba os números que
		// são, ao mesmo tempo, múltiplos de 3 e 5, na sequência de 1 até o número
		// informado pelo usuário.

		int num = 0;
		num = Teclado.lerInt("Digite um número:");
		for (int i = 1; i <= num; i++) {
			if ((i%3 == 0) && (i%5 ==0)) {
				System.out.println(i);
			}
		}
	}

}
