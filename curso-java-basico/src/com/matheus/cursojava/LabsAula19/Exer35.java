package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] listaNumeros = new int[10];

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Escreva na lista o número na posição " + (1 + i));
			listaNumeros[i] = scan.nextInt();
		}
		for (int j = 0; j < listaNumeros.length; j++) {
			System.out.println(listaNumeros[j]+ " Tem os divisores: ");
			for (int k = 1; k <= listaNumeros[j]; k++) {
				if (listaNumeros[j] % k == 0) {
					System.out.println(k);
				}
			}
		}

	}

}
