package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int [] arrayA = new int [10];
		int soma =0 ;
		int qte=0;
		for(int i = 0; i<arrayA.length;i++) {
			System.out.println("Digite o n�mero da posi��o "+ (i+1));
			arrayA [i] = scan.nextInt();
		}for (int j=0;j<arrayA.length;j++) {
			if(arrayA[j]%2!=0) {
			soma+=arrayA[j];
			qte++;
			}
		}
		System.out.println("A m�dia dos n�meros �mpares da lista �: " + (soma/qte));
	}

}
