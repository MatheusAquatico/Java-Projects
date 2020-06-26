package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa vai te dar a área de um quadrado e seu dobro se fornecido o lado: ");
		double lado =scan.nextDouble();
		double area = lado*lado;
		double dobro = area*2;
		System.out.println("Sua área: " + area);
		System.out.println("Seu dobro: "+ dobro);
	}

}
