package br.com.Exercicios1;

public class Aluno {
	String nome;
	int rg;
	String datNasc;
	public Turma turma;
	
	public Aluno(){
		
	}
	
	public Aluno(String xNome, int xRG, String xdata){
		this.nome = xNome;
		this.rg = xRG;
		this.datNasc = xdata;
	}
	
	
}
