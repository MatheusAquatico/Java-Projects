package com.matheus.cursojava.LabsAula74;

public class SemaforoMetodos {


	synchronized void acender(boolean acender, String cor, int tempo) {

		if (!acender) {
			notify();
			return;
		}

		System.out.println("O sinal está " + cor);

		notify();
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	

}
