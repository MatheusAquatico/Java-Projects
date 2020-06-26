package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int arrayIntA[] = new int [10];
		int arrayIntB[] = new int [10];
		int arrayIntC[] = new int [10];
		for (int i = 0; i< arrayIntA.length; i++) {
			arrayIntA[i]=i;
			arrayIntB[i] = i+1;
			arrayIntC[i]=arrayIntA[i] + arrayIntB[i];
		}

	}

}
