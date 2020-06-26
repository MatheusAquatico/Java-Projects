package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer29 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int [] listaNumerosA= new int [10];
		int [] listaNumerosB= new int [10];
		int [] listaNumerosC= new int [listaNumerosA.length + listaNumerosB.length];
		for ( int i = 0; i<listaNumerosA.length;i++) {
			System.out.println("Digite na lista A o número da posição " + (i+1));
			listaNumerosA [i]=scan.nextInt();
		}for ( int j = 0; j<listaNumerosB.length;j++) {
			System.out.println("Digite na lista B o número da posição " + (j+1));
			listaNumerosB [j]=scan.nextInt();
		}
		for(int k = 0;k<listaNumerosC.length;k++) {
			if(k<listaNumerosC.length/2) {
				listaNumerosC[k]=listaNumerosA[k];
			}else {
				listaNumerosC[k]=listaNumerosB[k-10];
			}
		}
		for (int numeros : listaNumerosC) {
			System.out.print(numeros + " ");
		}
	}
}
