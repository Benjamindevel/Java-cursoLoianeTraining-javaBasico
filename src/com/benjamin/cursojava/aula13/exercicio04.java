package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe quatro notas bimestrais:");
		int primeiraNota = scan.nextInt();
		int segundaNota = scan.nextInt();
		int terceiraNota = scan.nextInt();
		int quartaNota = scan.nextInt();
		int media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		System.out.println("Media das Notas é: " + media);
	}
}
