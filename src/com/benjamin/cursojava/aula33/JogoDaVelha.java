package com.benjamin.cursojava.aula33;

public class JogoDaVelha {
	
	
	private char[][] jogoVelha = new char[3][3];
	private int jogada;
	
	public JogoDaVelha() {
		jogoVelha = new char[3][3];
		jogada =1;
	}

	public char[][] getJogoVelha() {
		return jogoVelha;
	}

	public void setJogoVelha(char[][] jogoVelha) {
		this.jogoVelha = jogoVelha;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	
	public boolean validarJogada(int linha, int coluna, char sinal) {

		if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'o') {
			return false;
			
		} else {// jogada válida.
			jogoVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}

	}
	
	public void imprimirTabuleiro() {

		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha.length; j++) {
				System.out.print(jogoVelha[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
     public boolean verificarGanhador(char sinal) {
		
		//verificar ganhador. 
		if(( jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2]== sinal) ||   //linha 1
			(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2]== sinal) ||   //linha 2
			(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2]== sinal) ||   //linha 3
			(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0]== sinal) ||   //coluna 1
			(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1]== sinal) ||   //coluna 2 
			(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2]== sinal) ||   //coluna 3
			(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2]== sinal)){   // diagonal
		return true;
	}
		return false;

}
     public boolean vezJogador01() {
   	  if (jogada % 2 ==1) {
   		  return true;
   	  }
   	  return false;
   	  }
     }
	


	

	
	
	 
		
	
	


