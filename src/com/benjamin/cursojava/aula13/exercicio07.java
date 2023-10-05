package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor do Lado do Quadrado");
		double lado = scan.nextInt();
		double areaDoQuadrado = Math.pow(lado, 2); // (lado * lado)
		System.out.println("A Área do Quadrado é: " + areaDoQuadrado);
		System.out.println("O Dobro Dessa Área é: " + areaDoQuadrado * 2);

	}

}
