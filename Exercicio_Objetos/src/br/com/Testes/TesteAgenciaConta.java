package br.com.Testes;

import br.com.Exercicios1.Agencia;
import br.com.Exercicios1.Conta;

public class TesteAgenciaConta {

	public static void main(String[] args) {
		Agencia a1 = new Agencia(12345);
		Conta c1 = new Conta(a1);
		
		
		c1.setLimite(1000.0); 
		c1.setNumero(321);
		c1.setSaldo(1000.0);
		
		System.out.println(c1.getAgencia().num);
		System.out.println(c1.getNumero());
		
		
		

	}

}
