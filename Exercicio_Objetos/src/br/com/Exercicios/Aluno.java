package br.com.Exercicios;

public class Aluno {
	String nome;
	int rg;
	String datNasc;
	Turma turma;
	
	public Aluno(){
		
	}
	
	public Aluno(String xNome, int xRG, String xdata){
		this.nome = xNome;
		this.rg = xRG;
		this.datNasc = xdata;
	}
	
	
}
