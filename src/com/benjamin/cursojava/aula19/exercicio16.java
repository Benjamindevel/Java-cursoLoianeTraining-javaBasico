package com.benjamin.cursojava.aula19;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          
          int[] vetorA = new int[10];
          
          for (int i =0; i<vetorA.length; i++) {
  			System.out.println("Entre com o valor da possição: "+ i);
  			vetorA[i] = scan.nextInt();

	}
          int somaMenor15 =0;
          int somaMaior15 =0;
          int quantMaior15=0;	
          int igual15=0;
          for (int i =0; i<vetorA.length; i++) {
        	  if (vetorA[i]==15) {
        		 igual15++; 
        	  }
        	  else if (vetorA[i]<15) {
        		 somaMenor15 += vetorA[i]; 
        	  }
        	  else {
        		  quantMaior15++;
        		  somaMaior15 += vetorA[i];      		  
        	  }      	  
          }
          
          System.out.print("vetor A = ");
  		for (int i = 0; i<vetorA.length; i++) {
  			System.out.print(vetorA[i]+ " ");
  		}
  		System.out.println();
  			
  		System.out.println("Quantidade de números igual a 15: "+ igual15);
  		System.out.println("Soma dos números menores de 15: "+ somaMaior15);
  		System.out.println("Media dos números menores de 15: "+ quantMaior15);
}}
