package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer02 {

		public static void main (String [] args) {
			
			Scanner scan = new Scanner (System.in);
			System.out.println("Digite um valor inteiro para saber se � positivo ou negativo: ");
			int valor = scan.nextInt();
			if (valor >= 0) {
				System.out.println("O valor � positivo");
			}else {
				System.out.println("O valor � negativo");
			}
		}
}
