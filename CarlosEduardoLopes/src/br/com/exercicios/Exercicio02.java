package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio02 {

	public static void main(String[] args) {
		// ) Desenvolver um programa que apresente o total da soma de n n�meros inteiros
		// do n�mero 1 at� n, onde n � um valor informado pelo usu�rio.

		int num;
		int soma = 0;

		num = Teclado.lerInt("Digite um n�mero: ");

		for (int i = 1; i <= num; i++) {
			soma += i;

		}
		System.out.println(soma);

	}

}
