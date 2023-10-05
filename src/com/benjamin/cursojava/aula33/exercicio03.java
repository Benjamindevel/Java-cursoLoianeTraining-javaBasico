package com.benjamin.cursojava.aula33;

import java.util.Scanner;


public class exercicio03 {
	

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
				
		System.out.println("Entre com o nome do Aluno");
		aluno.setNome(scan.next());
		
		System.out.println("Entre com o nome do Curso");
		aluno.setNomeCurso(scan.next());
		
		System.out.println("Entre com a matriula");
		aluno.setMatricula(scan.next());	
		
		//aluno.nomeDisciplinas = new String[3];
		for(int i=0; i<aluno.getNomeDisciplinas().length; i++){
			System.out.println("Entre com o nome da Disciplina " + i);
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		
		for(int i=0; i<aluno.getNotaDisciplinas().length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
			for(int j=0; j<aluno.getNotaDisciplinas()[i].length; j++) {
				System.out.println("Entre com a nota "+ (j+1));
				aluno.getNotaDisciplinas()[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarInfo(); 	
		
		for(int i=0; i<aluno.getNomeDisciplinas().length; i++) {
			if(aluno.verificarAprovado(i)){
			   System.out.println("Disciplina "+ aluno.getNomeDisciplinas()[i] + " - foi aprovado ");
			}else {
				System.out.println("Disciplina "+ aluno.getNomeDisciplinas()[i] + " - foi reprovado "); 
			}
		}
	}

}
