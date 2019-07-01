package br.com.Testes;

import br.com.Exercicios1.CartaoCredito;
import br.com.Exercicios1.Cliente;

public class TesteClienteCdc {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		CartaoCredito cdc1 = new CartaoCredito(2345);
		cdc1.data = "17/24/2024";
		
		cdc1.cliente = c1;
		c1.codigo = 01;
		c1.nome = "Carlos";
		System.out.println(cdc1.cliente.nome);
		System.out.println(cdc1.cliente.codigo);
		System.out.println(cdc1.num);
		

	}

}
