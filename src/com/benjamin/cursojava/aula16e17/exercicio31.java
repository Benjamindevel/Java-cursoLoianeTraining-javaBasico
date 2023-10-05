package com.benjamin.cursojava.aula16e17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salario = 1000;
		double percentual = 1.5;
		
		DecimalFormat format = new DecimalFormat("###,###.###"); 
		
		salario += (salario/100)* percentual;
		
		for  (int i=1997; i<=2023; i++){
			
			percentual *=2;
			salario += (salario/100)* percentual;
			
			
			System.out.println(i+" = "+ format.format(salario)+ " - "+ percentual);
			
			
			
		}
	}

}
