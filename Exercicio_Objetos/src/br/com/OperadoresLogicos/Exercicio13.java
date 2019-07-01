package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio13 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		num1 = Teclado.ReadInt("Digite um número: ");
		num2 = Teclado.ReadInt("Digite um número: ");
		num3 = Teclado.ReadInt("Digite um número: ");
		
		if (num1 > num2 && num1 > num3) {
			if (num2 >num3) {
				System.out.println(num3+ " "+ num2 + " "+ num1);
			} else {
				System.out.println(num2+ " "+ num3 + " "+ num1);
			}
			
			
		}else if (num2 > num1 && num2 > num3) {
			if (num1 >num3) {
				System.out.println(num3+ " "+ num1 + " "+ num2);
			} else {
				System.out.println(num1+ " "+ num3 + " "+ num2);
			}
		} else {
			if (num2 >num1) {
				System.out.println(num1+ " "+ num2 + " "+ num3);
			} else {
				System.out.println(num2+ " "+ num1 + " "+ num3);
			}
		}

	}

}
