package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

 class exercicio34 {
	 
	 public static void main (String[]argas) {
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite o valor de n");
		 int n = scan.nextInt();
		 
		 double soma =0;
		 
		 for (int i = 1; i<=n; i++) {
			 
			 soma += 1/i; 
		 }
		 System.out.println("Soma = " + soma );
	 }

}
