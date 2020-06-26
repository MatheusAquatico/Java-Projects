package com.matheus.cursojava.LabsAula43;

public class Animal {
	
	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		this.patas=patas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public String toString() {
		String s="";
			s+=this.getNome() + "\n";
			s+=this.getAmbiente() + "\n";
			s+=this.getCor() + "\n";
			s+=this.getComprimento() + "\n";
			s+=this.getPatas() + "\n";
			s+=this.getVelocidade() + "\n";
		return s;
	}

}
