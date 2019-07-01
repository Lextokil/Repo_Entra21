package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio04 {

	public static void main(String[] args) {
		int num;
		num = Teclado.ReadInt("Digite um número: ");
		if (num % 4 == 0 && num % 5 == 0) {
			System.out.println(num);
		} else {
			System.out.println("Número indivisível por 4 e 5");
		}

	}
}
