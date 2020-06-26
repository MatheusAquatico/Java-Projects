package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arrayIntA = new int[10];
		char[] arraycharB = new char[10];
		for (int i = 0; i<arrayIntA.length;i++) {
			System.out.println("Escreva um número para a posição " + (i+1) );
			arrayIntA[i]=scan.nextInt();
			if(arrayIntA[i]<7) {
				arraycharB[i]='a';
			}else if (arrayIntA[i]==7) {
				arraycharB[i]='b';
			}
			else if (arrayIntA[i]>7&&arrayIntA[i]<10) {
				arraycharB[i]='c';
			}else if (arrayIntA[i]==10) {
				arraycharB[i]='d';
			}else if(arrayIntA[i]>10) {
				arraycharB[i]='e';
			}
	}
		System.out.print("ArrayA :");
		for (int inteiro : arrayIntA) {
			System.out.print(inteiro + " ");
		}
		System.out.print("ArrayB :");
		for (char character : arraycharB) {
			System.out.print(character + " ");
		}

}
}