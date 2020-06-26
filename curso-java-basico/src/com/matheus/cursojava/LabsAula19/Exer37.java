package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] listaNumerosA = new int[15];
		int[] listaNumerosB= new int[15];
		for (int i = 0; i < listaNumerosA.length; i++) {
			System.out.println("Escreva na lista o número na posição " + (1 + i));
			listaNumerosA[i] = scan.nextInt();
		}for(int j = 0;j<listaNumerosB.length;j++) {
			listaNumerosB[j]=listaNumerosA[j];
			for(int k=listaNumerosA[j]-1;k>0;k--) {
				listaNumerosB[j]*=k;
			}
		}
		for (int numero : listaNumerosB) {
			System.out.println(numero);
		}
	}

}
