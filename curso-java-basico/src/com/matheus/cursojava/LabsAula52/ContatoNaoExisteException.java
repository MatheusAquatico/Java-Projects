package com.matheus.cursojava.LabsAula52;

public class ContatoNaoExisteException extends Exception {
	
	private int id;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public ContatoNaoExisteException(int id) {
		super();
		this.id = id;
	}
	
	public String toString() {
		String s = "Esse contato não existe na agenda" + this.getStackTrace();
		return s;
	}
	
	
}
