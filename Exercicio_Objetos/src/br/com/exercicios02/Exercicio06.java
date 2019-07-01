package br.com.exercicios02;

import br.com.util.Teclado;

public class Exercicio06 {

	public static void main(String[] args) {
		// Desenvolver um programa que leiaum número nqualquer menor ou igual a 50 e
		// apresente o valor obtido da multiplicação sucessiva de npor 3 enquanto o
		// produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
		
		int num;
		int mult = 3;
		int parametro = 1;
		int result = 0;
		num = Teclado.ReadInt("Digite um número -50:");
		
		while (num >= 50) {
			num = Teclado.ReadInt("Digite um número -50:");
			
		}
		
		while ((result) < 250) {
			
			
			
			for (int i = 0; i < parametro ; i++) {
				result += (num * mult);
			}
			parametro++;
			if ((result)<250) {
				
				System.out.println(result);
			}
			
			
		}

	}

}
