package br.com.Testes;

import br.com.Exercicios1.Agencia;
import br.com.Exercicios1.Conta;

public class TesteMetodosConta {

	public static void main(String[] args) {
		Agencia a1 = new Agencia(12345);
		Agencia a2 = new Agencia(75634);
		Conta c1 = new Conta(a1);
		Conta c2  = new Conta(a2);
		
		
		
		
	//	System.out.println(c1.agencia.num);
		//System.out.println(c1.numero);
		
		c1.Extrato();
		c1.Deposito(500.0);
		System.out.println(c1.Consulta());
		c1.Saque(300.0);
		System.out.println(c1.Consulta());
		
		//transfere um valor maior que o saldo da conta
		c1.Transfere(2000.0, c2);
		
		//transfere um valor válido
		c1.Transfere(1000.0, c2);
		System.out.println(c1.Consulta());
		System.out.println(c2.Consulta());
		
		
	}

}
