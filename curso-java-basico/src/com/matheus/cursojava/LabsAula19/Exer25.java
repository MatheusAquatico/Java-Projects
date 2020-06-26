package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arrayIntA = new int[10];
		int[] arrayIntB= new int[10];
		for (int i = 0; i<arrayIntA.length;i++) {
			System.out.println("Escreva um número para a posição " + (i+1) );
			arrayIntA[i]=scan.nextInt();
			if(arrayIntA[i]%2==0) {
				arrayIntB[i]=1;
			}else {
				arrayIntB[i]=0;
			}
		}for (int j = 0; j<arrayIntA.length;j++) {
			System.out.println(arrayIntA[j]);
			
		}for (int k = 0; k<arrayIntB.length;k++) {
			System.out.println(arrayIntB[k] );
			
		}
	}

}
