package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos metros você tem para converter em centímetros: ");
		
		double metros = scan.nextDouble();
		double centimetros = metros*100;
		System.out.println(centimetros);
	}

}
