package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um número para gerar a tabuada: ");
		int num = scan.nextInt();
		
		boolean invalido = true;
		int numFinal, numInicial;
		
		do {
			System.out.println("Entre com o início da tabuada: ");
			numInicial = scan.nextInt();
			
			System.out.println("Entre com o final da tabuada: ");
			numFinal = scan.nextInt();
			
			if (numFinal >numInicial) {
				invalido = false;
			}
			
		}while(invalido);
		
		
		System.out.println("Tabuada de "+num+":");
		System.out.println("Começar por : "+ numInicial);
		System.out.println("Começar por : "+numFinal);
		System.out.println();
		
		for (int i=numInicial; i<=numFinal; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		
		
		
		

	}

}
