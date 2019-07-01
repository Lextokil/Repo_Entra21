package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio09 {

	public static void main(String[] args) {
		int num;
		num = Teclado.ReadInt("Digite um número: ");
		
		if (num < 0) {
			System.out.println("Negativo");
		}else if (num == 0) {
			System.out.println("Nulo");
		}else {
			System.out.println("Positivo");
		}

	}

}
