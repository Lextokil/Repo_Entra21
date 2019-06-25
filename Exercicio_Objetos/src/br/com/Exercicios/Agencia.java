package br.com.Exercicios;

public class Agencia {
	public int num;
	
	public Agencia() {
		
	}
	public Agencia(int xnum) {
		this.num = xnum;
		
	}
	
	
	
	public static void main(String[] args) {
		Agencia a1 = new Agencia();
		Agencia a2 = new Agencia();
		a1.num = 600;
		a2.num = 700;
		System.out.println(a1.num);
		System.out.println(a2.num);
	}
}
