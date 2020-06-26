package com.matheus.cursojava.LabsAula34;

public class Exer01 {
	public static void main (String [] args) {
		int mostrar = Contador.retornarContador();
		Contador contador = new Contador ();
		System.out.println(mostrar);
		Contador.incrementarContador(2);
		mostrar = Contador.retornarContador();
		System.out.println(mostrar);
		Contador.zerarContador();
		mostrar = Contador.retornarContador();
		System.out.println(mostrar);
	}
}
