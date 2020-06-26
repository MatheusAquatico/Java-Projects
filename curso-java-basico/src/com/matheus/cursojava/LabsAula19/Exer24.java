package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer24 {
	public static void main (String [ ]args) {
		Scanner scan = new Scanner(System.in);
		boolean palindromo = true;
		int[] arrayInt = new int[10];
		for (int i = 0; i<arrayInt.length;i++) {
			System.out.println("Escreva um dígito para a posição " + (i+1) );
			arrayInt[i]=scan.nextInt();
		}for (int j = 0,k=arrayInt.length-1;j<arrayInt.length;j++,k--) {
			if(arrayInt[j]!=arrayInt[k]) {
				palindromo = false;
			}
		}
		if(palindromo) {
			System.out.println("Esse número é um palíndromo");
		}else {
			System.out.println("Esse número não é um palíndromo");
		}
	}
}
