package com.matheus.cursojava.LabsAula43;

public class Mamifero extends Animal{
	private String alimento;
	
	public void setAlimento (String alimento) {
		this.alimento=alimento;
		
	}
	public String getAlimento(){
		return this.alimento;
	}
	
	Mamifero(){
		this.setAmbiente("Terra");
		this.setPatas(4);
	}
}
