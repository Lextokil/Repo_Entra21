package br.com.Exercicios1;

public class Gerente {
	Funcionario funcionario;
	
	public void AumentoFixo() {
		funcionario.salarioFunc += (funcionario.salarioFunc * 0.1);
	}
	
	public void AumentoVariavel(Double porcetagem) {
		funcionario.salarioFunc += funcionario.salarioFunc *(porcetagem/100);
	}

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Funcionario f1 = new Funcionario();
		
		f1.nome ="Carlos";
		f1.salarioFunc = 1000d;
		g1.funcionario = f1;
		
		System.out.println("Nome: "+  g1.funcionario.nome +"Salario: " +g1.funcionario.salarioFunc);
		g1.AumentoFixo();
		System.out.println("Nome: "+  g1.funcionario.nome +"Salario: " +g1.funcionario.salarioFunc);
		g1.AumentoVariavel(35d);
		System.out.println("Nome: "+  g1.funcionario.nome +"Salario: " +g1.funcionario.salarioFunc);
		
		
	}
}
