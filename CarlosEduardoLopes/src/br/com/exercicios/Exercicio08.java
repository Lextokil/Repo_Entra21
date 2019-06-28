package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio08 {

	public static void main(String[] args) {
		// Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa,
		// sexo e idade, e exiba o nome inteiro das pessoas que são do sexo masculino e
		// possuem 21 anos ou mais.
		
		String[] nomes = new String[20];
		int[] idades = new int[20];
		String[] sexos = new String[20];
		
		for (int i = 0; i < sexos.length; i++) {
			nomes[i] = Teclado.lerTexto("digite o " +(i+1)+" Nome: ");
			idades[i] = Teclado.lerInt("digite a " +(i+1)+" idade: ");
			sexos[i] = Teclado.lerTexto("digite o " +(i+1)+" Sexo: ");
			
			
		}
		for (int i = 0; i < sexos.length; i++) {
			if (sexos[i].equalsIgnoreCase("m") && idades[i] >= 21) {
				System.out.println(nomes[i]);
				
			}
			
		}
		

	}

}
