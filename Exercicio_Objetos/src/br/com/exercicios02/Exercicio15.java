package br.com.exercicios02;

public class Exercicio15 {
	

	
	public static void main(String[] args) {
		// Desenvolver um programa que apresente a série de Fibonacci até o décimo
		// quinto termo. A série de Fibonacci é formada pela sequência
		// 1,1,2,3,5,8,13,21,34, ... etc. Ela se caracteriza pela soma de um termo
		// posterior com seu anterior subsequente.
		
		
		
		int ante = 0;
		int atual = 1;
		int temporario = 1;
		
		for (int i = 1; i <= 15; i++) {
			
			
			System.out.println(atual);
			temporario = ante + atual;
			ante = atual;
			atual = temporario;
			
			
			
		}

		
	}

}
