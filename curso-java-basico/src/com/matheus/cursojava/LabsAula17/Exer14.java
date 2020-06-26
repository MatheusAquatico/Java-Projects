package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int pares=0;
		int impares =0;
		for(int i =0;i <10;i++) {
			System.out.println("Escreva o número: ");
			int numero = scan.nextInt();
			if(i%2==0) {
				pares++;
			}else {
				impares++;
			}
		}
		System.out.println("Tiveram " + pares + " pares e " + impares + " impares");
	}

}
