package br.com.OperadoresLogicos;

import br.com.util.Teclado;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] notas = new Double[4];

		Double media = 0.0;
		for (int i = 0; i < notas.length; i++) {
			
			notas[i] = Teclado.ReadDouble("Digite a "+ (i+1)+"� nota:");
			media += notas[i];
			
		}
		
		media = media/notas.length;
		
		if (media < 5) {
			System.out.println("Reprovado m�dia: "+media);
		} else {
			System.out.println("Aprovado m�dia: "+media);
		}
		

	}

}
