package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int [] arrayA = new int [10];
		double paresQte = 0;
		double imparesQte = 0;
		for(int i = 0; i<arrayA.length;i++) {
			System.out.println("Digite o n�mero da posi��o "+ (i+1));
			arrayA [i] = scan.nextInt();
			if(arrayA [i]%2==0) {
				paresQte++;
			}else {
				imparesQte++;
			}
		}
		double perPares = (paresQte/arrayA.length)*100; 
		double perImpares=(imparesQte/arrayA.length)*100;
		System.out.println("A porcentagem de n�meros pares �: " + perPares +"%");
		System.out.println("A porcentagem de n�meros �mpares �: " + perImpares +"%");
	}

}
