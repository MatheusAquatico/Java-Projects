package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double [] potencias = new double [11];
		for (int i =0;i<potencias.length;i++) {
			potencias[i]=Math.pow(2, i);
		}
		for ( double potencia : potencias) {
			System.out.println(potencia);
		}
	}

}
