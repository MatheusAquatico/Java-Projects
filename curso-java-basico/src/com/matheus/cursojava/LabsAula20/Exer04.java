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
			System.out.println("Você deseja:                                ");
			System.out.println("1- Marcar ou alterar compromisso.           ");
			System.out.println("2- Checar ou alterar compromisso.           ");
			System.out.println("Digite a opção abaixo: ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Informe o dia que você queira marcar o compromisso: ");
				dia = (scan.nextInt() - 1);
				System.out.println("Informe a hora que você queira marcar o compromisso: ");
				hora = (scan.nextInt() - 1);
				if (compromissos[dia][hora] == null) {
					System.out.println("O horário está vago! Escreva o compromisso:");
					scan.nextLine();
					compromissos[dia][hora] = scan.nextLine();
					break;
				} else {
					System.out.println("O horário está ocupado! Deseja alterar o compromisso?");
					alterar = scan.nextLine();
					if (alterar.equalsIgnoreCase("sim") || alterar.equalsIgnoreCase("s")) {
						System.out.println("Escreva o compromisso:");
						scan.nextLine();
						compromissos[dia][hora] = scan.nextLine();
						break;
					}
				}
			case 2:
				System.out.println("Informe o dia que você queira checar o compromisso: ");
				dia = (scan.nextInt() - 1);
				System.out.println("Informe a hora que você queira checar o compromisso: ");
				hora = (scan.nextInt() - 1);
				if (compromissos[dia][hora] != null) {
					System.out.println("Seu compromisso: ");
					scan.nextLine();
					System.out.println(compromissos[dia][hora]);
				} else {
					System.out.println("Não existe compromisso no dia e hora informado!");
				}
				break;
			}
			System.out.println("Você deseja marcar ou checar outro compromisso?");
			{
				recomecar = scan.nextLine();
				if (recomecar.equalsIgnoreCase("não") || recomecar.equalsIgnoreCase("n")) {
					acabou = true;
				}
			}
		}
	}
}
