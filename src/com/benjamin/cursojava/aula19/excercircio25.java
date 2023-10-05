package com.benjamin.cursojava.aula19;

import java.util.Scanner;

public class excercircio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com um numero para a posição "+i);
			vetorA[i] = scan.nextInt();
			// vetor A se ele for par, mode 2 iqual a 0, se dentro do cochete for positivo, recebe 1,se nao recebe 0.
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
			
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		System.out.println();

	}

}
