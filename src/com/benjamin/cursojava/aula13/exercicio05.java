package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a distância em metros: ");
		double metros = scan.nextDouble();
		int centimetros = (int) (metros * 100);
		System.out.println("A Distância Informada é " + centimetros + " em centímetros");
	}

}
