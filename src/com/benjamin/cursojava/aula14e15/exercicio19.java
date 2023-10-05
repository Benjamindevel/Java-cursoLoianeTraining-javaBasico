package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com a operação desejada(+ - / *): ");
		String operação = scan.next();
		
		double resultado = 0;
		boolean valida = true;
	
	    switch ( operação ) {
	    case "+": resultado = num1 + num2; break;
	    case "-": resultado = num1 - num2; break;
	    case "/": resultado = num1 / num2; break;
	    case "*": resultado = num1 * num2; break;
	    default: 
	    	System.out.println("Operação Invalida");
	    	valida = false; 	
	    } 
	    if (valida) {
	    	System.out.println("Resultado: "+ resultado);
	    	if (resultado >=0) {
	    		System.out.println("Resultado Positivo");
	    	} else {
	    		System.out.println("Resultado Negativo");
	    	}
	    	if (resultado % 2 ==0) {
	    		System.out.println("Resultado Par");
	    	} else {
	    		System.out.println("Resultado Impar");
	    	}
	    }
		
	}

}
