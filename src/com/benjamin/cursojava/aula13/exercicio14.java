package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual a Quantidade em Quilos de peixe?");
		double quilos = scan.nextDouble();
		boolean excesso = quilos > 50;
		if (quilos >= 50) {
			System.out.println("Excesso! Será Cobrada Uma Taxa de " + (quilos - 50) * 4 + " Reais!");
		} else {
			System.out.println(" A quantidade em quilos é " + quilos
					+ " Não será Multado! Estando Abaixo do Máximo Permitido de 50kg");

		}
	}

}
