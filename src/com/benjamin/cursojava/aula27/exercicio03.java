package com.benjamin.cursojava.aula27;
	
import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
				
		System.out.println("Entre com o nome do Aluno");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o nome do Curso");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Entre com a matriula");
		aluno.matricula = scan.next();	
		
		//aluno.nomeDisciplinas = new String[3];
		for(int i=0; i<aluno.nomeDisciplinas.length; i++){
			System.out.println("Entre com o nome da Disciplina " + i);
			aluno.nomeDisciplinas[i] = scan.next();
		}
		
		for(int i=0; i<aluno.notaDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
			for(int j=0; j<aluno.notaDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota "+ (j+1));
				aluno.notaDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarInfo(); 	
		
		for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
			if(aluno.verificarAprovado(i)){
			   System.out.println("Disciplina "+ aluno.nomeDisciplinas[i] + " - foi aprovado ");
			}else {
				System.out.println("Disciplina "+ aluno.nomeDisciplinas[i] + " - foi reprovado "); 
			}
		}
	}

}
