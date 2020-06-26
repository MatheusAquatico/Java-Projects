package com.matheus.cursojava.LabsAula46;

public class FiguraGeometrica {
	
	private String nome;
	private String cor;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome (String nome) {
		this.nome=nome;
	}
	
	public String toString () {
		String s= "Nome: " + this.getNome() + " Cor: " + this.getCor();
		return s;
	}
}
