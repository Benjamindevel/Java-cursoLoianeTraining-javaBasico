package com.benjamin.cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}

	}
		  
		   for (int i = 0; i < numerosAleatorios.length; i++) {
			   for (int j = 0; j < numerosAleatorios[i].length; j++) {
				   System.out.print(numerosAleatorios[i][j]+ " ");
			   }
			   
			   System.out.println();
	}
		   int maiorL5 =0;
		   int menorL5 =101; 
		   int linha5= 5;	
		   for(int i=0; i<numerosAleatorios[5].length; i++) {
			   if (numerosAleatorios[5][i]>maiorL5) {
				   maiorL5 = numerosAleatorios[5][i];
			   }
			   if (numerosAleatorios[linha5][i]< menorL5) {
				   menorL5 = numerosAleatorios[linha5][i]; 
			   }
		   }
		   System.out.println("Maior valor de linha 5 = "+ maiorL5);
		   System.out.println("Menor valor de linha 5 = "+ menorL5);
	
	       
		   int maiorC7 =0;
		   int menorC7 =101;
		   int col7 =7;
		   
		   for(int i=0; i<numerosAleatorios.length; i++) {
	    	   if(numerosAleatorios[i][col7]> maiorC7) {
	    		   maiorC7 = numerosAleatorios[i][col7];
	    	   }
	    	   if(numerosAleatorios[i][col7]<menorC7) {
	    		   menorC7 = numerosAleatorios[i][col7];
	    	   }
	       }
		   System.out.println("Maior valor de coluna 7 = "+ maiorC7);
		   System.out.println("Menor valor de coluna 7 = "+ menorC7);
	}
	
}	   
