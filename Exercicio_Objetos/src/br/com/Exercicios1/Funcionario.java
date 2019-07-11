package br.com.Exercicios1;

public class Funcionario {
	private String nome;
	private Double salarioFunc = 1000.0;
	private Double valeRefeicao = 25.0;

	public Funcionario() {

	}

	public Funcionario(String xnome, Double xsal) {
		this.nome = xnome;
		this.salarioFunc = xsal;
	}

	

	public void MostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Salario:" + salarioFunc);
		System.out.println(Bonificacao());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioFunc() {
		return salarioFunc;
	}

	public void setSalarioFunc(Double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}

	public Double getValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(Double valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}
	
	
	public void ReajusteValeRef(Double taxaPorcent) {
		taxaPorcent = taxaPorcent /100;
		this.valeRefeicao += this.valeRefeicao * taxaPorcent;
	}
	
	public Double Bonificacao() {
		Double bonificacao;
		bonificacao = this.salarioFunc * 0.1;
		return bonificacao;
	}
	
}
