package br.com.exercicios;

public class Exercicio12 {

	public static void main(String[] args) {
		// Agora fa�a uma altera��o para que sejam apresentados somente os itens acima
		// da diagonal principal da matriz anterior. No lugar que n�o � para exibir a
		// triangula��o, dever� aparecer x-x. Dever� aparecer como resposta algo assim
		// na tela:
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("\n");
			for (int j = 1; j <= 10; j++) {
				if (j<=i) {
					System.out.print(" x - x "+"    ");
				} else {
					
					System.out.print(i+" x "+ j +"    ");
				}
				
			}
		}

	}

}
