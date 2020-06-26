package com.matheus.cursojava.LabsAula20;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		int maior = 0;
		int col=0;
		int linha = 0;
		Scanner scan = new Scanner(System.in);
		int[][] matrizInt = new int[4][4];
		for (int i = 0; i < matrizInt.length; i++) {
			for (int j = 0; j < matrizInt[i].length; j++) {
				matrizInt[i][j] = (int) (Math.random() *10);
				if(matrizInt[i][j]>maior) {
					maior=matrizInt[i][j];
					col =j;
					linha= i;
					
				}
			}
		}
		for (int i = 0; i < matrizInt.length; i++) {
			System.out.println();
			for (int j = 0; j < matrizInt[i].length; j++) {
				System.out.print(matrizInt[i][j] +" ");
				
			}
		}
		System.out.println("O maior foi: " + maior + " na coluna " + col + " e na linha " + linha);
	}
}
