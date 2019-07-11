package br.com.Testes;

import br.com.Exercicios1.Funcionario;
import br.com.Exercicios1.Gerente;
import br.com.Exercicios1.Secretaria;
import br.com.Exercicios1.Telefonista;

public class TesteHerancaFuncionario {

	public static void main(String[] args) {
		Funcionario G1 = new Gerente("Carlos", 2000.0, "UsuarioGerente", "SenhaGerente");
		Funcionario T1 = new Telefonista("Juzinha", 800.0, 6969);
		Funcionario S1 = new Secretaria("Chelle", 950.0, 1234);
		System.out.println(G1.Bonificacao());
		System.out.println(T1.Bonificacao());
		System.out.println(S1.Bonificacao());
		G1.MostrarDados();
		T1.MostrarDados();
		S1.MostrarDados();
		
		

	}

}
