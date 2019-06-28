package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio02 {

	public static void main(String[] args) {
		// ) Desenvolver um programa que apresente o total da soma de n números inteiros
		// do número 1 até n, onde n é um valor informado pelo usuário.

		int num;
		int soma = 0;

		num = Teclado.lerInt("Digite um número: ");

		for (int i = 1; i <= num; i++) {
			soma += i;

		}
		System.out.println(soma);

	}

}
