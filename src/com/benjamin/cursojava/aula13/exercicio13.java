package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe Sua Altura: ");
		double altura = scan.nextDouble();
		System.out.println("Informe Seu Sexo (M para masculino / F para feminino): ");
		String meuSexo = scan.next();
		double pesoIdeal1;
		if (meuSexo.equals("F")) {
			pesoIdeal1 = (62.1 * altura) - 44.7;
		} else {
			pesoIdeal1 = (72.7 * altura) - 58;
		}
		System.out.println("Informe Seu Peso");
		double peso = scan.nextDouble();
		if (peso >= 70) {
			System.out.println("Você Está Acima do Peso");
		} else {
			System.out.println("Você Está Abaixo do Peso");
		}
		System.out.println("Seu Peso Ideal é:" + pesoIdeal1);

	}

}
