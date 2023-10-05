package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o tipo de Combustivel?");
		String tipo = scan.next();

		System.out.println("Qual a quantidade em litros de combustível? ");
		double litros = scan.nextDouble();

		double precoGas = 2.5;
		double precoAlc = 1.9;
		int precoDesconto = 0;
		double total = 0;
		double totalDesconto = 0;

		if (tipo.equalsIgnoreCase("a")) {
			if (litros <= 20) {
				precoDesconto = 3;
			} else {
				precoDesconto = 5;
			}

			total = litros * precoAlc;

		} else if (tipo.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				precoDesconto = 4;
			} else {
				precoDesconto = 6;
			}

			total = litros * precoGas;

		}
		totalDesconto = (total / 100) * precoDesconto;

		double precoApagar = total - totalDesconto;

		System.out.println("Valor a ser pago: " + precoApagar);
	}
}
