package com.benjamin.cursojava.aula13;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o Tamanho do Arquivo (em MB) que Deseja Baixar: ");
		double tamanhoDoArquivo = scan.nextDouble();
		System.out.println("Informe a Velocidade do Link da Internet(em Mbps): ");
		double velocidadeInternet = scan.nextDouble();
		double tempoAproximado = tamanhoDoArquivo / velocidadeInternet;
		System.out.println((int) tempoAproximado + " em Minutos Aproximadamente");

	}

}
