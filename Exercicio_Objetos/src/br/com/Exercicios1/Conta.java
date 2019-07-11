package br.com.Exercicios1;

public class Conta {
	private int numero;
	private Double saldo;
	private Double limite = 100.0;
	public static int contador;
	private Agencia agencia;
	 
	



	public Conta() {
		Conta.contador ++;
		this.numero = Conta.contador;
	};
	
	
	public Conta( Double saldo, Double limite, Agencia agencia) {
		Conta.contador ++;
		this.numero = Conta.contador;
		this.saldo = saldo;
		this.limite = limite;
		this.agencia = agencia;
		
		
		
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Double getLimite() {
		return limite;
	}


	public void setLimite(Double limite) {
		this.limite = limite;
	}

	


	public Agencia getAgencia() {
		return agencia;
	}


	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}


	public Conta(Agencia agencia) {
		this.agencia = agencia;
		
	}

	public void Deposito(Double valor) {
		saldo += valor;
	}

	public void Saque(Double valor) {
		saldo -= valor;
	}

	public void Extrato() {

		System.out.println("Conta: " + numero);
		System.out.println("Agencia: " + agencia.num);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);

	}

	public Double Consulta() {
		return saldo;
	}

	public void Transfere(Double valorTransferido, Conta cotaDestino) {
		if ((this.saldo - valorTransferido) >= 0) {
			this.saldo -= valorTransferido;
			cotaDestino.saldo += valorTransferido;
		} else {
			System.out.println("Saldo Indisponível");
		}
		
		
		
	}
	
	public static int  ZeraContador() {
		int contasCriadas;
		contasCriadas = Conta.contador;
		Conta.contador = 0;
		return contasCriadas;
		
		
	}


}
