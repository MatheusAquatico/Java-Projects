package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer07 {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite 3 n�meros inteiros diferentes para saber o maior e o menor deles");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			if(num2<= num3) {
				System.out.println(num1 + " � o maior n�mero e " + num2 + " � o menor n�mero");
			}else {
				System.out.println(num1 + " � o maior n�mero e " + num3 + " � o menor n�mero");
			}
		}else if (num2 >= num1 && num2 >= num3) {
			if(num1<= num3) {
				System.out.println(num2 + " � o maior n�mero e " + num1 + " � o menor n�mero");
			}else {
				System.out.println(num2 + " � o maior n�mero e " + num3 + " � o menor n�mero");
			}
		}else if (num3 >= num2 && num3 >= num1) {
			if(num2<= num1) {
				System.out.println(num3 + " � o maior n�mero e " + num2 + " � o menor n�mero");
			}else {
				System.out.println(num3 + " � o maior n�mero e " + num1 + " � o menor n�mero");
			}
		}
		
	}
}
