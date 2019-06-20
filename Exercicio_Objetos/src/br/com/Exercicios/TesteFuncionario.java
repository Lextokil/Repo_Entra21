package br.com.Exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Chico", 4500.50);
		Funcionario f2 = new Funcionario("Ze", 1000.50);
		System.out.println(f1.nome + f1.salarioFunc);
		System.out.println(f2.nome + f2.salarioFunc);

	}

}
