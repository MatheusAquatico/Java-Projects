package com.matheus.cursojava.LabsAula20;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] compromissos = new String[31][24];
		int dia = 0;
		int hora = 0;
		int opcao;
		String recomecar;
		boolean acabou = false;
		while (!acabou) {
			String alterar;
			System.out.println("----Seja bem vindo a sua agenda pessoal!----");
			System.out.println("Voc� deseja:                                ");
			System.out.println("1- Marcar ou alterar compromisso.           ");
			System.out.println("2- Checar ou alterar compromisso.           ");
			System.out.println("Digite a op��o abaixo: ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Informe o dia que voc� queira marcar o compromisso: ");
				dia = (scan.nextInt() - 1);
				System.out.println("Informe a hora que voc� queira marcar o compromisso: ");
				hora = (scan.nextInt() - 1);
				if (compromissos[dia][hora] == null) {
					System.out.println("O hor�rio est� vago! Escreva o compromisso:");
					scan.nextLine();
					compromissos[dia][hora] = scan.nextLine();
					break;
				} else {
					System.out.println("O hor�rio est� ocupado! Deseja alterar o compromisso?");
					alterar = scan.nextLine();
					if (alterar.equalsIgnoreCase("sim") || alterar.equalsIgnoreCase("s")) {
						System.out.println("Escreva o compromisso:");
						scan.nextLine();
						compromissos[dia][hora] = scan.nextLine();
						break;
					}
				}
			case 2:
				System.out.println("Informe o dia que voc� queira checar o compromisso: ");
				dia = (scan.nextInt() - 1);
				System.out.println("Informe a hora que voc� queira checar o compromisso: ");
				hora = (scan.nextInt() - 1);
				if (compromissos[dia][hora] != null) {
					System.out.println("Seu compromisso: ");
					scan.nextLine();
					System.out.println(compromissos[dia][hora]);
				} else {
					System.out.println("N�o existe compromisso no dia e hora informado!");
				}
				break;
			}
			System.out.println("Voc� deseja marcar ou checar outro compromisso?");
			{
				recomecar = scan.nextLine();
				if (recomecar.equalsIgnoreCase("n�o") || recomecar.equalsIgnoreCase("n")) {
					acabou = true;
				}
			}
		}
	}
}
