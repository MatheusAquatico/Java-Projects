package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este é um conversor de temperatura Celsius/Farenheit. Digite sua temperatura: ");
		double c= scan.nextDouble();
		double f= (c*9)/5+32;
		System.out.println("O valor convertido é: " + f);

	}

}
