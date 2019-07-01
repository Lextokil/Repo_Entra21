package br.com.Testes;

import br.com.Exercicios1.Aluno;
import br.com.Exercicios1.Turma;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 =  new Aluno("Cadu", 5054899, "17/06/1997");
		Turma t1 = new Turma();
		a1.turma = t1;
		t1.periodo = 6;
		t1.serie = 8;
		t1.tipoEnsino = "Médio";
		t1.sigla = "XXT";
		
		
		
		System.out.println("Periodo: " + a1.turma.periodo);
		System.out.println("Série: " + a1.turma.serie);
		System.out.println("Tipo de ensino: " +a1.turma.tipoEnsino);
		System.out.println("Sigla: " + a1.turma.sigla);
		
		
				

	}

}
