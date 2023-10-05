package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int coberturaTintaPorLitro = 3;
		int capacidadeLataLitro = 18;
		// uma lata faz 54m
		double preçoLata = 80;
		// um litro faz tres metros

		System.out.println("Informe o Tamanho da Área, em Metros Quadrados, que Deverá ser Pintada:");
		double tamanhoDaArea = scan.nextDouble();
		double litros = tamanhoDaArea / coberturaTintaPorLitro;
		double lata = (int) litros / capacidadeLataLitro;

		if (litros % capacidadeLataLitro != 0) {
			lata += 1;
		} else {
			litros = 18; // perguntar porque nao aceitou a variável"<=".
			System.out.println(lata = 1);
		}

		double valorDaCompra = lata * preçoLata;

		System.out.println("A Quantidade de Latas Necessárias Será " + lata);
		System.out.println("O Valor da Compra é: " + valorDaCompra);

	}

}
