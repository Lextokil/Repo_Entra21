package br.com.exercicios02;

public class Exercicio14 {

	public static void main(String[] args) {
		// Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
		// Desta forma, temos que 5! = 5 . 4 . 3 . 2 . 1 ou 5! = 1 . 2 . 3 . 4 . 5,
		// equivalente a 120.
		
		int fat = 5;
		
		
		for (int i = 4; i > 0; i--) {
			fat = fat*i;
		}
		System.out.println(fat);

	}

}
