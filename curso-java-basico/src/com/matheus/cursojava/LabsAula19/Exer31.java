package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] listaNumerosA= new int [20];
		int [] listaNumerosB= new int [20];
		int posA=0;
		int posB=10;
		for ( int i = 0; i<listaNumerosA.length;i++) {
			System.out.println("Digite na lista o número da posição " + (i+1));
			listaNumerosA [i]=scan.nextInt();
		}for (int j = 0 ; j<listaNumerosB.length;j++) {
			if(listaNumerosA [j]%2==0) {
				listaNumerosB [posA]=listaNumerosA [j];
				posA++;
			}else {
				listaNumerosB [posB]=listaNumerosA [j];
					posB++;
				}
			}
		
		for (int numeros : listaNumerosB) {
			System.out.print(numeros + " ");
		}
	}

}
