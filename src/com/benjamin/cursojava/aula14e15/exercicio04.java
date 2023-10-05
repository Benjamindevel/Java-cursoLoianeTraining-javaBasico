package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe uma letra: ");
		String letra = scan.next();

		/*
		 * if (letra.equalsIgnoreCase("A") ||letra.equalsIgnoreCase("E")
		 * ||letra.equalsIgnoreCase("I") ||letra.equalsIgnoreCase("O")
		 * ||letra.equalsIgnoreCase("U")) {
		 * System.out.println("Essa letra é uma vogal "); } else
		 * {System.out.println("Essa letra é uma Consoante "); //perguntar pq nao
		 * aceitou o "else" nessa linha. }
		 */

		// ou pode ser feito nessa outra forma.

		if (letra.length() > 1) {
			System.out.println("Não é uma letra valida");
		}

		else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.print("Vogal");
				break;
			default:
				System.out.println("consoante");
			}

		}

	}
}
