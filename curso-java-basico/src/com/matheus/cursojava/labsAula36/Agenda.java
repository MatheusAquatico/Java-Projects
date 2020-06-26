package com.matheus.cursojava.labsAula36;

public class Agenda {
	
	private Contato [] contatos=new Contato[3];
	private String nomeAgenda;
	
	public String infoContato (int i) {
		String saida=""+this.getNomeAgenda()+ "\n";
		
			return saida+=contatos[i].getNome() + "\n" + contatos[i].getTelefone() + "\n" + contatos[i].getEmail();
		
	}
	public String infoContatos () {
		String saida=""+this.getNomeAgenda()+ "\n";
		for (int i = contatos.length-1;i>0;i--) {
			saida+=contatos[i].getNome() + "\n" + contatos[i].getTelefone() + "\n" + contatos[i].getEmail();
		}
		return saida;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

}
