package com.matheus.cursojava.LabsAula13;
import java.util.Scanner;

public class Exer03 {
	
	public static void main (String [] args) {
		
		System.out.println("Digite dois números para saber a soma: ");
		Scanner scan = new Scanner (System.in);
		int num1= scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = num1 + num2;
		System.out.println("A soma é: " + num3);
		}
}
