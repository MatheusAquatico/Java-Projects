package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Voc� � de que turno?");
		char turno = scan.nextLine().charAt(0);
		
		switch (turno){
		case 'm':
		case 'M':System.out.println("Bom dia!");	break;
		case 'v':
		case 'V':System.out.println("Boa tarde!");	break;
		case 'n':
		case 'N':System.out.println("Boa noite!");	break;
		default:System.out.println("Digite um comando v�lido");	break;
		}
		
	}

}
