package br.com.Exercicios1;

public class Gerente extends Funcionario {
	private String nomeUsuario;
	private String senha;
	
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gerente(String xnome, Double xsal, String usuario, String senha) {
		super(xnome, xsal);
		this.nomeUsuario = usuario;
		this.senha = senha;
		
		// TODO Auto-generated constructor stub
	}
	
	//Override
	public void MostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salario:" + getSalarioFunc());
		System.out.println(getNomeUsuario());
		System.out.println(getSenha());
		System.out.println(Bonificacao());
	}
	
	//Override
	public Double Bonificacao() {
		Double bonificacao;
		bonificacao = getSalarioFunc() * 0.2;
		return bonificacao;
	}
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
