package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Quantas turmas voc� quer calcular sua m�dia?");
		int qteTurmas = scan.nextInt();
		int somatorioAlunos=0;
		int contador = qteTurmas;
		do {
			System.out.println("Digite a quantidade de alunos da turma: ");
			int numAlunos=scan.nextInt();
			if (numAlunos>40) {
				System.out.println("A turma n�o pode ter mais de 40 alunos.");
			}else {
				somatorioAlunos+=numAlunos;
				contador--;
			}
		}while(contador>0);
		double mediaAlunos= somatorioAlunos/qteTurmas;
		System.out.println("A m�dia dos alunos � de: " + mediaAlunos);

	}

}
