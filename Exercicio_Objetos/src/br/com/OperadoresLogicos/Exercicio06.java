package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio06 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int dif;
		num1 = Teclado.ReadInt("Digite um n�mero:");
		num2 = Teclado.ReadInt("Digite um n�mero:");
		
		if (num1 > num2) {
			dif = num1 - num2;
		} else {
			dif = num2 - num1;
		}
		System.out.println(dif);

	}

}
