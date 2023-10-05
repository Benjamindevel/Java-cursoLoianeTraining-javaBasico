package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe Sua Altura (colocando a virgula entre metros e centimetros): ");
		double minhaAltura = scan.nextDouble();
		double pesoIdeal = (72.7 * minhaAltura) - 58;
		System.out.println("Seu Peso Ideal é: " + pesoIdeal);
	}

}
