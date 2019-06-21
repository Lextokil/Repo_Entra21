package br.com.Exercicios;

public class TesteAgenciaConta {

	public static void main(String[] args) {
		Agencia a1 = new Agencia();
		Conta c1 = new Conta();
		a1.num = 123;
		c1.agencia = a1;
		c1.limite = 1000d;
		c1.numero = 321;
		c1.saldo = 1000d;
		
		System.out.println(c1.agencia.num);
		System.out.println(c1.numero);
		
		c1.Extrato();
		c1.Deposito(500d);
		System.out.println(c1.Consulta());
		c1.Saque(300d);
		System.out.println(c1.Consulta());
		

	}

}
