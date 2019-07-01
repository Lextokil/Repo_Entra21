package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio08 {

	public static void main(String[] args) {
		int num;
		num = Teclado.ReadInt("Digite um número: ");
		
		if (num<= 10 && num >= 1) {
			System.out.println("Esta na faixa");
		}else {
			System.out.println("Não esta na faixa");
		}

	}

}
