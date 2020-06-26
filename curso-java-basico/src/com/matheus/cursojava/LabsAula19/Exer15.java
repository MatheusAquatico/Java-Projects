package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int [] arrayA = new int [10];
		double paresQte = 0;
		double imparesQte = 0;
		for(int i = 0; i<arrayA.length;i++) {
			System.out.println("Digite o número da posição "+ (i+1));
			arrayA [i] = scan.nextInt();
			if(arrayA [i]%2==0) {
				paresQte++;
			}else {
				imparesQte++;
			}
		}
		double perPares = (paresQte/arrayA.length)*100; 
		double perImpares=(imparesQte/arrayA.length)*100;
		System.out.println("A porcentagem de números pares é: " + perPares +"%");
		System.out.println("A porcentagem de números ímpares é: " + perImpares +"%");
	}

}
