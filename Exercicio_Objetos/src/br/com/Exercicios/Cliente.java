package br.com.Exercicios;



public class Cliente {
		public String nome;
		public int codigo;
		
		public Cliente() {
			
		}
		
		public Cliente(String xNome, int xcodigo) {
			this.nome = xNome;
			this.codigo = xcodigo;
			
		}
		public static void main(String[] args) {
			Cliente c1 = new Cliente("Carlos", 1);
			Cliente c2 = new Cliente("J�o", 2);
			System.out.println(c1.nome + c1.codigo);
			System.out.println(c2.nome + c2.codigo);
			
		}
		
		
}
