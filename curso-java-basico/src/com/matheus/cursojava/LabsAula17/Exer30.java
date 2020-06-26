package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número que deseja fazer a tabuada: ");
		int numTabuada = scan.nextInt();
		System.out.println("Digite um número que deseja começar a fazer a tabuada: ");
		int numComeço = scan.nextInt();
		System.out.println("Digite um número que deseja terminar a fazer a tabuada: ");
		int numFim = scan.nextInt();
		for (int i= numComeço ; i <=numFim;i++) {
			System.out.println( numTabuada +  " * " + i + " = " + (numTabuada*i));
		}
	}

}
