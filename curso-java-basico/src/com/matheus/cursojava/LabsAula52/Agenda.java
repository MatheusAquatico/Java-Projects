package com.matheus.cursojava.LabsAula52;

public class Agenda {
	
	private Contato [] contatos = new Contato [1000];
	private int ponteiro;
	
	public int adicionarContato (String nome, String numero) {
		Contato contato = new Contato(nome, numero);
		this.ponteiro=contato.getIdentificador();
		contatos [ponteiro] = contato;
		return ponteiro;
	}
	
	public Contato consultarContato (int id ) {
		
		for(Contato cont : contatos) {
			if (cont.getIdentificador()==id) {
				return cont;
			}
		}
		return null;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public int getPonteiro() {
		return ponteiro;
	}

	public void setPonteiro(int ponteiro) {
		this.ponteiro = ponteiro;
	}
	
	

}
