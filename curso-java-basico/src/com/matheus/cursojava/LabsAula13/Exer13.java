package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa é uma calculadora de salário líquido. Digite o quanto você ganha "
				+ "por hora e suas horas trabalhadas para gerar o salário líquido: " );
		double salarioHora= scan.nextDouble();
		double horasTrabalhadas= scan.nextDouble();
		double salarioBruto = salarioHora * horasTrabalhadas;
		double iR = salarioBruto*0.11;
		double iNSS = salarioBruto*0.08;
		double sindicato = salarioBruto*0.05;
		double salarioLiquido = salarioBruto -iR - iNSS - sindicato;
		double totalDescontos= iR + iNSS+ sindicato;
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("Salário líquido: " + salarioLiquido);
		System.out.println("imposto de Renda: " + iR);
		System.out.println("INSS: " + iNSS);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Total descontos: " + totalDescontos);
	}

}
