package com.benjamin.cursojava.aula19;

import java.util.Scanner;

public class exercicio34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
        for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com o valot da posição A - "+i);
			vetorA[i]= scan.nextInt();
	}
        
        for( int i=0; i<vetorA.length; i++) {
        
        	System.out.println("Analizando o número "+ vetorA[i]);
        	
        	for(int j=2; j<vetorA.length; j++) {
        		if (j%2 ==0) {
        			System.out.println(j+ " é par");
        		}
        	} System.out.println();
        }
        

}}
