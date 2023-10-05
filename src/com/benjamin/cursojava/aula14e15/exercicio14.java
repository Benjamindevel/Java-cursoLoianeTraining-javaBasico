package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a primeira nota semestral: ");
		double nota1 = scan.nextInt();
		System.out.println("Informe a segunda nota semestral: ");
		double nota2 = scan.nextInt();

		double media = (nota1 + nota2) / 2;

		String aproveitamento = "";
		if (media >= 9 && media <= 10) {
			aproveitamento = "A";
		} else if (media >= 7.5 && media < 9) {
			aproveitamento = "B";
		} else if (media >= 6 && media < 7.5) {
			aproveitamento = "C";
		} else if (media >= 4 && media < 6) {
			aproveitamento = "D";
		} else if (media >= 0 && media < 4) {
			aproveitamento = "E";
		}
		System.out.println("nota1: " + nota1);
		System.out.println("nota2: " + nota2);
		System.out.println("média: " + media);
		System.out.println("conceito: " + aproveitamento);

		switch (aproveitamento) {
		case "A":
		case "B":
		case "C":
			System.out.println("Aprovado ");
			break;
		case "D":
		case "E":
			System.out.println("Reprovado");
			break;
		}

	}

}
