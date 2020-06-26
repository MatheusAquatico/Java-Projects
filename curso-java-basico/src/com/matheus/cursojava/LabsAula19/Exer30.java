package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] listaNumeros= new int [20];
		int [] listaNumerosPares= new int [10];
		int [] listaNumerosImpares= new int [10];
		int add =0;
		int bota = 0;
		for ( int i = 0; i<listaNumeros.length;i++) {
			System.out.println("Digite na lista o número da posição " + (i+1));
			listaNumeros [i]=scan.nextInt();
		}for ( int j = 0; j<listaNumeros.length;j++) {
			if(listaNumeros [j]%2==0) {
				listaNumerosPares [add]= listaNumeros [j];
				add++;
			}else {
				listaNumerosImpares [bota]= listaNumeros [j];
				bota++;
			}
		
		}
		for (int numeros : listaNumerosPares) {
			System.out.print(numeros + " ");
		}
		System.out.println();
		for (int numeros : listaNumerosImpares) {
			System.out.print(numeros + " ");
		}
	}

}
