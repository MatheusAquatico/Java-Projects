package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os 3 lados de um triângulo: ");
		System.out.println("Lado 1: ");
		double lado1 = scan.nextDouble();
		System.out.println("Lado 2: ");
		double lado2 = scan.nextDouble();
		System.out.println("Lado 3: ");
		double lado3 = scan.nextDouble();

		if ((lado1 + lado2) > lado3 ||(lado1 + lado3)>lado2 || (lado2 + lado3)>lado1) {
			System.out.println("É triângulo!");
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("É Équilátero");

			}else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("É Escaleno");

			}else {
				System.out.println("É isósceles");
			}
	
		}else {
			System.out.println("Não é triângulo!");
			
		}
		
	}

}
