package br.com.Exercicios1;

public class Conta {
	public int numero;
	public Double saldo;
	public Double limite = 100.0;
	public Agencia agencia;
	
	public Conta() {
		
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


}
