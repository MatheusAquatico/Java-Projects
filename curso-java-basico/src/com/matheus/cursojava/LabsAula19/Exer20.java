package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] cotacoesDolar = new double[20];
		for (int i = 0; i < cotacoesDolar.length; i++) {
			System.out.println("qual � a cota��o do d�lar hoje?");
			cotacoesDolar[i] = scan.nextDouble() * (i+1);
		}
		for (int j = 0; j < cotacoesDolar.length; j++) {
			System.out.println("Cota��o do dia " + j + ":" + cotacoesDolar[j]);
		}
	}

}
