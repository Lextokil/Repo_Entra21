package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio07 {

	public static void main(String[] args) {
		int num ;
		
		num = Teclado.ReadInt("Digite um número: ");
		
		if (num < 0) {
			num = num * -1;
			
			System.out.println(num);
		}else {
			System.out.println(num);
		}

	}

}
