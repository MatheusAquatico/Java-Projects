package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite 3 n�meros que o programa vai arrumar em forma decrescente");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			if(num2<= num3) {
				System.out.println(num1+ " " + num3 + " " + num2);
			}else {
				System.out.println(num1+ " " + num2 + " " + num3);
			}
		}else if (num2 >= num1 && num2 >= num3) {
			if(num1<= num3) {
				System.out.println(num2+ " " + num3 + " " + num1);
			}else {
				System.out.println(num2+ " " + num1 + " " + num3);
			}
		}else if (num3 >= num2 && num3 >= num1) {
			if(num2<= num1) {
				System.out.println(num3+ " " + num1 + " " + num2);
			}else {
				System.out.println(num3+ " " + num2 + " " + num1);
			}
		}


	}

}
