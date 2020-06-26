package com.matheus.cursojava.LabsAula34;

public class Contador {
	private static int contagem;

	Contador() {
		contagem++;
	}

	private static int getContagem() {
		return contagem;
	}

	private static void setContagem(int contagem) {
		Contador.contagem = contagem;
	}

	public static void zerarContador() {
		contagem = 0;
	}

	public static void incrementarContador(int incremento) {
		contagem +=incremento;
	}

	public static int retornarContador() {
		return contagem;
	}
}
