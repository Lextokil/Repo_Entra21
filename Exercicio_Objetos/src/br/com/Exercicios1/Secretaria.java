package br.com.Exercicios1;

public class Secretaria extends Funcionario{
	private int numeroRamal;
	
	
	public Secretaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretaria(String xnome, Double xsal, int numeroRamal) {
		super(xnome, xsal);
		this.numeroRamal = numeroRamal;
		
	}

	public int getNumeroRamal() {
		return numeroRamal;
	}

	public void setNumeroRamal(int numeroRamal) {
		this.numeroRamal = numeroRamal;
	}
	
	// Override
	public void MostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salario:" + getSalarioFunc());
		System.out.println(Bonificacao());
		System.out.println(getNumeroRamal());
	}


	

}
