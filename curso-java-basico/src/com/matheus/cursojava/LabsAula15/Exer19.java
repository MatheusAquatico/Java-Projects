package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = scan.nextInt();
		System.out.println("Que operação você quer fazer?: ");
		scan.nextLine();
		char operacao = scan.nextLine().charAt(0);
		int num3;
		
		switch (operacao) {
		case 'A':
		case 'a':
		case '+': num3 = num1 + num2;
		if(num3%2==0) {
			if (num3 >=0) {
				System.out.println(num3);
				System.out.println("É par e positivo");
			}else {
				System.out.println(num3);
				System.out.println("É par e negativo");
			}
			
		}else {
			if (num3 >=0) {
				System.out.println(num3);
				System.out.println("É impar e positivo");

			}else {
				System.out.println(num3);
				System.out.println("É impar e negativo");
			}

		}break;
		case 'S':
		case 's':
		case '-': num3 = num1 - num2; 
		if(num3%2==0) {
			if (num3 >=0) {
				System.out.println(num3);
				System.out.println("É par e positivo");
			}else {
				System.out.println(num3);
				System.out.println("É par e negativo");
			}
			
		}else {
			if (num3 >=0) {
				System.out.println(num3);
				System.out.println("É impar e positivo");

			}else {
				System.out.println(num3);
				System.out.println("É impar e negativo");
			}

		}break;
		case 'D':
		case 'd':
		case '/': num3 = num1 / num2;
		if(num3%2==0) {
			if (num3 >=0) {
				System.out.println(num3);
				System.out.println("É par e positivo");
			}else {
				System.out.println(num3);
				System.out.println("É par e negativo");
			}
			
		}else {
			if (num3 >=0) {
				System.out.println(num3);
				System.out.println("É impar e positivo");

			}else {
				System.out.println(num3);
				System.out.println("É impar e negativo");
			}

		}break;
		case 'M':
		case 'm':
		case '*': num3 = num1 * num2; 
		if(num3%2==0) {
			if (num3 >=0) {
				System.out.println(num3);
				System.out.println("É par e positivo");
			}else {
				System.out.println(num3);
				System.out.println("É par e negativo");
			}
			
		}else {
			if (num3 >=0) {
				System.out.println(num3);
				System.out.println("É impar e positivo");

			}else {
				System.out.println(num3);
				System.out.println("É impar e negativo");
			}

		}break;
		
		}
		

	}

}
