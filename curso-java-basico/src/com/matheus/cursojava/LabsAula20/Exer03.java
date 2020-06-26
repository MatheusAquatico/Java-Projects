package com.matheus.cursojava.LabsAula20;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		int[][] matrizInt = new int[3][3];
		for (int i = 0; i < matrizInt.length; i++) {
			for (int j = 0; j < matrizInt[i].length; j++) {
				System.out.println("Escreva o núnemro para a linha " + i + " e coluna " + j);
				matrizInt[i][j] = scan.nextInt();
				if (matrizInt[i][j] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}for (int i = 0; i < matrizInt.length; i++) {
			System.out.println();
			for (int j = 0; j < matrizInt[i].length; j++) {
				System.out.print(matrizInt[i][j] +" ");
				
			}
		}
		System.out.println();
		System.out.println("O número de pares foi: " + pares);
		System.out.println("O número de ímpares foi: " + impares);

	}

}
