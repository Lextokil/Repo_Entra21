package br.com.Exercicios;



public class CartaoCredito {
	int num;
	String data;
	public CartaoCredito() {
		
	}
	public CartaoCredito(int xNum, String xData) {
		this.num = xNum;
		this.data = xData;
		
	}
	public static void main(String[] args) {
		
		CartaoCredito  cc1 = new CartaoCredito(500, "17/05/2025");
		CartaoCredito cc3 = new CartaoCredito();
		cc3.num = 504;
		cc3.data = "24/08/2024";
		
		System.out.println(cc3.num + cc3.data);
		System.out.println(cc1.num + cc1.data);
		
	}
	
	
}
