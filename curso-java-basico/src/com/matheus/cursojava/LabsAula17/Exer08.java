package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer08 {

		public static void main (String [] args) {
			Scanner scan = new Scanner(System.in);
			int soma=0;
			double media=0;
			for(int i = 0;i<5;i++) {
				System.out.println("Digite o n�mero");
				int numero = scan.nextInt();
				soma+= numero;
			}
			media =soma/5;
			System.out.println("A soma dos n�meros �: " + soma);
			System.out.println("A m�dia dos n�meros �: " + media);
		}
}
