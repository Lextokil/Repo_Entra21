package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio13 {

	public static void main(String[] args) {
		// Sabendo-se que uma Polegada equivale a 2,54 centímetros, desenvolver um
		// programa que exiba uma tabela de conversões de polegadas para centímetros, de
		// 1 polegada até um valor inteiro de polegada inserido pelo usuário.
		
		double polegada = 2.54;
		int num = 0;
		
		
		num = Teclado.ReadInt("Digite um numero de polegadas");
		num = (int) (num*polegada);
		System.out.println(num+ " Centimetros");
		

	}

}
