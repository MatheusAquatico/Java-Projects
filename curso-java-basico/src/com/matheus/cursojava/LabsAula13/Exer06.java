package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saiba a área do seu círculo digitando seu raio: ");
		double raio =scan.nextDouble();
		double area =(Math.PI*raio)*raio;
		System.out.println(area);
	}

}
