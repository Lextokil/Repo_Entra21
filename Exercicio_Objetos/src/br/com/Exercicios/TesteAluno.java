package br.com.Exercicios;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 =  new Aluno("Cadu", 5054899, "17/06/1997");
		Aluno a2 = new Aluno("Gui", 5088349, "16/08/1999");
		
		System.out.println(a1.nome + a1.rg + a1.datNasc);
		System.out.println(a2.nome + a2.rg + a2.datNasc);
		
				

	}

}
