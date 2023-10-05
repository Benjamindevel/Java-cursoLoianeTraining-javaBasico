package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vítima? ");
		String resp1 = scan.next();
		
		System.out.println("Esteve no local do crime? ");
		String resp2 = scan.next();
		
		System.out.println("Morava proximo da vitima?");
		String resp3 = scan.next();
		
		System.out.println("Ja trabalhou com a vítima? ");
		String resp4 = scan.next();
		
		System.out.println("Devia para a vítima: ");
		String resp5 = scan.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("S")) {
			cont++;
	    }
		if (cont == 1 || cont ==2 ) {
			System.out.println("Suspeita");
		} else if (cont ==3 || cont ==4 ) {
			System.out.println("Cúmplece");
		}else if (cont ==5) {
			System.out.println("Assassino");
		}else if (cont == 0 ) {
			System.out.println("Inocente");
			
		}

	}
	}
