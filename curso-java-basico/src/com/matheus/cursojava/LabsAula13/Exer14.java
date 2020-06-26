package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa calcula o tempo aprox. de download de um aquivo.");
		System.out.println("Digite o tamanho do arquivo em MB: ");
		double tamanho = scan.nextDouble();
		System.out.println("Digite a velocidade da sua internet em Mbps: ");
		int velocidade = scan.nextInt();
		double tempo = (tamanho/ velocidade)/60;
		System.out.println("O tempo aprox. de download é: " + tempo);

	}

}
