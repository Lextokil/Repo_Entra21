package br.com.exercicios02;

import br.com.util.Teclado;

public class Exercicio12 {

	public static void main(String[] args) {
		// Desenvolver um programa que peça ao usuário para digitar diversos números
		// reais, e ao final, exibir o maiore omenor número que foram digitados, além da
		// média entre TODOS os números digitadospelo usuário. A inserção de números
		// deve parar quando o usuário digitar o número -1, e este número -1 não deve
		// ser considerado nem como maior, nem como menor, e nem na contagem da média.
		
		double maior = 0.0;
		double menor = 100000.0;
		double media = 0.0;
		double soma  = 0.0;
		double num   = 0.0;
		
		
		do {
			
			num = Teclado.ReadDouble("Digite um numero real;");
			
			if (num > -1) {
				if (num > maior) {
					maior = num;
					
				}
				if (num < menor) {
					menor = num;
				}
				soma += num;
				media++;
			}
			
		} while (num > -1);
		media = soma/media;
		System.out.println("Media:"+media);
		System.out.println("Maior" +maior);
		System.out.println("Menor" +menor);
		
	}
	

}
