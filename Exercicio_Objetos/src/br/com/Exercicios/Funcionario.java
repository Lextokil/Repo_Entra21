package br.com.Exercicios;

public class Funcionario {
	String nome;
	Double salarioFunc;
	
	public Funcionario(){
		
	}
	public Funcionario(String xnome, Double xsal){
		this.nome = xnome;
		this.salarioFunc = xsal;
	}
	
	public void AumentarSalario (Double valor) {
		salarioFunc += valor;
	}
	
	public void Consultar() {
		System.out.println("Nome: "+nome);
		System.out.println("Salario:" + salarioFunc);
	}
}
