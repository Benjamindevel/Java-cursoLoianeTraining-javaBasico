package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe seu sexo (F ou M): ");
		String input = scan.next();
		if (input.equalsIgnoreCase("M")) {
			System.out.println("Masculino ");
		} else if (input.equalsIgnoreCase("F")) {
			System.out.println("Feminino ");
		} else {
			System.out.println("Sexo Inválido");
		}

	}

}
