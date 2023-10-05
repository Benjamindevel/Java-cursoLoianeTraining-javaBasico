package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro Número Intéiros para a Soma:");
		int primeiroNumeroInteiro = scan.nextInt();
		System.out.println("Informe o segundo Número Intéiros para a Soma:");
		int segundoNumeroInteiro = scan.nextInt();
		int soma = primeiroNumeroInteiro + segundoNumeroInteiro;
		System.out.println("O Resultado da Soma foi " + soma);
	}

}
