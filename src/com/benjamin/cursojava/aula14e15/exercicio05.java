package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a primeira nota semestral: ");
		double nota1 = scan.nextDouble();
		System.out.println("Infome a segunda nota semestral ");
		double nota2 = scan.nextDouble();
		double media = ((nota1 + nota2) / 2);
		if (media == 10) {
			System.out.println("Aprovado com louvor ");
		} else if (media >= 7) {
			System.out.println("Aprovado ");
		} else {
			System.out.println("Reprovado ");
		}

	}

}
