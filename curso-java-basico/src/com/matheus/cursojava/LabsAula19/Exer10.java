package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int arrayIntA[] = new int [10];
		int arrayIntB[] = new int [10];
		for ( int i = 0 ; i <  arrayIntA.length; i++) {
			System.out.println("Digite o elemento da posição " + i);
			arrayIntA[i]= scan.nextInt();
			arrayIntB[i] = arrayIntA[i] % 2;
		}

	}

}
