package br.com.Exercicios;



public class Cliente {
		String nome;
		int codigo;
		
		public Cliente() {
			
		}
		
		public Cliente(String xNome, int xcodigo) {
			this.nome = xNome;
			this.codigo = xcodigo;
			
		}
		public static void main(String[] args) {
			Cliente c1 = new Cliente("Carlos", 1);
			Cliente c2 = new Cliente("Jão", 2);
			System.out.println(c1.nome + c1.codigo);
			System.out.println(c2.nome + c2.codigo);
			
		}
		
		
}
