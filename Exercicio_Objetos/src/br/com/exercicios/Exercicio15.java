package br.com.exercicios;

import br.com.util.Teclado;

public class Exercicio15 {

	public static void main(String[] args) {
		
		String[] nomes = new String[10];
		Double[] salarios = new Double[10];
		Double[] aliquota = new Double [10];
		
		
		for (int i = 0; i < salarios.length; i++) {
			nomes[i] = Teclado.ReadText("Digite o " + (i+1)+ "º nome");
			salarios[i] = Teclado.ReadDouble("Digite o " + (i+1)+ "º Salario");
			
			if (salarios[i] < 600) {
				
				aliquota[i] = 0.0;
				
			} else if (salarios[i] < 1500) {
				aliquota[i] = 0.10;
				
			}else {
				
				aliquota[i] = 0.15;
			}
						
		}
		
		for (int i = 0; i < aliquota.length; i++) {
			salarios[i] +=  salarios[i] * aliquota[i];
			System.out.println(nomes[i]+ " Tem a aliquota de "+ (aliquota[i]*100) + "% e o"
					+ " salario com desconto fica: "  +salarios[i]);
		}

	}

}
