package br.com.exercicios02;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		for (int i = 0; i <= 500; i += 2) {
			if (i%2 ==0) {
				soma += i;
			}
			
		}
		System.out.println(soma);
	}

}
