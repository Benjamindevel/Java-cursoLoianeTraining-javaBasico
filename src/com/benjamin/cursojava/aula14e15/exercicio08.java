package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o preço do primeiro produto ");
		double produto1 = scan.nextDouble();
		System.out.println("Informe o preço do segundo produto ");
		double produto2 = scan.nextDouble();
		System.out.println("Informe o preço do terceiro produto ");
		double produto3 = scan.nextDouble();

		if (produto1 <= produto2 && produto1 <= produto3) {
			System.out.println(produto1 + " Compre o terceiro produto");
		} else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println(produto2 + " Compre o terceiro produto");
		} else if (produto3 <= produto1 && produto3 <= produto2) {
			System.out.println(produto3 + " Compre o terceito produto");
		} else {
			System.out.println("Os Produtos tem o mesmo valor ");
		}
	}

}
