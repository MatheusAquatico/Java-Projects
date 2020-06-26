package com.matheus.cursojava.LabsAula74;

public class Threads implements Runnable {

	String nome;
	Thread t;
	boolean acender = true;
	final int NUM = 5;
	SemaforoMetodos sema;
	boolean desligar;

	public Threads(String nome) {
		this.nome = nome;
		sema=new SemaforoMetodos();
		t = new Thread(this, nome);
		t.start();

	}
	public synchronized void desligar(boolean desligar) {
		this.desligar=desligar;
		notify();
	}
	@Override
	public synchronized void run() {


			for (int i = 0; i < NUM; i++) {

				this.sema.acender(acender, "Vermelho", 1000);
				
				this.sema.acender(acender, "Verde", 800);
				
				this.sema.acender(acender, "Amarelo", 300);
				
				this.sema.acender(false, "Amarelo", 300);
				
				
		}
			while(!desligar) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			

	}
}
