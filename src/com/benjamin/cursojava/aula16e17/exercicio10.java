package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Entre com o primeiro número intéiro: ");
		int num1 = scan.nextInt();
		
		System.out.print("Entre com o segundo número intéiro: ");
		int num2 = scan.nextInt();
		
		for (int i=num1;i<=num2;i++) {
			System.out.println(i);
			
		}

	}

}
