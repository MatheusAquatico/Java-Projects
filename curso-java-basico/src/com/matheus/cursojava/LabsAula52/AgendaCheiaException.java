package com.matheus.cursojava.LabsAula52;

public class AgendaCheiaException extends Exception{
	
	private Agenda agenda;
	
	public Agenda getAgenda() {
		return this.agenda;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda=agenda;
	}
	
	AgendaCheiaException(Agenda agenda){
		super();
		this.agenda=agenda;
	}
	
	public String toString(Agenda agenda) {
		String s = "A agenda está cheia. Ela atingiu seu limite de " + agenda.getContatos().length;
		return s;
	}

}
