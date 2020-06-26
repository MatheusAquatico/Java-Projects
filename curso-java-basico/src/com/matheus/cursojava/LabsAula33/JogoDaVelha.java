package com.matheus.cursojava.LabsAula33;

public class JogoDaVelha {
	
	private char[][] jogoDaVelha;
	private int linha;
	private int coluna;
	private int jogadas;
	private char campeao;
	private boolean acabou;
	private char jogador;
	private boolean jogouCerto;
	
	JogoDaVelha (char[][] jogoDaVelha){
		this.jogoDaVelha = jogoDaVelha;		
		this.jogadas=0;
		this.acabou = false;
	}
	
	public void iniciarJogo() {
		System.out.println("Seja bem vindo ao jogo da velha!");
		System.out.println("O primeiro jogador começa com \"O\" ");
		System.out.println("O segundo jogador começa com \"X\" ");
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				jogoDaVelha[i][j] = ' ';
			}

		}
	}

	public void imprimirJogo() {
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

	public boolean verificarVencedor() {
		if (acabou) {
			System.out.println(campeao + " venceu!");
			if (jogadas > 8) {
				System.out.println("Deu empate");
			}
			return true;
		}
		return false;
	}

	public void fazerJogada(char jogador, int linha, int coluna) {
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

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int getJogadas() {
		return jogadas;
	}

	public void setJogadas(int jogadas) {
		this.jogadas = jogadas;
	}

	public char getCampeao() {
		return campeao;
	}

	public void setCampeao(char campeao) {
		this.campeao = campeao;
	}

	public boolean isAcabou() {
		return acabou;
	}

	public void setAcabou(boolean acabou) {
		this.acabou = acabou;
	}
	
	public char[][] getJogoDaVelha(){
		return jogoDaVelha;
	}
	
	public void setJogoDaVelha(char[][] JogoDaVelha) {
		this.jogoDaVelha= JogoDaVelha;
	}
	public char getJogador () {
		return jogador;
	}
	
	public void setJogador (char Jogador) {
		this.jogador=jogador;
	}
	public boolean isJogouCerto () {
		return jogouCerto;
	}
	public void setJogouCerto(boolean jogouCerto) {
		this.jogouCerto=jogouCerto;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}
}
