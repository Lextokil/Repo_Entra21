package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio06 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente o valor de uma potência de uma base
		// qualquer elevada a um expoente qualquer, ou seja, de b e
		// , onde os valores de b e e são fornecidos pelo usuário, sem utilizar
		// Math.pow().
		int b;
		int e;
		int result = 0;
		
		
		b = Teclado.lerInt("informe o valor base");
		e = Teclado.lerInt("Informe a potencia");
		result = b;
		
		for (int i = 0; i < (e-1); i++) {
			result = result*b;
			
		}
		System.out.println(result);
		

		
	}

}
