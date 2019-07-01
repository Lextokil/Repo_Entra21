package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio11 {

	public static void main(String[] args) {
		int num;
		Double result;
		num = Teclado.ReadInt("Digite um número de três casas: ");
		
		num = (num/100);
		
		System.out.println(num);

	}

}
