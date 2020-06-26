package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este é um conversor de temperatura Farenheit/celsius. Digite sua temperatura: ");
		double f= scan.nextDouble();
		double c= (5*(f-32)/9);
		System.out.println("O valor convertido é: " + c);
		
	}

}
