package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer11 {

		public static void main (String [] args) {
			Scanner scan = new Scanner (System.in);
			int [] arrayA = new int [10];
			int numPar=0;
			for(int i = 0; i<arrayA.length;i++) {
				System.out.println("Digite o número da posição "+ (i+1));
				arrayA [i] = scan.nextInt();
			}
			for (int j = 0;j<arrayA.length;j++) {
				if(arrayA[j]%2==0) {
					numPar++;
				}
			}
			System.out.println("Essa lista contém " + numPar + " números pares ");
		}
}
