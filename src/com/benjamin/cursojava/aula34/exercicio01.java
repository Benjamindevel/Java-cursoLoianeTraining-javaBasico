package com.benjamin.cursojava.aula34;

public class exercicio01 {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimirValor();
	}

}
