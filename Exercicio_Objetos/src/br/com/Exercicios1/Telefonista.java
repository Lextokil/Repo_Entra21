package br.com.Exercicios1;

public class Telefonista extends Funcionario {
	private int codTrab;

	public Telefonista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telefonista(String xnome, Double xsal, int codTrab) {
		super(xnome, xsal);
		this.codTrab = codTrab;
		// TODO Auto-generated constructor stub
	}

	// Override
	public void MostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salario:" + getSalarioFunc());
		System.out.println(Bonificacao());
		System.out.println(getCodTrab());
	}

	public int getCodTrab() {
		return codTrab;
	}

	public void setCodTrab(int codTrab) {
		this.codTrab = codTrab;
	}

}
