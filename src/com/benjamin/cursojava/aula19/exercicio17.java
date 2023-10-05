package com.benjamin.cursojava.aula19;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		
		 int[] vetorA = new int[10];
         
         for (int i =0; i<vetorA.length; i++) {
 			System.out.println("Entre com a idade da pessoa: "+  (1+i));
 			vetorA[i] = scan.nextInt();
	}
         int qtd =0;
         for (int i=0; i<vetorA.length; i++) {
        	 if (vetorA[i]>35){
        		 qtd++;
        		 
        	 }
         }
         System.out.print("vetor de idades = ");
   		for (int i = 0; i<vetorA.length; i++) {
   			System.out.print(vetorA[i]+ " ");
   		}
   		System.out.println();
   		
   		System.out.println("Quantidade de pessoas com idade maior que 35 anos: "+ qtd);
  		
  		
}
}