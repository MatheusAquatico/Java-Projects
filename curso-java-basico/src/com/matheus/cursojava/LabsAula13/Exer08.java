package com.matheus.cursojava.LabsAula13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa � uma calculadora de sal�rio. Digite o quanto voc� ganha "
				+ "por hora e suas horas trabalhadas para gerar o sal�rio: " );
		double salarioHora= scan.nextDouble();
		double horasTrabalhadas= scan.nextDouble();
		double salario = salarioHora * horasTrabalhadas;
		
		System.out.println("Seu sal�rio � de : " + salario);
		
		
		
	}

}
