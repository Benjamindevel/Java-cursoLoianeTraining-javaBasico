package com.benjamin.cursojava.aula19;

import java.util.Scanner;

public class exercicio32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com o valor da posição A - "+i);
			vetorA[i] = scan.nextInt();		
				
			}
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println(" Tabuada do " + vetorA[i]);
			
			for(int j=1; j<=vetorA.length; j++) {
				
				System.out.println(j+" * "+vetorA[i]+" = "+ (vetorA[i]*j)); 
			}
		      System.out.println();
		}
		}

	}


