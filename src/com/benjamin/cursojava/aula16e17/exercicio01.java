package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		do {

			System.out.println("Informe sua nota, entre 0 e 10: ");
			double nota = scan.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Voce digitou: " + nota);
			} else {
				System.out.println("Nota invalida. Digite novamente: ");
			}

		} while (!notaValida);
	}

}
