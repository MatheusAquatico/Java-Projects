package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] listaNumeros = new int[10];

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Escreva na lista o n�mero na posi��o " + (1 + i));
			listaNumeros[i] = scan.nextInt();
		}for ( int j = 0;j<listaNumeros.length;j++) {
			System.out.println("Os pares de 0 at� " + listaNumeros[j]);
			for(int k = 0; k<=listaNumeros[j];k++) {
			if(k%2==0) {
				System.out.println(k);
			}
			}
		}
	}
}
