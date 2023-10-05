/**
 * 
 */
/**
 * @author lobo-
 *
 */
package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro numero para a comparação: ");
		int num1 = scan.nextInt();
		System.out.println("Informe o primeiro numero para a comparação: ");
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println("o numero maior é " + num1);
		} else {
			System.out.println("O nùmero maior é " + num2);
		}
	}
}