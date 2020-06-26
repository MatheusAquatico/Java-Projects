package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer28 {

		public static void main (String [] args) {
			Scanner scan = new Scanner (System.in);
			char [] arrayChar1 = new char [10];
			char [] arrayChar2 = new char [10];
			for ( int i = 0; i<arrayChar1.length; i++) {
				System.out.println("Digite a letra de número " + (i+1));
				arrayChar1[i]= scan.nextLine().charAt(0);
			}
			for(int j = 0;j<arrayChar2.length;j++) {
				arrayChar2[j]=arrayChar1[(arrayChar1.length-1)-j];
			}
			for (char character : arrayChar1) {
				System.out.print(character + " ");
			}
			System.out.println();
			for (char character : arrayChar2) {
				System.out.print(character + " ");
			}
		}
}
