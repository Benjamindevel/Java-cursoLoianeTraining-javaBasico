package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int ano = 0;
		Scanner input = new Scanner(System.in);
		ano = input.nextInt();

		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.println(ano + " é um ano Bissexto!");
		} else {
			System.out.println(ano + " não é um ano Bissexto!");
		}
	}
}
