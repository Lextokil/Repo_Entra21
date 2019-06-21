package br.com.Exercicios;

public class Conta {
	int numero;
	Double saldo;
	Double limite = 100.0;
	Agencia agencia;
	
	public void Deposito(Double valor) {
		saldo += valor;
	}
	
	public void Saque(Double valor) {
		saldo -= valor;
	}
	
	public  void Extrato() {
		
		System.out.println("Conta: "   + numero);
		System.out.println("Agencia: " + agencia.num);
		System.out.println("Saldo: "   + saldo);
		System.out.println("Limite: "  + limite);
		
	}
	
	public  Double Consulta() {
		return saldo;
	}
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.numero = 1;
		c1.saldo = 1000.0;
		
		
		c2.numero = 2;
		c2.saldo = 3000.0;
		
		
		System.out.println(c1.numero +" "+ c1.saldo +" "+ c1.limite);
		System.out.println(c2.numero +" "+ c2.saldo +" "+ c2.limite);
		
	}

}
