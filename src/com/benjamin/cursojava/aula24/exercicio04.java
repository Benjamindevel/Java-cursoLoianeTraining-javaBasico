package com.benjamin.cursojava.aula24;

import java.util.Date;

public class exercicio04 {

	
	public static void main(String [] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Mmastering ExtJS";
		livro.autor = "Loiane Gronner";
		livro.anoLancamanto = 2015;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoPara =  "Benjamin";
		
		System.out.println("Nome do livro = "+ livro.nome);
		
		
	}
}
