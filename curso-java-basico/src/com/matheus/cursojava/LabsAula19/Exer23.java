package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean impar = false;
		int posicao = 0;
		int[] arrayInt = new int[10];
		for (int i = 0; i<arrayInt.length;i++) {
			System.out.println("Escreva um n�mero para a posi��o " + (i+1) );
			arrayInt[i]=scan.nextInt();
		}
		while (!impar) {
			if(arrayInt[posicao]%2!=0) {
				System.out.println("Esse n�mero n�o � par na posi��o " + (posicao+1));
				impar = true;
			}else {
				System.out.println("Esse n�mero � par na posi��o " + (posicao+1));
				posicao++;
				System.out.println("Fim do programa");
			}
		}
	}
}
