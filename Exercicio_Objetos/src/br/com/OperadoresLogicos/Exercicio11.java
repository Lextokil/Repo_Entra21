package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio11 {

	public static void main(String[] args) {
		int num;
		
		num = Teclado.ReadInt("Digite um n�mero de tr�s casas: ");
		
		num = (num/100);
		
		System.out.println(num);

	}

}
