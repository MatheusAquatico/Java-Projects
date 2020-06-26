package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa é uma calculadora de salário. Digite o quanto você ganha "
				+ "por hora e suas horas trabalhadas para gerar o salário: " );
		double salarioHora= scan.nextDouble();
		double horasTrabalhadas= scan.nextDouble();
		double salario = salarioHora * horasTrabalhadas;
		
		System.out.println("Seu salário é de : " + salario);
		
		
		
	}

}
