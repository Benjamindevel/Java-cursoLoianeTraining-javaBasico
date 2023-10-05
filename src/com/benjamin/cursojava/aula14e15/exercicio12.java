package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o Valor Hora: ");
		double hora = scan.nextDouble();
		System.out.println("Informe o a quantidade de horas trabalahada no mês: ");
		double qtdHora = scan.nextDouble();

		double salarioBruto = hora * qtdHora;

		int percentualIr = 0;
		if (salarioBruto <= 900) {
			percentualIr = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIr = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIr = 10;
		} else if (salarioBruto > 2500) {
			percentualIr = 20;
		}

		double ir = (salarioBruto / 100) * percentualIr;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salario Bruto: (" + hora + " * " + qtdHora + "):" + salarioBruto);
		System.out.println("(-)IR (" + percentualIr + "%):" + ir);
		System.out.println("(-)INSS(10%):" + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total de Descotos: " + totalDescontos);
		System.out.println("Salário Liquido: " + salarioLiquido);

	}
}
