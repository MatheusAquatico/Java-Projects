package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Quantos CDs voc� tem?");
		int Cds = scan.nextInt();
		int somatorioValores=0;
		for(int i = Cds; i>0;i--) {
			System.out.println("Digite o valor pago pelo CD: ");
			int valor = scan.nextInt();
			somatorioValores+=valor;
		}
		double mediaCds = somatorioValores/Cds;
		System.out.println("O valor total investido �: " + somatorioValores +  " e a m�dia gasta foi: " + mediaCds);
		
	}

}
