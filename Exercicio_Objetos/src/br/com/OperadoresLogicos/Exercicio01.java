package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double num;
		num = Teclado.ReadDouble("Digite um número:");
		if (num > 20) {
			num = num/2;
			System.out.println(num);
		} else {
			System.out.println(num);
		}
	}

}
