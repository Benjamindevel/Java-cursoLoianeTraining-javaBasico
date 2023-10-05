package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o número de CDs: ");
		int cds =scan.nextInt();
		
		double preco;
		double soma =0;
		
		for (int i=1; i<=cds; i++) {
			
			System.out.println("Informe o valor do Cd: "+i);
			preco = scan.nextInt();
			
			soma +=preco;
					    
		}
		double media= soma / cds;
		
		System.out.println("Média gasta com cada CD:"+ media+" R$");
		

	}

}
