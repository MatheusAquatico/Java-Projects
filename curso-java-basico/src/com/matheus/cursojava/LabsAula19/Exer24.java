package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer24 {
	public static void main (String [ ]args) {
		Scanner scan = new Scanner(System.in);
		boolean palindromo = true;
		int[] arrayInt = new int[10];
		for (int i = 0; i<arrayInt.length;i++) {
			System.out.println("Escreva um d�gito para a posi��o " + (i+1) );
			arrayInt[i]=scan.nextInt();
		}for (int j = 0,k=arrayInt.length-1;j<arrayInt.length;j++,k--) {
			if(arrayInt[j]!=arrayInt[k]) {
				palindromo = false;
			}
		}
		if(palindromo) {
			System.out.println("Esse n�mero � um pal�ndromo");
		}else {
			System.out.println("Esse n�mero n�o � um pal�ndromo");
		}
	}
}
