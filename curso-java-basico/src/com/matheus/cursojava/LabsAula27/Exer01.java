package com.matheus.cursojava.LabsAula27;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Lampada lampada = new Lampada ();
		boolean saiu=false;
		do {
			System.out.println("O que voc� quer fazer com a l�mpada? ");
			System.out.println("-Ligar");
			System.out.println("-Desligar");
			System.out.println("-Sair");
			String resposta = scan.nextLine();
			if(resposta.equals("Ligar")) {
				lampada.ligarLampada();
			}else if(resposta.equals("Desligar")) {
				lampada.desligarLampada();
			}else if(resposta.equals("Sair")) {
				saiu =true;
			}else {
				System.out.println("Comando errado, tente novamente.");
			}
			
		}while(!saiu);
		
		
	}

}
