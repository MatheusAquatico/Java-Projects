package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Voc� quer saber a m�dia de quantas notas?");
		int qte = scan.nextInt();
		double notas =0;
		for(int i = qte; i>0;i--) {
			System.out.println("Digite a nota: ");
			double nota = scan.nextDouble();
			notas+=nota;
		}
		double media = notas/qte;
		System.out.println("A m�dia das notas �: " + media);
		

	}

}
