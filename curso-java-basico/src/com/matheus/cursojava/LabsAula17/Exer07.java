package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean acabou = false;
		while (!acabou) {
			System.out.println("Escreva o 1� n�mero");
			int primeiro = scan.nextInt();
			int maior = primeiro;
			System.out.println("Escreva o 2� n�mero");
			int segundo = scan.nextInt();
			if (maior < segundo) {
				maior = segundo;
			}
			System.out.println("Escreva o 3� n�mero");
			int terceiro = scan.nextInt();
			if (maior < terceiro) {
				maior = terceiro;
			}
			System.out.println("Escreva o 4� n�mero");
			int quarto = scan.nextInt();
			if (maior < quarto) {
				maior = quarto;
			}
			System.out.println("Escreva o 5� n�mero");
			int quinto = scan.nextInt();
			if (maior < quinto) {
				maior = quinto;
			}
			System.out.println("o maior n�mero �: " + maior);
			acabou = true;
		}

	}

}
