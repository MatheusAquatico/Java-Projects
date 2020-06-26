package com.matheus.cursojava.LabsAula43;

public class Exer03 {
	public static void main (String [] args) {
		Animal [] animais = new Animal [3];
		Mamifero camelo =new Mamifero ();
		camelo.setNome("Camelo");
		camelo.setAmbiente("Deserto");
		camelo.setCor("Marrom");
		camelo.setComprimento(2);
		camelo.setVelocidade(5);
		camelo.setAlimento("Cenoura");
		animais [0]=camelo;
		Peixe tubarao = new Peixe ();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(3);
		tubarao.setVelocidade(20);
		animais [1]=tubarao;
		Mamifero urso = new Mamifero();
		urso.setNome("Urso");
		urso.setCor("Marrom");
		urso.setComprimento(4);
		urso.setAlimento("Peixes");
		urso.setVelocidade(10);
		System.out.println("Animais do zoo:");
		System.out.println(camelo.toString());
		System.out.println(tubarao.toString());
		System.out.println(urso.toString());
		
		
	}

}
