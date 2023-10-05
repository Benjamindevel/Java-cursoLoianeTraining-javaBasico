package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual a temperatura em Farenheit?");
		double farenheit = scan.nextDouble();
		double celsius = (5 * (farenheit - 32) / 9);
		System.out.println("A temperatura em Celsios é: " + celsius);
	}
}
