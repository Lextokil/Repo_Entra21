package br.com.exercicios02;

import br.com.util.Teclado;

public class Exercicio05 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente os resultados de uma tabela de um
		// número qualquer. Ela deve ser impressa no seguinte formato:
		
		int num;
		int result;
		num = Teclado.ReadInt("Digite um número:");
		
		for (int i = 1; i <= 10; i++) {
			result = num * i;
			System.out.println(num+"."+i+" = "+result);
		}

	}

}
