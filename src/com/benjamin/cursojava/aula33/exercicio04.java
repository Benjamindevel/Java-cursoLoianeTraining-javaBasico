package com.benjamin.cursojava.aula33;

import java.util.Scanner;

public class exercicio04 {

	
		public static void main(String[]args) {
			
			Scanner scan = new Scanner(System.in);
			
			
			JogoDaVelha jogoDaVelha = new JogoDaVelha();
			
			System.out.println("Jogador 1 = x ");
			System.out.println("Jogador 2 = o ");
			
			boolean ganhou = false;
			char sinal; 
			int linha = 0, coluna =0;
			
			while (!ganhou) {
				
	              if (jogoDaVelha.vezJogador01())  {
	            	  
					System.out.println("Vez do jogador 1. Escolha linha e coluna (1 a 3). ");
					sinal = 'x';
				}else {
					
					System.out.println("Vez do jogador 2. Escolha linha e coluna (1 a 3). ");
					sinal = 'o';
				}
				
	              linha = valor("Linha", scan);
	              coluna = valor("Coluna", scan);
	              
	              if(!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
	            	  System.out.println("Posição já usada, tente novamente");
	              }
	              
	              jogoDaVelha.imprimirTabuleiro();
	              
	              if(jogoDaVelha.verificarGanhador('x')) {
	            	ganhou = true;
	      			System.out.println("Parabéns, jogador 1 ganhou! "); 
	              }else if(jogoDaVelha.verificarGanhador('0')) {
	              	ganhou = true;
	        		System.out.println("Parabéns, jogador 0	 ganhou! "); 
	        	  }else if(jogoDaVelha.getJogada()>9){
	  				ganhou = true;
	  				System.out.println("Deu Velha. Ninguem ganhou essa partida! ");
	        	  }
		}
			
	}		

		
		static int valor(String tipoValor, Scanner scan){
			int valor =0;
			boolean valorValida = false;
			while (!valorValida) {
				System.out.println("Entre com a "+ tipoValor +" (1,2 ou 3)");
				valor = scan.nextInt();
				if (valor>=1 && valor<=3) {
					valorValida = true;
				}else {
					System.out.println("Entrada Invalida. Tente novamente! ");
				} 
		}
			valor --;
			return valor;


		}

}
