package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arrayIntA = new int[10];
		int[] arrayIntB = new int[10];
		int[] arrayIntC = new int[10];
		for (int i = 0; i < arrayIntA.length; i++) {
			System.out.println("Escreva um número para a posição " + (i + 1) + " do vetor A ");
			arrayIntA[i] = scan.nextInt();
			System.out.println("Escreva um número para a posição " + (i + 1) + " do vetor B ");
			arrayIntB[i] = scan.nextInt();
			if (arrayIntA[i] > arrayIntB[i]) {
				arrayIntC[i] = 1;
			} else if (arrayIntA[i] == arrayIntB[i]) {
				arrayIntC[i] = 0;
			} else {
				arrayIntC[i] = -1;
			}

		}
		System.out.print("ArrayA: ");
		for (int array : arrayIntA) {
			
			System.out.print(array + " ");
		}
		System.out.print("ArrayB: ");
		for (int array : arrayIntB) {
		
			System.out.print(array + " ");
		}
		System.out.print("ArrayC: ");
		for (int array : arrayIntC) {
			
			System.out.print(array + " ");
		}
	}
}
