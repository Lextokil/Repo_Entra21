package br.com.exercicios02;

public class Exercicio15 {
	

	
	public static void main(String[] args) {
		// Desenvolver um programa que apresente a s�rie de Fibonacci at� o d�cimo
		// quinto termo. A s�rie de Fibonacci � formada pela sequ�ncia
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
