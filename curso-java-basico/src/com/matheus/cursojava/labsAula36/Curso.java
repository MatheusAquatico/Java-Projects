package com.matheus.cursojava.labsAula36;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno [] alunos;
	
	public String getHorario () {
		return this.horario;
	}
	public void setHorario (String horarios) {
		this.horario = horarios;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public double [] calcularMediaAluno(Aluno [] aluno) {
		double [] medias = new double [5];
		for (int i = 0; i<aluno.length;i++) {
			double media =0;
			double [] notas =aluno[i].getNotas();
			for(int j = 0;j<aluno[i].getNotas().length;j++) {
			media += notas[j];
			}
			medias [i]=media/4;
		}
		return medias;
	}
	public double calcularMediaClasse (double [ ] medias) {
		double resultado =0;
		double [ ] somatorio = medias;
		for (int i = 0; i<medias.length;i++) {
			resultado += somatorio [i];
		}
		return (resultado/5);
	}

}
