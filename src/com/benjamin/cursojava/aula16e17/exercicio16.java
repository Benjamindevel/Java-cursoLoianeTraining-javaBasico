package com.benjamin.cursojava.aula16e17;

//import java.util.Scanner; 

public class exercicio16 {

	public static void main(String[] args) {
		
	//	Scanner scan = new Scanner (System.in);
		
		int primeiro = 1;
		int segundo = 2;
		int proximo= 0;
		
		System.out.println("Primeiro");
		System.out.println("segundo");
		
		while (proximo<500) {
			
			proximo= primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}

	}

}
