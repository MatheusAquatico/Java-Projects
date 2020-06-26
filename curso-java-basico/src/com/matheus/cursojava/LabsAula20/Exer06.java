package com.matheus.cursojava.LabsAula20;

import java.util.Scanner;

public class Exer06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] jogoDaVelha = new String[3][3];
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				jogoDaVelha[i][j] = "  ";
			}

		}
		int linha = 0;
		int coluna = 0;
		int jogadas = 0;
		System.out.println("Seja bem vindo ao jogo da velha!");
		System.out.println("O primeiro jogador começa com \"O\" ");
		System.out.println("O primeiro jogador começa com \"X\" ");
		boolean acabou = false;
		String campeao = "";
		while (!acabou) {
			boolean certo = false;
			for (int i = 0; i < jogoDaVelha.length; i++) {
				for (int j = 0; j < jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j]);
					if (j < 2) {
						System.out.print("|");
					}

				}
				System.out.println();
				if (i < 2) {
					System.out.println("--------");
				}
			}
			while (!certo) {
				System.out.println("Primeiro jogador, comece sua jogada informando a posição linha/coluna");
				linha = scan.nextInt();
				coluna = scan.nextInt();
				if (linha > 0) {
					linha--;
				}
				if (coluna > 0) {
					coluna--;
				}
				if (jogoDaVelha[linha][coluna].equals("O") || jogoDaVelha[linha][coluna].equals("X")) {
					System.out.println("Posição já ocupada!");
				} else {
					certo=true;
					jogoDaVelha[linha][coluna] = "O";
				}
			}
			jogoDaVelha[linha][coluna] = "O";
			for (int i = 0; i < jogoDaVelha.length; i++) {
				for (int j = 0; j < jogoDaVelha[i].length; j++) {
					if (i == 2 && j == 1) {
						if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i][j - 1].contentEquals("O")
								&& jogoDaVelha[i][j + 1].contentEquals("O")) {
							acabou = true;
							campeao = "O";
						} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i][j - 1].contentEquals("X")
								&& jogoDaVelha[i][j + 1].contentEquals("X")) {
							acabou = true;
							campeao = "X";
						}
					} else if (i == 1 && j == 1) {
						if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i - 1][j - 1].contentEquals("O")
								&& jogoDaVelha[i + 1][j + 1].contentEquals("O")
								|| jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i + 1][j - 1].contentEquals("O")
										&& jogoDaVelha[i - 1][j + 1].contentEquals("O")
								|| jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i][j - 1].contentEquals("O")
										&& jogoDaVelha[i][j + 1].contentEquals("O")
								|| jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i - 1][j].contentEquals("O")
										&& jogoDaVelha[i + 1][j].contentEquals("O")) {
							acabou = true;
							campeao = "O";
						} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i - 1][j - 1].contentEquals("X")
								&& jogoDaVelha[i + 1][j + 1].contentEquals("X")
								|| jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i + 1][j - 1].contentEquals("X")
										&& jogoDaVelha[i - 1][j + 1].contentEquals("X")
								|| jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i][j - 1].contentEquals("X")
										&& jogoDaVelha[i][j + 1].contentEquals("X")
								|| jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i - 1][j].contentEquals("X")
										&& jogoDaVelha[i + 1][j].contentEquals("X")) {
							acabou = true;
							campeao = "X";
						}
					} else if (i == 0 && j == 1) {
						if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i][j - 1].contentEquals("O")
								&& jogoDaVelha[i][j + 1].contentEquals("O")) {
							acabou = true;
							campeao = "O";

						} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i][j - 1].contentEquals("X")
								&& jogoDaVelha[i][j + 1].contentEquals("X")) {
							acabou = true;
							campeao = "X";
						}
					} else if (i == 1 && j == 0) {
						if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i - 1][j].contentEquals("O")
								&& jogoDaVelha[i + 1][j].contentEquals("O")) {
							acabou = true;
							campeao = "O";

						} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i - 1][j].contentEquals("X")
								&& jogoDaVelha[i + 1][j].contentEquals("X")) {
							acabou = true;
							campeao = "X";
						}
					} else if (i == 1 && j == 2) {
						if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i - 1][j].contentEquals("O")
								&& jogoDaVelha[i + 1][j].contentEquals("O")) {
							acabou = true;
							campeao = "O";

						} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i - 1][j].contentEquals("X")
								&& jogoDaVelha[i + 1][j].contentEquals("X")) {
							acabou = true;
							campeao = "X";
						}
					}
				}
			}
			jogadas++;
			if (!acabou) {
				for (int i = 0; i < jogoDaVelha.length; i++) {
					for (int j = 0; j < jogoDaVelha[i].length; j++) {
						System.out.print(jogoDaVelha[i][j]);
						if (j < 2) {
							System.out.print("|");
						}

					}
					System.out.println();
					if (i < 2) {
						System.out.println("--------");
					}

				}
				certo = false;
				while (!certo) {
					System.out.println("Segundo jogador, comece sua jogada informando a posição linha/coluna");
					linha = scan.nextInt();
					coluna = scan.nextInt();
					if (linha > 0) {
						linha--;
					}
					if (coluna > 0) {
						coluna--;
					}
					if (jogoDaVelha[linha][coluna].equals("O") || jogoDaVelha[linha][coluna].equals("X")) {
						System.out.println("Posição já ocupada!");
					} else {
						certo=true;
						jogoDaVelha[linha][coluna] = "X";
					}
				}
				jogoDaVelha[linha][coluna] = "X";
				for (int i = 0; i < jogoDaVelha.length; i++) {
					for (int j = 0; j < jogoDaVelha[i].length; j++) {
						if (i == 2 && j == 1) {
							if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i][j - 1].contentEquals("O")
									&& jogoDaVelha[i][j + 1].contentEquals("O")) {
								acabou = true;
								campeao = "O";
							} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i][j - 1].contentEquals("X")
									&& jogoDaVelha[i][j + 1].contentEquals("X")) {
								acabou = true;
								campeao = "X";
							}
						} else if (i == 1 && j == 1) {
							if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i - 1][j - 1].contentEquals("O")
									&& jogoDaVelha[i + 1][j + 1].contentEquals("O")
									|| jogoDaVelha[i][j].contentEquals("O")
											&& jogoDaVelha[i + 1][j - 1].contentEquals("O")
											&& jogoDaVelha[i - 1][j + 1].contentEquals("O")
									|| jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i][j - 1].contentEquals("O")
											&& jogoDaVelha[i][j + 1].contentEquals("O")
									|| jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i - 1][j].contentEquals("O")
											&& jogoDaVelha[i + 1][j].contentEquals("O")) {
								acabou = true;
								campeao = "O";
							} else if (jogoDaVelha[i][j].contentEquals("X")
									&& jogoDaVelha[i - 1][j - 1].contentEquals("X")
									&& jogoDaVelha[i + 1][j + 1].contentEquals("X")
									|| jogoDaVelha[i][j].contentEquals("X")
											&& jogoDaVelha[i + 1][j - 1].contentEquals("X")
											&& jogoDaVelha[i - 1][j + 1].contentEquals("X")
									|| jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i][j - 1].contentEquals("X")
											&& jogoDaVelha[i][j + 1].contentEquals("X")
									|| jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i - 1][j].contentEquals("X")
											&& jogoDaVelha[i + 1][j].contentEquals("X")) {
								acabou = true;
								campeao = "X";
							}
						} else if (i == 0 && j == 1) {
							if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i][j - 1].contentEquals("O")
									&& jogoDaVelha[i][j + 1].contentEquals("O")) {
								acabou = true;
								campeao = "O";

							} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i][j - 1].contentEquals("X")
									&& jogoDaVelha[i][j + 1].contentEquals("X")) {
								acabou = true;
								campeao = "X";
							}
						} else if (i == 1 && j == 0) {
							if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i - 1][j].contentEquals("O")
									&& jogoDaVelha[i + 1][j].contentEquals("O")) {
								acabou = true;
								campeao = "O";

							} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i - 1][j].contentEquals("X")
									&& jogoDaVelha[i + 1][j].contentEquals("X")) {
								acabou = true;
								campeao = "X";
							}
						} else if (i == 1 && j == 2) {
							if (jogoDaVelha[i][j].contentEquals("O") && jogoDaVelha[i - 1][j].contentEquals("O")
									&& jogoDaVelha[i + 1][j].contentEquals("O")) {
								acabou = true;
								campeao = "O";

							} else if (jogoDaVelha[i][j].contentEquals("X") && jogoDaVelha[i - 1][j].contentEquals("X")
									&& jogoDaVelha[i + 1][j].contentEquals("X")) {
								acabou = true;
								campeao = "X";
							}
						}
					}
				}
			}
			jogadas++;
			if (jogadas > 8) {
				acabou = true;
				campeao = "ninguém";
			}

		}
		System.out.println("O " + campeao + " venceu!");
	}
}
