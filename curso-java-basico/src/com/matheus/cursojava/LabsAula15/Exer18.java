package com.matheus.cursojava.LabsAula15;
import java.util.Scanner;
public class Exer18 {

		public static void main (String [] args) {
			Scanner scan = new Scanner (System.in);
			System.out.println("escreva um número que o programa dirá se é par ou impar: ");
			int num = scan.nextInt();
			if(num%2==0) {
				System.out.println("É par");
			}else {
				System.out.println("É impar");

			}
		}
}
