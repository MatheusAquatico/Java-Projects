package com.matheus.cursojava.LabsAula27;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		jogoDaVelha.jogoDaVelha = new char [3][3];
		jogoDaVelha.linha=0;
		jogoDaVelha.coluna=0;
		jogoDaVelha.jogadas=0;
		jogoDaVelha.acabou=false;
		jogoDaVelha.campeao= ' ';
		jogoDaVelha.jogouCerto=false;
		
		jogoDaVelha.iniciarJogo();
		jogoDaVelha.imprimirJogo();
		
		while(!jogoDaVelha.acabou) {
			System.out.println("Qual é o jogador da vez?");
			char jogador = scan.nextLine().charAt(0);
			System.out.println("Jogador " + jogador + ", comece sua jogada informando a posição linha/coluna");
			int linha = scan.nextInt();
			int coluna = scan.nextInt();
			scan.nextLine();
			jogoDaVelha.fazerJogada(jogador, linha, coluna);
			jogoDaVelha.imprimirJogo();
			jogoDaVelha.verificarVencedor();
		}
		if(jogoDaVelha.verificarVencedor()) {
		System.out.println("Acabou o jogo");
		}
		if (jogoDaVelha.jogadas > 8) {
			System.out.println("Deu empate");
		}
	}

}
