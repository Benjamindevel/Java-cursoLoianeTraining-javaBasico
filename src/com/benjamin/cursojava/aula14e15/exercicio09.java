package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro número ");
		double num1 = scan.nextDouble();
		System.out.println("Informe o segundo número ");
		double num2 = scan.nextDouble();
		System.out.println("Informe o primeiro número ");
		double num3 = scan.nextDouble();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 é menor
			// num3 é maior
			// num1<num2<num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
		} else if (num1 <= num3 && num1 <= num2 && num3 <= num2) {
			// num1 é menor
			// num2 é maior
			// num1<num3<num2
			System.out.println(num2 + " - " + num3 + " - " + num1);
		}

		else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// num2 é menor
			// num1 é maior
			// num1<num3<num2
			System.out.println(num1 + "-" + num3 + "-" + num2);
		}

		else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// num2 é menor
			// num3 é maior
			// num3<num1<num2
			System.out.println(num3 + "-" + num1 + "-" + num2);
		}

		else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 é menor
			// num2 é maior
			// num2<num1<nunm3
			System.out.println(num2 + " - " + num1 + " - " + num3);
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// num3 é menor
			// num1 é maior
			// num1<num2<nunm3
			System.out.println(num1 + " - " + num2 + " - " + num3);
		}
	}


}
