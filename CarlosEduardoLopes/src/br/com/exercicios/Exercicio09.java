package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio09 {

	public static void main(String[] args) {
		// Desenvolver um programa que pergunte um n�mero inteiro e exiba os n�meros que
		// s�o, ao mesmo tempo, m�ltiplos de 3 e 5, na sequ�ncia de 1 at� o n�mero
		// informado pelo usu�rio.

		int num = 0;
		num = Teclado.lerInt("Digite um n�mero:");
		for (int i = 1; i <= num; i++) {
			if ((i%3 == 0) && (i%5 ==0)) {
				System.out.println(i);
			}
		}
	}

}
