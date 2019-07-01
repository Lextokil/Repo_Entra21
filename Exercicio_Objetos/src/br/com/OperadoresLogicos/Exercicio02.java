package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capital;
		capital = Teclado.ReadText("Qual a capital do Brasil? ");
		
		if (capital.equalsIgnoreCase("Brasilia")) {
			System.out.println("Acertou");
		} else {
			System.out.println("Errou");
		}
	}

}
