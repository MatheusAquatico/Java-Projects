package com.matheus.cursojava.LabsAula19;

import java.text.DecimalFormat;

public class Exer09 {

	public static void main(String[] args) {
		double arrayDoubleA[] = new double [10];
		double arrayDoubleB[] = new double [10];
		double arrayDoubleC[] = new double [10];
		for (int i = 0; i< arrayDoubleA.length; i++) {
			arrayDoubleA[i]=i+2;
			arrayDoubleB[i] = i+1;
			arrayDoubleC[i]=arrayDoubleA[i] / arrayDoubleB[i];
		}
		for (int j = 0; j<arrayDoubleC.length;j++) {
			DecimalFormat df = new DecimalFormat ("###,###.##");
			System.out.println(arrayDoubleC[j]);
		}

	}

}
