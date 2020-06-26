package com.matheus.cursojava.LabsAula27;

public class JogoDaVelha {

	char[][] jogoDaVelha;
	int linha;
	int coluna;
	int jogadas;
	char campeao;
	boolean acabou;
	char jogador;
	boolean jogouCerto;

	void iniciarJogo() {
		System.out.println("Seja bem vindo ao jogo da velha!");
		System.out.println("O primeiro jogador começa com \"O\" ");
		System.out.println("O primeiro jogador começa com \"X\" ");
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				jogoDaVelha[i][j] = ' ';
			}

		}
	}

	void imprimirJogo() {
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				System.out.print(jogoDaVelha[i][j]);
				if (j < 2) {
					System.out.print("|");
				}

			}
			System.out.println();
			if (i < 2) {
				System.out.println("------");
			}

		}
	}

	boolean verificarVencedor() {
		if (acabou) {
			System.out.println(campeao + " venceu!");
			if (jogadas > 8) {
				System.out.println("Deu empate");
			}
			return true;
		}
		return false;
	}

	void fazerJogada(char jogador, int linha, int coluna) {
		jogouCerto=false;
		while (!jogouCerto) {
			this.jogador = jogador;
			this.linha = linha;
			this.coluna = coluna;
			if (this.linha > 0) {
				this.linha--;
			}
			if (this.coluna > 0) {
				this.coluna--;
			}
			if (jogoDaVelha[this.linha][this.coluna]==this.jogador) {
				System.out.println("Posição já ocupada!");
			} else {
				jogoDaVelha[this.linha][this.coluna] = this.jogador;
				jogouCerto = true;
			}

		}
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				if (i == 2 && j == 1) {
					if (jogoDaVelha[i][j]==this.jogador && jogoDaVelha[i][j - 1]==this.jogador
							&& jogoDaVelha[i][j + 1]==this.jogador) {
						acabou = true;
						campeao = this.jogador;
					}
				} else if (i == 1 && j == 1) {
					if (jogoDaVelha[i][j]==this.jogador && jogoDaVelha[i - 1][j - 1]==this.jogador
							&& jogoDaVelha[i + 1][j + 1]==this.jogador
							|| jogoDaVelha[i][j]==this.jogador
									&& jogoDaVelha[i + 1][j - 1]==this.jogador
									&& jogoDaVelha[i - 1][j + 1]==this.jogador
							|| jogoDaVelha[i][j]==this.jogador
									&& jogoDaVelha[i][j - 1]==this.jogador
									&& jogoDaVelha[i][j + 1]==this.jogador
							|| jogoDaVelha[i][j]==this.jogador
									&& jogoDaVelha[i - 1][j]==this.jogador
									&& jogoDaVelha[i + 1][j]==this.jogador) {
						acabou = true;
						campeao = this.jogador;
					}
				} else if (i == 0 && j == 1) {
					if (jogoDaVelha[i][j]==this.jogador && jogoDaVelha[i][j - 1]==this.jogador
							&& jogoDaVelha[i][j + 1]==this.jogador) {
						acabou = true;
						campeao = this.jogador;

					}
				} else if (i == 1 && j == 0) {
					if (jogoDaVelha[i][j]==this.jogador && jogoDaVelha[i - 1][j]==this.jogador
							&& jogoDaVelha[i + 1][j]==this.jogador) {
						acabou = true;
						campeao = this.jogador;

					}
				} else if (i == 1 && j == 2) {
					if (jogoDaVelha[i][j]==this.jogador && jogoDaVelha[i - 1][j]==this.jogador
							&& jogoDaVelha[i + 1][j]==this.jogador) {
						acabou = true;
						campeao = this.jogador;

					}
				}
			}
			
		}
		jogadas++;
	}
}
