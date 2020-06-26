package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer35 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Quantos termos você quer calcular da série?");
		int termos = scan.nextInt();
		double n = 1;
		double m = 1;
		double serie = n / m;
		System.out.print(n + "/" + m);
		System.out.print(" + ");
		for (int i = 2; i <= termos; i++) {
			n++;
			m += 2;
			serie += (n / m);
			System.out.print(n + "/" + m);
			if (i!=termos) {
				System.out.print(" + ");
			}
		}
		System.out.println("");
		System.out.println(serie);
	}
}
