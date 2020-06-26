package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Escreva uma nota entre zero e dez");
		int nota = scan.nextInt();
		while(nota<0 || nota>10) {
			System.out.println("Informe um valor válido");
			nota = scan.nextInt();
		}
	}

}
