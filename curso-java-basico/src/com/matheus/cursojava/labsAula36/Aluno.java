package com.matheus.cursojava.labsAula36;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double [] notas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double [] getNotas() {
		return notas;
	}
	public void setNotas(double [] notas) {
		this.notas = notas;
	}
	public String getMatricula () {
		return this.matricula;
	}
	public void setMatricula (String matricula) {
		this.matricula = matricula;
	}

}
