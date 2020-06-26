package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lojas Tabajara");
		boolean acabou = false;
		while (!acabou) {
			int i = 0;
			double somatorio = 0;
			double preco = 0;
			do {
				i++;
				System.out.println("Produto " + i + ":");
				preco = scan.nextDouble();
				somatorio += preco;
			} while (preco != 0);
			System.out.println("Total: " + somatorio);
			System.out.println("Dinheiro: ");
			double dinheiro = scan.nextDouble();
			System.out.println("Troco: " + (dinheiro - somatorio));

			if (somatorio == 0) {
				acabou = true;
			}
		}
	}

}
