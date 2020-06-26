package com.matheus.cursojava.LabsAula33;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] medias;
	
	public Aluno() {
		medias = new double[3][4];
		disciplinas = new String [3];
	}

	public boolean verificarAprovado(int disciplina) {
		double media = 0;
		boolean aprovado = false;
		for (int i = 0; i < medias[disciplina].length; i++) {
			media += medias[disciplina][i];
			if ((media / medias[disciplina].length) >= 7) {
				aprovado = true;
			}
		}
		return aprovado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[][] getMedias() {
		return medias;
	}

	public void setMedias(double[][] medias) {
		this.medias = medias;
	}
}
