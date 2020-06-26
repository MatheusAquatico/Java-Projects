package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer08 {

		public static void main (String [] args) {
			Scanner scan = new Scanner(System.in);
			int soma=0;
			double media=0;
			for(int i = 0;i<5;i++) {
				System.out.println("Digite o número");
				int numero = scan.nextInt();
				soma+= numero;
			}
			media =soma/5;
			System.out.println("A soma dos números é: " + soma);
			System.out.println("A média dos números é: " + media);
		}
}
