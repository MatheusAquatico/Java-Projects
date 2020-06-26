package com.matheus.cursojava.LabsAula19;

public class Exer08 {

	public static void main(String[] args) {
		int arrayIntA[] = new int [10];
		int arrayIntB[] = new int [10];
		int arrayIntC[] = new int [10];
		for (int i = 0; i< arrayIntA.length; i++) {
			arrayIntA[i]=i;
			arrayIntB[i] = i+1;
			arrayIntC[i]=arrayIntA[i] * arrayIntB[i];
		}

	}

}
