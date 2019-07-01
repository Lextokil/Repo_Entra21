package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio14 {

	public static void main(String[] args) {
		// Desenvolver um programa que pergunte nome, nota1 e nota2 de cada um dos 15
		// alunos de uma turma. E exiba a listagem contendo nome, nota1, nota2, m�dia e
		// apresente �APROVADO� se a m�dia for maior ou igual a 5, e �REPROVADO� se a
		// m�dia for menor que 5. Ao final, exibir tamb�m a m�dia da turma.
		
		String[] nomes = new String[15];
		Double[] notas1 = new Double[15];
		Double[] notas2 = new Double[15];
		Double[] medias = new Double[15];
		
		for (int i = 0; i <= medias.length; i++) {
			nomes[i] = Teclado.ReadText("Digite o " +(i+1)+ "� nome: "); 
			notas1[i] = Teclado.ReadDouble("Digite a " +(i+1)+ "� primeira nota: "); 
			notas2[i] = Teclado.ReadDouble("Digite a " +(i+1)+ "� segunda nota: ");
			
			medias[i] = (notas1[i] + notas2[i])/2;
			
			if (medias[i] < 5) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Aprovado");
			}
			
		}
		
		
		
	}

}
