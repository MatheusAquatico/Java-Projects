package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer08 {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Este programa vai te indicar o produto mais barato dentre 3. Digite os pre�os: ");
		System.out.println("Pre�o 1: ");
		double preco1 = scan.nextDouble();
		System.out.println("Pre�o 2: ");
		double preco2 = scan.nextDouble();
		System.out.println("Pre�o 3: ");
		double preco3 = scan.nextDouble();
		double maisBarato;
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			maisBarato= preco1;
			System.out.println(maisBarato + " � o mais barato");
		}else if(preco2 <= preco1 && preco2 <= preco3) {
			maisBarato= preco2;
			System.out.println(maisBarato + " � o mais barato");
		}else {
			maisBarato= preco3;
			System.out.println(maisBarato + " � o mais barato");
		}
		
	}
}
