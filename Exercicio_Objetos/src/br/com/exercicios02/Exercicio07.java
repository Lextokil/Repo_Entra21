package br.com.exercicios02;

public class Exercicio07 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente todos os números divisíveis por 4 que
		// sejam menores que 200. Para saber se o número é divisível por 4será
		// necessárioverificar a lógica desta condição com o comando if.Sendo divisível,
		// mostre-o; não sendo, passe para o próximo passo. A variável que controla o
		// contador deve ser iniciada com valor 1.
		
		for (int i = 1; i <= 200; i++) {
			if (i%4 == 0) {
				System.out.println(i);
			}
		}

	}

}
