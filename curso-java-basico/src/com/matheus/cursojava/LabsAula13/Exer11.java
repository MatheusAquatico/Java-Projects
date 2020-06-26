package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor digite dois números inteiros: ");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		System.out.println("Por favor digite um número real: ");
		double num3 = scan.nextDouble();
		System.out.println("Produto do dobro do primeiro com metade do segundo: ");
		System.out.println((num1 * 2) * (num2/2));
		System.out.println("Soma do triplo do primeiro com o terceiro: ");
		System.out.println(num1 * 3 + num3);
		System.out.println("Terceiro elevado ao cubo: ");
		System.out.println(Math.pow(num3, 3));

	}

}
