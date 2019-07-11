package br.com.Testes;

import br.com.Exercicios1.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Chico", 4500.50);
		
		f1.setSalarioFunc(2000.0);
		f1.MostrarDados();
		System.out.println(f1.getValeRefeicao());
		f1.ReajusteValeRef(50.0);
		System.out.println(f1.getValeRefeicao());
		

	}

}
