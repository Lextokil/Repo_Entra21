package br.com.exercicios;

public class Exercicio07 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente no final a soma dos valores pares
		// existentes na faixa de 3 até 21.
		
		int result = 0;
		for (int i = 3; i <= 21; i++) {
			if (i%2 == 0) {
				result += i;
			}
		}
		System.out.println(result);

	}

}
