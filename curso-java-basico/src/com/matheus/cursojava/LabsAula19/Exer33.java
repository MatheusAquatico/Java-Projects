package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer33 {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		int [] listaNumeros = new int [10];
		
		for ( int i=0; i<listaNumeros.length;i++) {
			System.out.println("Escreva na lista o n�mero na posi��o " + (1+i));
			listaNumeros [i]=scan.nextInt();
		}for ( int j =0;j<listaNumeros.length;j++) {
			boolean primo = true;
			for(int k = 1 ; k<=j;k++) {
				if(k!=1&&k!=j&&listaNumeros[j]%k==0) {
					System.out.println("O n�mero " + listaNumeros[j]+ " n�o � primo");
					primo = false;
					break;
				}
			}if(primo) {
			System.out.println("O n�mero " + listaNumeros[j] + " � primo");
			}
		}
	}
}
