package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite 3 números inteiros diferentes para saber o maior deles");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " é o maior número");
		}else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " é o maior número");
		}else if (num3 >= num2 && num3 >= num1) {
			System.out.println(num3 + " é o maior número");
		}
	}

}
