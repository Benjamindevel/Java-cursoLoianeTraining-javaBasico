package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número intéiro: ");
		int num1 = scan.nextInt();
		
		System.out.print("Entre com o segundo número intéiro: ");
		int num2 = scan.nextInt();
		
		int soma = 0;
		
		for (int i=num1;i<=num2;i++) {
			soma +=i;
		}	
		System.out.println("Soma: "+ soma );
	}

}
