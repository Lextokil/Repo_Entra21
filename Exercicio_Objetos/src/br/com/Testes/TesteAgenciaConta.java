package br.com.Testes;

import br.com.Exercicios.Agencia;
import br.com.Exercicios.Conta;

public class TesteAgenciaConta {

	public static void main(String[] args) {
		Agencia a1 = new Agencia(12345);
		Conta c1 = new Conta(a1);
		
		
		c1.limite = 1000d;
		c1.numero = 321;
		c1.saldo = 1000d;
		
		System.out.println(c1.agencia.num);
		System.out.println(c1.numero);
		
		
		

	}

}
