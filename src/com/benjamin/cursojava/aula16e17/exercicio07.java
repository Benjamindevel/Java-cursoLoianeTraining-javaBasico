package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com um números inteiros: ");
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
			}
		}
		System.out.println("Maior Valor digitado foi: " + maior);
	}

}
