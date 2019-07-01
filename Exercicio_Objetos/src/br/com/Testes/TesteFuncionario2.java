package br.com.Testes;

import br.com.Exercicios1.Funcionario;
import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.nome = Teclado.ReadText("Digite o nome do funcionario:" );
		
	}
}
