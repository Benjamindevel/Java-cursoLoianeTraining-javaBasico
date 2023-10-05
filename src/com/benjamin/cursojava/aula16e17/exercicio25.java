package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lojas Tabajara");

		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;

		do {

			System.out.println("Deseja Continuar Compra : S/N?");
			continuarCompra = scan.next();

			if (continuarCompra.equalsIgnoreCase("S")) {

				output = "Lojas Tababajara\n";

				System.out.println("Digite a quantidade de produtos da conta:");
				qtdProdutos = scan.nextInt();

				total = 0;

				for (int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Informe o preço do produto " + i);
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$" + preco + "\n";
				}

				output += "Total: R$" + total;

				System.out.println("total: R$ " + total);

				System.out.println("Entre com o valor pago: ");
				valorPago = scan.nextDouble();

				output += " Dinheiro: R$ " + valorPago + "\n";

				troco = total - valorPago;

				output += "Troco: R$ " + troco;

				System.out.println(output);

			} else {
				sair = true;
			}

		} while (!sair);
	}

}
