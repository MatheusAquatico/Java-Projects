package com.matheus.cursojava.LabsAula52;

public class Contato {
	
	private String nome;
	private String telefone;
	private int identificador;
	private int contador;
	
	public Contato (String nome, String telefone){
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setIdentificador(contador);
		contador++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String toString () {
		String s ="Nome: " + this.getNome()+ "\n" + "Telefone: " + this.getTelefone();
		return s;
	}
	

}
