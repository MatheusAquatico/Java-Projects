package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer13 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Escreva um n�mero que o programa mostratr� o dia da semana correspondente: ");
		int dia = scan.nextInt();
		
		switch (dia) {
		case 1:System.out.println("Domingo!"); break;
		case 2:System.out.println("Segunda!"); break;
		case 3:System.out.println("Ter�a!"); break;
		case 4:System.out.println("Quarta!"); break;
		case 5:System.out.println("Quinta!"); break;
		case 6:System.out.println("Sexta!"); break;
		case 7:System.out.println("S�bado!"); break;
		default: System.out.println("Dia inv�lido"); break;
		}
	}
}
