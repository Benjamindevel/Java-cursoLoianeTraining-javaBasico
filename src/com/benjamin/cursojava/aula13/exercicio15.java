package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto Você Ganha Por Hora?");
		double valorHora = scan.nextDouble();
		System.out.println("Quantas Horas Você Trabalha Por Mês?");
		double quantidadeHora = scan.nextDouble();
		double salarioBruto = valorHora * quantidadeHora;

		double inss = salarioBruto - (salarioBruto * 8 / 100);
		double valorInss = salarioBruto - inss;

		double sindicato = salarioBruto - (salarioBruto * 5 / 100);
		double valorSindicato = salarioBruto - sindicato;

		double salarioLiquido = salarioBruto - (valorInss + valorSindicato);

		System.out.println("O Seu Salário Bruto é " + salarioBruto + " R$");
		System.out.println("Você Pagou ao INSS " + valorInss + " R$");
		System.out.println("Você Pagou ao Sindicato " + valorSindicato + " R$");
		System.out.println("O Seu Salário Líquido é " + salarioLiquido + " R$");

	}

}
