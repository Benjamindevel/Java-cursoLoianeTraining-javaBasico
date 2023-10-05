package com.benjamin.cursojava.aula25;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void axibirAutonomia() {
		System.out.println("A autonomia do carro é: "+  capCombustivel * consumoCombustivel + " km ");
		
	}
	
}