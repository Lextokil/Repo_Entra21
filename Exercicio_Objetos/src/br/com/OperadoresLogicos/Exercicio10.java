package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio10 {

	public static void main(String[] args) {
		int num1;
		int num2;
		num1 = Teclado.ReadInt("Digite um número: ");
		num2 = Teclado.ReadInt("Digite um número: ");
		
		if (num1%num2 == 0) {
			System.out.println("É divisor");
		} else {
			System.out.println("Não é divisor");
		}

	}

}
