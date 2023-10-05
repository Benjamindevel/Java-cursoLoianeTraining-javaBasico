package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		do {

			System.out.println("Entre com o Nome: ");
			nome = scan.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de no mínimo 3 caracteres. ");
			}

		} while (!infoValida);

		infoValida = false;

		do {

			System.out.println("Entre com a idade: ");
			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150. ");
			}
		} while (!infoValida);

		infoValida = false;

		do {

			System.out.println("Entre com o salario: ");
			salario = scan.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario precisa ser maior que 0. ");
			}
		} while (!infoValida);

		infoValida = false;

		do {

			System.out.println("Entre com o sexo: ");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'F' ou 'M'. ");
			}
		} while (!infoValida);

		infoValida = false;

		do {

			System.out.println("Entre com o estado civil: ");
			estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser 's', ou 'c', ou 'v', ou 'd'. ");
			}
		} while (!infoValida);

		System.out.println("As seguintes informações foram coletadas: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
	}
}
