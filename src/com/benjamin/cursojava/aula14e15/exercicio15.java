package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o lado 1 do triangulo");
		int lado1 = scan.nextInt();
		System.out.println("Entre com o lado 2 do triangulo");
		int lado2 = scan.nextInt();
		System.out.println("Entre com o lado 3 do triangulo");
		int lado3 = scan.nextInt();

		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado3 + lado2) > lado1)) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triangulo equilátero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triangulo escaleno");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo isoceles");
			}
		} else {
			System.out.println("Nao forma um triangulo");
		}

	}
}
