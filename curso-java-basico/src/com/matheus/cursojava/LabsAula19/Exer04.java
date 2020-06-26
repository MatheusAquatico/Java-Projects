package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer04 {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int [] arrayIntA = new int [15];
		double [] arrayDoubleB = new double [15];
		
		for (int i = 0; i<arrayIntA.length; i++) {
			arrayIntA [i] = i;
			arrayDoubleB [i] = Math.sqrt(arrayIntA [i]);
		}

	}
}
