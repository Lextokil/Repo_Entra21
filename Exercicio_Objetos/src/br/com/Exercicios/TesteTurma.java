package br.com.Exercicios;

public class TesteTurma {

	public static void main(String[] args) {
		Turma t1 = new Turma("XXX", "Medio", 01, 04);
		Turma t2 = new Turma("Gxg", "Basico", 05, 03);
		System.out.println(t1.sigla + t1.serie + t1.tipoEnsino + t1.periodo);
		System.out.println(t2.sigla + t2.serie + t2.tipoEnsino + t2.periodo);
		

	}

}
