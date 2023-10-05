package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual a temperatura em Celsius?");
		double celsius1 = scan.nextDouble();
		double farenheit1 = (celsius1 * 1.8 + 32);
		System.out.println("A temperatura em Farenheit é: " + farenheit1);
	}
}
