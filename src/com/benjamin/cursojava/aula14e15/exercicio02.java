package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um valor para análise:");
		int numero = scan.nextInt();
		if (numero > 0) {
			System.out.println("Esse número é Positivo " + numero);
		} else {
			System.out.println("Esse número é negativo " + numero);
		}

	}

}
