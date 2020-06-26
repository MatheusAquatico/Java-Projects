package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arrayInt = new int [10];
		double zeros=0;
		double uns=0;
		for( int i = 0; i<arrayInt.length;i++) {
			arrayInt[i] =(int) Math.round(Math.random()*1);
		}
		for (int j = 0; j<arrayInt.length;j++) {
			if(arrayInt[j] ==0) {
				zeros++;
			}else if(arrayInt[j] ==1) {
				uns++;
			}
		}
		System.out.println("Zeros: " + ((zeros/arrayInt.length)*100)+"%");
		System.out.println("Uns: " + ((uns/arrayInt.length)*100)+"%");
	}

}
