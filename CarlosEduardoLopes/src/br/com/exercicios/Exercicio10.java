package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio10 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente o fatorial de um n�mero informado pelo
		// usu�rio.
		
		int num = 0;
		int fatorial = 0;
		
		num = Teclado.lerInt("Digite um n�mero:");
		fatorial = num;
		
		for (int i = (num-1); i >= 1; i--) {
			fatorial = fatorial *i;
		}
		System.out.println(fatorial);
	}
	

}
