package com.benjamin.cursojava.aula16e17;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValidas = false;
		String nomeUser;
		String senha;

		do {
			System.out.println("Entre com o nome do usuario: ");
			nomeUser = scan.next();

			System.out.println("Entre com a senha: ");
			senha = scan.next();

			if (nomeUser.equalsIgnoreCase(senha)) {
				// infoValidas = false;
				System.out.println("senha igual a usuário. Digite novamente: ");
			} else {
				infoValidas = true;
				System.out.println("Senha de usuario válido.");
			}

		} while (!infoValidas);

	}

}
