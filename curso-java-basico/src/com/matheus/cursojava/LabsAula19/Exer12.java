package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer12 {
	public static void main (String [] args) {
		Scanner scan= new Scanner (System.in);
		int [] arrayA = new int [10];
		int soma =0 ;
		for(int i = 0; i<arrayA.length;i++) {
			System.out.println("Digite o n�mero da posi��o "+ (i+1));
			arrayA [i] = scan.nextInt();
		}for (int j=0;j<arrayA.length;j++) {
			soma+=arrayA[j];
		}
		System.out.println("A soma dos n�meros da lista �: " + soma);
	}
}
