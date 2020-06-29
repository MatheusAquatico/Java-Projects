package com.matheus.cursojava.LabsAula20;

import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mes =0;
		int dia = 0;
		int hora = 0;
		
		int opcao;
		String recomecar;
		String[][][] compromissos = new String[12][31][24];
		boolean acabou = false;
		while (!acabou) {
			boolean mesCerto =false;
			String alterar;
			System.out.println("----Seja bem vindo a sua agenda pessoal!----");
			System.out.println("Voc� deseja:                                ");
			System.out.println("1- Marcar ou alterar compromisso.           ");
			System.out.println("2- Checar ou alterar compromisso.           ");
			System.out.println("Digite a op��o abaixo: ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				while(!mesCerto) {
				System.out.println("Qual m�s do ano voc� deseja usar?");
				
				mes = (scan.nextInt()-1);
				
				System.out.println("Informe o dia que voc� queira marcar o compromisso: ");
				dia = (scan.nextInt() - 1);
				switch (mes){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						 System.out.println("Esse m�s tem o dia escolhido!");
						 mesCerto=true;
						break;
					case 2:
						if(dia>27) {
							 System.out.println("Esse m�s n�o tem o dia escolhido!");
						}else {
							 System.out.println("Esse m�s tem o dia escolhido!");
							 mesCerto=true;
						}
						break;
					default:
						if(dia==20) {
							 System.out.println("Esse m�s n�o tem o dia escolhido!");
						}else {
							 System.out.println("Esse m�s tem o dia escolhido!");
							 mesCerto=true;
						}
						break;
					
				}}
				
				do {
					System.out.println("Informe a hora que voc� queira marcar o compromisso (S� pode ser entre 10 �s 17): ");
					hora = (scan.nextInt() - 1);
				}while (hora < 10 && hora > 17);
				
				
				if (compromissos[mes][dia][hora] == null) {
					System.out.println("O hor�rio est� vago! Escreva o compromisso:");
					scan.nextLine();
					String lembrete =scan.nextLine();;
					compromissos[mes][dia][hora] = lembrete;
					break;
				} else {
					System.out.println("O hor�rio est� ocupado! Deseja alterar o compromisso?");
					alterar = scan.nextLine();
					if (alterar.equalsIgnoreCase("sim") || alterar.equalsIgnoreCase("s")) {
						System.out.println("Escreva o compromisso:");
						scan.nextLine();
						compromissos[mes][dia][hora] = scan.nextLine();
						break;
					}
				}
			case 2:
				while(!mesCerto) {
				System.out.println("Informe o m�s que voc� queira checar o compromisso: ");
				
				 mes = (scan.nextInt()-1);
				 System.out.println("Informe o dia que voc� queira checar o compromisso: ");
					dia = (scan.nextInt() - 1);
				switch (mes){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						 System.out.println("Esse m�s tem o dia escolhido!");
						 mesCerto=true;
						break;
					case 2:
						if(dia>27) {
							 System.out.println("Esse m�s n�o tem o dia escolhido!");
						}else {
							 System.out.println("Esse m�s tem o dia escolhido!");
							 mesCerto=true;
						}
						break;
					default:
						if(dia==30) {
							 System.out.println("Esse m�s n�o tem o dia escolhido!");
						}else {
							 System.out.println("Esse m�s tem o dia escolhido!");
							 mesCerto=true;
						}
						break;
					
				}
				}
				System.out.println("Informe a hora que voc� queira checar o compromisso: ");
				hora = (scan.nextInt() - 1);
				if (compromissos[mes][dia][hora] != null) {
					System.out.println("Seu compromisso: ");
					scan.nextLine();
					System.out.println(compromissos[mes][dia][hora]);
				} else {
					System.out.println("N�o existe compromisso no dia e hora informado!");
				}
				break;
			}
			System.out.println("Voc� deseja marcar ou checar outro compromisso?");
			{
				scan.nextLine();
				recomecar = scan.nextLine();
				if (recomecar.equalsIgnoreCase("n�o") || recomecar.equalsIgnoreCase("n")) {
					acabou = true;
				}
			}
		}
	}
}
