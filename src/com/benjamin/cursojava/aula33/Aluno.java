package com.benjamin.cursojava.aula33;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private double[][] notaDisciplinas;
	
	public Aluno() {
		nomeDisciplinas = new String[3];
		notaDisciplinas =  new double[3][4];
	
	}

	public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas,
			double[][] notaDisciplinas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = nomeDisciplinas;
		this.notaDisciplinas = notaDisciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotaDisciplinas() {
		return notaDisciplinas;
	}
 
	public void setNotaDisciplinas(double[][] notaDisciplinas) {
		this.notaDisciplinas = notaDisciplinas;
	}
	
	
	public void mostrarInfo() {
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
	
	public boolean verificarAprovado(int indice) {
			
			
			if (obterMedia(indice)>=7) {
				return true;
			} 
		   	   return false;
			}


	private double obterMedia(int indice){
		 
		 double soma =0;
		 
		 for (int i=0; i<notaDisciplinas[indice].length; i++) {
			 soma += notaDisciplinas[indice][i];
		 }
		 
		 double media = soma /4;
		 
		 return media;
		 
	}
	
	   public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		   this.nomeDisciplinas[pos]= nomeDisciplina;
		   
	   }
	   
	   public void setNomePosIJ(int posI, int posJ, double nota) {
		   this.notaDisciplinas[posI][posJ] = nota;
	   }
		}
