package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe dois Número Intéiros:");
		int primeiroNumeroInteiro1 = scan.nextInt();
		int segundoNumeroInteiro2 = scan.nextInt();
		System.out.println("Informe Um Número Real:");
		double numeroReal = scan.nextInt();
		double produto = ((primeiroNumeroInteiro1 * 2) + (segundoNumeroInteiro2 / 2));
		double soma1 = ((primeiroNumeroInteiro1 * 3) + numeroReal);
		double elevadoAoCubo = Math.pow(numeroReal, 3); // é a mesma coisa que o numero real elevado ao cudo.
		System.out.println("O Resultado do Produto foi: " + produto);
		System.out.println("O Resultado da soma foi: " + soma1);
		System.out.println("o Número Real Elevado ao Cubo é: " + elevadoAoCubo);

	}

}
