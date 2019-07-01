package br.com.exercicios02;

public class Exercicio10 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente as pot�ncias de 3 variando de 0 a 15.
		// Deve ser considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 �
		// ele pr�prio. A apresenta��o deve observar a seguinte exibi��o na tela:
		
		int base =3;
		int pot=0;
		int result = 0;
		
		for (int i = 0; i <= 15; i++) {
			
			result = base;
			pot = i;
			
			for (int j = 0; j < (pot-1); j++) {
				result = result*base;
			}
			
			if (result > 0) {
				
				System.out.println("3 elevado a "+i+" = "+result);
			}else {
				result = 1;
				System.out.println("3 elevado a "+i+" = "+result);
			}
			
		}

	}

}
