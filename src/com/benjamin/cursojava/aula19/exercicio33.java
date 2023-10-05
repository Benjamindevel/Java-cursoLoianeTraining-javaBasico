package com.benjamin.cursojava.aula19;

import java.util.Scanner;

public class exercicio33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com o valot da posição A - "+i);
			vetorA[i]= scan.nextInt();
		}
		boolean primo;
		String msg;
		
		
		for( int i=0; i<vetorA.length; i++) {
			
			 primo =true;
			
			for(int j=2; j<vetorA[i]; j++) {
				if(vetorA[i]%j ==0) {
					primo = false;
					break;
				}
			}
			
			msg ="";
			if (primo) {
				msg = " primo";
			}else {
				msg = " não é primo";
			}
			
			System.out.println(vetorA[i] + msg);
			
		}

	}

}
