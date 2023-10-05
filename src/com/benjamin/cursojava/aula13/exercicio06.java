package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o Raio do Círculo: ");
		double raio = scan.nextDouble();

		double areaDoCirculo = Math.PI * Math.pow(raio, 2); // areadocirculo = 3,1415*r*2
		System.out.println("A Área do Círculo é: " + areaDoCirculo);

	}

}
