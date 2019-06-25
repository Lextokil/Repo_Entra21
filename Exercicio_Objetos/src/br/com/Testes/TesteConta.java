package br.com.Testes;

import br.com.Exercicios.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.numero = 1;
		c1.saldo = 1000.0;

		c2.numero = 2;
		c2.saldo = 3000.0;

		System.out.println(c1.numero + " " + c1.saldo + " " + c1.limite);
		System.out.println(c2.numero + " " + c2.saldo + " " + c2.limite);
	}

}
