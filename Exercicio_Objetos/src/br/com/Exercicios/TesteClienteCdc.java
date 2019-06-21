package br.com.Exercicios;

public class TesteClienteCdc {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		CartaoCredito cdc1 = new CartaoCredito();
		cdc1.data = "17/24/2024";
		cdc1.num  = 3456;
		cdc1.cliente = c1;
		c1.codigo = 01;
		c1.nome = "Carlos";
		System.out.println(cdc1.cliente.nome);
		System.out.println(cdc1.cliente.codigo);
		

	}

}
