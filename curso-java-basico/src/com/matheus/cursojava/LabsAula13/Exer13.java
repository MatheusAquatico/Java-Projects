package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa � uma calculadora de sal�rio l�quido. Digite o quanto voc� ganha "
				+ "por hora e suas horas trabalhadas para gerar o sal�rio l�quido: " );
		double salarioHora= scan.nextDouble();
		double horasTrabalhadas= scan.nextDouble();
		double salarioBruto = salarioHora * horasTrabalhadas;
		double iR = salarioBruto*0.11;
		double iNSS = salarioBruto*0.08;
		double sindicato = salarioBruto*0.05;
		double salarioLiquido = salarioBruto -iR - iNSS - sindicato;
		double totalDescontos= iR + iNSS+ sindicato;
		System.out.println("Sal�rio bruto: " + salarioBruto);
		System.out.println("Sal�rio l�quido: " + salarioLiquido);
		System.out.println("imposto de Renda: " + iR);
		System.out.println("INSS: " + iNSS);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Total descontos: " + totalDescontos);
	}

}
