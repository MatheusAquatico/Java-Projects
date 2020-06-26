package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] numeros = new int [5];
		for (int i = 0; i<numeros.length;i++) {
			System.out.println("Escreva na lista o número da posição " + (1+i));
			numeros [i]=scan.nextInt();
		}
		for(int k = 0;k<numeros.length;k++) {
		for (int j = 0; j<=10;j++) {
			System.out.println(numeros[k] + "*" + j +"=" + (numeros[k]*j));
			
		}
		}
	}

}
