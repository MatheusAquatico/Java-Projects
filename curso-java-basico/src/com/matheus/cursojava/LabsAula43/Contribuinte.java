package com.matheus.cursojava.LabsAula43;

public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	public abstract double calcularImposto(double rendaBruta) ;
	
	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public String getNome () {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		String s = "Nome: " + this.getNome()+ "\n" + "Imposto: " + this.calcularImposto(this.getRendaBruta());
		return s;
	}

}
