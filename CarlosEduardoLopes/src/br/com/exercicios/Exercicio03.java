package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3) Desenvolver um programa que apresente os resultados de uma tabuada de um
		// n�mero qualquer informado pelo usu�rio.
		
		int num; 
		
		num = Teclado.lerInt("Digite um n�mero para ver sua tabuada: ");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x "+ (i*num));
			
		}

	}

}
