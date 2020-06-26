package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite duas notas parciais de um aluno para cálcular a média: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2) / 2;
		boolean aprovado;
		String conceito;
		if (media > 9 && media <= 10) {
			conceito = "A";
			aprovado = true;
		} else if (media > 7.5 && media <= 9) {
			conceito = "B";
			aprovado = true;
		} else if (media > 6 && media <= 7.5) {
			conceito = "C";
			aprovado = true;
		} else if (media > 4 && media <= 6) {
			conceito = "D";
			aprovado = false;
		} else {
			conceito = "E";
			aprovado = false;
		}
		System.out.println("Nota: " + media);
		System.out.println("Conceito: " + conceito);
		if (aprovado) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}

	}
}
