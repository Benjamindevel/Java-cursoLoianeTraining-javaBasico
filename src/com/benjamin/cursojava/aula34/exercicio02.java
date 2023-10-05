package com.benjamin.cursojava.aula34;

public class exercicio02 {
	
	public static void mais(String[] args) {
		
		imprimirTela(Calculadora.somar(5, 5));
		
		imprimirTela(Calculadora.subtrair(2, 2));
		
		imprimirTela(Calculadora.multiplicar(2, 2));
		
		imprimirTela(Calculadora.dividir(4, 2));
		
		imprimirTela(Calculadora.potencia(2, 4));
	}
	static void imprimirTela(int num) {
		System.out.println(num);
	}


}
