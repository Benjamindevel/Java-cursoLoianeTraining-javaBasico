package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um Número: ");
		int num = scan.nextInt();
		
		System.out.println("Fatorial de "+ num);
		
		System.out.print(num +"! = ");
		
		int fatorial = 1;
		for (int i = num; i>1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.print("1 = "+ fatorial);
		
	}

}
