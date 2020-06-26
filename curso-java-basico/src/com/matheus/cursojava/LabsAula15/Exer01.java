package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer01 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite dois números para saber o maior deles: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + " é o maior número");
		}else if (num2>num1) {
			System.out.println(num2 + " é o maior número");
		}else {
			System.out.println("Os números são iguais");
		}
	}
}
