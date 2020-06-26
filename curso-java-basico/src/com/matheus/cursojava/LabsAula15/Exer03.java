package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite uma letra e saiba o sexo correspondente: ");
		char letra = scan.next().charAt(0);
		switch (letra) {
		case 'M':
		case 'm':System.out.println("Masculino"); break;
		case 'F':
		case 'f':System.out.println("Feminino"); break;
		default:System.out.println("Sexo inválido"); break;
		}
	}

}
