package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int [] arrayA = new int [10];
		int somaQuinze = 0;
		int qteQuinze=0;
		int mediaQuinze=0;
		int qte=0;
		for(int i = 0; i<arrayA.length;i++) {
			System.out.println("Digite o número da posição "+ (i+1));
			arrayA [i] = scan.nextInt();
		}for (int j=0;j<arrayA.length;j++) {
			if(arrayA[j]<15) {
			somaQuinze+=arrayA[j];
			}else if(arrayA[j]==15){
				qteQuinze++;
			}else if(arrayA[j]>15) {
				mediaQuinze+=arrayA[j];
				qte++;
			}
		}
		System.out.println("A soma dos números menores que 15 é: " + somaQuinze);
		System.out.println("A quantidade dos números a 15 é: " + qteQuinze);
		System.out.println("A média dos números maiores que 15 é: " + (mediaQuinze/qte));
	}

}
