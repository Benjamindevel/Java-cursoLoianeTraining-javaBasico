package com.benjamin.cursojava.aula27;

public class Aluno {
	
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas = new String[3];
	double[][] notaDisciplinas =  new double[3][4];
	 
		void mostrarInfo() {
			System.out.println("Nome: "+ nome);
			System.out.println("Matricula: "+ matricula);
			System.out.println("Nome do Curso: "+ nomeCurso);
			
			for( int i=0; i<notaDisciplinas.length; i++) {
				System.out.println("Notas da disciplina "+ nomeDisciplinas[i]);
				for (int j=0; j<notaDisciplinas[i].length;j++) {
					System.out.print(notaDisciplinas[i][j] + " ");
				}
				
				System.out.println();		
		}
		
	}
	
	boolean verificarAprovado(int indice) {
		
		
		double soma = 0;
		
		for(int i=0; i<notaDisciplinas[indice].length; i++) {
			soma +=notaDisciplinas[indice][i];
		}
		
		double media = soma/4;
		
		if (obterMedia(indice)>=7) {
			return true;
		} 
	   	   return false;
		}
	
	 double obterMedia(int indice){
		 
		 double soma =0;
		 
		 for (int i=0; i<notaDisciplinas[indice].length; i++) {
			 soma += notaDisciplinas[indice][i];
		 }
		 
		 double media = soma/4;
		 
		 return media;	
	 }
	
	}
