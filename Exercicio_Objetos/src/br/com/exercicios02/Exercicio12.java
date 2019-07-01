package br.com.exercicios02;

import br.com.util.Teclado;

public class Exercicio12 {

	public static void main(String[] args) {
		// Desenvolver um programa que pe�a ao usu�rio para digitar diversos n�meros
		// reais, e ao final, exibir o maiore omenor n�mero que foram digitados, al�m da
		// m�dia entre TODOS os n�meros digitadospelo usu�rio. A inser��o de n�meros
		// deve parar quando o usu�rio digitar o n�mero -1, e este n�mero -1 n�o deve
		// ser considerado nem como maior, nem como menor, e nem na contagem da m�dia.
		
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
