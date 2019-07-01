package br.com.Exercicios1;

public class Funcionario {
	public String nome;
	public Double salarioFunc = 1000.0;
	
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
