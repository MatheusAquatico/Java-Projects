package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um n�mero que deseja fazer a tabuada: ");
		int numTabuada = scan.nextInt();
		System.out.println("Digite um n�mero que deseja come�ar a fazer a tabuada: ");
		int numCome�o = scan.nextInt();
		System.out.println("Digite um n�mero que deseja terminar a fazer a tabuada: ");
		int numFim = scan.nextInt();
		for (int i= numCome�o ; i <=numFim;i++) {
			System.out.println( numTabuada +  " * " + i + " = " + (numTabuada*i));
		}
	}

}
