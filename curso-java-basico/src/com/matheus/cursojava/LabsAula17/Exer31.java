package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer31 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Qual � o sal�rio do funcion�rio?");
		double salario = scan.nextDouble();
		double aumento = 0.015;
		for(int i = 1996;i<2019;i++) {
			salario +=(salario*aumento);
			aumento= aumento*2;
		}
		System.out.println(salario);
	}
}
