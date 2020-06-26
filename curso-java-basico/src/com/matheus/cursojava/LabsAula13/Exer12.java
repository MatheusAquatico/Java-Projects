package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("este programa calcula o seu IMC. Digite seua altura que te daremos seu peso saudável: ");
		double altura= scan.nextDouble();
		double pesoIdeal= (72.7*altura)-58;
		System.out.println("Seu peso ideal é: " + pesoIdeal);
	}

}
