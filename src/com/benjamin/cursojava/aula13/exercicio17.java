package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int coberturaTintaPorLitro = 6; // um litro faz seis metros.

		int capacidadeLataLitro18 = 18; // lata maior faz 108m.
		double preçoLatade18 = 80;

		double capacidadeLataLitro36 = 3.6; // lata menor faz 21,6m
		double preçoLata36 = 25;

		System.out.println("Informe o Tamanho da Área, em Metros Quadrados, que Deverá ser Pintada:");
		double tamanhoDaArea = scan.nextDouble();

		double litros = tamanhoDaArea / coberturaTintaPorLitro;

		double lata1 = (int) litros / capacidadeLataLitro18;
		double lata2 = (int) litros / capacidadeLataLitro36;

		if (litros % capacidadeLataLitro18 != 0) {
			lata1 += 1;
		} else if (litros % capacidadeLataLitro36 != 0) {
			lata2 += 1;
		}

		double valorDaCompraLata1 = (int) lata1 * preçoLatade18;
		double valorDaCompraLata2 = (int) lata2 * preçoLata36;
		System.out.println("A Quantidade de Latas Necessárias Será " + lata1);
		System.out.println("O Valor das Latas é: " + valorDaCompraLata1);
		System.out.println("A Quantidade de Galões Necessários Serão " + (int) lata2);
		System.out.println("O Valor dos Galões é: " + valorDaCompraLata2);
	}

}
