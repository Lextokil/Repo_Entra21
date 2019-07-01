package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio03 {

	public static void main(String[] args) {
	 int num;
	 num = Teclado.ReadInt("digite um número: ");
	 
	 if (num%2 ==0) {
		System.out.println("PAR");
	} else {
		System.out.println("IMPAR");
	}

	}
}
