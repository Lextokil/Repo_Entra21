package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio13 {

	public static void main(String[] args) {
		// Sabendo-se que uma Polegada equivale a 2,54 cent�metros, desenvolver um
		// programa que exiba uma tabela de convers�es de polegadas para cent�metros, de
		// 1 polegada at� um valor inteiro de polegada inserido pelo usu�rio.
		
		double polegada = 2.54;
		int num = 0;
		
		
		num = Teclado.ReadInt("Digite um numero de polegadas");
		num = (int) (num*polegada);
		System.out.println(num+ " Centimetros");
		

	}

}
