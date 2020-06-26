package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite uma letra e o programa indicará se é uma vogal ou uma consoante");
		char letra = scan.next().charAt(0);
		switch (letra) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':System.out.println("Vogal");break;
		case '!':
		case '@':
		case '#':
		case '$':
		case '%':
		case '&':
		case '*':
		case ':':
		case '?':
		case ';':System.out.println("Input inválido");break;
		default: System.out.println("Consoante");break;
		}
	}

}
