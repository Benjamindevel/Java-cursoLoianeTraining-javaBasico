package com.benjamin.cursojava.aula24;

public class exercicio05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero ="12345678";
		conta.agencia = "12345";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = 10;	
		
		System.out.println("Saudo da conta "+ conta.numero+" = "+ conta.saldo);

	}

}
