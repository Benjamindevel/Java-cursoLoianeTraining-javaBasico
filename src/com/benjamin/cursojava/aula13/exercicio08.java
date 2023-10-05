package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora?");
		int hora = scan.nextInt();
		System.out.println("Qual o Seu Número de Horas trabalhadas ao Mês? ");
		int numeroDeHoras = scan.nextInt();
		double salario = (hora * numeroDeHoras);
		System.out.println("O Seu Salerio Mês é: " + salario + "R$");
	}

}
