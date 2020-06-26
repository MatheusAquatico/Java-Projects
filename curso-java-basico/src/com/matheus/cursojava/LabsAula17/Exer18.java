package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer18 {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Escreva um número inteiro para saber se ele é primo: ");
		int num = scan.nextInt();
		int contador = num;
		int numDivisores = 0;
		while (contador>0) {
			if (num%contador ==0) {
				numDivisores++;
			}
			contador--;
		}
			if (numDivisores ==2) {
				System.out.println("Seu número é primo!");
				
			}else {
				System.out.println("Seu número não é primo!");

			}
	}
}
