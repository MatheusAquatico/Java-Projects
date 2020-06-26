package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número para saber se é um ano bissexto: ");
		
		int ano =scan.nextInt();
		
		if ((ano%4==00 && ano%100!=0) ||  (ano%400==0)) {
			System.out.println("É um ano bissexto");
		}else {
			System.out.println("Não é um ano bissexto");
		}
		

	}

}
