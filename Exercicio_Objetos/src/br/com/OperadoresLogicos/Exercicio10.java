package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio10 {

	public static void main(String[] args) {
		int num1;
		int num2;
		num1 = Teclado.ReadInt("Digite um n�mero: ");
		num2 = Teclado.ReadInt("Digite um n�mero: ");
		
		if (num1%num2 == 0) {
			System.out.println("� divisor");
		} else {
			System.out.println("N�o � divisor");
		}

	}

}
