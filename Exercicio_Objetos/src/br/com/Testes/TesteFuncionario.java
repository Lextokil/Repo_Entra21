package br.com.Testes;

import br.com.Exercicios1.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Chico", 4500.50);
		
		f1.AumentarSalario(2000d);
		f1.Consultar();
		

	}

}
