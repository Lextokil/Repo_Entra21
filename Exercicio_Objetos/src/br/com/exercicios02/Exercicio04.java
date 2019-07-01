package br.com.exercicios02;

public class Exercicio04 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente o valor da soma dos cem primeiros
		// números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)
		
		int num = 0;
		
		for (int i = 1; i <= 100; i++) {
			num+= i;
			
		}
		System.out.println(num);

	}

}
