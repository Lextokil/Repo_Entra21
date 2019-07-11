package br.com.Testes;

import br.com.Exercicios1.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		System.out.println(Conta.contador);
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		System.out.println(Conta.contador);
		System.out.println(c2.getNumero());
		Conta.ZeraContador();
		System.out.println(Conta.contador);
		
		
		c1.setSaldo(1000.0);
		
		 
		c2.setSaldo(3000.0); 

		//System.out.println(c1.numero + " " + c1.saldo + " " + c1.limite);
		//System.out.println(c2.numero + " " + c2.saldo + " " + c2.limite);
	}

}
