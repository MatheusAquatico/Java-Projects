package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite a base do seu número: ");
		int base = scan.nextInt();
		int resultado = base;
		System.out.println("Digite o expoente do seu número: ");
		int expoente = scan.nextInt();
		for (int i = expoente; i>1 ;i--) {
			resultado = resultado * base;
		}
		System.out.println(resultado);
	}

}
